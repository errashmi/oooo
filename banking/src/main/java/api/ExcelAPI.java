package api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAPI {
	FileInputStream fi;
	FileOutputStream fo;
	public String filePath;
	public XSSFWorkbook w;
	public XSSFSheet s;
	public XSSFRow r;
	public XSSFCell c;
	public String cellValue;
	public ExcelAPI(String excelFilePath) throws Exception {
		this.filePath=excelFilePath;
		fi=new FileInputStream(filePath);
		w=new XSSFWorkbook(fi);
	}
	//GET DATA ACCORDING TO INDEX VALUE
	public String getExcelData(String sheetName,int rowNo,int colNo) {
		s=w.getSheet(sheetName);
		r=s.getRow(rowNo);
		c=r.getCell(colNo);
		//System.out.println(c.getStringCellValue());
		if(c.getCellType()==CellType.STRING) {
			cellValue= c.getStringCellValue();
			return cellValue;
		}
		else if(c.getCellType()==CellType.FORMULA||c.getCellType()==CellType.NUMERIC) {
			cellValue=String.valueOf(c.getNumericCellValue());
			return cellValue;
		}
		else if(c.getCellType()==CellType.BLANK) {
			return "";
		}
		else
			return "NO MATCHING FOUND";
	}
	//GET DATA ACCORDING TO CELL NAME
	public String getExcelData(String sheetName,int rowNo,String colName) {
		s=w.getSheet(sheetName);
		int colNo=0;
		r=s.getRow(0);
		for(int i=0;i<r.getLastCellNum();i++) {
			if(r.getCell(i).getStringCellValue().equalsIgnoreCase(colName))
				colNo=i;
		}
		r=s.getRow(rowNo);
		c=r.getCell(colNo);
		//System.out.println(c.getStringCellValue());
		if(c.getCellType()==CellType.STRING) {
			cellValue= c.getStringCellValue();
			return cellValue;
		}
		else if(c.getCellType()==CellType.FORMULA||c.getCellType()==CellType.NUMERIC) {
			cellValue=String.valueOf(c.getNumericCellValue());
			return cellValue;
		}
		else if(c.getCellType()==CellType.BLANK) {
			return "";
		}
		else
			return "NO MATCHING FOUND";
	}
	//SET DATA ACCORDING TO INDEX VALUE
	public void setExcelData(String sheetName,int rowNo,int colNo,String colValue) throws Exception {
		s=w.getSheet(sheetName);
		r=s.getRow(rowNo);
		if(r==null) {
			r=s.createRow(rowNo);
		}
		c=r.getCell(colNo);
		if(c==null) {
			c=r.createCell(colNo);
		}
		c.setCellValue(colValue);
		fo=new FileOutputStream(filePath);
		w.write(fo);
		fo.close();
	}
	//SET DATA ACCORDING TO column name
		public void setExcelData(String sheetName,int rowNo,String colName,String colValue) throws Exception {
			s=w.getSheet(sheetName);
			int colNo=0;
			r=s.getRow(0);
			for(int i=0;i<r.getLastCellNum();i++) {
				if(r.getCell(i).getStringCellValue().equalsIgnoreCase(colName)) {
					colNo=i;
				}
			}
			r=s.getRow(rowNo);
			if(r==null) {
				r=s.createRow(rowNo);
			}
			c=r.getCell(colNo);
			if(c==null) {
				c=r.createCell(colNo);
			}
			c.setCellValue(colValue);
			fo=new FileOutputStream(filePath);
			w.write(fo);
			fo.close();
		}
	//GET TOTAL COLUMN COUNT
		public int getColCount(String sheetName) {
			s=w.getSheet(sheetName);
			r=s.getRow(0);
			short x = r.getLastCellNum();
			return x;
		}
	//GET TOTAL ROW COUNT
		public int getRowCount(String sheetName) {
			s=w.getSheet(sheetName);
			int x = s.getLastRowNum();
			return x;			
		}
}
