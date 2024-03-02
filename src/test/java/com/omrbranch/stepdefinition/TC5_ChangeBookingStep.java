package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC5_ChangeBookingStep {

	PageObjectManager pom = new PageObjectManager();
	
	
	@When("User navigates to my booking page")
	public void user_navigates_to_my_booking_page() {
		
	pom.getMyBookingPage().clickMyBookingBtn();
	}

	@Then("User should verify after navigate my booking page success message {string}")
	public void user_should_verify_after_navigate_my_booking_page_success_message(String expMyBookingPageSucMsgTxt) {
	
		pom.getMyBookingPage().verifyMYBookingPageSucMsg(expMyBookingPageSucMsgTxt);
	}

	//@When("User enter order id")
	//public void user_enter_order_id() {
	//}

	@Then("User should verify same order id is displayed")
	public void user_should_verify_same_order_id_is_displayed() {
		
		
		boolean b = pom.getMyBookingPage().verifySameOrderIdIsDisplayed();
		Assert.assertTrue("Verify same order is present", b);
	}

	@Then("User should verify same hotel name is present")
	public void user_should_verify_same_hotel_name_is_present() {
		
		boolean b1 = pom.getMyBookingPage().verifySameHotelNameIsPresent();
		Assert.assertTrue("Verify same hotel name is present", b1);
	}

	@Then("User should verify same price is present")
	public void user_should_verify_same_price_is_present() {
		
		boolean b3 = pom.getMyBookingPage().verifySamePriceIsPresent();
		Assert.assertTrue("Verify same price is present", b3);
	}

	@When("User modify the checkIndate {string}")
	public void user_modify_the_check_indate(String modifyCheckInDate) {
		
		pom.getMyBookingPage().modifyCheckInDate(modifyCheckInDate);
	}

	@Then("User should verify after modify order success message {string}")
	public void user_should_verify_after_modify_order_success_message(String expModifyOrderSucMsg) {
	
		String actVerifyModifyOrderSucMsg = pom.getMyBookingPage().verifyModifyOrderSucMsg();
		boolean b4 = actVerifyModifyOrderSucMsg.contains(expModifyOrderSucMsg);
		Assert.assertTrue("Verify modify order success message", b4);
		
	}

}
