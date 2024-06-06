package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB_Suchi {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		//day
		WebElement dayDropdown=driver.findElement(By.id("day"));
		Select dayselect=new Select(dayDropdown);
		dayselect.selectByIndex(0);
		Thread.sleep(2000);
		//month
		WebElement monthDropdown=driver.findElement(By.id("month"));
		Select monthselect=new Select(monthDropdown);
		monthselect.selectByValue("8");
		Thread.sleep(2000);
		//year
		WebElement yearDropdown=driver.findElement(By.id("year"));
		Select yearselect=new Select(yearDropdown);
		yearselect.selectByVisibleText("2001");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
