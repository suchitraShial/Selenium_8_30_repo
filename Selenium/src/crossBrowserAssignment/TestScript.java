package crossBrowserAssignment;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass{
	@Test
	public void clickOnButton() {
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		Reporter.log("Electronics page is displayed", true);
	}
}