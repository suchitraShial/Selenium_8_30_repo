package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenDivisionPopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.makemytrip.com/");
	WebElement iframe=driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
	driver.switchTo().frame(iframe);
	driver.findElement(By.xpath("//a[@class='close']")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
	driver.manage().window().minimize();
	
}
}
