package frameWorkBuildingBlocks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void main(String[] args) throws IOException {
		
		Read_Data();

	}

	private static void Read_Data() throws IOException {
		
		   
		//Creating a file object with the path to the excel 
		String path = System.getProperty("user.dir")+"\\TestData\\readData.xlsx";
		
		
		File file = new File(path);

		//Now creating a fileinputstream to read the file 
		FileInputStream fis = new FileInputStream(file);

		//Creating a workbook instance to access the excel file content 
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		//Now Accessing the sheet named Sheet2 from the workbook
		XSSFSheet sheet= workbook.getSheet("alpha");

		//getting the total number of rows

		int rowCount = sheet.getLastRowNum();

		
             for (int i=0; i<=rowCount; i++)
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

