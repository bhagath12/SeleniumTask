package com.automationpractice.pages;

import org.openqa.selenium.By;

public class ShoppingCartSummaryPage extends BasePage{
	
	public void clickOnProceedToCheckout(){
		driver.findElement(By.xpath(OR.getProperty("shoppingCartSummaryPage_proceedToCheckout_xpath"))).click();
	}
	

}
