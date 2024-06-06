package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment01 {
	public static void main(String[] args) throws IOException {
		//step-1:create FIS object
	FileInputStream fis=new FileInputStream("./testdata/commondata1.properties");
	//step-2:create respective file type object
	Properties prop=new Properties();
	//call read method
	prop.load(fis);
	String URL=prop.getProperty("url");
	String EMAIL=prop.getProperty("email");
	String PASSWORD=prop.getProperty("password");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(URL);
	WebElement registerButton=driver.findElement(By.xpath("//a[text()='Log in']")); 
	registerButton.click();
	driver.findElement(By.name("Email")).sendKeys(EMAIL);
	driver.findElement(By.name("Password")).sendKeys(PASSWORD);
	 WebElement loginButton=driver.findElement(By.xpath("//input[@value='Log in']")); 
	 loginButton.submit();
	

	}
}
