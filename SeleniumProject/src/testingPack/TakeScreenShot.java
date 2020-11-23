package testingPack;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TakeScreenShot {

	/**
	 * @throws IOException
	 */
	@Test
	public void takeScreenshot() throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,80);
        WebElement moreMenu = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[7]/a/span[1]"));
	    moreMenu.click();
		
	   // WebElement moreMenu1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/input"));
	    //moreMenu1.click();
	    //moreMenu1.sendKeys("United Arab Emirates");
	   
	  //*[@id="SW"]/div/div/div/div/div[1]/div[1]/div/div/div/input
	    /*
		 * try { WebElement countrySearch = driver.findElement(By.xpath(
		 * "/html/body/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/div/input"
		 * )); countrySearch.sendKeys("United Arab Emirates"); } catch(Exception e) {
		 * System.out.println(e); }
		 */
        /*WebDriverWait wait  = new WebDriverWait(driver,40);
        try {
        	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div/div/div/div/div[1]/div[1]/div/div/div/input")));
        	 WebElement PrinterElement=driver.findElement(By.xpath("//*[@id=\"SW\"]/div/div/div/div/div[1]/div[1]/div/div/div/input"));
 	        PrinterElement.click();
 	        PrinterElement.sendKeys("United Arab Emirates");
        }
        catch (Exception e) {
        	System.out.println(e);
        }*/
       // WebDriverWait wait1  = new WebDriverWait(driver,40);
        try {
        	//wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div/div/div/div/div[2]/label/span")));
        	 WebElement PrinterElement=driver.findElement(By.xpath("//*[@id=\"SW\"]/div/div/div/div/div[2]/label/span"));
 	        PrinterElement.click();
 	        Thread.sleep(3000);
        }
        catch (Exception e) {
        	System.out.println(e);
        }
       // WebDriverWait wait2  = new WebDriverWait(driver,40);
        try {
        	//wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div/div[3]/label/span")));
        	 WebElement PrinterElement=driver.findElement(By.xpath("//*[@id=\"SW\"]/div/div/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[7]/div/p"));
 	        PrinterElement.click();
 	        Thread.sleep(3000);
        }
        catch (Exception e) {
        	System.out.println(e);
        }
        
        WebElement PrinterElement1=driver.findElement(By.xpath("//*[@id=\"SW\"]/div/div/div/div/div[3]/label/span"));
	        PrinterElement1.click();
	        
	        WebElement PrinterElement2=driver.findElement(By.xpath(" //*[@id=\"SW\"]/div/div/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[4]/div/p"));
	        PrinterElement2.click();
	        
	      //*[@id="SW"]/div/div/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[4]/div/p
		/*
		 * WebDriverWait wait3 = new WebDriverWait(driver,40); try {
		 * wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//*[@id=\"SW\"]/div/div/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/div[3]/div/p"
		 * ))); WebElement PrinterElement=driver.findElement(By.xpath(
		 * "//*[@id=\"SW\"]/div/div/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/div[3]/div/p"
		 * )); PrinterElement.click(); Thread.sleep(2000); } catch (Exception e) {
		 * System.out.println(e); }
		 * 
		 * WebDriverWait wait4 = new WebDriverWait(driver,40); try {
		 * wait4.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//*[@id=\"return\"]"))); WebElement
		 * PrinterElement=driver.findElement(By.xpath("//*[@id=\"return\"]"));
		 * PrinterElement.click(); Thread.sleep(2000); } catch (Exception e) {
		 * System.out.println(e); } WebDriverWait wait5 = new WebDriverWait(driver,40);
		 * try { wait5.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//*[@id=\"SW\"]/div/div/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[5]/div/p"
		 * ))); WebElement PrinterElement=driver.findElement(By.xpath(
		 * "//*[@id=\"SW\"]/div/div/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[5]/div/p"
		 * )); PrinterElement.click(); Thread.sleep(2000); } catch (Exception e) {
		 * System.out.println(e); }
		 */
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

}
