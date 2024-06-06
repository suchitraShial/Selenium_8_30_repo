package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm");
		Thread.sleep(2000);
		WebElement usernameTextfield=driver.findElement(By.id("username"));
		 usernameTextfield.clear();
		 Thread.sleep(2000);
		 usernameTextfield.sendKeys("ADMIN");
		 Thread.sleep(2000);
			WebElement passwordTextfield=driver.findElement(By.id("password"));
			passwordTextfield.clear();
			 Thread.sleep(2000);
			 passwordTextfield.sendKeys("ADMIN");
			 Thread.sleep(2000);
			 driver.manage().window().minimize();
			 driver.quit();
			 
}
}
