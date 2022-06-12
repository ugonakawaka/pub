package base.example;

import static base.utils.UWorkbook.sheet;
import static base.utils.UWorkbook.workbook;
import static base.utils.UCell.*;
import java.nio.file.Path;
import java.util.stream.IntStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import base.utils.DebugUtils;
import base.utils.UCell;

public class TestA {

	public static void main(String[] args) {
		a();
	}

	static void println(Object o) {
		System.out.println(o);
	}

	static void a() {
		var base = Path.of("doc");

		{
			var wb = workbook(base, "a.xlsx");

			var sheet = sheet(wb, "sheet1");
			for (Row row : sheet) {
				println(row);

				for (Cell cell : row) {
					println(cell.getCellType());
					println(cell.getCellStyle());
					println(UCell.value(cell));
				}
			}

			println(sheet);
			println(wb.getNumCellStyles());

			IntStream.range(0, wb.getNumCellStyles()).forEach(i -> {

				var cellStyle = wb.getCellStyleAt(i);

				println(cellStyle.getFillForegroundColor());
			});
			println(wb.getCellStyleAt(0).getFillForegroundColor());

		}
		if (false) {
			//
			var wb = workbook(base, "20220610_Short_Positions.xls");

			var sheet = sheet(wb, 0);
			for (Row row : sheet) {
				println(row);

				for (Cell cell : row) {
					println(cell.getCellType());
					println(cell.getCellStyle());

					println(value(cell));
				}
			}

		}

		{
			var wb = workbook(base, "a.xlsx");

			var sheet = sheet(wb, "sheet1");
			for (Row row : sheet) {
				// println(row);

				for (Cell cell : row) {

					DebugUtils.dprintln(value(cell));
				}
			}

		}
	}
}
