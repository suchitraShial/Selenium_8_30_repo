package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//step-1:create FIS object
	FileInputStream fis=new FileInputStream("./testdata/testscriptdata.xlsx");
	//step-2:create respective file type object
	Workbook workbook=WorkbookFactory.create(fis);
	//step-3:call read method
	  String  url=workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	  String  email=workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	  String  password=workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	  System.out.println(url);
	  System.out.println(email);
	  System.out.println(password);
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		WebElement loginLink=driver.findElement(By.xpath("//a[text()='Log in']")); 
		loginLink.click();
		driver.findElement(By.name("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(password);
		WebElement loginButton=driver.findElement(By.xpath("//input[@value='Log in']")); 
		 loginButton.submit();
}
}
