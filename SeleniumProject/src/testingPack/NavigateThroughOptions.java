package testingPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NavigateThroughOptions {

	@Test
	public void navigate() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        //driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement moreMenu = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div/div/nav/ul/li[1]/a/span[2]"));
	    moreMenu.click();
	    WebDriverWait wait = new WebDriverWait(driver,40);
	    try {
	    	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span")));
	        WebElement PrinterElement=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span"));
	        PrinterElement.click();
	    }
	    catch(NoSuchElementException e) {
	    	System.out.println("No such element");
	    }
	    WebDriverWait wait2 = new WebDriverWait(driver,40);
	    try {
	    	wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[4]/div/p[2]")));
	        WebElement PrinterElement=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[4]/div/p[2]"));
	        PrinterElement.click();
	        Thread.sleep(2000);
	    }
	    catch(NoSuchElementException e) {
	    	System.out.println("No such element");
	    }
	    WebDriverWait wait3 = new WebDriverWait(driver,40);
	    try {
	    	wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/p/a")));
	        WebElement PrinterElement=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/p/a"));
	        PrinterElement.click();
	        Thread.sleep(2000);
	    }
	    catch(NoSuchElementException e1) {
	    	System.out.println("No such element");
	    }
	   
	    Thread.sleep(2000);
	    driver.navigate().back();
	}

}
