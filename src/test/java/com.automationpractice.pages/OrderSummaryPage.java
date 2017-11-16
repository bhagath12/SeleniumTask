package com.automationpractice.pages;

import org.openqa.selenium.By;

public class OrderSummaryPage extends BasePage {
	
	public void confirmTheOrder(){
		driver.findElement(By.xpath(OR.getProperty("OrderSummaryPage_confirOrder_xpath"))).click();
	}

}
