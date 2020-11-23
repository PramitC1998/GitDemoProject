package SeleniumPack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleWindowNav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm");
        driver.manage().window().maximize();
	    String parentWindowId = driver.getWindowHandle();
	    System.out.println("Parent Window ID= "+parentWindowId);
	    WebElement Loginnow = driver.findElement(By.xpath("//*[@title='LOGIN NOW']"));
	    Loginnow.click();
	    Set <String> windids = driver.getWindowHandles();
	    System.out.println("Number of Open Windows= "+ windids.size());
	    Iterator <String> iter = windids.iterator();
	    String mainwindowId = iter.next().toString();
	    String subwindowId = iter.next().toString();
	    System.out.println("MainwindowID= "+mainwindowId);
	    System.out.println("SubwindowID= "+subwindowId);
	    driver.switchTo().window(subwindowId);
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    try {
	    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("User_Id")));
	    	driver.findElement(By.id("User_Id")).sendKeys("Selenium");
	    	Thread.sleep(3000);
	    	driver.close();
	    	driver.switchTo().window(mainwindowId);
	    	driver.findElement(By.id("topMnuinsurance")).click();
	    }catch (Exception e)
	    {
	    	System.out.println(e);
	    }
	    
	    	
	    }
	}

