package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.selenium.dev/");
				String seleniumHomePageUrl = driver.getCurrentUrl();
				System.out.println("Current Url is ="+seleniumHomePageUrl);
			}		
	}
