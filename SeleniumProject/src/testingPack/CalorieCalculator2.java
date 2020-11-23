package testingPack;

import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalorieCalculator2 {
	WebDriver driver = null;
	@Test (dataProvider= "getDataDetails")
	public void enterCalorieDetails(Hashtable<String,String> data) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://www.calculator.net/calorie-calculator.html");
        driver.manage().window().maximize();
        //WebElement ageTextBox = driver.findElement(By.id("cage"));
        WebElement ageTextBox = driver.findElement(By.xpath("//*[@id='cage']"));
        ageTextBox.clear();
        ageTextBox.sendKeys(data.get("age"));
        //locate element by name attribute
        //import the package java.util
       // List <WebElement> genderList = driver.findElements(By.name("csex"));
        List <WebElement> genderList = driver.findElements(By.xpath("//*[@name='csex']"));
        if (genderList.size()>0)
        {
        	for (WebElement gender :genderList)
        	{
        		if (gender.getAttribute("value").equals(data.get("gender"))) {
        		if(!gender.isSelected()) {
        			gender.click();
        			break;
        		}
        		}
        	}
        }
        		
       //By class attribute
        //WebElement table = driver.findElement(By.className("cinfoT"));
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
	}
	@DataProvider
	 public Object[][] getDataDetails() {
	      Object[][] data = new Object[1][1];
	      Hashtable<String,String> htable = new Hashtable<String,String>();
	      htable.put("age","45");
	      htable.put("gender","f");
	      data[0][0]=htable;
		  return data;
	      
	 }

}
