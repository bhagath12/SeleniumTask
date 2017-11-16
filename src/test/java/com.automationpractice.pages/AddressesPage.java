package com.automationpractice.pages;

import org.openqa.selenium.By;

public class AddressesPage extends BasePage {
	
	public void clickOnProceedToCheckout() {
		
		driver.findElement(By.xpath(OR.getProperty("addressesPage_proceedToCheckout_xpath"))).click();
	}

}
