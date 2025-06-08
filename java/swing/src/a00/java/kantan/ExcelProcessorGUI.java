package kantan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.prefs.Preferences;

public class ExcelProcessorGUI extends JFrame implements ExcelProcessorCallback {
	private static final long serialVersionUID = 1L;
	private JTextField definitionFileTextField;
	private JTextField pathTextField;
	private JButton searchButton;
	private JComboBox<String> excelFileComboBox;
	private JTextArea resultTextArea;
	private JButton executeButton;

	// データベース関連コンポーネント
	private JTextField connectionInfoTextField;
	private JTextField schemaTextField;
	private JPasswordField passwordField;
	private JButton testConnectionButton;

	// SQL操作関連コンポーネント
	private JRadioButton insertRadioButton;
	private JRadioButton updateRadioButton;
	private JRadioButton upsertRadioButton;
	private JRadioButton deleteRadioButton;
	private ButtonGroup operationButtonGroup;
	private JCheckBox suddenDeathCheckBox;

	// ExcelProcessorのインスタンス
	private ExcelProcessor processor;

	// Preferences API用
	private static final String PREF_DEFINITION_FILE = "definition_file";
	private static final String PREF_PATH = "path";
	private static final String PREF_CONNECTION_INFO = "connection_info";
	private static final String PREF_SCHEMA = "schema";
	private static final String PREF_OPERATION = "operation";
	private static final String PREF_SUDDEN_DEATH = "sudden_death";
	private Preferences prefs;

