package DataDriven;

//import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Nazmul\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver .get("http://43.245.118.130:8022/Account/LogOn");
		
	//	FileInputStream file=new FileInputStream("C:\\Users\\support Pc\\Documents\\NewTestfile.xlsx");
		
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
//		
//		int rowcount=sheet.getLastRowNum();
//		int colcount = sheet.getRow(0).getLastCellNum();
//		 
//		for(int i=0;i<rowcount;i++)
//		{
//			XSSFRow currentrow=sheet.getRow(i);
//			
//			for(int j=0;j<colcount;j++)
//			{
//				String value=currentrow.getCell(j).toString();
//				System.out.print("        " +    value);
//			}
//			System.out.println();
//		}
//	

	}

}
