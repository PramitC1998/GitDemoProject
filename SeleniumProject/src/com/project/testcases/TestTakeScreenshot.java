package com.project.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.project.config.EnvSettings;
import com.project.pages.TakeScreenShotPOM;

public class TestTakeScreenshot {
	WebDriver driver = null;
	@Test
	public void loginPage() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver",EnvSettings.QAEnv.chromedriverpath);;
    	driver = new ChromeDriver();
       // driver.get(PropertyReader.ReadProperty("appurl"));
    	driver.get(EnvSettings.QAEnv.appurl);
    	TakeScreenShotPOM lp = new TakeScreenShotPOM(driver);
        lp.takeScreenshot();
	}

}
