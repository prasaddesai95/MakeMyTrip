package com.MMT.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelUtils {

	public String readDataFromExcel(String sheet,int row,int cell) throws Throwable, Throwable
	{
		FileInputStream fis= new FileInputStream(IpathConstant.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		String value = sh.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public void writeDataIntoExcelfile(String sheet, int row , int cell, String data) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IpathConstant.excelPath);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		// this is to write a new data into excel
		sh.createRow(row).createCell(cell).setCellValue(data);
		// this is to write on existing data (overwriting)
		//sh.getRow(row).getCell(cell).setCellValue(data);
		
		//for adding data into existing file
		FileOutputStream fio = new FileOutputStream(IpathConstant.excelPath);
		wb.write(fio);
		wb.close();
		
	}
	
	public void readMultipleData(String sheet, int row, int cell ) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IpathConstant.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		int count= sh.getLastRowNum();
		for (int i = 0; i <=count; i++) {
			sh.getRow(i).getCell(0).getStringCellValue();
		}
	}

}
