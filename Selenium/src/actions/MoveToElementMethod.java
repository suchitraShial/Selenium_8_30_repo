package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.firstcry.com/");
	WebElement boyFashionLink=driver.findElement(By.xpath("//a[text()=' BOY FASHION']"));
	WebElement GirlFashionLink=driver.findElement(By.xpath("//a[text()=' GIRL FASHION']"));
	WebElement FootwearLink=driver.findElement(By.xpath("//a[text()=' Footwear']"));
	WebElement toysLink=driver.findElement(By.xpath("//a[text()=' Toys']"));
	WebElement DiaperingLink=driver.findElement(By.xpath("//a[text()=' Diapering']"));
	WebElement  GearLink=driver.findElement(By.xpath("//a[text()=' Gear']"));
	WebElement FeedingLink=driver.findElement(By.xpath("//a[text()=' Feeding']"));
	WebElement BathLink=driver.findElement(By.xpath("//a[text()=' Bath']"));
	WebElement NurseryLink=driver.findElement(By.xpath("//a[text()=' Nursery']"));
	WebElement MomsLink=driver.findElement(By.xpath("//a[text()=' Moms']"));
	WebElement HealthLink=driver.findElement(By.xpath("//a[text()=' Health']"));
	WebElement  BoutiquesLink=driver.findElement(By.xpath("//a[text()=' Boutiques']"));
	
	Actions actions=new Actions(driver);
	actions.moveToElement(boyFashionLink).pause(1000).moveToElement(GirlFashionLink).pause(1000).moveToElement(FootwearLink).
	pause(1000).
    moveToElement(toysLink).pause(1000).moveToElement(DiaperingLink).pause(1000).moveToElement(GearLink).pause(1000).
	moveToElement(FeedingLink).pause(1000).moveToElement(BathLink).pause(1000).moveToElement(NurseryLink).pause(1000).
	moveToElement(MomsLink).pause(1000).moveToElement(HealthLink).pause(1000).moveToElement(BoutiquesLink).perform();
	
}
}
