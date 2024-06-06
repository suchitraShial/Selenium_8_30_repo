package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demowebshop.tricentis.com/");
//	WebElement searchTF=driver.findElement(By.id("small-searchterms"));
//		searchTF.sendKeys("moblie",Keys.ENTER);
//		searchTF.sendKeys("selenium");
//	
	    WelcomePage wp=new WelcomePage(driver);
	   wp.getSeaechTextField().sendKeys("moblie",Keys.ENTER);
	   wp.getSeaechTextField().sendKeys("selenium");

	
	}	
		
}
