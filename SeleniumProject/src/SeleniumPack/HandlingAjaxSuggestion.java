package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAjaxSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement googleSearch = driver.findElement(By.name("q"));
        googleSearch.sendKeys("Selenium");
        WebDriverWait wait  = new WebDriverWait(driver,30);
        try {
        	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@role='listbox']/li[1]")));
        	List<WebElement> lst = driver.findElements(By.xpath("//*[@role='listbox']/li"));
        	for (WebElement element: lst)
        	{
        		if(element.getText().equals("selenium tutorial"))
        		{
        			element.click();
        			break;
        		}
        	}
        }
        catch (Exception e) {
        	System.out.println(e);
        }
        
        	
        }
      
}
