package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUsageOfSubmitMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shop-global.malaicha.com/login");
	Thread.sleep(2000);
	WebElement registerOpt=driver.findElement(By.xpath("//button[text()='Register']"));
	registerOpt.submit();
	driver.manage().window().minimize();
	driver.quit();
	
}
}