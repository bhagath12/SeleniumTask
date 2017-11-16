package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDescriptionPage extends BasePage{
	
	public void clickOnAddToCart(){
		driver.findElement(By.xpath(OR.getProperty("productDescriptionPage_addToCart_xpath"))).click();
	}
	
	public void clickOnProceedToCheckout(){
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(OR.getProperty("productDescriptionPage_proceedToCheckout_xpath")))));
		driver.findElement(By.xpath(OR.getProperty("productDescriptionPage_proceedToCheckout_xpath"))).click();
	}
	
	

}
