package base.func;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utils {

	public enum Type {
		STRING, INT, DOUBLE;

	}

	// ============
	public interface Silencer {
		public void apply() throws Throwable;
	}

	public interface QuietFunc<T> {
		public T apply() throws Throwable;
	}

	public static void exec(Silencer silencer) {
		try {
			silencer.apply();
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

	public static <T> T exec(QuietFunc<T> quietFunc) {
		try {
			return quietFunc.apply();
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}
	// ============

	// ============
	public static class I {
		public final int i;

		public I(int i) {
			this.i = i;
		}
	}

	public static class J {
		public final int j;

		public J(int j) {
			this.j = j;
		}
	}

	public static I i(int i) {
		return new I(i);
	}

	public static J j(int j) {
		return new J(j);
	}

	@FunctionalInterface
	public interface M<T> {
		public T get(int i);
	}

	@FunctionalInterface
	public interface N<T> {
		public T get(int j);
	}

	@FunctionalInterface
	public interface MN<T> {
		public T get(int i, int j);
	}

	// =========
	@FunctionalInterface
	public interface VH {
		public Cell get(int i, int j);
	}

	// =========
	// workbook

	public static Workbook workbook(Path book) {

		var filename = book.toFile().getName();
		if (filename.endsWith("xls")) {
			return hworkbook(book);
		}

		if (filename.endsWith("xlsx")) {
			return xworkbook(book);
		}

		//
		throw new RuntimeException();
	}

	public static Workbook hworkbook(Path book) {
		QuietFunc<Workbook> quietFunc = () -> {
			// xls
			return new HSSFWorkbook(Files.newInputStream(book));
		};

		return exec(quietFunc);

	}

	public static Workbook xworkbook(Path book) {
		QuietFunc<Workbook> quietFunc = () -> {
			// xlsx
			return new XSSFWorkbook(Files.newInputStream(book));
		};

		return exec(quietFunc);

	}

	public static void write(Workbook workbook, Path outputpath) {

		Silencer silencer = () -> {
			workbook.write(
					Files.newOutputStream(outputpath, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING));
		};
		exec(silencer);
	}
	// =========
	// sheet

	public static Sheet sheet(Workbook workbook, String name) {
		return workbook.getSheet(name);
	}

	// copy

	// 指定された名前のシートをコピーして、最後尾につける
	public static void copySheet(Workbook workbook, String src, String dest) {
		var sheetNum = workbook.getSheetIndex(workbook.getSheet(src));
		var sheet = workbook.cloneSheet(sheetNum);
		workbook.setSheetName(workbook.getSheetIndex(sheet), dest);
	}

	// =========
	// Cell
	public static Cell cell(Sheet sheet, int rowIx, int colIx) {

		var cell = SheetUtil.getCell(sheet, rowIx, colIx);
		if (cell == null) {
			var row = sheet.getRow(rowIx);
			if (row == null) {
				row = sheet.createRow(rowIx);
			}

			return row.createCell(colIx);
		}
		return cell;
	}

	public static void cellValue(Cell cell, String value) {
		cell.setCellValue(value);
	}

}
