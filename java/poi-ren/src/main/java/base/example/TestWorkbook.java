package base.example;

import static base.utils.Utils.*;
import static base.utils.UWorkbook.*;
import static base.utils.USheet.*;
import static base.utils.UCell.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.utils.UCell;

public class TestWorkbook {

	public static void main(String[] args) throws IOException {
		a();
		b();
	}

	static void a() throws IOException {
		var base = Path.of("doc");
		{
			var book = base.resolve("book.xls");
			{
				Workbook wb = new HSSFWorkbook(Files.newInputStream(book));

				wb.forEach(sheet -> {
					// sheet.
				});

			}
		}
		{
			

		}

	}

	static void b() {
		var outputdir = Path.of("output");

		var base = Path.of("doc");
		var book = base.resolve("book.xlsx");
		{
			var wb = workbook(book);

			// シートコピー
			copySheet(wb, "Sheet1", "xxxx1");
			copySheet(wb, "Sheet2", "xxxx2");

			Runnable r1 = () -> {

				System.out.println(sheet(wb, "Sheet1").getColumnStyle(0).getFillForegroundColor());
				System.out.println(sheet(wb, "Sheet1").getColumnStyle(0).getFillPattern());
				Cell cell = cell(sheet(wb, "xxxx1"), 0, 0);
				// changeCellStyle(cell, cell(sheet(wb, "Sheet2"), 0, 0));
				CellStyle cellStyle = cell.getCellStyle();
				cell.getCellStyle().cloneStyleFrom(sheet(wb, "Sheet1").getColumnStyle(0));

				System.out.println(cellStyle.getFillForegroundColor());
				System.out.println(cellStyle.getFillPattern());
			};

			Runnable r2 = () -> {

				System.out.println(sheet(wb, "Sheet2").getColumnStyle(0).getFillForegroundColor());
				System.out.println(sheet(wb, "Sheet2").getColumnStyle(0).getFillPattern());
				Cell cell = cell(sheet(wb, "xxxx2"), 0, 0);
				// changeCellStyle(cell, cell(sheet(wb, "Sheet2"), 0, 0));
				CellStyle cellStyle = cell.getCellStyle();
				cell.getCellStyle().cloneStyleFrom(sheet(wb, "Sheet2").getColumnStyle(0));

				System.out.println(cellStyle.getFillForegroundColor());
				System.out.println(cellStyle.getFillPattern());
			};

//			{
//				Cell cell = cell(sheet(wb, "xxxx1"), 0, 0);
//				CellStyle cellStyle = cell.getCellStyle(); 
//				System.out.println(cellStyle.getFillForegroundColor());
//			}
			{

			}
			{

			}

			{
				Cell src = cell(sheet(wb, "xxxx1"), 0, 0);
				value(cell(sheet(wb, "xxxx1"), 0, 0), "aaaa,bbb,ccccc");
				value(cell(sheet(wb, "xxxx2"), 0, 0), "aaaa,bbb,ccccc");
		
				
				reuseStyle(src, cell(sheet(wb, "xxxx2"), 0, 0));
			}
			write(wb, outputdir.resolve("a.xlsx"));

		}
	}
}
