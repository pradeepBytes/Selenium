package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Log;
import utility.constants;

public class test {
	public void main() throws Exception {

	 WebDriver driver=new ChromeDriver();
	 System.setProperty("webdriver.chrome.driver", constants.driverPath + "chromedriver.exe");
	 driver.get("https://myaccountqa.hrblock.net/mytax/");
	 driver.manage().window().maximize();
	 Log.info("Chrome driver instantiated");
	 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 //Log.info("Implicit wait applied on the driver for 10 seconds");*/
	   // driver.get(constants.App_URL);
	    
}
}
