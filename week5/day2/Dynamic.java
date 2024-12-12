package assignments.week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dynamic 

{
	//creat 2 - dimensional array
	public static String[][] readvalue() throws IOException 
	{
		//Setting the excel path
		XSSFWorkbook wb = new XSSFWorkbook("./excelData/DynamicParameterization.xlsx");
		//Get the first sheet
		XSSFSheet sheet = wb.getSheetAt(0);
		//To get the rows
		int rowCount = sheet.getLastRowNum();
		//To get the columns
		int cellCount = sheet.getRow(0).getLastCellNum();
		
		//Using for loop to store the values in string
		 String[][] data = new String[rowCount-1][cellCount];
		 for (int i = 1; i <=rowCount; i++) 
		 {
			 for (int j = 0; j < cellCount; j++) 
			 {
				 String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				
				 data[i-1][j]=stringCellValue;
				
			 }
			
		 }
		 
		 wb.close();
		return data;
		 
	}
	

}
