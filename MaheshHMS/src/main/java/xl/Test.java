package xl;

public class Test {

	public static void main(String[] args) throws Exception {
		String p="D:\\Selenium\\ExcelFiles\\xl1.xlsx";
		Excel_API obj=new Excel_API(p);
		String data=obj.getCellData("Sheet1", 3, 2);
		System.out.println(data);
		String data1=obj.getCellData("Sheet1", "Password", 2);
		System.out.println(data1);
		obj.setCellData("Sheet1", 2, 2, "HAPPY");
		obj.setCellData("Sheet1", "Password", 4, "GoodNight");
	}

}
