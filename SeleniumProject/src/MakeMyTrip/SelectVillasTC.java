package MakeMyTrip;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectVillasTC {
	@Test
	public void selectVillas() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
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
		  System.out.println("We have selected Mumbai as our location"); 
		  } 
		  else {
		  System.out.println("Invalid location input");
		  }

        WebElement dateD = driver.findElement(By.xpath("//*[@id='checkin']"));
       // System.out.println("Price of visa ="+price.getText());
        if(dateD.getAttribute("value").equals("Tue, 24 Nov 2020")) {
        	System.out.println("Correct Check-in Date is selected");
        }
        else
        {
        	System.out.println("date not same as selected");
        }
        
        WebElement dateR = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
        // System.out.println("Price of visa ="+price.getText());
         if(dateR.getAttribute("value").equals("Thu, 3 Dec 2020")) {
         	System.out.println("Correct checkout is selected");
         }
         else
         {
         	System.out.println("date not same as selected");
         }
         WebElement guest = driver.findElement(By.xpath("//*[@id=\"guest\"]"));
          //System.out.println("Number of travellers  ="+dateV2.getAttribute("value"));
			
			  if(guest.getAttribute("value").equals("1 Room, 4 Adults, 2 Children")) {
			  System.out.println("Right number of rooms and guests are selected"); 
			  } 
			  else {
			  System.out.println("Invalid input");
			  }
			  
	     
			 
        //*[@id="traveller"]
	    WebDriverWait wait6 = new WebDriverWait(driver,40);
		try {
		wait6.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"hlistpg_hotel_name\"]")));
        WebElement hotel1 = driver.findElement(By.xpath("//*[@id='htl_id_seo_201811151045246032']"));
        System.out.println("Name of hotel1 ="+hotel1.getText());
		}
		catch(Exception e) {
			System.out.println(e);
		}
        WebElement price1 = driver.findElement(By.xpath("//*[@id='hlistpg_hotel_shown_price']"));
        System.out.println("Price of hotel2 ="+price1.getText());
        
        WebElement hotel2 = driver.findElement(By.xpath("//*[@id='htl_id_seo_201606091607574291']"));
        System.out.println("Name of hotel2 ="+hotel2.getText());
        WebElement price2 = driver.findElement(By.xpath("//*[@id='hlistpg_hotel_shown_price']"));
        System.out.println("Price of hotel2 ="+price2.getText());
        
        
        Thread.sleep(2000);
        
        driver.close();
        System.out.println("Browser closed successfully");
	}


}
