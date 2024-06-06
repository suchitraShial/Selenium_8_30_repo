package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
public  HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(linkText="Log out")
private WebElement logOutButton;

@FindBy(partialLinkText ="BOOKS")
private WebElement booksLink;

public WebElement getLogOutButton() {
	return logOutButton;
}

public WebElement getBooksLink() {
	return booksLink;
}

}
