package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyTheColorOfLoginButton {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//rgba(8, 102, 255, 1)
		driver.manage().window().maximize();//#0866ff

		driver.get("https://www.facebook.com/");
		WebElement loginButton =driver.findElement(By.name("login"));
		String loginbackgroundcolor=loginButton.getCssValue("background-color");
		System.out.println("loginbackgroundcolor"+loginbackgroundcolor);
		String coveretedvalue=Color.fromString(loginbackgroundcolor).asHex();
		System.out.println("coveretedvalue"+coveretedvalue);
				
		
	}
 
}
