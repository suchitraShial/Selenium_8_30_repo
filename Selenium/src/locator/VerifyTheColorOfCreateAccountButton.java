package locator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyTheColorOfCreateAccountButton 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flifkart.com/");
	WebElement CreateAccountButton =driver.findElement
			(By.xpath("//a[@text()='Create new account']"));
			String flifkartcreateButton =CreateAccountButton .getCssValue("background-color");
	System.out.println("loginbackgroundcolor"+flifkartcreateButton );
	String coveretedvalue=Color.fromString(flifkartcreateButton).asHex();
	System.out.println("coveretedvalue"+coveretedvalue);
			
}
}
