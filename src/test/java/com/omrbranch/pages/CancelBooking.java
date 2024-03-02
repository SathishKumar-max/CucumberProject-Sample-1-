package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class CancelBooking extends BaseClass {

	public CancelBooking() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "//button[text()='My Booking']")
	private WebElement myBookingBtn;

	@FindBy(xpath = "(//a[text()='Cancel'])[1]")
	private WebElement cancelBtn;

	@FindBy(xpath = "//li[text()='Your booking cancelled successfully']")
	private WebElement cancelSucMsg;

	@FindBy(xpath = "(//h5[text()='Vivanta Bengaluru Residency Road Deluxe'])[1]")
	private WebElement firstBookingId;

	public WebElement getMyBookingBtn() {
		return myBookingBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getCancelSucMsg() {
		return cancelSucMsg;
	}

	public WebElement getFirstBookingId() {
		return firstBookingId;
	}

	public void cancelUpdatedOrderId() {

		elementClickByJs(getMyBookingBtn());
		elementClickByJs(getCancelBtn());
		clickOkAlert();
	}

	public boolean getCancelOrderIdSucMsg(String expCancelOrderIdSucMsg) {

		String actCancelOrderIdSucMsg = getElementText(getCancelSucMsg());
		boolean b = actCancelOrderIdSucMsg.contains(expCancelOrderIdSucMsg);
		return b;

	}

	public void navigateMyBooking() {

		back();

	}

	public void clickMyBooingBtn() {

		elementClickByJs(getMyBookingBtn());

	}

	public void clickCancelExistingOrderId() {

		elementClickByJs(getCancelBtn());

	}

}
