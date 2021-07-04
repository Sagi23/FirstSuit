package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver = null;
	
	@BeforeSuite 
	public void Startup() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.codecademy.com/");
		driver.manage().window().maximize();
		System.out.println(driver);
	}
	
	@AfterSuite
	public void Exit() {
		driver.quit();
	}

}
