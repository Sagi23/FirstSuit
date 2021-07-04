package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleHomeTest extends BaseTest {
	
	@Test(priority=2)
	public void TitleCheck() throws InterruptedException {
		Thread.sleep(1000);
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "My Home | Codecademy";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}

}
