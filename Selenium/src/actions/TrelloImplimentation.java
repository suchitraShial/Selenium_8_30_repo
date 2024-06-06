package actions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloImplimentation {

	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://trello.com/ ");
		WebElement loginLink = driver.findElement(By.xpath("//div[contains(@class,'Buttonsstyles__ButtonGroup')]/a[text()='Log in']"));
		loginLink.click();
//	wait.until(ExpectedConditions.titleIs(" Log in to continue - Log in with Atlassian account"));
	WebElement	userNmaeTextField   = driver.findElement(By.id("username"));
	userNmaeTextField.sendKeys("suchitrashial1@gmail.com");
	WebElement continueBtn=driver.findElement(By.id("login-submit"));
	continueBtn.submit();
	WebElement pwdTextField = driver.findElement(By.id("password"));
	pwdTextField.sendKeys("suchi@1234");
	WebElement loginButton = driver.findElement(By.id("login-submit"));
	loginButton.submit();
//   verify Url
WebElement createNewBoard = driver.findElement(By.xpath("//span[text()='Create new board']" ));
createNewBoard.click();
 WebElement boardTitleTextField = driver.findElement(By.xpath("//input[@data-testid='create-board-title-input']"));
   boardTitleTextField.sendKeys("selenium01");
   Actions ac = new Actions(driver);
 WebElement  createButton = driver.findElement(By.xpath("//button[@data-testid='create-board-submit-button']"));
wait.until(ExpectedConditions.elementToBeClickable(createButton));
 ac.click(createButton).pause(2000).perform();
	WebElement	EnterListTextField	=	driver.findElement(By.name("Enter list title…"));
	ac.sendKeys(EnterListTextField, "Topics").pause(2000).sendKeys(Keys.ENTER).perform();
	 WebElement	addACardOpt	=	driver.findElement(By.xpath("//BUTTON[@data-testid='list-add-card-button']"));
 ac.click(addACardOpt).pause(2000).sendKeys("Joins SQL").sendKeys(Keys.ENTER).pause(2000).
sendKeys("BlackBox Testing Manual").sendKeys(Keys.ENTER).pause(2000).sendKeys("OOPS JAVA").sendKeys(Keys.ENTER).pause(2000).
sendKeys("Selenium Framework").sendKeys(Keys.ENTER).pause(2000).perform();
// WebElement closed1 = driver.findElement(By.xpath("//span[@data-testid='CloseIcon']"));
// ac.click(closed1).perform();
WebElement addAnotherList = driver.findElement(By.xpath("//button[@data-testid='list-composer-button']"));
ac.click(addAnotherList).pause(2000).sendKeys(" SQL").sendKeys(Keys.ENTER).pause(2000).sendKeys("Manual").
sendKeys(Keys.ENTER).pause(2000).sendKeys("Java").sendKeys(Keys.ENTER).pause(2000).sendKeys("Selenium").sendKeys(Keys.ENTER).pause(2000).perform();
//	WebElement			closed	=	driver.findElement(By.xpath("//span[@data-testid='CloseIcon']"));
//	ac.click(closed).perform();
WebElement SQLSrcFile	= driver.findElement(By.xpath("//div[@class='amUfYqLTZOvGsn']/a[text()='SQL']"));
WebElement SQLTargetFile = driver.findElement(By.xpath("//textarea[text()='SQL']"));
WebElement ManualSrcFile	= driver.findElement(By.xpath("//div[@class='amUfYqLTZOvGsn']/a[text()='BlackBox Testing Manual']"));
WebElement ManualTargetFile = driver.findElement(By.xpath("//textarea[text()='Manual']"));
WebElement JavaSrcFile	= driver.findElement(By.xpath("//div[@class='amUfYqLTZOvGsn']/a[text()='OOPS JAVA']"));
WebElement JavaTargetFile = driver.findElement(By.xpath("//textarea[text()='Java']"));
WebElement SeleniumSrcFile	= driver.findElement(By.xpath("//div[@class='amUfYqLTZOvGsn']/a[text()='Selenium Framework']"));
WebElement SeleniumTargetFile = driver.findElement(By.xpath("//textarea[text()='Selenium']"));
ac.dragAndDrop(SQLSrcFile, SQLTargetFile).pause(2000).dragAndDrop(ManualSrcFile, ManualTargetFile).pause(2000).
dragAndDrop(JavaSrcFile, JavaTargetFile).pause(2000).dragAndDrop(SeleniumSrcFile, SeleniumTargetFile).pause(2000).pause(2000).perform();
//	driver.manage().window().minimize();
//	driver.quit();
}
}


