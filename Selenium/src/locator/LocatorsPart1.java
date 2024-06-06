package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPart1 {
	
	public static void main(String[] args) throws InterruptedException{
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://trello.com/login/");
    WebElement login = driver.findElement(By.id("user"));
    login.sendKeys("suchitrashial1@.com");
    Thread.sleep(5000);
    WebElement click=driver.findElement(By.id("login"));
    click.click();
    Thread.sleep(3000);
    driver.switchTo().newWindow(WindowType.TAB);
    driver.get("https://www.facebook.com/");
    WebElement textbutton=driver.findElement(By.cssSelector("button[type='submit']"));
    textbutton.click();
    Thread.sleep(3000);
    WebElement textbutton1=driver.findElement(By.cssSelector("input[id='email']"));
    textbutton1.sendKeys("suchitrashial1@.com");
    Thread.sleep(3000);
    WebElement textbutton2=driver.findElement(By.cssSelector("input[type='password']"));
    textbutton2.sendKeys("suchi@1234");
    Thread.sleep(3000);
    WebElement textbutton3=driver.findElement(By.cssSelector("button[name='login']"));
    textbutton3.click();
    Thread.sleep(3000);
    driver.switchTo().newWindow(WindowType.TAB);
    driver.get("https://shop-global.malaicha.com/login");
    Thread.sleep(3000);
    WebElement textbutton4=driver.findElement(By.cssSelector("button[type='submit']"));
    textbutton4.click();
    Thread.sleep(3000);
    
   //driver.quit(); 

}
}