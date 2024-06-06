package webDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaywithMultipleWindow
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.myntra.com");
	Set<String> allWids=driver.getWindowHandles();
	System.out.println(allWids.size());
	
}

}
