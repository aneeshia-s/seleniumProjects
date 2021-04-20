
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTask4 {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\vishnu\\Documents\\Aneeshia\\test.xlsx";
		FileInputStream inputstream = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row = sheet.createRow(6);
		XSSFCell cell = row.createCell(1);
		cell.setCellValue("Hello");
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		fos.close();
		wb.close();

	}

}
