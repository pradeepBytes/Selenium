package testCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import pageObjects.*;
import utility.*;
import appModule.*;

public class CreateNewUser {
    
  public WebDriver driver;
  private String sTestCaseName;
  private int iTestCaseRow;
	
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  DOMConfigurator.configure("log4j.xml");
	  sTestCaseName = this.toString();
	  sTestCaseName = Utils.getTestCaseName(this.toString());
	  Log.startTestCase(sTestCaseName);
	  excelUtils.setExcelFile(constants.MasterXL_Path,"Sheet1");
	  iTestCaseRow = excelUtils.getRowContains(sTestCaseName,constants.Col_TestCaseName);
	driver = Utils.OpenBrowser(iTestCaseRow);
	System.out.println(iTestCaseRow);
	new BaseClass(driver);  
  }
 
  
  @Test
  public void main() throws Exception {
	  try{
		  System.out.println(iTestCaseRow);
		  Login.Execute(iTestCaseRow);
		  Signout.Execute(iTestCaseRow);
		  if(BaseClass.bResult==true){
			  excelUtils.setCellData("Pass", iTestCaseRow, constants.Col_Result);
		  }else{
				throw new Exception("Test Case Failed because of Verification");
			}
	  }catch (Exception e){
		  excelUtils.setCellData("Fail", iTestCaseRow, constants.Col_Result);
		  //Utils.takeScreenshot(driver, sTestCaseName);
		  Log.error(e.getMessage());
		  throw (e);
	  }
		
  }

  @AfterMethod
  public void afterMethod() {
	  Log.endTestCase(sTestCaseName);
	  driver.close();
	  driver.quit();
  }

}
