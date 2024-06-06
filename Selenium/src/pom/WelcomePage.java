package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//Initialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//declare
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	@FindBy(linkText="Register")
	private WebElement registerLink;
	
	@FindBy(linkText="small-searchterms")
	private WebElement seaechTextField;
	
	
	
	

	//getter
	public WebElement getLoginLink() {
		return loginLink;
	}

public WebElement getRegisterLink() {
		return registerLink;
	}
public WebElement getSeaechTextField() {
	return seaechTextField;
}
}
