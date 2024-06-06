package webElement;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTheSizeAndPositionOfTheWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");// parent
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/signup");
		Set<String> allwids = driver.getWindowHandles();
		for (String wid : allwids) {
			String widUrl = driver.switchTo().window(wid).getCurrentUrl();
			System.out.println(widUrl);
			if (widUrl.equals("https://www.facebook.com/")) {
			} else if (widUrl.equals("https://www.facebook.com/signup")) {
				int childHeight = driver.manage().window().getSize().getHeight();
				System.out.println(" childHeight" + childHeight);
				int childwidth = driver.manage().window().getSize().getWidth();
				System.out.println(" childwidth" + childwidth);
				int childXaxis = driver.manage().window().getPosition().getX();
				System.out.println(" childXaxis" + childXaxis);
				int childYaxis = driver.manage().window().getPosition().getY();
				System.out.println(" childYaxis" + childYaxis);
			}

		}
	}

}
