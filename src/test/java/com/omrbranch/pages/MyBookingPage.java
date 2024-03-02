package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.omrbranch.baseclass.BaseClass;

public class MyBookingPage extends BaseClass {

	// TC_5
	// TC_6

	@FindBy(xpath = "//button[text()='My Booking']")
	private WebElement myBookingBtn;

	// h4[contains(text(),'Bookings')]
	@FindBy(xpath = "(//div[@class='col-md-5'])[1]")
	private WebElement myBookingPageSucMge;

	@FindBy(xpath = "//div[@class='room-code'])[1]")
	private WebElement orderId;

	@FindBy(xpath = "(//button[text()='Edit'])[1]")
	private WebElement editBtn;

	@FindBy(xpath = "//input[@name='check_in']")
	private WebElement checkInDate;

	@FindBy(xpath = "//li[text()='Booking updated successfully']")
	private WebElement modifyOrderSucMsg;

	// h2[@name='booking-code']
	@FindBy(xpath = "//h2[text()=' Booking is Confirmed ']")
	private WebElement bookingConfirm;

	@FindBy(xpath = "//h5[text()='Vivanta Bengaluru Residency Road Deluxe']")
	private WebElement firstSelectedHotelName;

	@FindBy(xpath = "//strong[contains(text(),'Vivanta Bengaluru Residency Road')]")
	private WebElement sameSelectedHotel;

	@FindBy(xpath = "(//strong[@class='total-prize'])[1]")
	private WebElement price;

	public WebElement getMyBookingBtn() {
		return myBookingBtn;
	}

	public WebElement getMyBookingPageSucMge() {
		return myBookingPageSucMge;
	}

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getModifyOrderSucMsg() {
		return modifyOrderSucMsg;
	}

	public WebElement getBookingConfirm() {
		return bookingConfirm;
	}

	public WebElement getFirstSelectedHotelName() {
		return firstSelectedHotelName;
	}

	public WebElement getSameSelectedHotel() {
		return sameSelectedHotel;
	}

	public WebElement getPrice() {
		return price;
	}

	public void clickMyBookingBtn() {

		elementClickByJs(getMyBookingBtn());

	}

	public boolean verifyMYBookingPageSucMsg(String expMyBookingPageSucMsgTxt) {

		String actMyBookingPageSucMsgTxt = getElementText(getMyBookingPageSucMge());

		boolean b = actMyBookingPageSucMsgTxt.contains(expMyBookingPageSucMsgTxt);
		return b;

	}

	public boolean verifySameOrderIdIsDisplayed() {

		boolean displayed = isDisplayed(getOrderId());

		return displayed;
	}

	public boolean verifySameHotelNameIsPresent() {

		boolean displayed = isDisplayed(getSameSelectedHotel());
		return displayed;
	}

	public boolean verifySamePriceIsPresent() {
  
		String expPrice = "Rs 2,832";
		String actPriceTxt = getElementText(getPrice());
		
		boolean b = expPrice.contains(actPriceTxt);
		return b;
		
	}
	public void modifyCheckInDate(String modifyCheckInDate){
		
		sendKeysJavaScript(getCheckInDate(), modifyCheckInDate);
	}
	
	public String verifyModifyOrderSucMsg(){
		
		String modifyOrderSucMsg = getElementText(getModifyOrderSucMsg());
		return modifyOrderSucMsg;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
