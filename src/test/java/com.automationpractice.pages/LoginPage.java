package com.automationpractice.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	
	public void enterUserName(String userName){
		driver.findElement(By.id(OR.getProperty("loginPage_UserName_id"))).sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		driver.findElement(By.id(OR.getProperty("loginPage_Password_id"))).sendKeys(password);
	}
	
	public void clickOnSignin(){
		driver.findElement(By.id(OR.getProperty("loginPage_LoginButtion_id"))).click();
	}

}
