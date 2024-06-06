package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindowPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/products_page/6");
		String parentIds=driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		Set<String>allwindowIds=driver.getWindowHandles();
		allwindowIds.remove(parentIds);
		for(String id:allwindowIds);{
			driver.switchTo().window(parentIds).close();
		
		//for(String id:allwindowIds) {
			//driver.switchTo().window(id);
			//String url=driver.switchTo().window(id).toString();
			//if(url.contains("flipkart"));
			//driver.manage().window().maximize();
			//driver.close();
		}
}
}