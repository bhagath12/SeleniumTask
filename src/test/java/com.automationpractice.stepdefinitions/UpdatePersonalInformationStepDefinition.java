package com.automationpractice.stepdefinitions;

import com.automationpractice.pages.BasePage;
import com.automationpractice.pages.MyAccountPage;
import com.automationpractice.pages.PersonalInformationPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class UpdatePersonalInformationStepDefinition extends BasePage {

	MyAccountPage accountPage = new MyAccountPage();
	PersonalInformationPage personalInfo = new PersonalInformationPage();

	@When("^user clicks on my personal information$")
	public void user_clicks_on_my_personal_information() {
		accountPage.clickOnMyPersonalInformation();
	}
	
	@And("^user updates first name as \"([^\"]*)\"$")
	public void user_updates_first_name_as(String firstName) {
		personalInfo.enterFirstName(firstName);
	    
	}
	
	@And("^user enters current password as \"([^\"]*)\"$")
	public void user_enters_current_password(String password){
		personalInfo.enterCurrentPassword(password);
		}
	@When("^user clicks on save button$")
	public void user_clicks_on_save_button(){
		personalInfo.clickOnSaveButton();
	}
	
	@When("^user clicks on back to your account$")
	public void user_clicks_on_back_to_your_account(){
		personalInfo.clickOnBackToYourButton();
	}
	
	@Then("^verify first name field appears updated as \"([^\"]*)\"$")
	public void verfy_firstName_field(String expectedName){
		String actualName = personalInfo.verifyFirstNameFieldAppearsUpdated();
		Assert.assertEquals(expectedName, actualName);
		
	}


}
