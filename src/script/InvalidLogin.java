package script;

import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class InvalidLogin extends BaseTest{
	@Test(priority=2,groups= {"login"})
	public void testInvalidLogin() {
		int rc = Excel.getRowCount(XL_PATH,"InvalidLogin");
		for(int i=1;i<=rc;i++) {
		String un=Excel.getData(XL_PATH,"InvalidLogin",i,0);
		String pw=Excel.getData(XL_PATH,"InvalidLogin",i,1);
		String msg=Excel.getData(XL_PATH,"InvalidLogin",i,2);
		//Enter invalid user name
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		//Enter invalid password
		l.setPassword(pw);
		//click login
		l.clickLogin();
		//verify err msg
		l.verifyErrMsg(msg);
		}
	}
}






