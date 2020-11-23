package MakeMyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginMakeMyTrip {

	@Test
	public static void login() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        //WebElement ageTextBox = driver.findElement(By.id("cage"));
        WebDriverWait wait = new WebDriverWait(driver,60);
        WebElement loginBox = driver.findElement(By.xpath("//*[@class='makeFlex column flexOne whiteText latoBold']"));
        loginBox.click();
        //loginBox.click();
        WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        emailBox.sendKeys("pramit.chakraborty@gmail.com");
        System.out.println("Email ID entered successfully");
        Thread.sleep(2000);
        WebElement clickBox = driver.findElement(By.xpath("//*[@class='capText font16']"));
        clickBox.click();
        Thread.sleep(2000);
        WebElement OTPcheck = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/section/form/div[1]/div/input"));
        OTPcheck.sendKeys("835888");
        System.out.println("OTP entered successfully");
        Thread.sleep(3000);
        WebElement OTPclick = driver.findElement(By.xpath(" //*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button"));
        OTPclick.click();
        WebDriverWait wait2 = new WebDriverWait(driver,80);
        try {
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[1]/span")));
        WebElement OTPconsole = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[1]/span"));
        if(OTPconsole.getText().equals("Incorrect OTP Entered. Please try again."))
        {
        	System.out.println("OTP entered is not correct");
        }
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        
	}

}