	public ExcelProcessorGUI() {
		// Preferences初期化
		prefs = Preferences.userNodeForPackage(ExcelProcessorGUI.class);

		// ExcelProcessor初期化
		processor = new ExcelProcessor(this);

		initializeComponents();
		setupLayout();
		setupEventHandlers();
		loadPreferences();

		setTitle("Excel Processor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 600);
		setLocationRelativeTo(null);

		// ウィンドウクローズ時の処理
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				savePreferences();
			}
		});
	}

	private void initializeComponents() {
		// ファイル関連コンポーネント
		definitionFileTextField = new JTextField(30);
		pathTextField = new JTextField(25);
		searchButton = new JButton("サーチ");
		excelFileComboBox = new JComboBox<>();
		excelFileComboBox.addItem("ディレクトリを検索してください");

		// 結果表示関連
		resultTextArea = new JTextArea(15, 40);
		resultTextArea.setEditable(false);
		resultTextArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
		executeButton = new JButton("実行");

		// データベース関連コンポーネント
		connectionInfoTextField = new JTextField(30);
		schemaTextField = new JTextField(30);
		passwordField = new JPasswordField(30);
		testConnectionButton = new JButton("テスト接続");

		// SQL操作関連ラジオボタン
		insertRadioButton = new JRadioButton("INSERT");
		updateRadioButton = new JRadioButton("UPDATE");
		upsertRadioButton = new JRadioButton("UPSERT", true);
		deleteRadioButton = new JRadioButton("DELETE");
		
		// ボタングループ
		operationButtonGroup = new ButtonGroup();
		operationButtonGroup.add(insertRadioButton);
		operationButtonGroup.add(updateRadioButton);
		operationButtonGroup.add(upsertRadioButton);
		operationButtonGroup.add(deleteRadioButton);
		
		
		// オプション
		suddenDeathCheckBox = new JCheckBox("サドンデス");
	}

	private void setupLayout() {
		setLayout(new BorderLayout());

		// 上部パネル（入力フィールド）
		JPanel inputPanel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		int row = 0;

		// 定義ファイル入力行
		gbc.gridx = 0;
		gbc.gridy = row;
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0;
		inputPanel.add(new JLabel("定義ファイル:"), gbc);

		gbc.gridx = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		inputPanel.add(definitionFileTextField, gbc);

		row++;

		// パス入力行
		gbc.gridx = 0;
		gbc.gridy = row;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0;
		inputPanel.add(new JLabel("パス:"), gbc);

		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		inputPanel.add(pathTextField, gbc);

		gbc.gridx = 2;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0;
		inputPanel.add(searchButton, gbc);

		row++;

		// エクセルファイル選択行
		gbc.gridx = 0;
		gbc.gridy = row;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0;
		inputPanel.add(new JLabel("エクセルファイル:"), gbc);

		gbc.gridx = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		inputPanel.add(excelFileComboBox, gbc);

		row++;

		// セパレーター
		gbc.gridx = 0;
		gbc.gridy = row;
		gbc.gridwidth = 3;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(10, 5, 10, 5);
		inputPanel.add(new JSeparator(), gbc);
		gbc.insets = new Insets(5, 5, 5, 5); // 元に戻す

		row++;

		// 接続情報入力行
		gbc.gridx = 0;
		gbc.gridy = row;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0;
		inputPanel.add(new JLabel("接続情報:"), gbc);

		gbc.gridx = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		inputPanel.add(connectionInfoTextField, gbc);

		row++;

		// スキーマ入力行
		gbc.gridx = 0;
		gbc.gridy = row;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0;
		inputPanel.add(new JLabel("スキーマ:"), gbc);

		gbc.gridx = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		inputPanel.add(schemaTextField, gbc);

		row++;

		// パスワード入力行
		gbc.gridx = 0;
		gbc.gridy = row;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0;
		inputPanel.add(new JLabel("パスワード:"), gbc);

		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		inputPanel.add(passwordField, gbc);

		gbc.gridx = 2;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0;
		inputPanel.add(testConnectionButton, gbc);

		row++;

		// SQL操作選択行
		gbc.gridx = 0;
		gbc.gridy = row;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0;
		inputPanel.add(new JLabel("SQL操作:"), gbc);

		// ラジオボタンのパネル
		JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		radioPanel.add(insertRadioButton);
		radioPanel.add(Box.createHorizontalStrut(10));
		radioPanel.add(updateRadioButton);
		radioPanel.add(Box.createHorizontalStrut(10));
		radioPanel.add(upsertRadioButton);
		radioPanel.add(Box.createHorizontalStrut(10));
		radioPanel.add(deleteRadioButton);
		
		gbc.gridx = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		inputPanel.add(radioPanel, gbc);

		row++;

		// オプション行
		gbc.gridx = 0;
		gbc.gridy = row;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.weightx = 0;
		inputPanel.add(new JLabel("オプション:"), gbc);

		gbc.gridx = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1.0;
		inputPanel.add(suddenDeathCheckBox, gbc);

		add(inputPanel, BorderLayout.NORTH);

		// 中央パネル（結果表示エリア）
		JPanel resultPanel = new JPanel(new BorderLayout());
		resultPanel.setBorder(BorderFactory.createTitledBorder("実行結果"));
		resultPanel.add(new JScrollPane(resultTextArea), BorderLayout.CENTER);
		add(resultPanel, BorderLayout.CENTER);

		// 下部パネル（実行ボタン）
		JPanel buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.add(executeButton);
		add(buttonPanel, BorderLayout.SOUTH);
	}

	private void setupEventHandlers() {
		executeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				executeProcess();
			}
		});

		searchButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				searchExcelFiles();
			}
		});

		testConnectionButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				testConnection();
			}
		});
	}

	// 設定の保存
	private void savePreferences() {
		prefs.put(PREF_DEFINITION_FILE, definitionFileTextField.getText());
		prefs.put(PREF_PATH, pathTextField.getText());
		prefs.put(PREF_CONNECTION_INFO, connectionInfoTextField.getText());
		prefs.put(PREF_SCHEMA, schemaTextField.getText());

		// ラジオボタンの選択状態を保存
		String operation = "UPSERT";
		if (insertRadioButton.isSelected()) {
			operation = "INSERT";
		} else if (updateRadioButton.isSelected()) {
			operation = "UPDATE";
		}
		prefs.put(PREF_OPERATION, operation);

		// チェックボックスの状態を保存
		prefs.putBoolean(PREF_SUDDEN_DEATH, suddenDeathCheckBox.isSelected());
	}

	// 設定の読み込み
	private void loadPreferences() {
		String definitionFile = prefs.get(PREF_DEFINITION_FILE, "/root/定義ファイル.csv");
		String path = prefs.get(PREF_PATH, "akawaka/export/git/github.com/ugonakawaka/pub/java/swing/temp");
		String connectionInfo = prefs.get(PREF_CONNECTION_INFO, "jdbc:oracle:thin:@localhost:1521:XE");
		String schema = prefs.get(PREF_SCHEMA, "test");
		String operation = prefs.get(PREF_OPERATION, "UPSERT");
		boolean suddenDeath = prefs.getBoolean(PREF_SUDDEN_DEATH, false);

		definitionFileTextField.setText(definitionFile);
		pathTextField.setText(path);
		connectionInfoTextField.setText(connectionInfo);
		schemaTextField.setText(schema);

		// ラジオボタンの設定
		switch (operation) {
		case "INSERT":
			insertRadioButton.setSelected(true);
			break;
		case "UPDATE":
			updateRadioButton.setSelected(true);
			break;
		case "DELETE":
			deleteRadioButton.setSelected(true);
			break;
			
		default:
			upsertRadioButton.setSelected(true);
			break;
		}

		// チェックボックスの設定
		suddenDeathCheckBox.setSelected(suddenDeath);
	}

	// サーチ処理（ディレクトリからエクセルファイルを検索）
	private void searchExcelFiles() {
		String path = pathTextField.getText().trim();

		if (path.isEmpty()) {
			appendResult("パスが入力されていません");
			return;
		}

		File directory = new File(path);

		if (!directory.exists()) {
			appendResult("指定されたパスが存在しません: " + path);
			return;
		}

		if (!directory.isDirectory()) {
			appendResult("指定されたパスはディレクトリではありません: " + path);
			return;
		}

		// コンボボックスのアイテムをクリア
		excelFileComboBox.removeAllItems();

		// ディレクトリ内のエクセルファイルを検索
		File[] files = directory.listFiles();
		int excelFileCount = 0;

		if (files != null) {
			for (File file : files) {
				if (file.isFile() && isExcelFile(file.getName())) {
					excelFileComboBox.addItem(file.getName());
					excelFileCount++;
				}
			}
		}

		if (excelFileCount == 0) {
			excelFileComboBox.addItem("エクセルファイルが見つかりません");
			appendResult("ディレクトリにエクセルファイルが見つかりませんでした");
		} else {
			appendResult(excelFileCount + "個のエクセルファイルが見つかりました");
		}
	}

	// エクセルファイルかどうかを判定
	private boolean isExcelFile(String fileName) {
		String lowerName = fileName.toLowerCase();
		return lowerName.endsWith(".xlsx") || lowerName.endsWith(".xls");
	}

	// テスト接続処理
	private void testConnection() {
		String connectionInfo = connectionInfoTextField.getText();
		String schema = schemaTextField.getText();
		String password = new String(passwordField.getPassword());

		// 設定を保存
		savePreferences();

		// ExcelProcessorのテスト接続メソッドを呼び出し
		processor.testConnection(connectionInfo, schema, password);
	}

	// 実行処理
	private void executeProcess() {
		String definitionFile = definitionFileTextField.getText();
		String path = pathTextField.getText();
		String selectedFile = (String) excelFileComboBox.getSelectedItem();
		String connectionInfo = connectionInfoTextField.getText();
		String schema = schemaTextField.getText();
		String password = new String(passwordField.getPassword());

		String operation = "UPSERT";
		if (insertRadioButton.isSelected()) {
			operation = "INSERT";
		} else if (updateRadioButton.isSelected()) {
			operation = "UPDATE";
		} else if (deleteRadioButton.isSelected()) {
			operation = "DELETE";
		}

		boolean suddenDeath = suddenDeathCheckBox.isSelected();

		// 設定を保存
		savePreferences();

		// ExcelProcessorの実行メソッドを呼び出し
		processor.executeProcess(definitionFile, path, selectedFile, connectionInfo, schema, password, operation,
				suddenDeath);
	}

	// ExcelProcessorCallbackの実装
	@Override
	public void onMessage(String message) {
		SwingUtilities.invokeLater(() -> {
			appendResult(message);
		});
	}

	@Override
	public void onError(String error) {
		SwingUtilities.invokeLater(() -> {
			appendResult("エラー: " + error);
			JOptionPane.showMessageDialog(this, error, "エラー", JOptionPane.ERROR_MESSAGE);
		});
	}

	@Override
	public void onConnectionTestResult(boolean success, String message) {
		SwingUtilities.invokeLater(() -> {
			appendResult(message);
			if (success) {
				JOptionPane.showMessageDialog(this, "データベース接続が正常に確立されました。", "接続テスト", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(this, "データベース接続に失敗しました。\n" + message, "接続エラー", JOptionPane.ERROR_MESSAGE);
			}
		});
	}

	// 結果表示メソッド
	public void appendResult(String message) {
		resultTextArea.append(message + "\n");
		resultTextArea.setCaretPosition(resultTextArea.getDocument().getLength());
	}

	// 結果クリアメソッド
	public void clearResult() {
		resultTextArea.setText("");
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ExcelProcessorGUI().setVisible(true);
			}
		});
	}
}