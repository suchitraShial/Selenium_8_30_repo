package Sychcronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.get("https://www.trello.com/");
	WebElement loginLink=driver.findElement(By.xpath("//a[text()='Log in']"));
	loginLink.click();
	wait.until(ExpectedConditions.titleIs("Log in to continue - Log in with Atlassian account"));
	WebElement emailTextField=driver.findElement(By.id("username"));
	emailTextField.sendKeys("suchitrashial1@gmail.com");
	WebElement continueButton=driver.findElement(By.id("login-submit"));
	continueButton.submit();
	WebElement passwordTextField=driver.findElement(By.id("password"));
	passwordTextField.sendKeys("suchi@1234");
	WebElement loginbutton=driver.findElement(By.id("login-submit"));
	loginbutton.submit();
   wait.until(ExpectedConditions.urlToBe("https://trello.com/u/suchitrashial1/boards"));
   WebElement createNewBoardopt=driver.findElement(By.xpath("//span[text()='Create new board']"));
   createNewBoardopt.click();
   WebElement boardtitleTextField=driver.findElement(By.xpath("//input[@data-testid='create-board-title-input']"));
   boardtitleTextField.sendKeys("SUCHITRA");
   WebElement createButton=driver.findElement(By.xpath("//button[@data-testid='create-board-submit-button']"));
   wait.until(ExpectedConditions.elementToBeClickable(createButton));
   createButton.click();
   

}
}
