package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyThestateOfDropdown {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	WebElement monthDropdown=driver.findElement(By.id("month"));
	Select monthselect=new Select(monthDropdown);
	if( monthselect.isMultiple()) {
		System.out.println("The drop down is multimselect");
	}else {
		 monthselect.selectByVisibleText("Dec");
	}
}}