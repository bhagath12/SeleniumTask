package com.automationpractice.stepdefinitions;

import org.junit.Assert;

import com.automationpractice.common.FooterMenus;
import com.automationpractice.pages.AddressesPage;
import com.automationpractice.pages.BasePage;
import com.automationpractice.pages.CategoryPage;
import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.LoginPage;
import com.automationpractice.pages.MyAccountPage;
import com.automationpractice.pages.OrderHistoryPage;
import com.automationpractice.pages.OrderSummaryPage;
import com.automationpractice.pages.PaymentPage;
import com.automationpractice.pages.ProductDescriptionPage;
import com.automationpractice.pages.ShippingPage;
import com.automationpractice.pages.ShoppingCartSummaryPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderTShirtStepDefinition extends BasePage {
	HomePage hpage = new HomePage();
	LoginPage lpage = new LoginPage();
	MyAccountPage mpage = new MyAccountPage();
	CategoryPage cpage = new CategoryPage();
	ProductDescriptionPage pdpage = new ProductDescriptionPage();
	ShoppingCartSummaryPage spage = new ShoppingCartSummaryPage();
	AddressesPage apage = new AddressesPage();
	ShippingPage shippingPage = new ShippingPage();
	PaymentPage paymentPage = new PaymentPage();
	OrderSummaryPage oPage = new OrderSummaryPage();
	FooterMenus fMenus = new FooterMenus();
	OrderHistoryPage historyPage = new OrderHistoryPage();

	@Given("^user enters the URL$")
	public void user_enters_the_URL() {
		navigate("url");

	}

	@When("^user clicks on sign in$")
	public void user_clicks_on_signin() {
		hpage.clickOnSignin();

	}

	@When("^user enters userName as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_userName_as_and_password_as(String userName, String password) {
		lpage.enterUserName(userName);
		lpage.enterPassword(password);
		lpage.clickOnSignin();
	}

	@And("^user clicks on T-Shirts$")
	public void user_clicks_on_T_Shirts() {
		mpage.clickOnTShirts();

	}

	@When("^user selects a T-Shirt$")
	public void user_selects_a_T_Shirt() {
		cpage.selectATshirt();

	}

	@When("^user clicks on AddToCart$")
	public void user_clicks_on_AddToCart() {
		pdpage.clickOnAddToCart();

	}

	@When("^user clicks on Proceed to checkout button$")
	public void user_clicks_on_Proceed_to_checkout_button() {
		pdpage.clickOnProceedToCheckout();
		spage.clickOnProceedToCheckout();
		apage.clickOnProceedToCheckout();

	}

	@When("^user accepts terms and conditions$")
	public void user_accepts_terms_and_conditions() {
		shippingPage.acceptTermsAndConditions();

	}

	@When("^user clicks on Proceed to checkout$")
	public void user_clicks_on_Proceed_to_checkout() {
		shippingPage.clickOnProceedToCheckout();
	}

	@And("^select payment type as PayByCheck$")
	public void select_payment_type_as() {
		paymentPage.selectPaymentTypeAsPayByCheck();
	}

	@When("^user confirms the order$")
	public void user_confirms_the_order() {
		oPage.confirmTheOrder();

	}

	@When("^user clicks on my orders$")
	public void user_clicks_on_my_orders() {
		fMenus.clickOnMyOrders();

	}

	@And("^user clicks on order reference$")
	public void user_clicks_on_order_reference() {
		historyPage.clickOnOrderReference();
	}

	@Then("^verity the \"([^\"]*)\" exist in order history$")
	public void verity_the_exist_in_order_history(String actualItem) {
		String expectedItem = historyPage.verifyItemExistingInOrderHistory();
		Assert.assertEquals(expectedItem, actualItem);

	}

}
