package excelAPI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	//public String xlpath="D:\\Selenium\\ExcelFiles\\xl1.xlsx";
	public FileInputStream fi=null;
	public FileOutputStream fo=null;
	public XSSFWorkbook w=null;
	public XSSFSheet s=null;
	public XSSFRow r=null;
	public XSSFCell c=null;
	public String result;
	public String path;
	public Excel(String filePath) throws Exception {
		this.path=filePath;
		fi=new FileInputStream(path);
		w=new XSSFWorkbook(fi);
	}
	//GET DATA FROM EXCEL ACCORDING TO INDEX VALUE
	public String getSheetData(String sName,int rNo,int cNo) {
		try {
			s=w.getSheet(sName);
			r=s.getRow(rNo);
			c=r.getCell(cNo);
			if(c.getCellType()==CellType.STRING)
				return c.getStringCellValue();
			else if(c.getCellType()==CellType.NUMERIC||c.getCellType()==CellType.FORMULA)
				return String.valueOf(c.getNumericCellValue());
			else if(c.getCellType()==CellType.BLANK)
				return "";
			else 
				return String.valueOf(c.getBooleanCellValue());
		} catch (Exception e) {
			e.printStackTrace();
			return "No matching found";
		}
		
	}
	//GET DATA FROM EXCEL ACCORDING TO COLUMN NAME
		public String getSheetData(String sName,String cName,int rNo) {
			try {
				int cNo=0;
				s=w.getSheet(sName);
				r=s.getRow(0);
				for(int i=0;i<r.getLastCellNum();i++) {
					if(r.getCell(i).getStringCellValue().equalsIgnoreCase(sName))
						cNo=i;
				}
				r=s.getRow(rNo);
				c=r.getCell(cNo);
				if(c.getCellType()==CellType.STRING)
					return c.getStringCellValue();
				else if(c.getCellType()==CellType.NUMERIC||c.getCellType()==CellType.FORMULA)
					return String.valueOf(c.getNumericCellValue());
				else if(c.getCellType()==CellType.BLANK)
					return "";
				else 
					return String.valueOf(c.getBooleanCellValue());
			} catch (Exception e) {
				e.printStackTrace();
				return "No matching found";
			}
			
		}
//SET DATA IN INDEX ACCORDING TO INDEX PROVIDED
		public boolean setSheetData(String sName,int cNo,int rNo,String cVal) throws Exception {
			try {
				fo=new FileOutputStream(path);
				s=w.getSheet(sName);
				r=s.getRow(rNo);
				if(r==null)
					r=s.createRow(rNo);
				c=r.getCell(cNo);
				if(c==null)
					c=r.createCell(cNo);
				c.setCellValue(cVal);
				w.write(fo);
				fo.close();
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}
//SET DATA IN INDEX ACCORDING TO COLUMN NAME
	public boolean setSheetData(String sName,String cName,int rNo,String cVal) throws Exception {
		try {
			int cNo=0;
			fo=new FileOutputStream(path);
			s=w.getSheet(sName);
			r=s.getRow(0);
			for(int i=0;i<r.getLastCellNum();i++) {
				if(r.getCell(i).getStringCellValue().equalsIgnoreCase(cName))
					cNo=i;
			}
			r=s.getRow(rNo);
			if(r==null)
				r=s.createRow(rNo);
			c=r.getCell(cNo);
			if(c==null)
				c=r.createCell(cNo);
			c.setCellValue(cVal);
			w.write(fo);
			fo.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
//GET TOTAL COLUMN COUNT
	public int getColumnCount(String sName) {
		s=w.getSheet(sName);
		r=s.getRow(0);
		return r.getLastCellNum();
	}
//GET TOTAL ROW COUNT
	public int getRowCount(String sName) {
		s=w.getSheet(sName);
		return s.getLastRowNum()+1;
	}
}
