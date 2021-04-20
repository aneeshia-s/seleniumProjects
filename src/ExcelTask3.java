import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTask3 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\vishnu\\Documents\\Aneeshia\\test.xlsx");
		FileInputStream inputstream = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		XSSFCell cell = sheet.getRow(1).getCell(1);
		DataFormatter df = new DataFormatter();

		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int k=2;k<rowCount+1;k++)
		{
			
		
			XSSFCell cell1 = sheet.getRow(k).getCell(1);
			
			if (df.formatCellValue(cell).equals(df.formatCellValue(cell1))){
				
				XSSFCell cell2 = sheet.getRow(k).getCell(0);
				XSSFCell cell3 = sheet.getRow(k).getCell(2);
				
				XSSFCell cell4 = sheet.getRow(k-1).getCell(0);
				XSSFCell cell5 = sheet.getRow(k-1).getCell(2);
  				System.out.println(cell2+"||"+cell+"||"+cell3);
  				System.out.println(cell4+"||"+cell1+"||"+cell5);
			}
			
			
  			cell=cell1;	
			
		}	wb.close();	
		
	}

}
