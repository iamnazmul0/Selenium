package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABC {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Nazmul\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://43.245.118.130:8022/Account/LogOn");
		
		driver.findElement(By.xpath("//*[@id='div1']/span/input")).sendKeys("Orient Button Ltd");
		driver.findElement(By.xpath("//*[@id='divCompanyWiseLocation']/span/input")).sendKeys("Head Office");

		driver.findElement(By.id("UserName")).sendKeys("OAdmin");
		driver.findElement(By.id("Password")).sendKeys("DATABIZ33305");
		
		
		driver.findElement(By.xpath("//*[@id=\"btnLogIn\"]")).click();
		
		
		String u=driver.getCurrentUrl();
		if(u.equals("http://43.245.118.130:8022/Account/LogOn"))
		{
			System.out.println("Test Case passed ");
		}
	    else {
			System.out.println("Test Case failed");
		}
		driver.close();
	
	}

}
