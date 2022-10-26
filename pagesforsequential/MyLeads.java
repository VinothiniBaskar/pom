package pagesforsequential;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class MyLeads   extends BaseClass{
	
	
	
	public CreateLead clickCreateButton() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead();

	}
	

}
