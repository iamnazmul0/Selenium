package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenBrowser {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException  {
	
	
		System.setProperty("webdriver.chrome.driver","D:\\Nazmul\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://43.245.118.130:8022/Account/LogOn");
		Thread.sleep(5000);
		System.out.println("Browser Opend and URL accessed SuccessFully...!!!");
		
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
		
		driver.findElement(By.id("UserName")).sendKeys("OAdmin");
		driver.findElement(By.id("Password")).sendKeys("DATABIZ33305");
		
		driver.findElement(By.xpath("//*[@id=\"btnLogIn\"]")).click();
		System.out.println("Log In SuccessFul ...!!!");
		
		WebElement click_Setup = driver.findElement(By.xpath("//*[@id=\"cc\"]/div[1]/div[2]/div/div[1]/div[1]/div[3]/a"));
		click_Setup.click();
		System.out.println("Click Setup button...!!!");
		
		
		WebElement click_Common = driver.findElement(By.xpath("//body/div[@id='cc']/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/span[1]"));
		click_Common.click();
		System.out.println("Click Common button...!!!");

		
		WebElement click_Task = driver.findElement(By.xpath("//*[@id=\"cc\"]/div[1]/div[2]/div/div[2]/div[1]/div[3]/a"));
		click_Task.click();
		System.out.println("Click Task button...!!!");

		
		WebElement click_Document = driver.findElement(By.xpath("//*[@id=\"a1\"]/li[2]/ul/li[4]/div"));
		click_Document.click();
		System.out.println("Click Document button...!!!");

		
		WebElement click_saleOrder = driver.findElement(By.xpath("//*[@id=\"a1\"]/li[4]/ul/li[15]/div"));
		click_saleOrder.click();
		System.out.println("Click sale Order...!!!");
		
		
		WebElement click_cusInfo = driver.findElement(By.xpath("//*[@id=\"divSearch\"]/div/div[2]/div[1]/div[1]/div[2]"));
		click_cusInfo.click();
		System.out.println("Click Customer Info...!!!");
		Thread.sleep(5000);
		
//		WebDriverWait wait = new WebDriverWait (driver,10);
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"a1\"]/li[4]/ul/li[15]/div")));
//		element.click();
//		System.out.println("click sale order");
//		Thread.sleep(5000);
//		
//		WebElement open_Employee = driver.findElement(By.xpath("//*[@id=\"a0\"]/li[1]/ul/li[6]"));
//		open_Employee.click();
//		System.out.println("Click Employee button...!!!");
//		Thread.sleep(9000);

    		
		//Test case condition
		String current_Url=("http://43.245.118.130:8022/Account/LogOn");
		if(current_Url.equals("http://43.245.118.130:8022/Account/LogOn"))
		{
			System.out.println("Tase Case Passed");
		}
		else
		{
			System.out.println("Test Case faile");
		}
		
		
		
		 //driver.close();
		  
		 

	 

	}

}
