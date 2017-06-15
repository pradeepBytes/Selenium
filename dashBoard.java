package pageObjects;

import org.openqa.selenium.*;
import utility.Log;

public class dashBoard extends BaseClass {
	private static WebElement element = null;
	
	  public dashBoard(WebDriver driver){
            	super(driver);
        }     
        public static WebElement Link_Logout() throws Exception{
        	try{
	            element = driver.findElement(By.className("SIGN OUT"));
	            Log.info("Sign Out is displayed in Dashboard Page");
        	}catch (Exception e){
           		Log.error("Sign Out is not displayed in Dashboard Page");
           		throw(e);
           		}
           	return element;
            }
}