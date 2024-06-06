package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaptureAllTheopt {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement yearDropdown=driver.findElement(By.id("year"));
		Select yearselect=new Select(yearDropdown);
		List<WebElement>allyearopts=yearselect.getOptions();
		System.out.println(allyearopts.size());
		for(WebElement opt:allyearopts)
		{
			String optText=opt.getText();
			System.out.println(optText);
			 yearselect.selectByVisibleText(optText);
			 if(opt.isSelected()) {
				 System.out.println("The opt is in selectable format");
			 }else 
			 {
				 System.out.println("The opt is not in selectable format");
			 }
		}
		Thread.sleep(2000);
		//month
		WebElement monthDropdown=driver.findElement(By.id("month"));
		Select monthselect=new Select(yearDropdown);
		List<WebElement>allmonthopts=monthselect.getOptions();
		System.out.println(allmonthopts.size());
		for(WebElement monthopt:allmonthopts)
		{
			String MonthoptText= monthopt.getText();
			System.out.println(MonthoptText);
			 
			monthselect.selectByVisibleText(MonthoptText);
			 if(monthopt.isSelected()) {
				 System.out.println("The opt is in selectable format");
			 }else 
			 {
				 System.out.println("The opt is not in selectable format");
			 }
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}

