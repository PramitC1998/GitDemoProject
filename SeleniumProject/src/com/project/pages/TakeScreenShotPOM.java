package com.project.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TakeScreenShotPOM {
	@FindBy(id="SW")
	WebElement moreMenu;
	@FindBy(id="fromCountryCode")
	WebElement gSearch;
	@FindBy(id="react-autowhatever-1-section-0-item-0")
	WebElement gInput;
	@FindBy(id="SW")
	WebElement PrinterElement;
	@FindBy(id="SW")
	WebElement PrinterElement1;
	@FindBy(id="SW")
	WebElement PrinterElement2;
	@FindBy(id="SW")
	WebElement PrinterElement3;
	@FindBy(id="SW")
	WebElement PrinterElement4;
	@FindBy(id="hsw_search_button")
	WebElement PrinterElement7;
	@FindBy(id="city")
	WebElement location;
	@FindBy(id="depart")
	WebElement dateV;
	@FindBy(id="return")
	WebElement dateV1;
	@FindBy(id="traveller")
	WebElement travellers;
	@FindBy(id="root")
	WebElement price;
	WebDriver driver;
	public TakeScreenShotPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void takeScreenshot() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
       // WebElement driver1 = driver.findElement(By.xpath("//html")).click();
        //WebDriverWait wait = new WebDriverWait(driver,80);
        moreMenu = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[7]/a/span[1]"));
	    moreMenu.click();
		moreMenu.click();
		
	    Thread.sleep(2000);
		
	   
	    gSearch = driver.findElement(By.xpath("//*[@id='fromCountryCode']"));
        gSearch.click();
        
        gInput = driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']/div/p/span"));
        gInput.click();
	   
        try {
        	//wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div/div/div/div/div[2]/label/span")));
        	 PrinterElement=driver.findElement(By.xpath("//*[@id=\"SW\"]/div/div/div/div/div[2]/label/span"));
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
        
            PrinterElement1=driver.findElement(By.xpath("//*[@id=\"SW\"]/div/div/div/div/div[3]/label/span"));
	        PrinterElement1.click();
	        
	        PrinterElement2=driver.findElement(By.xpath(" //*[@id=\"SW\"]/div/div/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[1]/div"));
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
	        PrinterElement3=driver.findElement(By.xpath(" //*[@id=\"SW\"]/div/div/div/div/div[4]/div[1]/div/div/span[3]"));
	        //System.out.println("Return Date is selected");
	        PrinterElement3.click();
	        
	        PrinterElement4=driver.findElement(By.xpath(" //*[@id=\"SW\"]/div/div/div/div/div[4]/div[1]/button"));
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
      
        
          location = driver.findElement(By.xpath("//*[@id='city']"));
		  if(location.getAttribute("value").equals("United Arab Emirates")) {
		  System.out.println("We have selected UAE as our location"); 
		  } 
		  else {
		  System.out.println("Invalid location input");
		  }

        dateV = driver.findElement(By.xpath("//*[@id='depart']"));
       // System.out.println("Price of visa ="+price.getText());
        if(dateV.getAttribute("value").equals("Mon, 30 Nov 2020")) {
        	System.out.println("Correct Departure Date is selected");
        }
        else
        {
        	System.out.println("date not same as selected");
        }
        
        dateV1 = driver.findElement(By.xpath("//*[@id='return']"));
        // System.out.println("Price of visa ="+price.getText());
         if(dateV1.getAttribute("value").equals("Sun, 06 Dec 2020")) {
         	System.out.println("Correct Return Date is selected");
         }
         else
         {
         	System.out.println("date not same as selected");
         }
         travellers = driver.findElement(By.xpath("//*[@id='traveller']"));
          //System.out.println("Number of travellers  ="+dateV2.getAttribute("value"));
			
			  if(travellers.getAttribute("value").equals("02")) {
			  System.out.println("We selected 2 travellers"); 
			  } 
			  else {
			  System.out.println("Invalid input");
			  }
			  
	     
			 
        //*[@id="traveller"]
        price = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div/div[1]/div[2]/div[1]/div[1]/div[2]/p"));
        System.out.println("Price of visa ="+price.getText());
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
