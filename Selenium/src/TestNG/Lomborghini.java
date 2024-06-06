package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lomborghini {
@Test(groups = "smoke")
public void launch() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.lamborghini.com/");
	Reporter.log("Lomborghini launched successfully", true);
}
}
