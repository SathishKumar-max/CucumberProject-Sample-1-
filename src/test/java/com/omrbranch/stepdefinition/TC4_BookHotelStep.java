package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC4_BookHotelStep {

	PageObjectManager pom = new PageObjectManager();

	@Then("User add guest details {string},{string},{string},{string} and {string}")
	public void user_add_guest_details_and(String Salutation, String firstname, String lastname, String mobileno,
			String emailId) throws InterruptedException {
		
		pom.getBookHotelPage().addGustDetails(Salutation, firstname, lastname, mobileno, emailId);

	}

	@Then("User add gst details {string},{string} and {string}")
	public void user_add_gst_details_and(String GstNo, String companyNo, String companyAddress)
			throws InterruptedException {

		pom.getBookHotelPage().addGstDetails(GstNo, companyNo, companyAddress);

	}

	@Then("User add special request {string}")
	public void user_add_special_request(String SpecialRequest) throws InterruptedException {

		pom.getBookHotelPage().spicalRequest();
	}

	@Then("User add payment details with card options {string}")
	public void user_add_payment_details_with_card_options(String CardType, io.cucumber.datatable.DataTable dataTable) {

		pom.getBookHotelPage().addPaymentWithCardOptions(CardType, dataTable);
	}

	@Then("User should verify after booking success message {string} and save order id.")
	public void user_should_verify_after_booking_success_message_and_save_order_id(String expBookingIsConfirmed) {

		String actBookingIsConfirmed = pom.getBookHotelPage().verifyBookingIsConfirmed();
		//boolean b = actBookingIsConfirmed.contains(expBookingIsConfirmed);
		Assert.assertEquals(expBookingIsConfirmed, actBookingIsConfirmed);

	}

	@Then("User should verify same selected hotel only booked")
	public void user_should_verify_same_selected_hotel_only_booked() {

     boolean verifySameSelectedHotelIsBooked = pom.getBookHotelPage().verifySameSelectedHotelIsBooked();
     Assert.assertTrue(verifySameSelectedHotelIsBooked);
		  
	}

	@Then("User should verify payment error messsage {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_payment_error_messsage_and(String string, String string2, String string3, String string4, String string5, String string6) {

	}




}