package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/calorie-calculator.html");
        driver.manage().window().maximize();
        WebElement bmilink = driver.findElement(By.linkText("BMI"));
        //WebElement bmilink = driver.findElement(By.xpath("//*[@='BMI']"));
        bmilink.click();
        System.out.println("Title of the BMI page= " + driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("Title of the calorie page= "+driver.getCurrentUrl());
        Thread.sleep(2000);
        WebElement weightlink = driver.findElement(By.partialLinkText("Weight"));
        weightlink.click();
        Thread.sleep(2000);
        System.out.println("Title of the calorie page= "+driver.getPageSource());
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
	}

}
