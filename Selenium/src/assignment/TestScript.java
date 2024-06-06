package assignment;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {
	@Test
	public void clickOnBooks() {
		hp=new HomePage(driver);
		hp.getBooksLink().click();
		Reporter.log("Books page is displayed", true);
	}
	

}
