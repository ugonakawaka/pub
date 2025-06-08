package kantan;

import javax.swing.SwingWorker;
import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

// コールバックインターフェース
interface ExcelProcessorCallback {
	void onMessage(String message);

	void onError(String error);

	void onConnectionTestResult(boolean success, String message);
}

public class ExcelProcessor {
	private ExcelProcessorCallback callback;
	private Connection connection;
	private Map<String, TableDefinition> tableDefinitions = new HashMap<>();

	public ExcelProcessor(ExcelProcessorCallback callback) {
		this.callback = callback;
	}

	// テスト接続メソッド
	public void testConnection(String url, String user, String password) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection testConn = DriverManager.getConnection(url, user, password);
			testConn.close();

			callback.onMessage("接続テスト成功");
			callback.onConnectionTestResult(true, "接続テスト成功");
		} catch (Exception e) {
			String errorMessage = "接続テスト失敗: " + e.getMessage();
			callback.onMessage(errorMessage);
			callback.onConnectionTestResult(false, errorMessage);
		}
	}

	// メイン実行メソッド
	public void executeProcess(String definitionFile, String path, String excelFile, String connectionUrl,
			String schema, String password, String operation, boolean suddenDeath) {

		new SwingWorker<Void, String>() {
			@Override
			protected Void doInBackground() throws Exception {
				try {
					publish("処理開始...");

					// データベース接続
					connectDatabase(connectionUrl, schema, password);

					// 定義ファイル読み込み
					loadTableDefinitions(definitionFile);

					// Excelファイル処理
					processExcelFile(path, excelFile, operation, suddenDeath);

					publish("処理完了");
				} catch (Exception e) {
					publish("エラー: " + e.getMessage());
					e.printStackTrace();
				} finally {
					closeDatabase();
				}
				return null;
			}

			@Override
			protected void process(List<String> chunks) {
				for (String message : chunks) {
					callback.onMessage(message);
				}
			}
		}.execute();
	}

	// データベース接続
	private void connectDatabase(String url, String user, String password) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection = DriverManager.getConnection(url, user, password);
		connection.setAutoCommit(false);
	}

	// データベース接続を閉じる
	private void closeDatabase() {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// テーブル定義読み込み
	private void loadTableDefinitions(String definitionFile) throws Exception {
		callback.onMessage("定義ファイル読み込み: " + definitionFile);

		try (BufferedReader br = new BufferedReader(
				new FileReader(definitionFile, java.nio.charset.StandardCharsets.UTF_8))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (line.trim().isEmpty())
					continue;

				String[] parts = line.split(",");
				if (parts.length >= 7) {
					String tableName = parts[0].trim();
					String tableSymbol = parts[1].trim();
					String columnName = parts[2].trim();
					String columnSymbolName = parts[3].trim();
					String dataType = parts[4].trim();
					String size = parts[5].trim();
					String isPK = parts[6].trim();

					TableDefinition tableDef = tableDefinitions.computeIfAbsent(tableName,
							k -> new TableDefinition(tableName, tableSymbol));
					ColumnDefinition colDef = new ColumnDefinition(tableSymbol, columnName, columnSymbolName, dataType,
							size, "Y".equalsIgnoreCase(isPK));
					tableDef.addColumn(colDef);
				}
			}
		}

		callback.onMessage("テーブル定義読み込み完了: " + tableDefinitions.size() + "テーブル");
	}

	// Excelファイル処理
	private void processExcelFile(String path, String excelFile, String operation, boolean suddenDeath)
			throws Exception {
		String excelPath = path + "/" + excelFile;
		callback.onMessage("Excelファイル処理開始: " + excelPath);

		try (FileInputStream fis = new FileInputStream(excelPath);
				Workbook workbook = excelPath.endsWith(".xlsx") ? new XSSFWorkbook(fis) : new HSSFWorkbook(fis)) {

			for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
				Sheet sheet = workbook.getSheetAt(i);
				String sheetName = sheet.getSheetName();

				// シート名が#で始まる場合はスキップ
				if (sheetName.startsWith("#")) {
					callback.onMessage("シートスキップ: " + sheetName);
					continue;
				}

				callback.onMessage("シート処理開始: " + sheetName);
				processSheet(sheet, operation, suddenDeath);
			}
		}
	}

	// シート処理
	private void processSheet(Sheet sheet, String operation, boolean suddenDeath) throws Exception {
		final String sheetName = sheet.getSheetName();

		final Row startRow = findStartRow(sheet);
		if (startRow == null) {
			callback.onMessage("警告: 'start'が見つかりません: " + sheetName);
			return;
		}

		// スタート行からテーブル名を取得
		final String tableName = getCellValueAsString(startRow.getCell(2));

		TableDefinition tableDef = tableDefinitions.get(tableName);

		if (tableDef == null) {
			callback.onMessage("警告: テーブル定義が見つかりません: " + sheetName);
			return;
		}

		// ヘッダー行の解析
		Row headerRow = sheet.getRow(startRow.getRowNum() + 1);
		if (headerRow == null) {
			callback.onMessage("警告: ヘッダー行が見つかりません: " + sheetName);
			return;
		}

		List<String> headers = new ArrayList<>();
		for (Cell cell : headerRow) {
			String value = getCellValueAsString(cell);
			headers.add(value);
		}

		// データ行の処理
		for (int i = startRow.getRowNum() + 2; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			if (row == null)
				continue;

			// skip行のチェック
			Cell firstCell = row.getCell(0);
			if (firstCell != null && "skip".equals(getCellValueAsString(firstCell))) {
				callback.onMessage("行スキップ: " + (i + 1));
				continue;
			}

			try {
				processDataRow(tableDef, headers, row, operation);
			} catch (Exception e) {
				String errorMessage = "行処理エラー (行" + (i + 1) + "): " + e.getMessage();
				callback.onMessage(errorMessage);
				if (suddenDeath) {
					throw e;
				}
			}
		}
	}

	// start行を検索
	private Row findStartRow(Sheet sheet) {
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			if (row != null) {
				Cell firstCell = row.getCell(0);
				if (firstCell != null && "start".equals(getCellValueAsString(firstCell))) {
					return row;
				}
			}
		}
		return null;
	}

	// データ行処理
	private void processDataRow(TableDefinition tableDef, List<String> headers, Row row, String operation)
			throws Exception {
		Map<String, Object> data = new LinkedHashMap<>();

		for (int i = 1; i < headers.size() + 1 && i < row.getLastCellNum(); i++) {
			String header = headers.get(i - 1);
			if (header == null || header.trim().isEmpty())
				continue;

//			// #で始まる列ヘッダーはスキップ（項番列など）
			if (header.startsWith("#")) {
				continue;
			}

			// Excelの列名をCSVで定義されたカラム記号名に変換
			String columnSymbolName = getColumnSymbolName(tableDef, header);
			if (columnSymbolName == null) {
				callback.onMessage("警告: カラム定義が見つかりません: " + header);
				continue;
			}

			Cell cell = row.getCell(i);
			Object value = getCellValue(cell);

			// システム日時の処理
			if (value instanceof String) {
				String strValue = (String) value;
				if ("sysdate".equalsIgnoreCase(strValue) || "SYSTIMESTAMP".equalsIgnoreCase(strValue)) {
					data.put(columnSymbolName, strValue.toUpperCase());
					continue;
				}
			}

			data.put(columnSymbolName, value);
		}

		if (!data.isEmpty()) {
			executeSQL(tableDef, data, operation);
		}
	}

	// SQL実行
	private void executeSQL(TableDefinition tableDef, Map<String, Object> data, String operation) throws Exception {
		switch (operation) {
		case "INSERT":
			executeInsertSQL(tableDef, data);
			break;
		case "UPDATE":
			executeUpdateSQL(tableDef, data);
			break;
		case "DELETE":
			executeDeleteSQL(tableDef, data);
			break;
		case "UPSERT":
		default:
			executeMergeSQL(tableDef, data);
			break;
		}
	}

	// MERGE SQL実行
	private void executeMergeSQL(TableDefinition tableDef, Map<String, Object> data) throws Exception {
		StringBuilder sql = new StringBuilder();
		// テーブル名の代わりにtableSymbolを使用
		sql.append("MERGE INTO ").append(tableDef.getTableSymbol()).append(" T ");
		sql.append("USING (SELECT ");

		List<String> selectColumns = new ArrayList<>();
		List<Object> parameters = new ArrayList<>();

		for (Map.Entry<String, Object> entry : data.entrySet()) {
			String columnName = entry.getKey();
			Object value = entry.getValue();

			if (isSystemFunction(value)) {
				selectColumns.add(value + " AS " + columnName);
			} else {
				selectColumns.add("? AS " + columnName);
				parameters.add(value);
			}
		}

		sql.append(String.join(", ", selectColumns));
		sql.append(" FROM DUAL) S ON (");

		// PK条件
		List<String> pkConditions = new ArrayList<>();
		for (ColumnDefinition col : tableDef.getColumns()) {
			if (col.isPrimaryKey() && data.containsKey(col.getColumnSymbolName())) {
				pkConditions.add("T." + col.getColumnSymbolName() + " = S." + col.getColumnSymbolName());
			}
		}

		if (pkConditions.isEmpty()) {
			throw new Exception("主キー項目が見つかりません: " + tableDef.getTableSymbol());
		}

		sql.append(String.join(" AND ", pkConditions));
		sql.append(") WHEN MATCHED THEN UPDATE SET ");

		// UPDATE部分
		List<String> updateColumns = new ArrayList<>();
		for (String columnName : data.keySet()) {
			boolean isPK = tableDef.getColumns().stream()
					.anyMatch(col -> col.getColumnSymbolName().equals(columnName) && col.isPrimaryKey());
			if (!isPK) {
				updateColumns.add("T." + columnName + " = S." + columnName);
			}
		}

		sql.append(String.join(", ", updateColumns));
		sql.append(" WHEN NOT MATCHED THEN INSERT (");
		sql.append(String.join(", ", data.keySet()));
		sql.append(") VALUES (");
		sql.append(data.keySet().stream().map(k -> "S." + k).reduce((a, b) -> a + ", " + b).orElse(""));
		sql.append(")");

		callback.onMessage("SQL: " + sql.toString());

		try (PreparedStatement pstmt = connection.prepareStatement(sql.toString())) {
			for (int i = 0; i < parameters.size(); i++) {
				pstmt.setObject(i + 1, parameters.get(i));
			}

			int result = pstmt.executeUpdate();
			connection.commit();
			callback.onMessage("MERGE実行完了: " + result + "件");
		}
	}

	// INSERT SQL実行
	private void executeInsertSQL(TableDefinition tableDef, Map<String, Object> data) throws Exception {
		StringBuilder sql = new StringBuilder();
		// テーブル名の代わりにtableSymbolを使用
		sql.append("INSERT INTO ").append(tableDef.getTableSymbol()).append(" (");
		sql.append(String.join(", ", data.keySet()));
		sql.append(") VALUES (");

		List<String> placeholders = new ArrayList<>();
		List<Object> parameters = new ArrayList<>();

		for (Object value : data.values()) {
			if (isSystemFunction(value)) {
				placeholders.add(value.toString());
			} else {
				placeholders.add("?");
				parameters.add(value);
			}
		}

		sql.append(String.join(", ", placeholders));
		sql.append(")");

		callback.onMessage("SQL: " + sql.toString());

		try (PreparedStatement pstmt = connection.prepareStatement(sql.toString())) {
			for (int i = 0; i < parameters.size(); i++) {
				pstmt.setObject(i + 1, parameters.get(i));
			}

			int result = pstmt.executeUpdate();
			connection.commit();
			callback.onMessage("INSERT実行完了: " + result + "件");
		}
	}

	// UPDATE SQL実行
	private void executeUpdateSQL(TableDefinition tableDef, Map<String, Object> data) throws Exception {
		StringBuilder sql = new StringBuilder();
		// テーブル名の代わりにtableSymbolを使用
		sql.append("UPDATE ").append(tableDef.getTableSymbol()).append(" SET ");

		List<String> setColumns = new ArrayList<>();
		List<Object> parameters = new ArrayList<>();
		List<Object> whereParameters = new ArrayList<>();

		// SET部分
		for (Map.Entry<String, Object> entry : data.entrySet()) {
			String columnName = entry.getKey();
			Object value = entry.getValue();

			boolean isPK = tableDef.getColumns().stream()
					.anyMatch(col -> col.getColumnSymbolName().equals(columnName) && col.isPrimaryKey());

			if (!isPK) {
				if (isSystemFunction(value)) {
					setColumns.add(columnName + " = " + value);
				} else {
					setColumns.add(columnName + " = ?");
					parameters.add(value);
				}
			}
		}

		sql.append(String.join(", ", setColumns));
		sql.append(" WHERE ");

		// WHERE部分
		List<String> whereConditions = new ArrayList<>();
		for (ColumnDefinition col : tableDef.getColumns()) {
			if (col.isPrimaryKey() && data.containsKey(col.getColumnSymbolName())) {
				whereConditions.add(col.getColumnSymbolName() + " = ?");
				whereParameters.add(data.get(col.getColumnSymbolName()));
			}
		}

		if (whereConditions.isEmpty()) {
			throw new Exception("主キー項目が見つかりません: " + tableDef.getTableSymbol());
		}

		sql.append(String.join(" AND ", whereConditions));

		callback.onMessage("SQL: " + sql.toString());

		try (PreparedStatement pstmt = connection.prepareStatement(sql.toString())) {
			int paramIndex = 1;
			for (Object param : parameters) {
				pstmt.setObject(paramIndex++, param);
			}
			for (Object param : whereParameters) {
				pstmt.setObject(paramIndex++, param);
			}

			int result = pstmt.executeUpdate();
			connection.commit();
			callback.onMessage("UPDATE実行完了: " + result + "件");
		}
	}

	// DELETE SQL実行
	private void executeDeleteSQL(TableDefinition tableDef, Map<String, Object> data) throws Exception {
		StringBuilder sql = new StringBuilder();
		// テーブル名の代わりにtableSymbolを使用
		sql.append("DELETE FROM ").append(tableDef.getTableSymbol());
		sql.append(" WHERE ");

		List<String> whereConditions = new ArrayList<>();
		List<Object> parameters = new ArrayList<>();

		// WHERE部分（主キーのみを使用）
		for (ColumnDefinition col : tableDef.getColumns()) {
			if (col.isPrimaryKey() && data.containsKey(col.getColumnSymbolName())) {
				whereConditions.add(col.getColumnSymbolName() + " = ?");
				parameters.add(data.get(col.getColumnSymbolName()));
			}
		}

		if (whereConditions.isEmpty()) {
			throw new Exception("主キー項目が見つかりません: " + tableDef.getTableSymbol());
		}

		sql.append(String.join(" AND ", whereConditions));

		callback.onMessage("SQL: " + sql.toString());

		try (PreparedStatement pstmt = connection.prepareStatement(sql.toString())) {
			for (int i = 0; i < parameters.size(); i++) {
				pstmt.setObject(i + 1, parameters.get(i));
			}

			int result = pstmt.executeUpdate();
			connection.commit();
			callback.onMessage("DELETE実行完了: " + result + "件");
		}
	}

	// システム関数チェック
	private boolean isSystemFunction(Object value) {
		if (value instanceof String) {
			String strValue = (String) value;
			return "SYSDATE".equalsIgnoreCase(strValue) || "SYSTIMESTAMP".equalsIgnoreCase(strValue);
		}
		return false;
	}

	// Excelの列名からカラム記号名を取得
	private String getColumnSymbolName(TableDefinition tableDef, String columnName) {
		for (ColumnDefinition col : tableDef.getColumns()) {
			if (col.getColumnName().equals(columnName)) {
				return col.getColumnSymbolName();
			}
		}
		return null;
	}

	// セル値を文字列として取得
	private String getCellValueAsString(Cell cell) {
		if (cell == null)
			return "";

		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue().trim();
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cell.getDateCellValue());
			} else {
				double numValue = cell.getNumericCellValue();
				if (numValue == (long) numValue) {
					return String.valueOf((long) numValue);
				} else {
					return String.valueOf(numValue);
				}
			}
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case FORMULA:
			return cell.getCellFormula();
		default:
			return "";
		}
	}

	// セル値をオブジェクトとして取得
	private Object getCellValue(Cell cell) {
		if (cell == null)
			return null;

		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue().trim();
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				return new Timestamp(cell.getDateCellValue().getTime());
			} else {
				double numValue = cell.getNumericCellValue();
				if (numValue == (long) numValue) {
					return (long) numValue;
				} else {
					return numValue;
				}
			}
		case BOOLEAN:
			return cell.getBooleanCellValue();
		case FORMULA:
			return cell.getCellFormula();
		default:
			return null;
		}
	}

	// 内部クラス - テーブル定義
	private static class TableDefinition {
		private String tableName;
		private String tableSymbol;
		private List<ColumnDefinition> columns = new ArrayList<>();

		public TableDefinition(String tableName, String tableSymbol) {
			this.tableName = tableName;
			this.tableSymbol = tableSymbol;
		}

		public void addColumn(ColumnDefinition column) {
			columns.add(column);
		}

		public String getTableName() {
			return tableName;
		}

		public String getTableSymbol() {
			return tableSymbol;
		}

		public List<ColumnDefinition> getColumns() {
			return columns;
		}
	}

	// 内部クラス - カラム定義
	private static class ColumnDefinition {
		private String tableSymbol;
		private String columnName;
		private String columnSymbolName;
		private String dataType;
		private String size;
		private boolean primaryKey;

		public ColumnDefinition(String tableSymbol, String columnName, String columnSymbolName, String dataType,
				String size, boolean primaryKey) {
			this.tableSymbol = tableSymbol;
			this.columnName = columnName;
			this.columnSymbolName = columnSymbolName;
			this.dataType = dataType;
			this.size = size;
			this.primaryKey = primaryKey;
		}

		public String getTableSymbol() {
			return tableSymbol;
		}

		public String getColumnName() {
			return columnName;
		}

		public String getColumnSymbolName() {
			return columnSymbolName;
		}

		public String getDataType() {
			return dataType;
		}

		public String getSize() {
			return size;
		}

		public boolean isPrimaryKey() {
			return primaryKey;
		}
	}
}