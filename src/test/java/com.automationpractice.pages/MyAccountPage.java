package com.automationpractice.pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage {
	
	public void clickOnTShirts(){
		
		driver.findElement(By.xpath(OR.getProperty("myAccoutPage_TShirt_xpath"))).click();
		
	}
	
	public void clickOnMyPersonalInformation() {
		driver.findElement(By.xpath(OR.getProperty("MyAccountPage_MyPersonalInformation_xpath"))).click();
	}

}
