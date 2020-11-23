package com.project.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static Object[][] ReadFromExcelToObjArr(String filepath , String filename , String sheetname) throws IOException
    {
    	File file = new File(filepath + "/" +filename);
    	FileInputStream inputStream = new FileInputStream(file);
    	Workbook workbook = new XSSFWorkbook(inputStream);
    	Sheet sheet = workbook.getSheet(sheetname);
    	int rowCount = sheet.getLastRowNum();//2 data rows and 1 header row- returns 2 as rowcount
    	Object[][] data = new Object[rowCount][1];
    	Hashtable<String,String>rec = null;
    	Row keysrow = sheet.getRow(0);//keysrow
    	for (int r=1;r<rowCount+1;r++)
    	{
    		rec = new Hashtable<String,String>();//Hastable created for every record
    		Row datarow = sheet.getRow(r);
    		for(int c=0;c<datarow.getLastCellNum();c++)
    		{
    			String key = keysrow.getCell(c).getStringCellValue();
    			String val = datarow.getCell(c).getStringCellValue();
    			rec.put(key, val);
    		}
    		data[r-1][0]=rec;
    	}
    	return data;
    }

        public static void ReadFromExcel(String filepath , String filename , String sheetname) throws IOException
        {
        	File file = new File(filepath + "/" +filename);
        	FileInputStream inputStream = new FileInputStream(file);
        	Workbook workbook = new XSSFWorkbook(inputStream);
        	Sheet sheet = workbook.getSheet(sheetname);
        	int rowCount = sheet.getLastRowNum();
        	for (int r=1;r<rowCount+1;r++)
        	{
        		Row row = sheet.getRow(r);
        		for(int c=0;c<row.getLastCellNum();c++)
        		{
        			Cell cell =row.getCell(0);
        			System.out.println(cell.getStringCellValue().toString() + "\t");
        		}
        		System.out.println();
        	}
        }
        public static void main(String args[])throws IOException{
        	String ProjectPath = System.getProperty("user.dir");
        	String filepath = ProjectPath + "/src/com/project/testdata";
        	String filename = "LoginDetails.xlsx";
        	String sheetname = "LoginCredentials";
        	ExcelReader.ReadFromExcel(filepath, filename, sheetname);
        }
}
