package MakeMyTrip;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.utils.ExcelReader;

public class LoginMakeMyTripDDTExcel {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
	}
	 @Test(dataProvider = "getDataDetails")
	   public void StartUp(Hashtable<String,String> data)throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver,60);
	        WebElement loginBox = driver.findElement(By.xpath("//*[@class='makeFlex column flexOne whiteText latoBold']"));
	        loginBox.click();
	        //loginBox.click();
	        WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	        emailBox.sendKeys(data.get("Email"));
	        System.out.println("Email ID entered successfully");
	        Thread.sleep(2000);
	        WebElement clickBox = driver.findElement(By.xpath("//*[@class='capText font16']"));
	        clickBox.click();
	        Thread.sleep(2000);
	        WebElement OTPcheck = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/section/form/div[1]/div/input"));
	        OTPcheck.sendKeys(data.get("OTP"));
	        System.out.println("OTP entered successfully");
	        Thread.sleep(3000);
	        WebElement OTPclick = driver.findElement(By.xpath(" //*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button"));
	        OTPclick.click();
	        WebDriverWait wait2 = new WebDriverWait(driver,80);
	        try {
	            wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[1]/span")));
	            WebElement OTPconsole = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[1]/span"));
	            if(OTPconsole.getText().equals("Incorrect OTP Entered. Please try again."))
	            {
	            	System.out.println("OTP entered is not correct");
	            }
	            }
	            catch(Exception e) {
	            	System.out.println(e);
	            }
	        driver.close();
	 }
	 @DataProvider
	 public Object[][] getDataDetails() throws IOException {
	     /* Object[][] data = new Object[1][1];
	      Hashtable<String,String> htable = new Hashtable<String,String>();
	      htable.put("age","45");
	      htable.put("gender","f");
	      data[0][0]=htable;
		  return data;*/
		String ProjectPath = System.getProperty("user.dir");
     	String filepath = ProjectPath + "/src/com/project/testdata";
     	String filename = "LoginDetails.xlsx";
     	String sheetname = "LoginCredentials";
     	return ExcelReader.ReadFromExcelToObjArr(filepath, filename, sheetname);
	      
	 }
	 @AfterClass
	 public void close() throws InterruptedException {
		 Thread.sleep(2000);
		 if(driver!=null)
			 driver.close();
		 
		 //driver.quit();
	 }
}

	

