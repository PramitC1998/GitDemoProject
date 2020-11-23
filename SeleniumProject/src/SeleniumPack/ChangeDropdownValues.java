package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChangeDropdownValues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/calorie-calculator.html");
        driver.manage().window().maximize();
        WebElement activitydd = driver.findElement(By.id("cactivity"));
        //WebElement activitydd = driver.findElement(By.xpath("//*[@id= 'cactivity']"));
        Select dd = new Select (activitydd);
        System.out.println("default select dropdown value- Moderate = " + dd.getFirstSelectedOption().getText());
        dd.selectByIndex(0);
        Thread.sleep(2000);
        System.out.println("changed select dropdown value to index 0- Basal = " + dd.getFirstSelectedOption().getText());
        dd.selectByValue("1.55");
        Thread.sleep(2000);
        System.out.println("changed select dropdown value by value 1.55 - Basal = " + dd.getFirstSelectedOption().getText());
        dd.deselectByVisibleText("Extra Active: very intense exercise daily, or physical job");
        Thread.sleep(2000);
        System.out.println("changed select dropdown value by visible text - Basal = " + dd.getFirstSelectedOption().getText());
        System.out.println("Is the dropdown multiselect= " + dd.isMultiple());
	}

}
