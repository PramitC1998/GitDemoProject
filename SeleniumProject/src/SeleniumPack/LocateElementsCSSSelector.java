package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementsCSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/calorie-calculator.html");
        driver.manage().window().maximize();
        System.out.println("Identify all elements by attributes that starts with c using CSS Selector");
        List<WebElement> starts = driver.findElements(By.cssSelector("[id ^='c']"));
        System.out.println(starts.size());
        for (WebElement element: starts) {
        	System.out.println(element.getAttribute("id"));
        }
        	
        	System.out.println("Identify all elements by attributes that contains height using CSSSelector");
            List<WebElement> containswithin = driver.findElements(By.cssSelector("[id*='height']"));
            System.out.println(containswithin.size());
            for (WebElement element1: containswithin) {
            	System.out.println(element1.getAttribute("id"));
        
        }
	}

}
