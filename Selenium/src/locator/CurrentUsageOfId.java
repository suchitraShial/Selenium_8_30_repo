package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUsageOfId {
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//NoSuchElementException....sel...run...unchecked.
		//Address is mismatch.
		WebElement emailTextfield=driver.findElement(By.id("email"));
		emailTextfield.sendKeys("abc@gmail.com");
		
		
	}

	
	}

	
	


