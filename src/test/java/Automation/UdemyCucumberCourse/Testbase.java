package Automation.UdemyCucumberCourse;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriver getDriver() throws IOException {
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Ertom\\eclipse-workspace\\UdemyCucumberCourse\\src\\test\\java\\Automation\\UdemyCucumberCourse\\global.properties");
		prop.load(file);
		
 
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\UpdatedChrome\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));

		 return driver;
	}
	

}
