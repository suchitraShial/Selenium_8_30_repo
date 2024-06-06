package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaptureTheFirstSlectedOpt {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	WebElement dayDropDown=driver.findElement(By.id("day"));
	Select daySelect=new Select(dayDropDown);
	String daydefaultopt=daySelect.getFirstSelectedOption().getText();
	System.out.println(daydefaultopt);
}
}
