package com.automationpractice.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/features"},
		glue={"com/automationpractice/stepdefinitions"},
		plugin= {"pretty", "html:target/cucumber", "junit:target/cucuber-junit","json:target/json-report.json"}
		)
public class TestRunner {
	
	}
