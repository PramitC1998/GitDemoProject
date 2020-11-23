package com.project.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.Objectmap.ObjectReposMMT;

public class LoginObjectReposMMT {
	@FindBy(className=ObjectReposMMT.LoginPage.s1)
	WebElement loginBox;
	@FindBy(id=ObjectReposMMT.LoginPage.s2)
	WebElement emailBox;
	@FindBy(className=ObjectReposMMT.LoginPage.s3)
	WebElement clickBox;
	@FindBy(id=ObjectReposMMT.LoginPage.s5)
	WebElement OTPclick;
	@FindBy(id = ObjectReposMMT.LoginPage.s7)
	WebElement OTPconsole;

	WebDriver driver;
	
	public LoginObjectReposMMT(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterLoginDetails(String email, String OTP) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver,60);
    WebElement loginBox = driver.findElement(By.xpath("//*[@class='makeFlex column flexOne whiteText latoBold']"));
    loginBox.click();
    //loginBox.click();
    WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
    emailBox.sendKeys(email);
    System.out.println("Email ID entered successfully");
    Thread.sleep(2000);
    WebElement clickBox = driver.findElement(By.xpath("//*[@class='capText font16']"));
    clickBox.click();
    Thread.sleep(2000);
    WebElement OTPcheck = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/section/form/div[1]/div/input"));
    OTPcheck.sendKeys(OTP);
    System.out.println("OTP entered successfully");
    Thread.sleep(3000);
    WebElement OTPclick = driver.findElement(By.xpath(" //*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button"));
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
