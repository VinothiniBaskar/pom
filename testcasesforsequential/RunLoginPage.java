package testcasesforsequential;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.LoginPage;

public class RunLoginPage extends BaseClass {
	

	@Test
	public void runLogin() {

		LoginPage lp = new LoginPage(driver);
		lp.enterUserName().enterPassword().clickLoginbutton().crmLinkclick().cilckLeadsButton()
		.clickCreateButton()
		.entercompanyName()
		.enterFirstName()
		.enterLastName()
		.clickCreateLeadbutton()
		.verify();
	
		

	}

}
