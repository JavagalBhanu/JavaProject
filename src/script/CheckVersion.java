package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.EnterTTPage;
import page.LoginPage;

public class CheckVersion extends BaseTest{

	@Test(priority=3,groups= {"version","smoke"})
	public void testVersion() {
		String un=Excel.getData(XL_PATH,"CheckVersion",1,0);
		String pw=Excel.getData(XL_PATH,"CheckVersion",1,1);
		String eVersion=Excel.getData(XL_PATH, "CheckVersion",1,2);
		 //Enter Valid User Name
		 LoginPage l=new LoginPage(driver);
		 l.setUserName(un);
		 //Enter Valid Password
		 l.setPassword(pw);
		 //click on Login Button
		 l.clickLogin();
		 //Click Help
		 EnterTTPage e=new EnterTTPage(driver);
		 e.clickHelp();
		 //click About
		 e.clickAboutActiTIME();
		 //verify version
		 e.verifyVersion(eVersion);
		 //click close button
		 e.clickCloseButton();
		 //click logout
		 e.clickLogout();
	}
	
}
