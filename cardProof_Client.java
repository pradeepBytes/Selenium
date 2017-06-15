package pageObjects;

import org.openqa.selenium.*;
import utility.Log;

public class cardProof_Client extends BaseClass {
	private static WebElement element = null;
	
	  public cardProof_Client(WebDriver driver){
            	super(driver);
        }     
        public static WebElement Button_AccessMyCard() throws Exception{
        	try{
	            element = driver.findElement(By.id("hCDP"));
	            Log.info("Access My Card button is displayed in Dashboard Page");
        	}catch (Exception e){
           		Log.error("Access My Card button is NOT displayed in Dashboard Page");
           		throw(e);
           		}
           	return element;
            }
        
        public static WebElement  WebEdit_Fname() throws Exception{
        	try{
	            element = driver.findElement(By.id("firstName"));
	            Log.info("FirstName Field is displayed in Card Proofing Flow.");
        	}catch (Exception e){
           		Log.error("FirstName Field is not displayed in Card Proofing Flow.");
           		throw(e);
           		}
           	return element;
            }
        
        public static WebElement  WebEdit_Lname() throws Exception{
        	try{
	            element = driver.findElement(By.id("lastName"));
	            Log.info("LastName Field is displayed in Card Proofing Flow.");
        	}catch (Exception e){
           		Log.error("LastName Field is not displayed in Card Proofing Flow.");
           		throw(e);
           		}
           	return element;
            }
        public static WebElement  WebEdit_SSN() throws Exception{
        	try{
	            element = driver.findElement(By.id("ssn3"));
	            Log.info("SSN Field is displayed in Card Proofing Flow.");
        	}catch (Exception e){
           		Log.error("SSN Field is not displayed in Card Proofing Flow.");
           		throw(e);
           		}
           	return element;
            }
        public static WebElement  WebEdit_DOB() throws Exception{
        	try{
	            element = driver.findElement(By.id("ssn3"));
	            Log.info("SSN Field is displayed in Card Proofing Flow.");
        	}catch (Exception e){
           		Log.error("SSN Field is not displayed in Card Proofing Flow.");
           		throw(e);
           		}
           	return element;
            }
}