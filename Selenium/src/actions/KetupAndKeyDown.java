package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KetupAndKeyDown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm");
		WebElement loginTextField=driver.findElement(By.id("username"));
		//WebElement passwordTextfield=driver.findElement(By.id("password"));
		Actions  actions=new Actions(driver);
		actions.keyDown(loginTextField, Keys.CONTROL).sendKeys(loginTextField, "a")
		.keyUp(loginTextField, Keys.CONTROL).sendKeys(loginTextField, Keys.DELETE)
		.keyDown(loginTextField, Keys.SHIFT).sendKeys(loginTextField, "suchitra").pause(1000)
		.keyUp(loginTextField, Keys.SHIFT).sendKeys(loginTextField, "swati").build().perform();
		
		
		
	}
}
