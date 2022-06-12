package base.utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UWorkbook extends UBase {

	public static Workbook workbook(Path parent, String filename) {
		return workbook(parent.resolve(filename));
	}

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

	public static Sheet sheet(Workbook workbook, String name) {
		return workbook.getSheet(name);
	}

	public static Sheet sheet(Workbook workbook, int index) {
		return workbook.getSheetAt(index);
	}
	
	// copy

	// 指定された名前のシートをコピーして、最後尾につける
	public static void copySheet(Workbook workbook, String src, String dest) {
		var sheetNum = workbook.getSheetIndex(workbook.getSheet(src));
		var sheet = workbook.cloneSheet(sheetNum);
		workbook.setSheetName(workbook.getSheetIndex(sheet), dest);
	}

	// ==========
	public static void write(Workbook workbook, Path outputpath) {

		Silencer silencer = () -> {
			workbook.write(
					Files.newOutputStream(outputpath, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING));
		};
		exec(silencer);
	}

	public static void write(Workbook workbook, Path parent, String filename) {
		write(workbook, parent.resolve(filename));
	}
}
