package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

public class signIn_Page extends BaseClass { 
   
	private static WebElement element = null;
		
		  public signIn_Page(WebDriver driver){
	            	super(driver);
	        }     
	        
		  public static WebElement WebEdit_Login() throws Exception{
	        	try{
		            element = driver.findElement(By.id("username"));
		            Log.info("UserName field is displayed in Login Page");
	        	}catch (Exception e){
	           		Log.error("UserName field is not displayed in Login Page");
	           		throw(e);
	           		}
	           	return element;
	            }
 
		  public static WebElement WebEdit_Pwd() throws Exception{
	        	try{
		            element = driver.findElement(By.id("password"));
		            Log.info("Password field is displayed in Login Page");
	        	}catch (Exception e){
	           		Log.error("Password field is not displayed in Login Page");
	           		throw(e);
	           		}
	           	return element;
	            }
 
		  public static WebElement Button_Login() throws Exception{
	        	try{
		            element = driver.findElement(By.cssSelector("input.gua_button"));
		            Log.info("Login button is displayed in Login Page");
	        	}catch (Exception e){
	           		Log.error("Login button is not displayed in Login Page");
	           		throw(e);
	           		}
	           	return element;
	            }
		  public static WebElement Button_Create() throws Exception{
	        	try{
		            element = driver.findElement(By.linkText("Create Account"));
		            Log.info("Create button is displayed in Login Page");
	        	}catch (Exception e){
	           		Log.error("Create button is not displayed in Login Page");
	           		throw(e);
	           		}
	           	return element;
	            }	  
    }
 
