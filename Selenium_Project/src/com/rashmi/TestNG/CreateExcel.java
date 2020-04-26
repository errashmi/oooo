package com.rashmi.TestNG;
import org.testng.annotations.Test;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import java.io.FileOutputStream;
import org.testng.annotations.BeforeTest;

public class CreateExcel {
	public FileOutputStream fo;
	public WritableWorkbook wb;
	public WritableSheet ws;
	
  @Test
  public void create() throws Exception {
	  fo=new FileOutputStream("D:\\Selenium\\ExcelFiles\\test4_result.xls");
	  wb=Workbook.createWorkbook(fo);
	  ws=wb.createSheet("Results", 0);
	  
	  jxl.write.Label un=new jxl.write.Label(0, 0, "UserName");
	  jxl.write.Label pw=new jxl.write.Label(1, 0, "Password");
	  jxl.write.Label res=new jxl.write.Label(2, 0, "Result");
	  ws.addCell(un);
	  ws.addCell(pw);
	  ws.addCell(res);
	  
	  wb.write();
	  wb.close();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

}
