package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheData {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement firstnameTextfield=driver.findElement(By.name("firstname"));
		String firstnameTextfieldvalue=firstnameTextfield.getAttribute("value");
		if( firstnameTextfieldvalue.isEmpty()) 
		{
			firstnameTextfield.sendKeys("QSP");
		}
		else
		{
			firstnameTextfield.clear();
			firstnameTextfield.sendKeys("qsp");
		}
			
	}

}
