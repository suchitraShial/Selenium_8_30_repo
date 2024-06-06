package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsageOfName {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.Facebook.com/");
	WebElement emailOrMobileNoTextField=driver.findElement(By.name("email"));
	emailOrMobileNoTextField.click();

	}
}
