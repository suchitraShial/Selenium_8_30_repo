package Takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshortForCreatenewAccount {
public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		 String  timestamp =  LocalDateTime.now().toString().replace(':','-');
			driver.get("https://www.facebook.com/");
		WebElement ctreateAccountButton	=	driver.findElement(By.xpath("//a[text()='Create new account']"));
		File tempfile = ctreateAccountButton.getScreenshotAs(OutputType.FILE);
		File perfile = new File ("./DShots/"+timestamp+"screenshortForCreatenewAccount.png");
	FileUtils.copyFile(tempfile, perfile);
	driver.manage().window().minimize();
	driver.quit();
}
}
