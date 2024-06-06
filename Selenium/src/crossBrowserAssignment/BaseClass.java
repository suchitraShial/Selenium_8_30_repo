package crossBrowserAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	  @Parameters("Browser")
		@BeforeClass
		public void openBrowser(@Optional("chrome")String browser)
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
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://demowebshop.tricentis.com/");
		}
		@BeforeMethod
		public void login() {
			
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("abhis@1234");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			
		}
		@AfterMethod
		public void logout() {
			driver.findElement(By.linkText("Log out")).click();
		}
		@AfterClass
		public void closeBrowser()
		{
			driver.quit();
		}
	}


