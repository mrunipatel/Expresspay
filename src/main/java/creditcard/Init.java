package creditcard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chromedriver.driver","chromedriver.exe");
		driver.get("https://www.google.co.in/");
		
	
	}//main

}//class
