package testCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import pageObjects.*;
import utility.*;
import appModule.*;

public class Login_MyHRB {
    
  public WebDriver driver;
  private String sTestCaseName;
  private int iTestCaseRow;
  private String sExeDesision;
	
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  DOMConfigurator.configure("log4j.xml");
	  sTestCaseName = this.toString();
	  sTestCaseName = Utils.getTestCaseName(this.toString());
	  Log.startTestCase(sTestCaseName);
	  excelUtils.setExcelFile(constants.MasterXL_Path,"Main");
	  iTestCaseRow = excelUtils.getRowContains(sTestCaseName,constants.Col_TestCaseName);
	  System.out.println(iTestCaseRow);
	  sExeDesision=excelUtils.getCellData(iTestCaseRow, constants.Exc_Choice);
	  System.out.println(sExeDesision);
	  if (sExeDesision.equalsIgnoreCase("YES")){
		  System.out.println("Yes decision");
		  driver = Utils.OpenBrowser(iTestCaseRow);
		  System.out.println(iTestCaseRow);
		new BaseClass(driver);  
	  }
	  else{
		//  @AfterMethod
		  //public void afterMethod() {
		  System.out.println("in else");
			  Log.info("Test Case not selected for Execution.");
			  Log.endTestCase(sTestCaseName);
			  driver.close();
			  driver.quit();
		  }

	  
	
	
	  }
 
  
  @Test
  public void main() throws Exception {
	  try{
		  System.out.println(iTestCaseRow);
		  System.out.println("in test");
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
	  System.out.println("in after");
	  Log.endTestCase(sTestCaseName);
	 // driver.close();
	  if(driver!=null){
	  driver.quit();
	  }
  }

}
