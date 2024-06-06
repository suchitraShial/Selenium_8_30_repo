package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkes {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com");
	WebElement passwordTextField=driver.findElement(By.id("pass"));
	WebElement loginButton=driver.findElement(By.name("login"));
	Actions  actions=new Actions(driver);
	actions.sendKeys("suchitrashial1@gmail.com").sendKeys(passwordTextField,"suchi@1234").click(loginButton).perform();
	
	
}
}
