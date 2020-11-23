package com.project.testcases;

import java.io.IOException;

import org.apache.poi.hpsf.Property;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.project.config.EnvSettings;
import com.project.pages.BMIPage;
import com.project.pages.CaloriePage;
import com.project.pages.CaloriePage2;
import com.project.pages.CaloriePage3;
import com.project.utils.PropertyReader;

public class CaloriePageTestCases {
    WebDriver driver = null;
    @Test
    public void EnterCalorieDetails() throws IOException
    {
    	//System.setProperty("webdriver.chrome.driver",PropertyReader.ReadProperty("chromedriverpath"));
    	System.setProperty("webdriver.chrome.driver",EnvSettings.QAEnv.chromedriverpath);;
    	driver = new ChromeDriver();
       // driver.get(PropertyReader.ReadProperty("appurl"));
    	driver.get(EnvSettings.QAEnv.appurl);
    	CaloriePage cp = new CaloriePage(driver);
        cp.EntercalorieDetails("45", "f");
    
        CaloriePage2 cp2 = new CaloriePage2(driver);
        cp.EntercalorieDetails("65", "m");
        
        CaloriePage3 cp3 = new CaloriePage3(driver);
        cp3 = PageFactory.initElements(driver, CaloriePage3.class);
        cp.EntercalorieDetails("75", "f");
        
        BMIPage bp =new BMIPage(driver);
        CaloriePage2 cp22 = bp.CalorieLinkClick();
        cp22.EntercalorieDetails("90", "f");
    }
}
