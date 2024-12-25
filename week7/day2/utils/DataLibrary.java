package assignments.week7.day2.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.ProjectSpecificMethod;

public class DataLibrary extends ProjectSpecificMethod
{

	//retain the static keyword 
	//static represents common reference value
	
	//Step 4 - convert main method into normal method
	public static String[][] readvalue(String fileData) throws IOException 
	{
		
		XSSFWorkbook wb = new XSSFWorkbook("./excelData/CreateAccount.xlsx");
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		short cellCount = sheet.getRow(1).getLastCellNum();
		
		//Step-1 declare 2 dimensional array and pass the variable dynamically no need to mention numbers
		 String[][] data = new String[rowCount][cellCount];
		
		 
		 //to print all the rows and col use for loop
		 for (int i = 1; i <=rowCount; i++) //row count starts from 1
		 {
			 for (int j = 0; j < cellCount; j++) //col count starts from 0
			 {
				 String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				 //Step - 2 declare value to data provider
				 data[i-1][j]=stringCellValue;//row starts with 0 @data provider so we gives a i-1 
				
			 }
			
		 }
		 //step-3 - return the data
		 wb.close();
		return data;
		 
	}

}
