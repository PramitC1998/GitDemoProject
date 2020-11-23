package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByIdNameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/calorie-calculator.html");
        driver.manage().window().maximize();
        //WebElement ageTextBox = driver.findElement(By.id("cage"));
        WebElement ageTextBox = driver.findElement(By.xpath("//*[@id='cage']"));
        ageTextBox.clear();
        ageTextBox.sendKeys("45");
        System.out.println("Tagname of ageTextBox= "+ageTextBox.getTagName());
        System.out.println("ID of ageTextBox= "+ageTextBox.getAttribute("id"));
        System.out.println("name of ageTextBox= "+ageTextBox.getAttribute("name"));
        System.out.println("type of ageTextBox= "+ageTextBox.getAttribute("type"));
        System.out.println("class of ageTextBox= "+ageTextBox.getAttribute("class"));
        System.out.println("value of ageTextBox= "+ageTextBox.getAttribute("value"));
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
        
	}


