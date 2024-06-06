package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Sample2 {
	
		public static void main(String[] args) {
			//obj of browser
			WebDriver driver=new ChromeDriver();
			//trigger the main URL
			//InvalidArgumentException....sel...uncheked 
			//driver.get("facebook.com/");
			driver.get("https://www.facebook.com/");
			String fbLoginTitle =driver.getTitle();
			System.out.println("fbLoginTitle= "+fbLoginTitle);
		}

	}