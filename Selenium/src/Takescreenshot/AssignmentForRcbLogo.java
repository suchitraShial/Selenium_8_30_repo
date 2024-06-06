package Takescreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentForRcbLogo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalchallengers.com/");
		
	WebElement	RcbLogo	=driver.findElement(By.xpath("//div[@class='hdr-logo']//img"));
		String rcbImgTagName=RcbLogo.getTagName();
		System.out.println("TagName"+rcbImgTagName);
		if(rcbImgTagName.equals("img"))
		{
			System.out.println("Rcb logo creted with <img>");
		}else {
			System.out.println("rcb logo not created with<img>");
		}
	}

}
