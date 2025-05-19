package Framwork_BuildingBlocks;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class excel_sheet {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Test");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Zakir");
		sheet.getRow(0).createCell(1).setCellValue("Bluestone");
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Imran");
		sheet.getRow(1).createCell(1).setCellValue("Bluestone");
		sheet.createRow(2);
		sheet.getRow(2).createCell(0).setCellValue("Aman");
		sheet.getRow(2).createCell(1).setCellValue("Bluestone");
		sheet.createRow(3);
		sheet.getRow(3).createCell(0).setCellValue("Zakriya");
		sheet.getRow(3).createCell(1).setCellValue("Bluestone");
		
		 try {
	            FileOutputStream out = new FileOutputStream("C:\\Users\\maste\\eclipse-workspace\\Automation_Selenium\\ExcelFiles.xlsx");
	            workbook.write(out);
	            out.close();
	            workbook.close();

	            System.out.println("Excel file written successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		
		
		

	}}
