package SeleniumPack;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
      public static String browser = "chrome";
	  public static WebDriver driver = null; 
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","D:\\Selenium_Training\\Softwares\\chromedriver_v86\\chromedriver.exe");
		if (browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();
		}
		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//FirefoxDriver fdriver = new FirefoxDriver();
	    //fdriver.get("https://www.selenium.dev/selenium/docs/api/java/");
	    //Thread.sleep(1000);
	    //fdriver.close();
		else if(browser.equals("ie"))
			{
			System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
		    //InternetExplorerDriver idriver = new InternetExplorerDriver();
		    //zoom level must be 100%
		    //Protected mode level
		    driver.get("https://www.selenium.dev/selenium/docs/api/java/");
		    driver.close();
			}
	   // System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
	    //InternetExplorerDriver idriver = new InternetExplorerDriver();
	    //zoom level must be 100%
	    //Protected mode level
	    //idriver.get("https://www.selenium.dev/selenium/docs/api/java/");
	}
	

}
