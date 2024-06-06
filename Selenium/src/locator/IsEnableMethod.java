package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		
			WebElement	submitbutton	=	driver.findElement(By.name("submit"));
			Thread.sleep(2000);
			if(submitbutton.isEnabled())
			{
				submitbutton.click();
			}else {
				driver.findElement(By.xpath("//button[text()='Accept Terms of Service']")).click();
				
				Thread.sleep(2000);
				driver.findElement(By.id("confbtn")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='Close']")).click();
				
				Thread.sleep(2000);
				submitbutton.click();
			}
			
			Thread.sleep(2000);
			
			driver.manage().window().minimize();
			driver.quit();
		
	}
	
}
