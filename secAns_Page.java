package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
public class secAns_Page extends BaseClass {

	private static WebElement element = null;
		
		  public secAns_Page(WebDriver driver){
	            	super(driver);
	        }     
	        
		  public static WebElement WebEdit_SecAns() throws Exception{
	        	try{
		            element = driver.findElement(By.id("securityAnswer"));
		            Log.info("Security Answer field is displayed in Security Answer Page");
	        	}catch (Exception e){
	           		Log.error("Security Answer field is not displayed in Security Answer Page");
	           		throw(e);
	           		}
	           	return element;
	            }
	 
		  public static WebElement ChkBox_RememberMe() throws Exception{
	        	try{
		            element = driver.findElement(By.id("box"));
		            Log.info("Remember Me Checkbox is displayed in Security Answer Page");
	        	}catch (Exception e){
	           		Log.error("Remember Me Checkbox is not displayed in Security Answer Page");
	           		throw(e);
	           		}
	           	return element;
	            }
		  
		  public static WebElement Button_Next() throws Exception{
	        	try{
		            element = driver.findElement(By.id("securityqn-next"));
		            Log.info("Next button is displayed in Security Answer Page");
	        	}catch (Exception e){
	           		Log.error("Next button is displayed in Security Answer Page");
	           		throw(e);
	           		}
	           	return element;
	            }
		  
 
	}

