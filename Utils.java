package utility;

//import java.io.File;
//import java.io.File;
import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Utils {
		public static WebDriver driver ;
	public static WebDriver OpenBrowser(int iTestCaseRow) throws InterruptedException {
		System.out.println("inside browser");
		String sBrowserName;
		
		try{
		sBrowserName = excelUtils.getCellData(iTestCaseRow, constants.Col_Browser);
		System.out.println(sBrowserName);
		if(sBrowserName.equalsIgnoreCase("FireFox")){
			
			
			System.setProperty("webdriver.gecko.driver", constants.driverPath +"geckodriver.exe");
			//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			//capabilities.setCapability("marionette", true);
			WebDriver driver = new FirefoxDriver();
			//driver = new FirefoxDriver();
			Log.info("Firefox driver instantiated");
		   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    //Log.info("Implicit wait applied on the driver for 10 seconds");
		    driver.get(constants.App_URL);
		    System.out.println(constants.App_URL);
		    Log.info("Web application launched successfully");
		  
			}
		
		 if (sBrowserName.equals("IE")){

			 System.setProperty("webdriver.ie.driver", constants.driverPath +"IEDriverServer.exe");
			 //DesiredCapabilities caps = new DesiredCapabilities(); 
			 //caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true); 
			 
			 WebDriver driver=new InternetExplorerDriver();
			 //Log.info("IE driver instantiated");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 //Log.info("Implicit wait applied on the driver for 10 seconds");
			 driver.get("https://myaccountqa.hrblock.net/mytax/");   
			 //driver.get(constants.App_URL);
			    System.out.println(constants.App_URL);
			    Log.info("Web application launched successfully");
			
		}
		 if (sBrowserName.equals("Chrome")){
		
			 System.setProperty("webdriver.chrome.driver", constants.driverPath + "chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.get(constants.App_URL);
			 driver.manage().window().maximize();
			 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 //driver.findElement(By.id("button")).click();
			 Log.info("Chrome driver instantiated");
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 //Log.info("Implicit wait applied on the driver for 10 seconds");*/
			   // driver.get(constants.App_URL);
			    System.out.println(constants.App_URL);
			    Log.info("Web application launched successfully");
			
		}
		}catch (Exception e){
			Log.error("Class Utils | Method OpenBrowser | Exception desc : "+e.getMessage());
		}
		  return driver;
	}
	public static String getTestCaseName(String sTestCase)throws Exception{
		String value = sTestCase;
		try{
			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			posi = value.lastIndexOf(".");	
			value = value.substring(posi + 1);
			return value;
				}catch (Exception e){
			Log.error("Class Utils | Method getTestCaseName | Exception desc : "+e.getMessage());
			throw (e);
					}
			}
	/*public static void waitForElement(WebElement element){
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	     wait.until(ExpectedConditions.elementToBeClickable(element));
	 	}
	/*	
	 public static void takeScreenshot(WebDriver driver, String sTestCaseName) throws Exception{
			try{
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File(constants.Path_ScreenShot + sTestCaseName +".jpg"));	
			} catch (Exception e){
				Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());
				throw new Exception();
			}
		}*/
}