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
	    File file = new File("C:\\Users\\maste\\eclipse-workspace\\Automation_Selenium\\TestData\\TestData.xlsx");
	    FileInputStream fis = new FileInputStream(file);
	    XSSFWorkbook workbook = new XSSFWorkbook(fis);
	    XSSFSheet sheet = workbook.getSheet("Test");

	    int rowCount = sheet.getLastRowNum();
	    
	    for (int i = 0; i <= rowCount; i++) 
	    {
	        XSSFRow row = sheet.getRow(i);
	        if (row == null) continue;

	        int columnCount = row.getLastCellNum();
	        for (int j = 0; j < columnCount; j++) {
	            if (row.getCell(j) != null) {
	                String cellValue = row.getCell(j).toString();
	                System.out.print(" | " + cellValue);
	            } else {
	                System.out.print(" | ");
	            }
	        }
	        System.out.println();
	    }

	    workbook.close();
	    fis.close();
	}

}
