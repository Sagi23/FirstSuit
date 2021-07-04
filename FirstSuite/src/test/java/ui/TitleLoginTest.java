package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleLoginTest extends BaseTest {
	@Test(priority=4)
	public void TitleLogoutCheck() throws InterruptedException {
		Thread.sleep(1000);
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Log in | Codecademy";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}

}
