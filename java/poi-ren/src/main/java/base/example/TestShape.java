package base.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSimpleShape;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestShape {

	public static void main(String[] args) throws IOException {
		a();
	}

	static void a() throws IOException {
		var base = Path.of("doc");
		{
			var book = base.resolve("シェイプ.xlsx");
			{
				var wb = new XSSFWorkbook(Files.newInputStream(book));

				var sheet = wb.getSheetAt(0);
				var drawing = sheet.getDrawingPatriarch();
				System.out.println(drawing);
				drawing.getShapes().forEach(c -> {
					System.out.println(c);
					System.out.println(c.getShapeName());
					System.out.println();

					if (c instanceof XSSFSimpleShape shape) {
						
						
						String sText = shape.getText();
						System.out.println(sText);
						shape.setText(sText + "b");
						
					
					}

	
				});
				
				wb.write(Files.newOutputStream(book));
			}

		}
	}
}
