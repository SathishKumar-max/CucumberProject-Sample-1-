package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC3_SelectHotelStep {

	PageObjectManager pom = new PageObjectManager();

	@When("User select first hotel and save name and price")
	public void user_select_first_hotel_and_save_name_and_price() {

		String hotelName = pom.getSelectHotelPage().getFirsthotelName();
		String hotelPrice = pom.getSelectHotelPage().getFirsthoteltotalPrice();
	}

	@When("User accept the alert")
	public void user_accept_the_alert() throws InterruptedException {

		pom.getSelectHotelPage().acceptHotelSelectAlert();
	}

	@Then("User should verify after Search Hotel success message {string}")
	public void user_should_verify_after_search_hotel_success_message(String expSelectHotelSuccessMsg) {

		String actSelectHotelSuccessMsgText = pom.getSelectHotelPage().getSelectHotelSuccessMsgText();
		Assert.assertEquals("Verify SelectHotel Success Msg", expSelectHotelSuccessMsg, actSelectHotelSuccessMsgText);
	}

	@Then("User should verify after Select Hotel success message {string}")
	public void user_should_verify_after_select_hotel_success_message(String expBookHotelSuccessMsg) {

		String actbookHotelSuccessMsgText = pom.getSelectHotelPage().getbookHotelSuccessMsgText();
		Assert.assertEquals("Verify BookHotel Success Msg", expBookHotelSuccessMsg, actbookHotelSuccessMsgText);
	}

	@When("User cancel the alert")
	public void user_cancel_the_alert() throws InterruptedException {

		pom.getSelectHotelPage().dismissHotelSelectAlert();
	}

	@When("User select radio button to sort by price low to high")
	public void user_select_radio_button_to_sort_by_price_low_to_high() {

		pom.getSelectHotelPage().clickLowAndHigh();
	}

	@Then("User should verify hotels are arranged in sorting order")
	public void user_should_verify_hotels_are_arranged_in_sorting_order() {

		boolean b = pom.getSelectHotelPage().sortingOrdr();

		Assert.assertTrue("Verify Hotels Ascending", b);
	}

	@When("User select radio button to sort name by descending order")
	public void user_select_radio_button_to_sort_name_by_descending_order() {

		pom.getSelectHotelPage().clickDescendingOrder();

	}

	@Then("User should verify the hotels are arranged in sorting order")
	public void user_should_verify_the_hotels_are_arranged_in_sorting_order() {

		boolean b1 = pom.getSelectHotelPage().descendingOrder();
		Assert.assertTrue("Verify Hotels Descending", b1);
	}

	@Then("User should verify after Search Hotel name ends with same {string} filter is present")
	public void user_should_verify_after_search_hotel_name_ends_with_same_filter_is_present(
			String expEndsWithSameFilter) {

		boolean verifyFirstHotelName = pom.getSelectHotelPage().verifyFirstHotelName(expEndsWithSameFilter);
		Assert.assertTrue("Verify Search Hotel Name", verifyFirstHotelName);
	}

}
