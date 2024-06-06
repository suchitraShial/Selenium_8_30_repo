package crossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestScript {
	 public WebDriver driver;
	 @Parameters("Browser")
@Test
public void launch(@Optional("chrome")   String browser)
{
	if(browser.equalsIgnoreCase("chrome")) {
		 driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		 driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("edge")) {
		 driver = new EdgeDriver();
	}
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
}
}
