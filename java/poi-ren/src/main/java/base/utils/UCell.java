package base.utils;

import java.util.Objects;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;

public abstract class UCell {

	public static void value(Cell cell, String value) {

//		if (value instanceof Number) {
//			
//		}
		// double value
		// TODO
//		setCellValue(String value)
//		setCellValue(LocalDateTime value) 
//		setCellValue(Calendar value)
//		setCellValue(Date value) 
//		setCellValue(RichTextString value)
		cell.setCellValue(value);
	}

	public static <T> T value(Cell cell, Class<T> returnType) {

		// TODO
		return null;
	}

	public static Object value(Cell cell) {

		Objects.requireNonNull(cell, "cell is null");

		switch (cell.getCellType()) {

		case NUMERIC:

			if (DateUtil.isCellDateFormatted(cell)) {
				return cell.getDateCellValue();
			}
			return cell.getNumericCellValue();

		case STRING:
			return cell.getStringCellValue();
		case FORMULA:
			switch (cell.getCachedFormulaResultType()) {
			case BOOLEAN:
				return cell.getBooleanCellValue();
			case NUMERIC:
				return cell.getNumericCellValue();
			case STRING:
				return cell.getRichStringCellValue();
			default:
				break;
			}

			if (false) {
				FormulaEvaluator evaluator = cell.getRow().getSheet().getWorkbook().getCreationHelper()
						.createFormulaEvaluator();
				//
				switch (evaluator.evaluateFormulaCell(cell)) {
				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				}
			}
			break;
		case BLANK:
			return null;
		case BOOLEAN:
			return cell.getBooleanCellValue();
		case ERROR:
			;
		default:
			;
		}

		throw new RuntimeException();
	}

	public static void reuseStyle(Cell src, Cell dst) {
		dst.setCellStyle(src.getCellStyle());
	}

}
