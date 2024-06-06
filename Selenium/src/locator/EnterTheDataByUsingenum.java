package locator;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheDataByUsingenum {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement usernameTextfield=driver.findElement(By.id("username"));
		usernameTextfield.sendKeys(Keys.CONTROL +"a");
		usernameTextfield.sendKeys(Keys.DELETE);
		usernameTextfield.sendKeys(Keys.chord("QSP"));
	}
}
