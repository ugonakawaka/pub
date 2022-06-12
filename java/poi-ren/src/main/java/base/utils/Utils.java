package base.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utils {


	
	
	
	public enum Type {
		STRING, INT, DOUBLE;

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





	// =========
	// sheet




	// =========




	public static void changeCellStyle(Cell cell, Cell sourceCell) {
		// cell.getCellStyle().cloneStyleFrom(sourceCell.getCellStyle());
		
//		cell.setCellStyle(sourceCell.getCellStyle());
//		CellUtil.setCellStyleProperty(cell, CellUtil.BORDER_TOP, BorderStyle.MEDIUM);
	}
}
