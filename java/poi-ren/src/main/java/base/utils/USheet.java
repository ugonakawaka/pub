package base.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellUtil;

public class USheet {

	// Cell
	public static Cell cell(Sheet sheet, int rowIx, int colIx) {

//		var cell = SheetUtil.getCell(sheet, rowIx, colIx);
//		if (cell == null) {
//			var row = sheet.getRow(rowIx);
//			if (row == null) {
//				row = sheet.createRow(rowIx);
//			}
//
//			return row.createCell(colIx);
//		}
//		return cell;

		var row = CellUtil.getRow(rowIx, sheet);
		return CellUtil.getCell(row, colIx);

	}
}
