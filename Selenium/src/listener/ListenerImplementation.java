package listener;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.annotations.IListeners;

public class ListenerImplementation extends BaseClass implements ITestListener ,ISuiteListener
{

 @Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TestScript is failed", true);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		String methodname=result.getName();
		File dest=new File("./errorshots/"+methodname+".png");
		try {
			FileHandler.copy(temp, dest);
			}catch(IOException e) {
				e.printStackTrace();
		
		}
	}


	

}
