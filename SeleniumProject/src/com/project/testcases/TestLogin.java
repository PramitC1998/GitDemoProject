package com.project.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.project.config.EnvSettings;
import com.project.pages.LoginPOM;

public class TestLogin {
	WebDriver driver = null;
	@Test
	public void loginPage() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",EnvSettings.QAEnv.chromedriverpath);;
    	driver = new ChromeDriver();
       // driver.get(PropertyReader.ReadProperty("appurl"));
    	driver.get(EnvSettings.QAEnv.appurl);
    	LoginPOM lp = new LoginPOM(driver);
        lp.enterLoginDetails("pramit.chakraborty@gmail.com", "833348");
	}

}
