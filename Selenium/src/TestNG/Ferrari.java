package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ferrari {
	@Test(groups = "system")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ferrari.com/");
		Reporter.log("Ferrari launched successfully", true);
	}

}
