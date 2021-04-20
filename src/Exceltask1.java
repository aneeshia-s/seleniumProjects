import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Exceltask1 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\vishnu\\Documents\\Aneeshia\\test2.xlsx");
		FileInputStream inputstream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row3 = sheet.getRow(2);
		XSSFCell cell= row3.getCell(1);
		//String value = cell.getStringCellValue();
		String data= "";
		if(cell.getCellType()==CellType.STRING) 
		    data = cell.getStringCellValue(); 
		else if(cell.getCellType()==CellType.NUMERIC) 
			data = String.valueOf(cell.getNumericCellValue());
		System.out.println("The value in the cell is: "+ data);
		wb.close();
		
	}

}
