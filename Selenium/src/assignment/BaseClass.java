package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.WelcomePage;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	welcomePage wp;
	HomePage hp;
	LoginPage lp;
	
	@BeforeClass
	public void openbrowser()throws IOException{
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 FileInputStream fis=new  FileInputStream("./Testdata/commondata1.properties");
		 prop=new Properties();
		 prop.load(fis);
		 driver.get(prop.getProperty("url"));
		
	}
	@BeforeMethod
	public void login()
	{
		wp=new welcomePage(driver);
		wp.getLoginLink().click();
		lp=new LoginPage(driver);
		lp.getEmailTF().sendKeys(prop.getProperty("email"));
		lp.getPasswordTF().sendKeys(prop.getProperty("password"));
		lp.getLoginButton().click();
	}
	@AfterMethod
	public void logout() {
		hp=new HomePage(driver);
		hp.getLogOutButton().click();
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
}
