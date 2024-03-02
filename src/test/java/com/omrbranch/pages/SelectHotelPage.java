package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;


public class SelectHotelPage extends BaseClass {

	public static String hotelName;
	public static String hotelPrice;

	public SelectHotelPage() {

		PageFactory.initElements(wd, this);
	}

	@FindBy(xpath = "//h5[text()='Select Hotel']")
	private  WebElement selectHotelSuccessMsg;
	
	@FindBy(xpath="//h2[contains(text(),'Book Hotel')]")
	private  WebElement bookHotelSuccessMsg;

	@FindBy(xpath = "//label[@for='value_pltoh']")
	private  WebElement priceLowTohigh;

	@FindBy(xpath = "//strong[@class='total-prize']")
	private  WebElement totalPriceLowTohighList;

	@FindBy(xpath = "//label[@for='value_ndesc']")
	private  WebElement descendingradioBtn;

	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']/h5")
	private  WebElement descendingOrderList;

	@FindBy(xpath = "//a[text()='Continue']")
	private  WebElement continueBtn;

	@FindBy(xpath = "//h5[text()='Vivanta Bengaluru Residency Road Deluxe']")
	private  WebElement firstHotelName;

	@FindBy(xpath = "(//strong[@class='total-prize'])[1]")
	private  WebElement firstHotelTotalPrice;
	
	@FindBy(xpath="//label[@for='Standard']")
	private WebElement clkStandardRadioBtn;
	
	@FindBy(xpath="//label[@for='Deluxe']")
	private WebElement clkDeluxeRadioBtn;
	
	@FindBy(xpath="//label[@for='Suite']")
	private WebElement clkSuiteBtn;
	
	@FindBy(xpath="//label[@for='Luxury']")
	private WebElement clkLuxuryBtn;
	
	@FindBy(xpath="//label[@for='Studio']")
	private WebElement clkStudioBtn;

	@FindBy(xpath="//a[text()='Standard/Deluxe/Suite/Luxury/Studio']")
	public WebElement clickedRoomTypes;
	
	
	public WebElement getSelectHotelSuccessMsg() {
		return selectHotelSuccessMsg;
	}


	public WebElement getBookHotelSuccessMsg() {
		return bookHotelSuccessMsg;
	}


	public  WebElement getPriceLowTohigh() {
		return priceLowTohigh;
	}
	

	public  WebElement getTotalPriceLowTohighList() {
		return totalPriceLowTohighList;
	}

	public  WebElement getDescendingradioBtn() {
		return descendingradioBtn;
	}

	public  WebElement getDescendingOrderList() {
		return descendingOrderList;
	}

	public  WebElement getContinueBtn() {
		return continueBtn;
	}

	public  WebElement getFirstHotelName() {
		return firstHotelName;

	}

	public  WebElement getFirstHotelTotalPrice() {
		return firstHotelTotalPrice;

	}
	
	public WebElement getClkStandardRadioBtn() {
		return clkStandardRadioBtn;
	}

	public WebElement getClkDeluxeRadioBtn() {
		return clkDeluxeRadioBtn;
	}

	public WebElement getClkSuiteBtn() {
		return clkSuiteBtn;
	}

	public WebElement getClkLuxuryBtn() {
		return clkLuxuryBtn;
	}

	public WebElement getClkStudioBtn() {
		return clkStudioBtn;
	}
	
	public WebElement getClickedRoomTypes() {
		return clickedRoomTypes;
	}

	public String getSelectHotelSuccessMsgText(){
		
		String SelectHotelSuccessMsgText = getElementText(getSelectHotelSuccessMsg());
		return SelectHotelSuccessMsgText;
		
	}
	public String getbookHotelSuccessMsgText(){
		
		String getbookHotelSuccessMsgText = getElementText(getBookHotelSuccessMsg());
		return getbookHotelSuccessMsgText;
		
	}

	public void acceptHotelSelectAlert() throws InterruptedException {

		helpsWait2();
		elementtClick(getContinueBtn());
		helpsWait2();
		clickOkAlert();
	}

	public void dismissHotelSelectAlert() throws InterruptedException {

		helpsWait2();
		elementtClick(getContinueBtn());
		helpsWait2();
		clickCancelAlert();
	}

	public String getFirsthoteltotalPrice() {

		String hotelprice = getElementText(getFirstHotelTotalPrice());
		return hotelprice;

	}

	public String getFirsthotelName() {

		String hotelprice = getElementText(getFirstHotelName());
		return hotelprice;
	}
	
	public void clickLowAndHigh(){
		
		elementtClick(getPriceLowTohigh());
	}
	
   public boolean sortingOrdr(){
	   
	   return sortingOrder(getTotalPriceLowTohighList());
	   
   }
   public boolean descendingOrder(){
	   
	   return descendingOrder(getDescendingOrderList());
	   
   }  
	public void clickDescendingOrder(){
		
		elementtClick(getDescendingradioBtn());
	   
	}
	public void clickRoomTypeRadioBtns(){
		
		elementtClick(getClkStandardRadioBtn());
		elementtClick(getClkDeluxeRadioBtn());
		elementtClick(getClkSuiteBtn());
		elementtClick(getClkLuxuryBtn());
		elementtClick(getClkStudioBtn());
		
	}	
	public boolean verifyFirstHotelName(String text){
		
		String verifyFrtHtlNamTxt = getElementText(getFirstHotelName());
		
		boolean b = verifyFrtHtlNamTxt.contains(text);
		return b;
		
	}
}