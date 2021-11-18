package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mnc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Nazmul\\selenium\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver(); 
		driver.get("http://43.245.118.130:8022/Home/Index");
		
		

	}

}
