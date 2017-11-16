package com.automationpractice.stepdefinitions;

import com.automationpractice.pages.BasePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BasePage {

	@Before
	public void beforeScenario() {
		InitializeDriver("browser");
	}

	@After
	public void afterScenario() {
		closeDriver();
	}

}
