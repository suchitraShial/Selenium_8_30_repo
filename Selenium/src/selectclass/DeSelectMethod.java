package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file://c:/User/Admin/Desktop/multiselect.html");
	WebElement carsdropdown=driver.findElement(By.id("cars"));
	Select carsSelect=new Select(carsdropdown);
	if(carsSelect.isMultiple())
	{
		carsSelect.selectByValue("volvo");
		Thread.sleep(2000);
		carsSelect.selectByValue("opel");
		Thread.sleep(2000);
		carsSelect.selectByVisibleText("Audi");
		Thread.sleep(2000);
		carsSelect.selectByIndex(1);
		Thread.sleep(2000);
		carsSelect.deselectByValue("volvo");
		Thread.sleep(2000);
		}else
	 {
		System.out.println("The dropdown is single select");
	}
		driver.manage().window().minimize();
		driver.quit();
	
}
}
