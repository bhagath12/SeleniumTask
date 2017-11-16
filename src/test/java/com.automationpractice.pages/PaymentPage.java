package com.automationpractice.pages;

import org.openqa.selenium.By;

public class PaymentPage extends BasePage {
	
	public void selectPaymentTypeAsPayByCheck(){
		 driver.findElement(By.xpath(OR.getProperty("PaymentPage_payByCheck_xpath"))).click();
	}

}
