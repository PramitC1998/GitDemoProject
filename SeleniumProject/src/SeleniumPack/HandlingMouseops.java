package SeleniumPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingMouseops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement componentsmenu = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a"));
	    componentsmenu.click();
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    Actions actions = new Actions(driver);
	    try {
	    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/div/ul/li[3]/a")));
	        WebElement PrinterElement=driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/div/ul/li[3]/a"));
	        actions.moveToElement(PrinterElement).click().build().perform();
	        //PrinterElement.click();
	    }
	    catch(NoSuchElementException e) {
	    	System.out.println("No such element");
	    }
	    
	}

}
