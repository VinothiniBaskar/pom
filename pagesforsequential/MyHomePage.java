package pagesforsequential;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class MyHomePage extends BaseClass {
	

	public MyLeads cilckLeadsButton() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeads();

	}

}
