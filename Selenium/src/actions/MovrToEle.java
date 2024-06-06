package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovrToEle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.myntra.com/");
	WebElement menopt=driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
	
	WebElement womenopt=driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Women']"));
	
	WebElement kidsopt=driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Kids']"));
	
	WebElement homeAndLivingopt=driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Home & Living']"));
	
	WebElement Beautyopt=driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Beauty']"));
	
	WebElement studiopt=driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Studio']"));
	
	Actions actions=new Actions(driver);
//	actions.moveToElement( menopt).pause(1000).moveToElement( womenopt).pause(1000).moveToElement(kidsopt).pause(1000)
//	.moveToElement(homeAndLivingopt).pause(1000).moveToElement( Beautyopt).pause(1000).moveToElement(studiopt).perform();
	
//men to studio one by one
//	actions.moveToElement(menopt, 0, 0).pause(1000).moveToElement(menopt, 73, 0).pause(1000).moveToElement(womenopt, 63, 0).pause(1000).
//	moveToElement(kidsopt, 96, 0).pause(1000).moveToElement(homeAndLivingopt, 73, 0).pause(1000).moveToElement(Beautyopt, 72, 0).pause(1000).
//	moveToElement(studiopt, 83, 0).perform();
	
	//men to studio
	actions.moveToElement(menopt, 0, 0).pause(1000).moveToElement(womenopt, 73, 0).pause(1000).perform();
	actions.moveToElement(menopt, 0, 0).pause(1000).moveToElement(Beautyopt, 352, 0).perform();
actions.moveToElement(menopt, 0, 0).pause(1000).moveToElement(kidsopt, 147, 0).pause(1000).perform();
//  
//	moveToElement(menopt, 0, 0).pause(1000).moveToElement(homeAndLivingopt, 244, 0).pause(1000).
//	
//	moveToElement(menopt, 0, 0).pause(1000).moveToElement(Beautyopt, 352, 0).pause(1000).
//
//	moveToElement(menopt, 0, 0).pause(1000).moveToElement(studiopt, 435, 0).perform();
	
	
	//reverse
//	actions.moveToElement(studiopt, 0, 0).pause(1000).moveToElement(Beautyopt, -83, 0).pause(1000).
//	moveToElement(homeAndLivingopt, -107, 0).pause(1000).moveToElement(kidsopt, -97, 0).pause(1000).
//	 moveToElement(womenopt, -74, 0).pause(1000).
//	moveToElement(menopt, -73, 0).pause(1000).moveToElement(menopt, 0, 0).perform();
	
//	actions.moveToElement(menopt, 0, 0).pause(1000).moveToElement(womenopt, 73, 0).perform();
//	actions.moveToElement(menopt, 0, 0).pause(1000).moveToElement(kidsopt, 147, 0).perform();
//	actions.moveToElement(menopt, 0, 0).pause(1000).moveToElement(homeAndLivingopt, 244, 0).perform();
//	actions.moveToElement(menopt, 0, 0).pause(1000).moveToElement(Beautyopt, 352, 0).perform();
//	actions.moveToElement(menopt, 0, 0).pause(1000).moveToElement(studiopt, 435, 0).perform();
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
}
}
