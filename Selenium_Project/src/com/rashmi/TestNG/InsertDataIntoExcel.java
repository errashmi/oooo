package com.rashmi.TestNG;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.testng.annotations.BeforeTest;

public class InsertDataIntoExcel {
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
	public FileOutputStream fo;
	public WritableWorkbook wb;
	public WritableSheet ws;
	
  @Test
  public void addTestDataToResultFile() throws Exception {
	  fi=new FileInputStream("D:\\Selenium\\ExcelFiles\\testdata.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("Sheet1");
	  
	  fo=new FileOutputStream("D:\\Selenium\\ExcelFiles\\results.xls");
	  wb=Workbook.createWorkbook(fo);
	  ws=wb.createSheet("Results", 0);
	  
	  for(int i=0;i<s.getRows();i++)
	  {
		  for(int j=0;j<s.getColumns();j++) {
			  System.out.println(s.getCell(j, i).getContents());
			  Label a=new Label(j, i, s.getCell(j, i).getContents());
			  ws.addCell(a);
		  }
	  }
	  Label rs=new Label(2, 0, "Result");
	  ws.addCell(rs);
	  wb.write();
	  wb.close();
  }
  @BeforeTest
  public void beforeTest() {
  }

}
