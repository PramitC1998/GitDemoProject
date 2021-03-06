package testingPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingFrames {
     WebDriver driver;
     @Test
	public void handlingframe() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
	    WebElement frameElement = driver.findElement(By.className("demo-frame"));
	    driver.switchTo().frame(frameElement);
	    Actions actions = new Actions(driver);
	    WebElement dragElement = driver.findElement(By.id("draggable"));
	    WebElement dropElement = driver.findElement(By.id("droppable"));
	    actions.dragAndDrop(dragElement,dropElement).build().perform();
	    if(dropElement.getText().contentEquals("Dropped!"))
	    {
	    	System.out.println("Dropped Successfully");
	    }
	    else
	    	System.out.println("Dropped unsuccessfully");
	    Thread.sleep(2000);
	    driver.close();
	    
	}

}
