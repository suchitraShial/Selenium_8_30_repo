package webElement;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTheSizeAndPasition {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");//parent window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");//second window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.instagram.com/");//third window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");//fourth window
		Set<String> allwids=driver.getWindowHandles();
		for(String wid:allwids)
		{
			String widurl=driver.switchTo().window(wid).getCurrentUrl();
			System.out.println(widurl);
			if(widurl.equals("https://www.myntra.com/")) {
				
			}
			else if(widurl.equals("https://www.flipkart.com/")) {
				String childTitle=driver.switchTo().window(wid).getTitle();
				System.out.println("Third window title="+childTitle);
			}
			else if(widurl.equals("https://www.flipkart.com/"))
			{
				Dimension definedSize=new Dimension(500,500);
				driver.manage().window().setSize(definedSize);
				Point definedcoordinates=new Point(80,120);
				driver.manage().window().setPosition(definedcoordinates);
				
				
			}
		}
		
		
		
		
	}

}
