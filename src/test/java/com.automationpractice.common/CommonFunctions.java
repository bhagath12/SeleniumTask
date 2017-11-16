package com.automationpractice.common;

import org.openqa.selenium.By;

import com.automationpractice.pages.BasePage;

public class CommonFunctions {
	
	public void clickOnHomeButton(){
		
		BasePage.driver.findElement(By.xpath(BasePage.OR.getProperty("CommonFunctions_clickOnHomeButtion_xpath"))).click();
		 
		
	}

}
