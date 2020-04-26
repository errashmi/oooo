package ExcelComm;

public class TestConn {
	public static String testDataPath="D:\\Selenium\\ExcelFiles\\test.xls";
	public static String resultPath="D:\\Selenium\\ExcelFiles\\testresult.xls";
	public static String testDataSheetName="data";
	public static String resultSheetname="TestResult";
	public static void main(String[] args) throws Exception {
		
		ExcelAPI e=new ExcelAPI(testDataPath,testDataSheetName,resultPath,resultSheetname);
		System.out.println(e.getExcelData(1,1));
		e.setExcelData(2,3,"rashmi");
		e.setExcelData(3,3,"ranjan");
		System.out.println(e.getRowCount(testDataSheetName));
		System.out.println(e.getColumnCount(testDataSheetName));
		//copy from one excel sheet to anathor
		for(int i=0;i<e.getRowCount(testDataSheetName);i++) {
			for(int j=0;j<e.getColumnCount(testDataSheetName);j++) {
				//System.out.println(e.getExcelData("Results", j, i));
				e.setExcelData(j, i, e.getExcelData(j, i));
			}
		}
		e.wb.write();
		e.wb.close();
	}
	
	
	
}
