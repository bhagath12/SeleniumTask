package com.automationpractice.pages;

import org.openqa.selenium.By;

public class CategoryPage extends BasePage {
	
	public void selectATshirt(){
		driver.findElement(By.xpath(OR.getProperty("categoryPage_selectATShirt_xpath"))).click();
	}

}
