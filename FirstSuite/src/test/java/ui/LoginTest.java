package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
	@Test(priority=1)
	public void CALogin() throws InterruptedException {
		System.out.println(driver);
		WebElement loginMainBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/header/div[1]/div/div/div/div[2]/div[2]/a"));
		loginMainBtn.click();
		WebElement uName = driver.findElement(By.xpath("//*[@id=\"user_login\"]"));
		uName.sendKeys("twigsagi2@gmail.com");
		WebElement pw = driver.findElement(By.xpath("//*[@id=\"login__user_password\"]"));
		pw.sendKeys("Aa!987");
		Thread.sleep(1000);
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/main/div/div/div/div/div/div[1]/form/div/div[4]/div/button"));
		loginBtn.click();
	}
	
}
