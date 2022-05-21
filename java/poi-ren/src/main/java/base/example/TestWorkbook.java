package base.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import static base.func.Utils.*;
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
			var book = base.resolve("book.xlsx");
			{
				var wb = new XSSFWorkbook(Files.newInputStream(book));
				
			}
			
			
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
		
			
			cellValue(cell(sheet(wb, "xxxx1"), 0, 0), "aaaa,bbb,ccccc");
			cellValue(cell(sheet(wb, "xxxx2"), 0, 0), "aaaa,bbb,ccccc");
			write(wb, outputdir.resolve("a.xlsx"));
			
			
		}
	}
}
