package com.practice;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWritting {

	@Test
	public void write1() throws Exception {
		String filePath=System.getProperty("user.dir")+"/src/test/java/com/practice/hello.xml";
		
		//sadece yaziyorum bu bana ait bir xpatch degil
		
		FileInputStream file=new FileInputStream(filePath);
		
		Workbook wbook=new XSSFWorkbook(file);
		
		Sheet sheet=wbook.getSheet("Test");
		
		sheet.getRow(0).createCell(2).setCellValue("Language");
		
		//sheet.getRow(0).createCell(2).setCellValue("Insturactor");
		
		
		sheet.createRow(2).createCell(0).setCellValue("Eklenir");
		//creatrow yazdiktan sonra 2. icin tekrar 2.ye bir seye bir sey eklemek istersek
		sheet.getRow(2).createCell(1).setCellValue("Insturactor");
		
		
		//excel kapatmak icin
		FileOutputStream fos=new FileOutputStream(filePath);
		wbook.write(fos);
		wbook.close();
		file.close();
		
		
	}
	
	
	
	
	
	
	
}
