package ExcelComm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelAPI {
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
	public FileOutputStream fo;
	public WritableWorkbook wb;
	public WritableSheet ws;
	
	public ExcelAPI(String testDataPath ,String testDataSheetName, String resultPath, String resultSheetname) throws Exception {
		fi=new FileInputStream(testDataPath);
		w=Workbook.getWorkbook(fi);
		s=w.getSheet(testDataSheetName);
		fo=new FileOutputStream(resultPath);
		wb=Workbook.createWorkbook(fo);
		ws=wb.createSheet(resultSheetname, 0);
	}
	//methos to getdata from excel file
	public String getExcelData(int rNO, int cNO) throws Exception {
		return s.getCell(rNO, cNO).getContents();	
	}
	
	public void setExcelData(int rNO, int cNO, String data) throws Exception {
		  jxl.write.Label results=new jxl.write.Label(rNO, cNO,data);
		  ws.addCell(results);
	}
	public int getRowCount(String sheetName) {
		s=w.getSheet(sheetName);
		return s.getRows();
	}
	public int getColumnCount(String sheetName) {
		s=w.getSheet(sheetName);
		return s.getColumns();
	}

}
