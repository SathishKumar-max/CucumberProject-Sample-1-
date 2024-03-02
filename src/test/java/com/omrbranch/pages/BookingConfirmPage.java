package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

//order id
//bookingid confimd
//hotelname

public class BookingConfirmPage extends BaseClass{
	
	public BookingConfirmPage(){
		
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath="//button[text()='My Booking']")
	private WebElement myBookingBtn;
	
	//(//div[@class='room-code'])[1]
	@FindBy(xpath="//h2[@class='couppon-code']/child::strong")
	private  WebElement orderId;
	
	@FindBy(xpath="//*[@id='page-wrapper']/section/div/div/div/div/div/div/h2/text()")
	private  WebElement orderMsg;
	
	@FindBy(xpath="//strong[text()='The Chevron Hotel']")
	private  WebElement hotelName;
	
	
	public WebElement getMyBookingBtn() {
		return myBookingBtn;
	}

	public  WebElement getOrderId() {
		return orderId;
	}

	public  WebElement getOrderMsg() {
		return orderMsg;
	}

	public  WebElement getHotelName() {
		return hotelName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}