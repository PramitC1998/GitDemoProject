package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/calorie-calculator.html");
        driver.manage().window().maximize();
        WebElement ageLabelbyCSS = driver.findElement(By.cssSelector("#calinputtable > tbody > tr:nth-child(1) > td:nth-child(1)"));
        System.out.println(ageLabelbyCSS.getText());
        WebElement ageTextBox = driver.findElement(By.cssSelector("#cage"));
        ageTextBox.clear();
        ageTextBox.sendKeys("65");
        System.out.println("Get CSS value of width of Age TextBox=" + ageTextBox.getCssValue("width"));
        WebElement table = driver.findElement(By.cssSelector(".cinfoT "));
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
