package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC6_CancelBookingStep {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should verify after select success message {string}")
	public void user_should_verify_after_select_success_message(String string) {

	}

	@When("User Cancel updated the order")
	public void user_cancel_updated_the_order() {

		pom.getCancelBooking().cancelUpdatedOrderId();

	}

	@Then("User should verify after cancel order id success message {string}")
	public void user_should_verify_after_cancel_order_id_success_message(String expCancelOrderIdSucMsg) {

		boolean actCancelOrderIdSucMsg = pom.getCancelBooking().getCancelOrderIdSucMsg(expCancelOrderIdSucMsg);
		Assert.assertEquals("Verify Cancel OrderId Success Message", expCancelOrderIdSucMsg, actCancelOrderIdSucMsg);

	}

	@When("User should navigate the my booking page")
	public void user_should_navigate_the_my_booking_page() {

		pom.getCancelBooking().navigateMyBooking();
	}

	@Then("User should select the first order id to cancel booking")
	public void user_should_select_the_first_order_id_to_cancel_booking() {
		
		pom.getCancelBooking().clickMyBooingBtn();
	}

	@Then("User should select the existing order id cancel button")
	public void user_should_select_the_existing_order_id_cancel_button() {
		
		
	}

}
