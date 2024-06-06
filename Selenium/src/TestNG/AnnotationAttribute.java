package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttribute {
@Test(priority=1)
public void sample() {
	Reporter.log("Sample testcase executed", true);
	
}
@Test(priority=2)
public void demo() {
	Reporter.log("demo testcase executed", true);
}
}
