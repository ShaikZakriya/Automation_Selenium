package Framwork_BuildingBlocks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_Data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Read_Data();
		

	}

	private static void Read_Data() throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\maste\\eclipse-workspace\\Automation_Selenium\\TestData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Test");
		int rowCount = sheet.getRow(0).getLastCellNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		for(int i=0; i<=rowCount; i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			for (int j=0; j<=columnCount; j++ )
				
			{
				String cellValue = row.getCell(j).toString();
			
			}
			
			System.out.println();
			
			
			
		}
		workbook.close();
	}

}
