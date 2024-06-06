package selectclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleActiveEle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.switchTo().activeElement().sendKeys("abc@gmail.com");
	driver.switchTo().activeElement().sendKeys(Keys.TAB);
	driver.switchTo().activeElement().sendKeys("1234");
	driver.switchTo().activeElement().sendKeys(Keys.TAB);
	driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	
}
}
