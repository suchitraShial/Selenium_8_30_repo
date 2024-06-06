package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment {
	@Test()
	public void createAccount() {
		Reporter.log("Account created", true);
		
	}
	@Test(dependsOnMethods="createAccount")
	public void editAccount() {
		Reporter.log("Account Edited", true);
	}
	@Test(dependsOnMethods={"createAccount","editAccount"})
	public void deleteAccount() {
		Reporter.log("Account Deleted", true);
	}
	
}
