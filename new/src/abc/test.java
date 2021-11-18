package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		WebElement E=driver.findElement(By.name("birthday_day"));
		
		Select s=new Select(E);
		s.selectByVisibleText("2");
		//s.selectByIndex(2);
		// s.selectByValue("3");
		  
		
		
       
		
		

	}

}
