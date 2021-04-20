import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTask2 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\vishnu\\Documents\\Aneeshia\\test.xlsx");
		FileInputStream inputstream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		String data= "";
		for(int i=0;i<rowCount+1;i++)
		{	
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++)
			{
				XSSFCell cell =row.getCell(j);
				
				if(cell.getCellType()==CellType.STRING) 
				    data = cell.getStringCellValue(); 
				else if(cell.getCellType()==CellType.NUMERIC) 
					data = String.valueOf(cell.getNumericCellValue());
				System.out.print(data + "||");
				
			}
			System.out.println("");
		}
		wb.close();
		
		

	}

}
