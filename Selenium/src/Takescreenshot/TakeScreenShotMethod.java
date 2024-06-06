package Takescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotMethod {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.the-maharajas.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		File permFile = new File ("./errosschoots/maharajpagesscreenshot.png");
		FileUtils.copyFile(tempfile, permFile);
		driver.manage().window().minimize();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
