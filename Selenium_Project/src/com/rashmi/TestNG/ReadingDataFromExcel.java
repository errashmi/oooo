package com.rashmi.TestNG;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import org.testng.annotations.BeforeTest;

public class ReadingDataFromExcel {
  @Test
  public void f() throws Exception {
	  FileInputStream fi=new FileInputStream("D:\\Selenium\\ExcelFiles\\test.xls");
	  Workbook w=Workbook.getWorkbook(fi);
	  Sheet s=w.getSheet("Sheet1");
	  System.out.println(s.getCell(0,1).getContents());
	  System.out.println(s.getCell(1,1).getContents());
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

}
