package testingPack;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.utils.ExcelReader;

public class CalorieCalculatorDDT2 {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://www.calculator.net/calorie-calculator.html");
        driver.manage().window().maximize();
	}
	 @Test(dataProvider = "getDataDetails")
	   public void StartUp(Hashtable<String,String> data)throws InterruptedException {
		 //System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 //public void StartUp()throws InterruptedException {
	       // WebElement ageTextBox = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[5]/table[1]/tbody/tr[1]/td[2]/input"));
	        WebElement ageTextBox = driver.findElement(By.xpath("//*[@id='cage']"));
	        ageTextBox.clear();
	        ageTextBox.sendKeys(data.get("age"));
	        //WebElement genderList = driver.findElements(By.name("csex"));
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
	 }
	 @DataProvider
	 public Object[][] getDataDetails() throws IOException {
	     /* Object[][] data = new Object[1][1];
	      Hashtable<String,String> htable = new Hashtable<String,String>();
	      htable.put("age","45");
	      htable.put("gender","f");
	      data[0][0]=htable;
		  return data;*/
		String ProjectPath = System.getProperty("user.dir");
     	String filepath = ProjectPath + "/src/com/project/testdata";
     	String filename = "CalorieData.xlsx";
     	String sheetname = "CalorieSheet";
     	return ExcelReader.ReadFromExcelToObjArr(filepath, filename, sheetname);
	      
	 }
	 @AfterClass
	 public void close() throws InterruptedException {
		 Thread.sleep(2000);
		 if(driver!=null)
			 driver.close();
		 
		 //driver.quit();
	 }
}
	 
	 
	 
