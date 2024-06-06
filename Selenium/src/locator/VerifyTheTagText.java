package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import org.openqa.selenium.WebElement;
public class VerifyTheTagText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement forgottenPwdLink=driver.findElement(By.xpath("//a[contains@href,'//www.facebook.com/recover/initiate/?privacy']"));
	String forgottenPwdLinkTagText=forgottenPwdLink.getText();
	
	System.out.println(" forgottenPwdLinkTagText"+ forgottenPwdLinkTagText);
}
}
