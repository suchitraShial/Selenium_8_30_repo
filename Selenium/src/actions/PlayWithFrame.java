package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithFrame {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);
		String childFrameText=driver.findElement(By.tagName("h1")).getText();
		System.out.println("childFrameText ="+childFrameText);
		driver.switchTo().parentFrame();
		String parentFrameText=driver.findElement(By.tagName("p")).getText();
		System.out.println("parentFrameText="+parentFrameText);
		
}
}