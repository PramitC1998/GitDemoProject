package SeleniumPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopUpsAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/calorie-calculator.html");
        driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("alert('This is an informational alert');");
	    Alert alert = driver.switchTo().alert();
	    String alertMsg = alert.getText();
	    Thread.sleep(3000);
	    alert.accept();
	    if(alertMsg.equals("This is an informational alert"))
	    {
	    	System.out.println("Alert msg match found");
	    }
	    else
	    	System.out.println("Alert msg match was not found");
	    js = (JavascriptExecutor)driver;
	    js.executeScript("confirm('Do you wish to continue?(y/n)');");
	    alert = driver.switchTo().alert();
	    alertMsg = alert.getText();
	    Thread.sleep(3000);
	    alert.dismiss();
	    if(alertMsg.equals("This is an informational message"))
	    {
	    	System.out.println("Alert msg match found");
	    }
	    else
	    	System.out.println("Alert msg match was not found");
	}

}
