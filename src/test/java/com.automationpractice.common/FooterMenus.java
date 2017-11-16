package com.automationpractice.common;

import org.openqa.selenium.By;

import com.automationpractice.pages.BasePage;

public class FooterMenus {
	
	public void clickOnMyOrders(){
		
		BasePage.driver.findElement(By.xpath(BasePage.OR.getProperty("FooterMenus_ClickOnMyorders_xpath"))).click();
	}

}
