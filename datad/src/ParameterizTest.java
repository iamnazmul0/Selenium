import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import excelUtility.Xls_Reader;

public class ParameterizTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\support Pc\\Documents\\company.xlsx");
		int rowCount = reader.getRowCount("Sheet1");
		
		for(int i=2;i<=rowCount;i++) {
			System.out.println("----------");
	
			String firstName = reader.getCellData("Sheet1","Company", i);
			System.out.println(firstName);
			
			String Location = reader.getCellData("Sheet1","Location",i);
			System.out.println(Location);
			 
			String UserName = reader.getCellData("Sheet1","UserName",i);
			System.out.println(UserName);
			
			String Password = reader.getCellData("Sheet1","Password",i);
			System.out.println(Password);
			
			
			System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://43.245.118.130:8022/Account/LogOn");
			Thread.sleep(5000);
			
			
			//<<--------For Company and Location Drop Down---------->>
			WebElement dd_Company = driver.findElement(By.xpath("//select[@id='CompanyId']/following-sibling::span/a[@title='Show All']/span[1]"));
			dd_Company.click();
			Thread.sleep(2000);
			System.out.println("Clicked on Company drop down...!!!");
			
			// select option from company drop down
			WebElement txt_OrintButtonLtd = driver.findElement(By.xpath("//li/div[text()='Orient Button Ltd']"));
			txt_OrintButtonLtd.click();
			System.out.println("Selected Option Orient button ltd from company drop down...!!!");
			
			// need to wait some time to load elements in location drop down
			Thread.sleep(5000);
			//select option from location drop down
			WebElement dd_Location = driver.findElement(By.xpath("//select[@id='LocationId']/following-sibling::span/a[@title='Show All']/span[1]"));
			dd_Location.click();
			System.out.println("Clicked on Location drop down...!!!");
			Thread.sleep(2000);
			
			WebElement txt_Factory = driver.findElement(By.xpath("//li/div[text()='Factory']"));
			txt_Factory.click();
			
			System.out.println("Selected Option Factory from Location drop down...!!!");

			//<----End----->
			driver.findElement(By.id("UserName")).clear();
			driver.findElement(By.id("UserName")).sendKeys(UserName);
			
			driver.findElement(By.id("Password")).clear();
			driver.findElement(By.id("Password")).sendKeys(Password);
			
			
			driver.findElement(By.xpath("//*[@id=\"btnLogIn\"]")).click();
//			System.out.println("Log In SuccessFul ...!!!");
			
			 driver.close();
			
		}


	}

}
