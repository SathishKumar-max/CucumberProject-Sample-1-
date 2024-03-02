package com.omrbranch.pages;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookHotelPage extends BaseClass{
	
	public BookHotelPage(){
		
		PageFactory.initElements(wd, this);
	}
	//
	@FindBy(xpath = "//input[@id='oth']")
	private WebElement someOneelse;

	@FindBy(xpath = "//select[@id='user_title']")
	private WebElement selectSalutation;

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@id='user_phone']")
	private WebElement mobileNo;

	@FindBy(xpath = "//input[@id='user_email']")
	private WebElement eMail;
	
	@FindBy(xpath="//input[@id='gst']")
    private WebElement gstClick;
    
	@FindBy(xpath = "//input[@id='gst_registration']")
	private WebElement enterRegNo;

	@FindBy(xpath = "//input[@id='company_name']")
	private  WebElement companyName;

	@FindBy(xpath = "//input[@id='company_address']")
	private  WebElement companyAddress;

	@FindBy(xpath="//input[@id='late']")
	private WebElement lateCheckIn;
	
	@FindBy(xpath = "(//button[contains(text(),'Next')])[2]")
	private  WebElement nextBtn;
	
	@FindBy(xpath="//h5[text()='Credit/Debit/ATM Card']")
	private  WebElement creditDebitATMCard;
	
	@FindBy(xpath="//select[@id='payment_type']")
	private WebElement selectCartType;
	
	@FindBy(xpath="//select[@id='card_type']")
	private  WebElement selectCard;
	
	@FindBy(xpath="//input[@id='card_no']")
	private  WebElement cardNo;
	
	@FindBy(xpath="//input[@id='card_name']")
	private  WebElement nameOfCard;
	
	@FindBy(xpath="//select[@id='card_month']")
	private  WebElement selectMonth;
	
	@FindBy(xpath="//select[@id='card_year']")
	private WebElement cardYear;
	
	@FindBy(xpath="//input[@id='cvv']")
	private  WebElement cvv;
	
	@FindBy(xpath="//button[@id='submitBtn']")
	private  WebElement submitBtn;
	
	//h2[@name='booking-code']
	@FindBy(xpath="//h2[text()=' Booking is Confirmed ']")
	private WebElement bookingConfirm;
	
	@FindBy(xpath="//h5[text()='Vivanta Bengaluru Residency Road Deluxe']")
	private WebElement firstSelectedHotelName;
	
	@FindBy(xpath="//strong[contains(text(),'Vivanta Bengaluru Residency Road')]")
	private WebElement sameSelectedHotel; 
	
	public  WebElement getSomeOneelse() {
		return someOneelse;
	}

	public  WebElement getSelectSalutation() {
		return selectSalutation;
	}

	public  WebElement getFirstName() {
		return firstName;
	}

	public  WebElement getLastName() {
		return lastName;
	}

	public  WebElement getMobileNo() {
		return mobileNo;
	}

	public  WebElement geteMail() {
		return eMail;
	}

	public  WebElement getGstClick() {
		return gstClick;
	}

	public  WebElement getGstRegNo() {
		return enterRegNo;
	}

	public  WebElement getCompanyName() {
		return companyName;
	}

	public  WebElement getCompanyAddress() {
		return companyAddress;
	}

	public  WebElement getNextBtn() {
		return nextBtn;
	}
    
	public WebElement getLateCheckIn() {
		return lateCheckIn;
	}

	public  WebElement getCreditDebitATMCard() {
		return creditDebitATMCard;
	}

	public  WebElement getSelectCartType() {
		return selectCartType;
	}

	public  WebElement getSelectCard() {
		return selectCard;
	}

	public  WebElement getCardNo() {
		return cardNo;
	}

	public  WebElement getNameOfCard() {
		return nameOfCard;
	}

	public  WebElement getSelectMonth() {
		return selectMonth;
	}
    
	public WebElement getCardYear() {
		return cardYear;
	}

	public  WebElement getCvv() {
		return cvv;
	}

	public  WebElement getSubmitBtn() {
		return submitBtn;
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

	public void addGustDetails(String Salutation, String firstname, String lastname, String mobileno,
			String emailId) throws InterruptedException {
		
		helpsWait1();
		elementClickByJs(getSomeOneelse());
		helpsWait1();
		selectByVisibleText(getSelectSalutation(), Salutation);
		helpsWait1();
		sendKeys(getFirstName(), firstname);
		helpsWait1();
		sendKeys(getLastName(), lastname);
		helpsWait1();
		sendKeys(getMobileNo(), mobileno);
		helpsWait1();
		sendKeys(geteMail(), emailId);
		
	}
	public void addGstDetails(String GstNo, String companyNo, String companyAddress) throws InterruptedException{
		
		helpsWait1();
		elementtClick(getGstClick());
		helpsWait1();
		sendKeysJavaScript(getGstRegNo(), GstNo);
		helpsWait1();
		sendKeysJavaScript(getCompanyName(), companyNo);
		helpsWait1();
		sendKeysJavaScript(getCompanyAddress(), companyAddress);
		helpsWait1();
		elementClickByJs(getNextBtn());
		helpsWait1();
		
		
		
	}
	public void spicalRequest() throws InterruptedException{
	

	}
	public void addPaymentWithCardOptions(String CardType, io.cucumber.datatable.DataTable dataTable){
		
		elementClickByJs(getCreditDebitATMCard());
		selectByVisibleText(getSelectCartType(), CardType);
		
		List<Map<String, String>> outterMap = dataTable.asMaps();
	   
		switch (CardType) {
		case "Debit Card":
			Map<String, String> innerMap = outterMap.get(0);
		    String cardName = innerMap.get("CardType");
		    System.out.println(cardName);
		    selectByVisibleText(getSelectCard(), cardName);
		    String cardNO = innerMap.get("CardNo");
		    sendKeys(getCardNo(), cardNO);
		    String name = innerMap.get("Name");
		    sendKeys(getNameOfCard(), name);
		    String month  = innerMap.get("Month");
		    selectByVisibleText(getSelectMonth(), month);
		    String year = innerMap.get("Year");
		    selectByVisibleText(getCardYear(), year);
		    String cvv = innerMap.get("Cvv");
		    sendKeysJavaScript(getCvv(), cvv);
		    elementClickByJs(getSubmitBtn());
			break;
		case "Credit Card":
			Map<String, String> innerMap1 = outterMap.get(4);
		    String cardName1 = innerMap1.get("CardType");
		    System.out.println(cardName1);
		    selectByVisibleText(getSelectCard(), cardName1);
		    String cardNO1 = innerMap1.get("CardNo");
		    sendKeys(getCardNo(), cardNO1);
		    String name1 = innerMap1.get("Name");
		    sendKeys(getNameOfCard(), name1);
		    String month1  = innerMap1.get("Month");
		    selectByVisibleText(getSelectMonth(), month1);
		    String year1 = innerMap1.get("Year");
		    selectByVisibleText(getCardYear(), year1);
		    String cvv1 = innerMap1.get("Cvv");
		    sendKeysJavaScript(getCvv(), cvv1);
		    elementClickByJs(getSubmitBtn());
			break;
			
		default:
			break;
		}
		
	}
	public String verifyBookingIsConfirmed(){
		
		String verifyBookingIsConfirmedTxt = getElementText(getBookingConfirm());
		return verifyBookingIsConfirmedTxt;	
	}
  public boolean verifySameSelectedHotelIsBooked(){
	  
	String actfirstSelectedHtlTxt = getElementText(getFirstSelectedHotelName());
	String expsameSelectedHtlTxt = getElementText(getSameSelectedHotel());
    boolean equals = actfirstSelectedHtlTxt.equals(expsameSelectedHtlTxt);
	return equals;
	  
  }
}