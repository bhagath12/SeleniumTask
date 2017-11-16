package com.automationpractice.pages;

import org.openqa.selenium.By;

public class ShippingPage extends BasePage{
	
	public void acceptTermsAndConditions(){
		driver.findElement(By.id(OR.getProperty("ShippingPage_agreeTheTermsAndConditions_id"))).click();
	}
	
	public void clickOnProceedToCheckout(){
		driver.findElement(By.xpath(OR.getProperty("ShippingPage_proceedToCheckout_xpath"))).click();
	}

}
