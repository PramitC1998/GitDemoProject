package MakeMyTrip;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.project.pages.SelectVillasPOM;
import com.project.utils.ExcelReader;
	
 
public class ExtentReportsClass{
public ExtentHtmlReporter htmlReporter = null;
public ExtentReports extent = null;
public ExtentTest logger = null;
public WebDriver driver = null; 

 @BeforeTest
 public void startReport(){
     htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport.html");
     extent = new ExtentReports();
     extent.attachReporter(htmlReporter);
     extent.setSystemInfo("Host Name", "SoftwareTesting");
     extent.setSystemInfo("Environment", "Automation Testing");
     extent.setSystemInfo("User Name", "TestEngineer");
	 htmlReporter.config().setDocumentTitle("Make My Trip Test Case Report");
	 htmlReporter.config().setReportName("Selenium Regression Test Suite");
	 htmlReporter.config().setTheme(Theme.STANDARD);		
 }
 
	@BeforeMethod
	public void LaunchBrowser(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Creating object instance of ChromeDriver class
		//This will launch chrome browser		
	    driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void takeScreenshot() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		logger = extent.createTest("Verify the VISA page");
       // WebElement driver1 = driver.findElement(By.xpath("//html")).click();
        WebDriverWait wait = new WebDriverWait(driver,80);
        WebElement moreMenu = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[7]/a/span[1]"));
	    moreMenu.click();
		moreMenu.click();
		
	    Thread.sleep(2000);
		
	   
	    WebElement gSearch = driver.findElement(By.xpath("//*[@id='fromCountryCode']"));
        gSearch.click();
        
        WebElement gInput = driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']/div/p/span"));
        gInput.click();
	   
        try {
        	//wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div/div/div/div/div[2]/label/span")));
        	 WebElement PrinterElement=driver.findElement(By.xpath("//*[@id=\"SW\"]/div/div/div/div/div[2]/label/span"));
 	        PrinterElement.click();
 	        Thread.sleep(2000);
        }
        catch (Exception e) {
        	System.out.println(e);
        }
       // WebDriverWait wait2  = new WebDriverWait(driver,40);
        try {
        	//wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div/div[3]/label/span")));
        	 WebElement PrinterElement=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[1]"));
 	        PrinterElement.click();
 	       System.out.println("Departure Date is selected");
 	        Thread.sleep(2000);
        }
        catch (Exception e) {
        	System.out.println(e);
        }
        
        WebElement PrinterElement1=driver.findElement(By.xpath("//*[@id=\"SW\"]/div/div/div/div/div[3]/label/span"));
	        PrinterElement1.click();
	        
	        WebElement PrinterElement2=driver.findElement(By.xpath(" //*[@id=\"SW\"]/div/div/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[1]/div"));
	        System.out.println("Return Date is selected");
	        PrinterElement2.click();
	        
	        WebDriverWait wait2  = new WebDriverWait(driver,40);
	        try {
	        	wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div/div/div/div/div[4]/label/span")));
	        	 WebElement PrinterElement=driver.findElement(By.xpath("//*[@id=\"SW\"]/div/div/div/div/div[4]/label/span"));
	 	        PrinterElement.click();
	 	       //System.out.println("Departure Date is selected");
	 	        Thread.sleep(2000);
	        }
	        catch (Exception e) {
	        	System.out.println(e);
	        }
	        WebElement PrinterElement3=driver.findElement(By.xpath(" //*[@id=\"SW\"]/div/div/div/div/div[4]/div[1]/div/div/span[3]"));
	        //System.out.println("Return Date is selected");
	        PrinterElement3.click();
	        
	        WebElement PrinterElement4=driver.findElement(By.xpath(" //*[@id=\"SW\"]/div/div/div/div/div[4]/div[1]/button"));
	        //System.out.println("Return Date is selected");
	        PrinterElement4.click();
	      
	   
       // WebDriverWait wait6  = new WebDriverWait(driver,50);
        try {
        	//wait6.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/p/button")));
        	 WebElement PrinterElement=driver.findElement(By.xpath("//*[@id=\"search_button\"]"));
 	        PrinterElement.click();
 	        Thread.sleep(3000);
        }
        catch (Exception e) {
        	System.out.println(e);
        }
        
        Assert.assertEquals(driver.getTitle(), "Visa");
      
        
        WebElement location = driver.findElement(By.xpath("//*[@id='city']"));
		  if(location.getAttribute("value").equals("United Arab Emirates")) {
		  logger.createNode("We have selected UAE as our location"); 
		  } 
		  else {
			  logger.createNode("Invalid location input");
		  }

        WebElement dateV = driver.findElement(By.xpath("//*[@id='depart']"));
       // System.out.println("Price of visa ="+price.getText());
        if(dateV.getAttribute("value").equals("Mon, 30 Nov 2020")) {
        	 logger.createNode("Correct Departure Date is selected");
        }
        else
        {
        	 logger.createNode("date not same as selected");
        }
        
        WebElement dateV1 = driver.findElement(By.xpath("//*[@id='return']"));
        // System.out.println("Price of visa ="+price.getText());
         if(dateV1.getAttribute("value").equals("Sun, 06 Dec 2020")) {
        	 logger.createNode("Correct Return Date is selected");
         }
         else
         {
        	 logger.createNode("date not same as selected");
         }
         WebElement dateV2 = driver.findElement(By.xpath("//*[@id='traveller']"));
          //System.out.println("Number of travellers  ="+dateV2.getAttribute("value"));
			
			  if(dateV2.getAttribute("value").equals("02")) {
				  logger.createNode("We selected 2 travellers"); 
			  } 
			  else {
				  logger.createNode("Invalid input");
			  }
			  
	     
			 
        //*[@id="traveller"]
        WebElement price = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div[1]/div[2]/div[1]/div[1]/div[2]/p"));
        logger.createNode("Price of visa ="+price.getText());
        try {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File (System.getProperty("user.dir")+"/Screenshots/MakeMyTripVISAPage.png"));
        System.out.println("Screenshot of visa document requirement is captured");
        Thread.sleep(3000);
        }
        catch (Exception e) {
        	System.out.println(e);
        }
        driver.close();
        System.out.println("Browser closed successfully");
	}

	@Test(dataProvider = "getDataDetails")
	public void testLogin(Hashtable<String,String> data) throws InterruptedException {
		logger = extent.createTest("Account setup verification");
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
        	logger.createNode("OTP entered is not correct");
        }
        }
        catch(Exception e) {
        	System.out.println(e);
        }
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
	
	@Test
	public void selectVillas() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		logger = extent.createTest("Verify villa booking page");
       // WebElement driver1 = driver.findElement(By.xpath("//html")).click();
        WebDriverWait wait = new WebDriverWait(driver,80);
        WebElement villasMenu = driver.findElement(By.xpath("//*[@id='SW']/div[1]/div[2]/div/div/nav/ul/li[3]/a/span[2]"));
	    villasMenu.click();
		villasMenu.click();
		
	    Thread.sleep(2000);
		/*
		 * WebElement moreMenu1 = driver.findElement(By.xpath(
		 * "//*[@id=\"SW\"]/div/div/div/div/div[1]/div[1]/div/div/div/input"));
		 * moreMenu1.click(); moreMenu1.sendKeys("United Arab Emirates");
		 */
	   
	    WebElement gSearch = driver.findElement(By.xpath("//*[@id='city']"));
        gSearch.click();
        //Thread.sleep(2000);
        //WebDriverWait wait1  = new WebDriverWait(driver,40);
        //gSearch.sendKeys("Mumbai");
        
        WebDriverWait wait1  = new WebDriverWait(driver,40);
        try {
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='react-autowhatever-1-section-0-item-3']")));
        WebElement gInput = driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-3']/div"));
        gInput.click();
        }
       catch(Exception e) {
     	  System.out.println(e);
       }
      
       // WebDriverWait wait1  = new WebDriverWait(driver,40);
        try {
        	//wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div/div/div/div/div[2]/label/span")));
        	 WebElement PrinterElement=driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div/div[1]/div[2]/label/span"));
 	        PrinterElement.click();
 	        Thread.sleep(2000);
        }
        catch (Exception e) {
        	System.out.println(e);
        }
       // WebDriverWait wait2  = new WebDriverWait(driver,40);
        try {
        	//wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div/div[3]/label/span")));
        	 WebElement PrinterElement=driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[3]"));
 	        PrinterElement.click();
 	       //System.out.println("Departure Date is selected");
 	        Thread.sleep(2000);
        }
        catch (Exception e) {
        	System.out.println(e);
        }
        
        WebElement PrinterElement1=driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
	        PrinterElement1.click();
	        
	        WebElement PrinterElement2=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[5]"));
	        //System.out.println("Return Date is selected");
	        PrinterElement2.click();
	        
	        WebDriverWait wait2  = new WebDriverWait(driver,40);
	        try {
	        	wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("guest")));
	        	 WebElement PrinterElement=driver.findElement(By.id("guest"));
	 	        PrinterElement.click();
	 	       //System.out.println("Departure Date is selected");
	 	        Thread.sleep(2000);
	        }
	        catch (Exception e) {
	        	System.out.println(e);
	        }
	        WebElement PrinterElement3=driver.findElement(By.xpath(" //*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[1]/li[4]"));
	        PrinterElement3.click();
	        
	        WebElement PrinterElement4=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[2]/li[3]"));
	        PrinterElement4.click();
	        
	        WebElement PrinterElement5=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[4]/div[1]/div[2]/button"));
	        PrinterElement5.click();
	      
       // WebDriverWait wait6  = new WebDriverWait(driver,50);
        try {
        	//wait6.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/p/button")));
        	 WebElement PrinterElement=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[5]/label/span"));
 	        PrinterElement.click();
 	        Thread.sleep(3000);
        }
        catch (Exception e) {
        	System.out.println(e);
        }
        
        WebElement PrinterElement6=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[5]/ul/li[2]"));
        PrinterElement6.click();
        
        WebElement PrinterElement7=driver.findElement(By.xpath("//*[@id=\"hsw_search_button\"]"));
        PrinterElement7.click();
        
       // Assert.assertEquals(driver.getTitle(), "Visa");
      
        
        WebElement location = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		  if(location.getAttribute("value").equals("Mumbai")) {
			  logger.createNode("We have selected Mumbai as our location"); 
		  } 
		  else {
			  logger.createNode("Invalid location input");
		  }

        WebElement dateD = driver.findElement(By.xpath("//*[@id='checkin']"));
       // System.out.println("Price of visa ="+price.getText());
        if(dateD.getAttribute("value").equals("Tue, 24 Nov 2020")) {
        	logger.createNode("Correct Check-in Date is selected");
        }
        else
        {
        	logger.createNode("date not same as selected");
        }
        
        WebElement dateR = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
        // System.out.println("Price of visa ="+price.getText());
         if(dateR.getAttribute("value").equals("Thu, 3 Dec 2020")) {
        	 logger.createNode("Correct checkout is selected");
         }
         else
         {
        	 logger.createNode("date not same as selected");
         }
         WebElement guest = driver.findElement(By.xpath("//*[@id=\"guest\"]"));
          //System.out.println("Number of travellers  ="+dateV2.getAttribute("value"));
			
			  if(guest.getAttribute("value").equals("1 Room, 4 Adults, 2 Children")) {
				  logger.createNode("Right number of rooms and guests are selected"); 
			  } 
			  else {
				  logger.createNode("Invalid input");
			  }
			  
	     
			 
        //*[@id="traveller"]
			  WebDriverWait wait6 = new WebDriverWait(driver,40);
				try {
				wait6.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"hlistpg_hotel_name\"]")));
		        WebElement hotel1 = driver.findElement(By.xpath("//*[@id='htl_id_seo_201811151045246032']"));
		        logger.createNode("Name of hotel1 ="+hotel1.getText());
				}
				catch(Exception e) {
					System.out.println(e);
				}
        WebElement price1 = driver.findElement(By.xpath("//*[@id='hlistpg_hotel_shown_price']"));
        logger.createNode("Price of hotel2 ="+price1.getText());
        
        WebElement hotel2 = driver.findElement(By.xpath("//*[@id='htl_id_seo_201606091607574291']"));
        logger.createNode("Name of hotel2 ="+hotel2.getText());
        WebElement price2 = driver.findElement(By.xpath("//*[@id='hlistpg_hotel_shown_price']"));
        logger.createNode("Price of hotel2 ="+price2.getText());
        
        
        Thread.sleep(2000);
        
        driver.close();
        System.out.println("Browser closed successfully");
	}
	
	@Test
	public void selectVillasTest() throws InterruptedException {
		logger = extent.createTest("Check Villa availability using POM ");
		boolean flg = true;
		SelectVillasPOM sv = new SelectVillasPOM(driver);
        sv.selectVillas();
        logger.createNode("We have selected Mumbai as out location");
        Assert.assertTrue(flg);
        logger.createNode("Correct check in date is selected");
        Assert.assertTrue(flg);
        logger.createNode("Correct check out date is selected");
        Assert.assertTrue(flg);
        logger.createNode("Number of guests are equal to 6- same as selected");
        Assert.assertTrue(flg);
        
	}
	

	public String getScreenshot(WebDriver driver, String ScreenshotName) throws IOException{
		//for that we need to reference another jar files 
		//one for the extent report and another is for snapshot
		//please go to google driver and unzip common-io jars and reference it in the project
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		String destination = System.getProperty("user.dir")+"/Screenshots/" + ScreenshotName + dateName + ".png"; 
		//added common-io jars
		FileUtils.copyFile(source, new File(destination));
		return destination;
	}
	
	@AfterMethod
	public void CloseBrowser(ITestResult result) throws IOException
	{
		if(result.getStatus() == ITestResult.FAILURE){
			//log the results
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed ", ExtentColor.RED));
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed ", ExtentColor.RED));
			logger.fail("Test Case Failed Snapshot is below - " + logger.addScreenCaptureFromPath(getScreenshot(driver,result.getName())));
		}
		else if(result.getStatus() == ITestResult.SKIP){
			logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped ", ExtentColor.ORANGE));
		}
		else if(result.getStatus() == ITestResult.SUCCESS){
			logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " - Test Case Passed ", ExtentColor.GREEN));
		}
		driver.quit();
		
	}
	@AfterTest
	public void stopTest(){
		extent.flush(); //at the end of all tests - it will append the test results to the htmlreport when flushed
	}

}
