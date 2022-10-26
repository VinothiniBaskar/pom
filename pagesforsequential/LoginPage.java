package pagesforsequential;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class LoginPage extends BaseClass {
	

	public LoginPage enterUserName() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		return this;

	}

	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}

	public WelcomePage clickLoginbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();

	}

}
