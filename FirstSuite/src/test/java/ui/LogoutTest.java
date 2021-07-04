package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {
	
	@Test(priority=3)
	public void Logout() throws InterruptedException {
		Thread.sleep(5000);
		WebElement userOpt = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/header/div[1]/div/div/div/div[2]/div[3]/div/button"));		
		userOpt.click();
		Thread.sleep(1000);
		WebElement logoutBtn = driver.findElement(By.xpath("/html/body/div[20]/div[3]/div/div/div/div/div/div[5]/div/a/div"));	
		logoutBtn.click();
		
	}

}
