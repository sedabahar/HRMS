package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class XLReading {
	
	
	@Test
	public void read() throws FileNotFoundException {
	String filePath="Mac SSD/Users/Syntax/Destop/Hello.xlsx";

		FileInputStream fis=new  FileInputStream(filePath);
	//to read excel we need to use different classes
		//Workbook wbook=HSSWorkbook()--->2003 xfile
		Workbook wbook=new XSSFWorkbook();//2007 file
		Sheet xlsheet=wbook.getSheet("Sheet1");
		Row row=xlsheet.getRow(0);
		Cell cell=row.getCell(0);
		String value=cell.toString();
		System.out.println(value);
		
		String value2=xlsheet.getRow(1).getCell(1).toString();
		System.out.println(value2);
		
	}
	
	
	
	
	
	
	

}
