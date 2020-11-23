package com.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectVillasPOM {
	@FindBy(id="SW")
	WebElement villasMenu;
	@FindBy(id="city")
	WebElement gSearch;
	@FindBy(id="react-autowhatever-1-section-0-item-3")
	WebElement gInput;
	@FindBy(id="root")
	WebElement PrinterElement;
	@FindBy(id="checkout")
	WebElement PrinterElement1;
	@FindBy(id="root")
	WebElement PrinterElement2;
	@FindBy(id="guest")
	WebElement PrinterElement0;
	@FindBy(id="root")
	WebElement PrinterElement3;
	@FindBy(id="root")
	WebElement PrinterElement4;
	@FindBy(id="root")
	WebElement PrinterElement5;
	@FindBy(id="root")
	WebElement PrinterElement00;
	@FindBy(id="root")
	WebElement PrinterElement6;
	@FindBy(id="hsw_search_button")
	WebElement PrinterElement7;
	@FindBy(id="city")
	WebElement location;
	@FindBy(id="checkin")
	WebElement dateD;
	@FindBy(id="checkout")
	WebElement dateR;
	@FindBy(id="guest")
	WebElement guest;
	@FindBy(id="htl_id_seo_201811151045246032")
	WebElement hotel1;
	@FindBy(id="hlistpg_hotel_shown_price")
	WebElement price1;
	//WebElement OTPconsole;
	WebDriver driver;
	
	public SelectVillasPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void selectVillas() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver,80);
	        villasMenu = driver.findElement(By.xpath("//*[@id='SW']/div[1]/div[2]/div/div/nav/ul/li[3]/a/span[2]"));
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
	       gInput = driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-3']/div"));
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
	        	 PrinterElement00=driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[3]"));
	 	        PrinterElement00.click();
	 	       //System.out.println("Departure Date is selected");
	 	        Thread.sleep(2000);
	        }
	        catch (Exception e) {
	        	System.out.println(e);
	        }
	        
	            PrinterElement1=driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
		        PrinterElement1.click();
		        
		        PrinterElement2=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[5]"));
		        //System.out.println("Return Date is selected");
		        PrinterElement2.click();
		        
		        WebDriverWait wait2  = new WebDriverWait(driver,40);
		        try {
		        	wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("guest")));
		        	PrinterElement0=driver.findElement(By.id("guest"));
		 	        PrinterElement0.click();
		 	       //System.out.println("Departure Date is selected");
		 	        Thread.sleep(2000);
		        }
		        catch (Exception e) {
		        	System.out.println(e);
		        }
		        PrinterElement3=driver.findElement(By.xpath(" //*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[1]/li[4]"));
		        PrinterElement3.click();
		        
		        PrinterElement4=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[2]/li[3]"));
		        PrinterElement4.click();
		        
		        PrinterElement5=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[4]/div[1]/div[2]/button"));
		        PrinterElement5.click();
		      
	       // WebDriverWait wait6  = new WebDriverWait(driver,50);
	        try {
	        	//wait6.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/p/button")));
	        	PrinterElement00=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[5]/label/span"));
	 	        PrinterElement00.click();
	 	        Thread.sleep(3000);
	        }
	        catch (Exception e) {
	        	System.out.println(e);
	        }
	        
	        PrinterElement6=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[1]/div[5]/ul/li[2]"));
	        PrinterElement6.click();
	        
	        PrinterElement7=driver.findElement(By.xpath("//*[@id=\"hsw_search_button\"]"));
	        PrinterElement7.click();
	        
	       // Assert.assertEquals(driver.getTitle(), "Visa");
	      
	        
	          location = driver.findElement(By.xpath("//*[@id=\"city\"]"));
			  if(location.getAttribute("value").equals("Mumbai")) {
			  System.out.println("We have selected Mumbai as our location"); 
			  } 
			  else {
			  System.out.println("Invalid location input");
			  }

	        dateD = driver.findElement(By.xpath("//*[@id='checkin']"));
	       // System.out.println("Price of visa ="+price.getText());
	        if(dateD.getAttribute("value").equals("Tue, 24 Nov 2020")) {
	        	System.out.println("Correct Check-in Date is selected");
	        }
	        else
	        {
	        	System.out.println("date not same as selected");
	        }
	        
	        dateR = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
	        // System.out.println("Price of visa ="+price.getText());
	         if(dateR.getAttribute("value").equals("Thu, 3 Dec 2020")) {
	         	System.out.println("Correct checkout is selected");
	         }
	         else
	         {
	         	System.out.println("date not same as selected");
	         }
	         guest = driver.findElement(By.xpath("//*[@id=\"guest\"]"));
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
	        hotel1 = driver.findElement(By.xpath("//*[@id='htl_id_seo_201811151045246032']"));
	        System.out.println("Name of hotel1 ="+hotel1.getText());
			}
			catch(Exception e) {
				System.out.println(e);
			}
	         price1 = driver.findElement(By.xpath("//*[@id='hlistpg_hotel_shown_price']"));
	        System.out.println("Price of hotel1 ="+price1.getText());
	        
	        WebElement hotel2 = driver.findElement(By.xpath("//*[@id='htl_id_seo_201606091607574291']"));
	        System.out.println("Name of hotel2 ="+hotel2.getText());
	        WebElement price2 = driver.findElement(By.xpath("//*[@id='hlistpg_hotel_shown_price']"));
	        System.out.println("Price of hotel2 ="+price2.getText());
	        
	        
	        Thread.sleep(2000);
	        
	        driver.close();
	        System.out.println("Browser closed successfully");
		}

	}


