package appModule;

import pageObjects.secAns_Page;
import pageObjects.signIn_Page;
import utility.Log;
import utility.constants;
import utility.excelUtils;
//import utility.global_Driver;

public class Login{

	public static void Execute(int iTestCaseRow) throws Exception{
		String sUserName = excelUtils.getCellData(iTestCaseRow, constants.Col_UserName);	
		signIn_Page.WebEdit_Login().sendKeys(sUserName);
		Log.info(sUserName+" is entered in UserName text box" );
		
		String sPwd = excelUtils.getCellData(iTestCaseRow, constants.Col_Password);	
		signIn_Page.WebEdit_Pwd().sendKeys(sPwd);
		Log.info(sPwd+" is entered in Password text box" );
		
		signIn_Page.Button_Login().click();
		//boolean status= secAns_Page.WebEdit_SecAns().isDisplayed();
		
		if (secAns_Page.WebEdit_SecAns().isDisplayed()){
		String sSec_Ans = excelUtils.getCellData(iTestCaseRow, constants.Col_SecAns);	
		secAns_Page.WebEdit_SecAns().sendKeys(sSec_Ans);
		Log.info(sSec_Ans+" is entered in Security Answer text box" );
		
		secAns_Page.ChkBox_RememberMe().click();
		Log.info("UnCheck Remember me in Sec Ans Page." );
		//secAns_Page.driver.wait(10);
		secAns_Page.Button_Next().click();
		Log.info("Clicked Nex in Sec Ans Page." );
		}
				
	}
		
	}
	
