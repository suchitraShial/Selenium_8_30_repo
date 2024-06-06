  package Sychcronization;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	try {
		driver.get("https://flipkart.com/");
	}
	catch(TimeoutException e)
	{
		System.out.println("The application is not capable of loading within time");
	}
	
}
}
