package appModule;



import pageObjects.dashBoard;
import pageObjects.signIn_Page;
import utility.Log;

public class Signout  {
	public static void Execute(int iTestCaseRow) throws Exception{

 //if (!dashBoard.Link_Logout().isDisplayed()){
	// Thread.sleep(1000);
 //}
	//dashBoard
	dashBoard.Link_Logout().click();
	Log.info("Sign out Link is Clicked." );
	
	if (signIn_Page.WebEdit_Login().isDisplayed()){
	Log.info("Successfully Logged out of MyBlock." );
		}
}
}

	
