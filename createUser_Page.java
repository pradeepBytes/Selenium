package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

public class createUser_Page extends BaseClass { 
   
	private static WebElement element = null;
		
		  public createUser_Page(WebDriver driver){
	            	super(driver);
	        }     
	        
		  public static WebElement WebEdit_EMail() throws Exception{
	        	try{
		            element = driver.findElement(By.id("email"));
		            Log.info("Email field is displayed in Create Page");
	        	}catch (Exception e){
	           		Log.error("Email field is not displayed in Create Page");
	           		throw(e);
	           		}
	           	return element;
	            }
 
		  public static WebElement WebEdit_UserName() throws Exception{
	        	try{
		            element = driver.findElement(By.id("userName"));
		            Log.info("UserName field is displayed in Create Page");
	        	}catch (Exception e){
	           		Log.error("UserName field is not displayed in Create Page");
	           		throw(e);
	           		}
	           	return element;
	            }
		  public static WebElement WebEdit_Password() throws Exception{
	        	try{
		            element = driver.findElement(By.id("password"));
		            Log.info("Password field is displayed in Create Page");
	        	}catch (Exception e){
	           		Log.error("Password field is not displayed in Create Page");
	           		throw(e);
	           		}
	           	return element;
	            }
		  public static WebElement WebEdit_CnfPassword() throws Exception{
	        	try{
		            element = driver.findElement(By.id("confirmpassword"));
		            Log.info("Confirm Password field is displayed in Create Page");
	        	}catch (Exception e){
	           		Log.error("Confirm Password field is not displayed in Create Page");
	           		throw(e);
	           		}
	           	return element;
	            }

		  public static WebElement WebList_SecQuestion() throws Exception{
	        	try{
		            element = driver.findElement(By.id("securityQuestion"));
		            Log.info("Security Question List is displayed in Create Page");
	        	}catch (Exception e){
	           		Log.error("Security Question List is not displayed in Create Page");
	           		throw(e);
	           		}
	           	return element;
	            }
		  public static WebElement WebList_SecAns() throws Exception{
	        	try{
		            element = driver.findElement(By.id("securityAnswer"));
		            Log.info("Security Answer is displayed in Create Page");
	        	}catch (Exception e){
	           		Log.error("Security Answer is not displayed in Create Page");
	           		throw(e);
	           		}
	           	return element;
	            }
		  
		  public static WebElement WebCheckBox_RememberMe() throws Exception{
	        	try{
		            element = driver.findElement(By.id("rememberme"));
		            Log.info("Remember Me Checkbox is displayed in Create Page");
	        	}catch (Exception e){
	           		Log.error("Remember Me Checkbox is not displayed in Create Page");
	           		throw(e);
	           		}
	           	return element;
	            }
		  public static WebElement WebCheckBox_Terms() throws Exception{
	        	try{
		            element = driver.findElement(By.id("termsconditions"));
		            Log.info("Terms and Condition is displayed in Create Page");
	        	}catch (Exception e){
	           		Log.error("Terms and Condition is not displayed in Create Page");
	           		throw(e);
	           		}
	           	return element;
	            }
		  public static WebElement Button_Submit() throws Exception{
	        	try{
		            element = driver.findElement(By.id("submitButton"));
		            Log.info("Submit button is displayed in Login Page");
	        	}catch (Exception e){
	           		Log.error("Submit button is not displayed in Login Page");
	           		throw(e);
	           		}
	           	return element;
	            }
    }
 
