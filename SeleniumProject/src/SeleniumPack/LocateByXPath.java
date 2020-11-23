package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/calorie-calculator.html");
        driver.manage().window().maximize();
        WebElement ageLabelByAbsPath = driver.findElement(By.xpath("/html/body/div[3]/div/div[5]/table[1]/tbody/tr[1]/td[1]"));
        System.out.println("Identifying label value of Absolute path = "+ ageLabelByAbsPath.getText());
        WebElement ageLabelByRelPath = driver.findElement(By.xpath("//table[@id ='calinputtable']/tbody/tr[1]/td[1]"));
        System.out.println("Identifying label value of Relative path = "+ ageLabelByRelPath.getText());
	}

}
