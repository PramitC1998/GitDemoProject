package testingPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginMakeMyTrip {

	@Test
	public void OTPCheck() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        //driver.manage().window().maximize();
        //WebElement ageTextBox = driver.findElement(By.id("cage"));
        //WebElement loginBox = driver.findElement(By.xpath("//*[@class='makeFlex column flexOne whiteText latoBold']"));
        WebElement loginBox = driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[6]"));
        loginBox.click();
        WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        emailBox.sendKeys("pramit.chakraborty123@gmail.com");
        //System.out.println("email ID= "+emailBox.getText());
        Thread.sleep(2000);
        WebElement clickBox = driver.findElement(By.xpath("//*[@class='capText font16']"));
        clickBox.click();
        Thread.sleep(2000);
        WebElement OTPcheck = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/section/form/div[1]/div/input"));
        OTPcheck.sendKeys("835888");
        //System.out.println("OTP= "+OTPcheck.getText());
        Thread.sleep(3000);
        WebElement OTPback = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/section/div[1]/a"));
        OTPback.click();
        //driver.close();
        //driver.navigate().back();
        //Thread.sleep(2000);
	}

}
