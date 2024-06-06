package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
public static void main(String[] args)throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_");
	Thread.sleep(2000);
	WebElement ATofS=driver.findElement
			(By.xpath("//button[text()='Accept terms of service']"));
	 ATofS.click();
}
}
