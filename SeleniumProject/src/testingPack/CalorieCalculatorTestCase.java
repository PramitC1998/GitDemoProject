package testingPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalorieCalculatorTestCase {
	WebDriver driver = null;
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/calorie-calculator.html");
        driver.manage().window().maximize();
	}
	@Test
	public void enterCalorieDetails() {
        //WebElement ageTextBox = driver.findElement(By.id("cage"));
        WebElement ageTextBox = driver.findElement(By.xpath("//*[@id='cage']"));
        ageTextBox.clear();
        ageTextBox.sendKeys("45");
        //locate element by name attribute
        //import the package java.util
       // List <WebElement> genderList = driver.findElements(By.name("csex"));
        List <WebElement> genderList = driver.findElements(By.xpath("//*[@name='csex']"));
        if (genderList.size()>0)
        {
        	for (WebElement gender :genderList)
        	{
        		if (gender.getAttribute("value").equals("f")) {
        		if(!gender.isSelected()) {
        			gender.click();
        			break;
        		}
        		}
        	}
        }
	}
        		
       //By class attribute
        //WebElement table = driver.findElement(By.className("cinfoT"));
   /* @Test
	public void anotherTest() {    
	WebElement table = driver.findElement(By.xpath("//*[@class='cinfoT ']"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row:rows)
        {
        	List<WebElement> cols = table.findElements(By.tagName("td"));
        	for (WebElement col: cols)
        	{
        		System.out.println(col.getText()+ "\t");
        	}
        	System.out.println("");
        }
    }*/
    
 @AfterMethod
 public void close() throws InterruptedException {
	 Thread.sleep(2000);
	 if(driver!=null)
		 driver.close();
	 
	 //driver.quit();
 }
	 
 }
    
