package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementbyTextFn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/calorie-calculator.html");
        driver.manage().window().maximize();
        System.out.println("Identify all the elements that contains Active using the text function");
        List<WebElement> containswithin = driver.findElements(By.xpath("//*[@id='cactivity']/option[contains(text(),'Active')]"));
        for (WebElement element1: containswithin) {
        	System.out.println(element1.getText());
    
    }
        System.out.println("Identify all the elements that starts with Extra using the text function");
        List<WebElement> starts = driver.findElements(By.xpath("//*[@id='cactivity']/option[starts-with(text(),'Active')]"));
        for (WebElement element1: starts) {
        	System.out.println(element1.getText());
    
    }
        System.out.println("Identify all the elements that starts with the given text using the text function");
        List<WebElement> containstext = driver.findElements(By.xpath("//*[@id='cactivity']/option[text()='Very Active:intense exercise 6-7 times/week']"));
        //List<WebElement> containstext = driver.findElements(By.cssSelector("//*[@id='cactivity']/option[text()='Very Active:intense exercise 6-7 times/week']"));
        for (WebElement element1: containstext) {
        	System.out.println(element1.getText());
    
    }
	}

}
