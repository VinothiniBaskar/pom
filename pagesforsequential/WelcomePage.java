package pagesforsequential;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class WelcomePage  extends BaseClass {
	
	
	public MyHomePage crmLinkclick() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return  new MyHomePage();

	}
	

}
