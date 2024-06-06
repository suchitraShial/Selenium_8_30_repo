package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0); 
		 
		WebElement     srcEle=driver.findElement(By.id("draggable"));
		WebElement     targetEle=driver.findElement(By.id("droppable"));
	
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(srcEle).release(targetEle).perform();
		
}
}
