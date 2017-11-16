package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PersonalInformationPage extends BasePage {
	
	public void enterFirstName(String firstName){
		WebElement element = driver.findElement(By.id(OR.getProperty("PersonalInformationPage_FirstName_id")));
		element.clear();
		element.sendKeys(firstName);
		
	}
	
	public void enterCurrentPassword(String password){
		driver.findElement(By.id(OR.getProperty("PersonalInformationPage_CurrentPassword_id"))).sendKeys(password);
	}
	
	public void clickOnSaveButton(){
		driver.findElement(By.xpath(OR.getProperty("PersonalInformationPage_ClickOnSave_xpath"))).click();
	}
	
	public void clickOnBackToYourButton(){
		driver.findElement(By.xpath(OR.getProperty("PersonalInformationPage_clickOnBackToYourAccount_xpath"))).click();
	}
	
	public String verifyFirstNameFieldAppearsUpdated(){
		String text = driver.findElement(By.id(OR.getProperty("PersonalInformationPage_FirstName_id"))).getAttribute("value");
		return text;
	}

}
