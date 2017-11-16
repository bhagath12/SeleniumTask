package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderHistoryPage extends BasePage {
	
	public void clickOnOrderReference(){
		driver.findElement(By.xpath(OR.getProperty("OrderHistoryPage_clickOnOrderRefence_xpath"))).click();
	}
	
	
	public String verifyItemExistingInOrderHistory(){
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR.getProperty("OrderHistoryPage_productName_xpath"))));
		String text = driver.findElement(By.xpath(OR.getProperty("OrderHistoryPage_productName_xpath"))).getText();
		return text;
		
	}

}
