package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement loginButton=driver.findElement(By.name("login"));
		loginButton.click();
		Thread.sleep(2000);
		WebElement forgottenPWDLink=driver.findElement(By.linkText("forgotten password"));
		 forgottenPWDLink.click();
		 Thread.sleep(2000);
		 driver.manage().window().minimize();
		 driver.quit();
		
}}
