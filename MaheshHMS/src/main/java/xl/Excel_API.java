package xl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_API {
	//String path="D:\\Selenium\\ExcelFiles\\xl1.xlsx";
	FileInputStream fi;
	FileOutputStream fo;
	XSSFWorkbook w;
	XSSFSheet s;
	XSSFRow r;
	XSSFCell c;
	String filePath;
	public Excel_API(String Path) throws Exception {
		this.filePath=Path;
		fi=new FileInputStream(filePath);
		w=new XSSFWorkbook(fi);
		
	}
//Reading cell data from excel using column index
	public String getCellData(String sheetName,int colNo,int rowNo) {
		try {
			s=w.getSheet(sheetName);
			r=s.getRow(rowNo);
			c=r.getCell(colNo);
			if(c.getCellType()==CellType.STRING) {
				return c.getStringCellValue();
			}
			else if(c.getCellType()==CellType.NUMERIC||c.getCellType()==CellType.FORMULA) {
				String cValue=String.valueOf(c.getNumericCellValue());
				return cValue;
			}
			else if(c.getCellType()==CellType.BLANK) {
				return "";
			}
			else {
				return String.valueOf(c.getBooleanCellValue());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "No matching values";
		}
	}
//Reading data using column name
	public String getCellData(String sheetName,String colName,int rowNo) {
		try {
			int colNum=-1;
			s=w.getSheet(sheetName);
			r=s.getRow(0);
			for(int i=0;i<r.getLastCellNum();i++) {
				if(r.getCell(i).getStringCellValue().equalsIgnoreCase(colName)){
					colNum=i;
				}	
			}
			r=s.getRow(rowNo);
			c=r.getCell(colNum);
			if(c.getCellType()==CellType.STRING) {
				return c.getStringCellValue();
			}
			else if(c.getCellType()==CellType.NUMERIC||c.getCellType()==CellType.FORMULA) {
				String cValue=String.valueOf(c.getNumericCellValue());
				return cValue;
			}
			else if(c.getCellType()==CellType.BLANK) {
				return "";
			}
			else {
				return String.valueOf(c.getBooleanCellValue());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return "No matching values";
		}
		
	}
//Write cell data by using column index
	public boolean setCellData(String sheetName,int colNo,int rowNo,String cValue) throws Exception {
		try {
			s=w.getSheet(sheetName);
			r=s.getRow(rowNo);
			if(r==null)
				r=s.createRow(rowNo);
			c=r.getCell(colNo);
			if(c==null)
				c=r.createCell(colNo);
				c.setCellValue(cValue);
				fo=new FileOutputStream(filePath);
				w.write(fo);
				fo.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
		}
		
//Write cell using column name
	public boolean setCellData(String sheetName,String colName,int rowNo,String cValue) throws Exception {
		try {
			s=w.getSheet(sheetName);
			r=s.getRow(0);
			int colNo=-1;
			for(int i=0;i<r.getLastCellNum();i++) {
				if(r.getCell(i).getStringCellValue().equalsIgnoreCase(colName))
					colNo=i;
			}
			r=s.getRow(rowNo);
			if(r==null)
				r=s.createRow(rowNo);
			c=r.getCell(colNo);
			if(c==null)
				c=r.createCell(colNo);
				c.setCellValue(cValue);
				fo=new FileOutputStream(filePath);
				w.write(fo);
				fo.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
		}
}
