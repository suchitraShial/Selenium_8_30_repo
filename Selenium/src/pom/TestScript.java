package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextfield().sendKeys("abhis1234@gmail.com");
		lp.getPassWordTextField().sendKeys("abhis@1234");
		lp.getLoginButton().click();
		
		HomePage hp=new HomePage(driver);
		hp.getLogoutLink().click();
}
} 