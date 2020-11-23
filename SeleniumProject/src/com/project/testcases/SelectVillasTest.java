package com.project.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.project.config.EnvSettings;
import com.project.pages.LoginPOM;
import com.project.pages.SelectVillasPOM;

public class SelectVillasTest {
	WebDriver driver = null;
	@Test
	public void loginPage() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",EnvSettings.QAEnv.chromedriverpath);;
    	driver = new ChromeDriver();
       // driver.get(PropertyReader.ReadProperty("appurl"));
    	driver.get(EnvSettings.QAEnv.appurl);
    	SelectVillasPOM sv = new SelectVillasPOM(driver);
        sv.selectVillas();
	}
}
