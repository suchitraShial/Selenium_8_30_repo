package TestNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass 
{
@Test
public void clickOnButton() {
	driver.findElement(By.partialLinkText("BOOKS")).click();
	Reporter.log("Books page is displayed", true);
}
}

