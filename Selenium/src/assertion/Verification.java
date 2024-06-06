package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification {
@Test
public void login() {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login","log in page is not isplayed");
		Reporter.log("log in page is displayed", true);
		
		
		if(driver.getTitle().equals("Demo web shop")) {
			Reporter.log("Log in page is displayed", true);
		}
		else {
			Reporter.log("Log in page is not  displayed", true);
		}
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		if(driver.getTitle().equals("Home page is displayed")) {
			Reporter.log("Home page is displayed", true);
		}
		else {
			Reporter.log("Home page is not  displayed", true);
		}
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Home page is not isplayed");
		Reporter.log("Home  page is displayed", true);
}
}
