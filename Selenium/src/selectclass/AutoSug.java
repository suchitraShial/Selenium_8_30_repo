package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSug {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("selenium");
	Thread.sleep(2000);
	List<WebElement> allAutoSugs=driver.findElements(By.xpath("//div[@role='presentation']/ul/li"));
	
	System.out.println(allAutoSugs.size());
	for(WebElement sug:allAutoSugs) {
		String sugText=sug.getText();
		System.out.println(sugText);
		if(sugText.contains("testing")) {
			sug.click();
			break;
		}
	}
}
}
