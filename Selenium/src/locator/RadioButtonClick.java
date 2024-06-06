package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonClick {
	public static void main(String[] args)throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		WebElement customRadioButton=driver.findElement
				(By.xpath("//label[text()='custom']/../input[@type='radio']"));
		customRadioButton.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
}
}