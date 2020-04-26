//13-Write a program to get data from excel file(.xls) and print it on console
package com.rex.T;

import java.io.FileInputStream;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class T13 {
	FileInputStream fi;
	Workbook w;
	Sheet s;
  @Test
  public void GetDatafromExcel() throws Exception {
	  String path="D:\\Selenium\\ExcelFiles\\testdata.xls";
	  fi=new FileInputStream(path);
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("Sheet1");
	  System.out.println(s.getCell(0, 0).getContents());
  }
}
