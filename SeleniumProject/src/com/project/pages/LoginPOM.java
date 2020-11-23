package com.project.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPOM {
	@FindBy(className="makeFlex column flexOne whiteText latoBold")
	WebElement loginBox;
	@FindBy(id="username")
	WebElement emailBox;
	@FindBy(className="capText font1")
	WebElement clickBox;
	@FindBy(id="SW")
	WebElement OTPclick;
	@FindBy(id="SW")
	WebElement OTPconsole;
	WebDriver driver;
	
	public LoginPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterLoginDetails(String email, String OTP) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver,60);
    loginBox = driver.findElement(By.xpath("//*[@class='makeFlex column flexOne whiteText latoBold']"));
    loginBox.click();
    //loginBox.click();
    emailBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
    emailBox.sendKeys(email);
    System.out.println("Email ID entered successfully");
    Thread.sleep(2000);
    clickBox = driver.findElement(By.xpath("//*[@class='capText font16']"));
    clickBox.click();
    Thread.sleep(2000);
    WebElement OTPcheck = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/section/form/div[1]/div/input"));
    OTPcheck.sendKeys(OTP);
    System.out.println("OTP entered successfully");
    Thread.sleep(3000);
    OTPclick = driver.findElement(By.xpath(" //*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button"));
    OTPclick.click();
    WebDriverWait wait2 = new WebDriverWait(driver,80);
    try {
    wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[1]/span")));
    OTPconsole = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[1]/span"));
    if(OTPconsole.getText().equals("Incorrect OTP Entered. Please try again."))
    {
    	System.out.println("OTP entered is not correct");
    }
    }
    catch(Exception e) {
    	System.out.println(e);
    }
    
}

}
