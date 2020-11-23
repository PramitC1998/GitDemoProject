package com.project.pages;

import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CalorieExcelRead {
	@FindBy(id="cage")
	WebElement ageTextBox;
	@FindBy(name="csex")
	List<WebElement> genderList;
	WebDriver driver;
	
	public CalorieExcelRead(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	 @Test(dataProvider = "getDataDetails")
	   public void StartUp(Hashtable<String,String> data)throws InterruptedException {
		 //System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 //public void StartUp()throws InterruptedException {
	       // WebElement ageTextBox = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[5]/table[1]/tbody/tr[1]/td[2]/input"));
	        ageTextBox = driver.findElement(By.xpath("//*[@id='cage']"));
	        ageTextBox.clear();
	        ageTextBox.sendKeys(data.get("age"));
	        //WebElement genderList = driver.findElements(By.name("csex"));
	        List <WebElement> genderList = driver.findElements(By.xpath("//*[@name='csex']"));
	        if (genderList.size()>0)
	        {
	        	for (WebElement gender :genderList)
	        	{
	        		if (gender.getAttribute("value").equals(data.get("gender"))) {
	        		if(!gender.isSelected()) {
	        			gender.click();
	        			break;
	        		}
	        		}
	        	}
	        }
	 }
}
