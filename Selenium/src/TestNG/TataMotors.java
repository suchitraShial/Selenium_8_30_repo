package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TataMotors {
	@Test(groups = "system")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tatamotors.com/");
		Reporter.log("tatamotors launched successfully", true);
	}
}
