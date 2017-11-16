package com.automationpractice.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
	
	public void clickOnSignin() {
		driver.findElement(By.xpath(OR.getProperty("signIn_xpath"))).click();
		
	}

}
