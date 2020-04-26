package xl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	public String path="D:\\Selenium\\ExcelFiles\\xl1.xlsx";
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook w;
	public XSSFSheet s;
	public XSSFRow r;
	public XSSFCell c;
	public static void main(String[] args) throws Exception {
		ReadData obj=new ReadData();
		//obj.readDataUsingIndex();
		//obj.readDataUsingColName();
		//obj.readAlldata();
		//obj.writeDataUsingIndex();
		obj.writeDataUsingColName();
	}
public void readDataUsingIndex() throws Exception {
	fi=new FileInputStream(path);
	w=new XSSFWorkbook(fi);
	s=w.getSheet("Sheet1");
	r=s.getRow(2);
	//System.out.println(r.getCell(2).getStringCellValue());
	
}
public void readDataUsingColName() throws Exception {
	fi=new FileInputStream(path);
	w=new XSSFWorkbook(fi);
	s=w.getSheet("Sheet1");
	r=s.getRow(0);
	c=null;
	int col=-1;
	for(int i=0;i<r.getLastCellNum();i++) {
		System.out.println(r.getCell(i).getStringCellValue());
		if(r.getCell(i).getStringCellValue().equalsIgnoreCase("Password")) {
			col=i;
			System.out.println(col);
		}
	}
	r=s.getRow(1);
	c=r.getCell(col);
	System.out.println(c.getStringCellValue());
}
public void readAlldata() throws Exception {
	fi=new FileInputStream(path);
	w=new XSSFWorkbook(fi);
	s=w.getSheet("Sheet1");
	int rCount=s.getLastRowNum()-s.getFirstRowNum();
	System.out.println(rCount);
	for(int i=0;i<rCount;i++) {
		r=s.getRow(i);
		for(int j=0;j<r.getLastCellNum();j++) {
			System.out.println(r.getCell(j).getStringCellValue());
		}
		System.out.println();
	}
}
public void writeDataUsingIndex() throws Exception {
	fi=new FileInputStream(path);
	w=new XSSFWorkbook(fi);
	s=w.getSheet("Sheet1");
	r=null;
	c=null;
	r=s.getRow(2);
	if(r==null)
		r=s.createRow(2);
	c=r.getCell(3);
	if(c==null)
		c=r.createCell(3);
	c.setCellValue("RESULY123");
	fo=new FileOutputStream(path);
	w.write(fo);
	fo.close();
}
public void writeDataUsingColName() throws Exception {
	fi=new FileInputStream(path);
	w=new XSSFWorkbook(fi);
	s=w.getSheet("Sheet1");
	r=null;
	c=null;
	int colNo=-1;
	r=s.getRow(0);
	for(int i=0;i<r.getLastCellNum();i++) {
		System.out.println(r.getCell(i).getStringCellValue());
		if(r.getCell(i).getStringCellValue().equalsIgnoreCase("RESULT")) {
			colNo=i;
		}
			
	}
	r=s.getRow(2);
	if(r==null)
		r=s.createRow(2);
	c=r.getCell(colNo);
	if(c==null)
		c=r.createCell(colNo);
	c.setCellValue("PASSED");
	fo=new FileOutputStream(path);
	w.write(fo);
	fo.close();
}
}


