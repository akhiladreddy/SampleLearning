package Jenkee.GitJnk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JekChk {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\40659\\Desktop\\AkhilaWOrk\\GitJnk\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("test case completed");
	}

}
