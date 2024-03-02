package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC2_ExploreHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Then("User Search Hotels by selecting {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotels_by_selecting_and(String statename, String city, String selectRoomType, String checkindate,
			String checkoutdate, String noofroom, String noofadult, String noofchild) {

		pom.getExploreHotelPage().exploreHotel(statename, city, selectRoomType, checkindate, checkoutdate, noofroom,
				noofadult, noofchild);
		
	}

	@Then("User should verify after Search Hotel success message  {string}")
	public void user_should_verify_after_search_hotel_success_message(String expSelectHotelSuccMsg) {

		String actSelectHotelSuccMsg = pom.getExploreHotelPage().getSelectHotelSuccessMsgText1();
		boolean succ = actSelectHotelSuccMsg.equals(expSelectHotelSuccMsg);
        Assert.assertTrue("Verify Search Hotel Success Message", succ);
	}

	@Then("User Search Hotels by selecting {string},{string},{string},{string},{string} and {string}")
	public void user_search_hotels_by_selecting_and(String statename, String cityname, String checkIndate,
			String checkOutdate, String noOfroom, String noOfadult) {

		pom.getExploreHotelPage().exploreHotelWithMandatoryFields(statename, cityname, checkIndate, checkOutdate,
				noOfroom, noOfadult);
	}

	@Then("User Search Hotels without selecting any fields")
	public void user_search_hotels_without_selecting_any_fields() {
		
		pom.getExploreHotelPage().exploreHotelWithOutAnyFieldsGetErrorMsg();
		
	}

	@Then("User should verify empty field error message {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_empty_field_error_message_and(String expStateError, String expCityError, String expCheckInDateError,
			String expCheckOutDateError, String expNoOfRoomsError, String expNoOfAdults) throws InterruptedException {

	String actStateErrorTxt = pom.getExploreHotelPage().stateErrorMsg();
	boolean b = actStateErrorTxt.contains(expStateError);
	Assert.assertTrue("Verify State Error Msg", b);
	
	String actCityErrorTxt = pom.getExploreHotelPage().cityErrorMsg();
	boolean b1 = actCityErrorTxt.equals(expCityError);
	Assert.assertTrue("Verify City Error Msg", b1);
	
	String actCheckInDateErrorMsgTxt = pom.getExploreHotelPage().checkInDateErrorMsg();
	boolean b2 = actCheckInDateErrorMsgTxt.equals(expCheckInDateError);
	Assert.assertTrue("Verify CheckInDate Error Msg", b2);
	
	
 	String actCheckOutDateErrorMsgTxt = pom.getExploreHotelPage().checkOutDateErrorMsg();
 	boolean b3 = expCheckOutDateError.equals(expCheckOutDateError);
    Assert.assertTrue("Verify CheckOutDate Error Msg", b3);
 	
	
	String actNoOfRoomErrorMsgTxt = pom.getExploreHotelPage().noOfRoomErrorMsg();
	boolean b4 = actNoOfRoomErrorMsgTxt.equals(expNoOfRoomsError);
	Assert.assertTrue("Verify NoOfRoomError Error Msg", b4);
	
	String actNoOfAdultsErrorMsgTxt = pom.getExploreHotelPage().noOfAdultsErrorMsg();
	boolean b5 = actNoOfAdultsErrorMsgTxt.equals(actNoOfAdultsErrorMsgTxt);
	Assert.assertTrue("Verify NoOfAdults Error Msg", b5);
	 
	}

	@Then("User should verify after Search Hotel name ends with {string} is present")
	public void user_should_verify_after_search_hotel_name_ends_with_is_present(String selectRoomType) throws InterruptedException {
       
        
        pom.getExploreHotelPage().verifydisplayedFilters(selectRoomType);
        boolean verifyHotelNameEndsWith = pom.getExploreHotelPage().verifyHotelNameEndsWith(selectRoomType);
        Assert.assertTrue(verifyHotelNameEndsWith);
        
	
	}

}