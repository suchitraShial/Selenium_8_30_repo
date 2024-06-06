package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	public static void main(String[] args) throws IOException {
		//step-1:create FIS object
	FileInputStream fis=new FileInputStream("./testdata/commondata.properties");
	//step-2:create respective file type object
	Properties prop=new Properties();
	//call read method
	prop.load(fis);
	String URL=prop.getProperty("url");
	String EMAIL=prop.getProperty("email");
	String PASSWORD=prop.getProperty("password");
	String FIRSTNAME=prop.getProperty("firstname");
	String LASTNAME=prop.getProperty("lastname");
	String CONFIRMPASSWORD=prop.getProperty("confirmpassword");
	
	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(URL);
	WebElement registerLink=driver.findElement(By.xpath("//a[text()='Register']")); 
	registerLink.click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys(FIRSTNAME);
	driver.findElement(By.id("LastName")).sendKeys(LASTNAME);
	driver.findElement(By.id("Email")).sendKeys(EMAIL);
	driver.findElement(By.id("Password")).sendKeys(PASSWORD);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(CONFIRMPASSWORD);
	
	
	 WebElement registerButton=driver.findElement(By.xpath("//input[@value=\"Register\"]")); 
	 registerButton.submit();
	

	}

}
