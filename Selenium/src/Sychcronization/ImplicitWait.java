package Sychcronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
public static void main(String[] args) throws InterruptedException {
	//launch the empty chrome browser
	WebDriver driver=new ChromeDriver();
	//maximize window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//tigger the url
	driver.get("https://trello.com/");
	//clicked in login
	WebElement loginLink = driver.findElement(By.xpath("//a[text()='Log in']"));
	loginLink.click();
	String expectedLoginpageTitle =driver.getTitle();
	System.out.println("expectedLoginpageTitle"+expectedLoginpageTitle);
	String actualLoginpageTitle="Log in to continue - Log in with Atlassian account";
	System.out.println("actualLoginpageTitle"+actualLoginpageTitle);
	//enter the email
	WebElement usernameTextfield=driver.findElement(By.id("username"));
	usernameTextfield.sendKeys("suchitrashial1@gmail.com");
	//click on continue button
	WebElement continueButton=driver.findElement(By.id("login-submit"));
	continueButton.submit();
	//enter the password
	WebElement passwordtextField=driver.findElement(By.id("password"));
	 passwordtextField.sendKeys("suchi@1234");
	  //click on login button
	 WebElement loginButton=driver.findElement(By.id("login-submit")); 
	 loginButton.submit();
	 String expectedBoardpageTitle =driver.getTitle();
		System.out.println("expectedBoardLoginpageTitle"+ expectedBoardpageTitle);
		String actualBoardpageTitle="Trello Workspace (userworkspace65856524) | Trello";
		System.out.println("actualBoardpageTitle"+ actualBoardpageTitle);
		//click on createNewBoard
		WebElement createNewBoard = driver.findElement(By.xpath("//span[text()='Create new board']"));
		
		createNewBoard.click();
		//Thread.sleep(2000);
		//enter the board title
		WebElement boardTitleTextfield=driver.findElement(By.xpath("//input[@data-testid='create-board-title-input']"));
		boardTitleTextfield.sendKeys("BatchM7_M5");
		//Thread.sleep(2000);
				//v & v createButton
		WebElement createButton=driver.findElement(By.xpath("//button[@data-testid='create-board-submit-button']"));
		createButton.click();
		String expectedCreatedBoardsPage=driver.getTitle();
		  System.out.println("expectedCreatedBoardsPage="+expectedCreatedBoardsPage);
		  String actualCreatedBoardPage="BatchM7_M5 | Trello";
		  System.out.println("actualCreatedBoardPage"+actualCreatedBoardPage);
		  System.out.println("HURRY.......Successful");
		  driver.manage().window().minimize();
		  driver.quit();
		
}
}
