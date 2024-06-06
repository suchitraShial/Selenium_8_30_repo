package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment0506 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-tshirts");
			WebElement	CheckboxClick	=	driver.findElement
					(By.xpath("//label[text()='Tshirts']/..//input[@type='checkbox']"));
		if(CheckboxClick.isSelected())
		{
			System.out.println("Fail");
		}else {
			System.out.println("Pass");
			CheckboxClick.click();
		}
		
		
		
		
		
	}

}
