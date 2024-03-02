package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExploreHotelPage extends com.omrbranch.baseclass.BaseClass {

	public ExploreHotelPage() {

		PageFactory.initElements(wd, this);
	}
	
	@FindBy(xpath="//a[text()='Book Hotel']")
	private WebElement bookHotel;
	
	@FindBy(xpath = "//a[contains(text(),'Welcome Karuna')]")
	private WebElement logInSuccessMsg;

	@FindBy(id = "state")
	private WebElement selectState;

	@FindBy(xpath = "//select[@id='city']")
	private WebElement selectCity;

	@FindBy(id = "room_type")
	private WebElement selectRoomtype;

	@FindBy(xpath = "//input[@name='check_in']")
	private WebElement checkIndate;

	@FindBy(xpath = "//input[@name='check_out']")
	private static WebElement checkOutdate;

	@FindBy(id = "no_rooms")
	private WebElement noOfroom;

	@FindBy(id = "no_adults")
	private WebElement noOfadult;

	@FindBy(xpath = "//input[@id='no_child']")
	private WebElement noOfchildrn;

	@FindBy(id = "hotelsearch_iframe")
	private WebElement frame;

	@FindBy(id = "searchBtn")
	private WebElement searchBtn;

	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']//h5")
	private WebElement lisfOfSelectRoomTypeHotelName;
	
	@FindBy(xpath = "//h5[text()='Select Hotel']")
	private WebElement selectHotelSuccessMsgText;

	@FindBy(xpath = "//div[@class='invalid-feedback animated fadeInDown']")
	private WebElement errorMsgofExplorehotel;

	@FindBy(xpath = "/html/body/div[4]/div[1]/section/div/div/div/div/form/div/div[1]/div[1]/div/div")
	private WebElement stateErrorMsgText;

	@FindBy(xpath = "(//div[@class='invalid-feedback animated fadeInDown'])[2]")
	private WebElement cityErrorMsgText;

	@FindBy(xpath = "(//div[@class='invalid-feedback animated fadeInDown'])[3]")
	private WebElement checkInDateErrorMsgText;

	@FindBy(xpath = "(//div[@class='invalid-feedback animated fadeInDown'])[4]")
	private WebElement checkOutDateErrorMsgText;

	@FindBy(xpath = "(//div[@class='invalid-feedback animated fadeInDown'])[5]")
	private WebElement noOfRoomErrorMsgText;

	@FindBy(xpath = "(//div[@class='invalid-feedback animated fadeInDown'])[6]")
	private WebElement noOfAdultsErrorMsgText;

	@FindBy(xpath = "//a[@id='room_type']")
	private WebElement multipleRoomType;

	@FindBy(xpath = "//a[@class='ui-state-default']")
	private WebElement inDateDatesSelector;

	public WebElement getBookHotel() {
		return bookHotel;
	}

	public WebElement getInDateDatesSelector() {
		return inDateDatesSelector;
	}

	public WebElement getLogInSuccessMsg() {
		return logInSuccessMsg;
	}

	public WebElement getSelectState() {
		return selectState;
	}

	public WebElement getSelectCity() {
		return selectCity;
	}

	public WebElement getSelectRoomtype() {
		return selectRoomtype;
	}

	public WebElement getCheckIndate() {
		return checkIndate;
	}

	public WebElement getCheckOutdate() {
		return checkOutdate;
	}

	public WebElement getNoOfroom() {
		return noOfroom;
	}

	public WebElement getNoOfadult() {
		return noOfadult;
	}

	public WebElement getNoOfchildrn() {
		return noOfchildrn;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getSelectHotelSuccessMsgText() {
		return selectHotelSuccessMsgText;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getErrorMsgofExplorehotel() {
		return errorMsgofExplorehotel;
	}

	public WebElement getStateErrorMsgText() {
		return stateErrorMsgText;
	}

	public WebElement getCityErrorMsgText() {
		return cityErrorMsgText;
	}

	public WebElement getCheckInDateErrorMsgText() {
		return checkInDateErrorMsgText;
	}

	public WebElement getCheckOutDateErrorMsgText() {
		return checkOutDateErrorMsgText;
	}

	public WebElement getNoOfRoomErrorMsgText() {
		return noOfRoomErrorMsgText;
	}

	public WebElement getNoOfAdultsErrorMsgText() {
		return noOfAdultsErrorMsgText;
	}

	public WebElement getMultipleRoomType() {
		return multipleRoomType;
	}
	public WebElement getlistOfSelectRoomTypeHotelName(){
		return lisfOfSelectRoomTypeHotelName;
		
	}
	public String getLogInSuccessMsgText() {

		
		String loginHotelElementText = getElementText(getLogInSuccessMsg());
		return loginHotelElementText;
		
	}
     public List<WebElement> getHotelNames(){
		
		getlistOfSelectRoomTypeHotelName();
		return null;
		
	}
	
	public boolean verifyHotelNameEndsWith(String selectRoomType){
		
		List<WebElement> hotelName = getHotelNames();
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		for (WebElement htName : hotelName) {
			String text = htName.getText();
		if (text.endsWith(selectRoomType)) {
			list1.add(text);
		} else {
		     list2.add(text);
		}
		}boolean empty = list2.isEmpty();
		return empty;
		
		
	}
	public void verifydisplayedFilters(String selectRoomType){
		
		selectByVisibleText(getSelectRoomtype(), selectRoomType);
		
		
	}
	public void exploreHotel(String statename, String city, String selectRoomType, String checkindate, String checkoutdate,
			String noofroom, String noofadult, String noofchild) {

		selectByVisibleText(getSelectState(), statename);
		selectByVisibleText(getSelectCity(), city);
		selectByVisibleText(getSelectRoomtype(), selectRoomType);
		sendKeysJavaScript(getCheckIndate(), checkindate);
		sendKeysJavaScript(getCheckOutdate(), checkoutdate);
		selectByVisibleText(getNoOfroom(), noofroom);
		selectByVisibleText(getNoOfadult(), noofadult);
		sendKeys(getNoOfchildrn(), noofchild);
		switchtoFrameByElement(getFrame());
		elementtClick(getSearchBtn());
		defaultContent();

	}

	public String getSelectHotelSuccessMsgText1() {

		String selectHotelElementText = getElementText(getSelectHotelSuccessMsgText());
		return selectHotelElementText;

	}

	public String stateErrorMsg() {

		String stateErrorMsg = getElementText(getStateErrorMsgText());
		return stateErrorMsg;
	}

	public String cityErrorMsg() {

		String cityErrorMsg = getElementText(getCityErrorMsgText());
		return cityErrorMsg;
	}

	public String checkInDateErrorMsg() {

		String checkInDateMsg = getElementText(getCheckInDateErrorMsgText());
		return checkInDateMsg;

	}

	public String checkOutDateErrorMsg() {

		String checkOutDateMsg = getElementText(getCheckOutDateErrorMsgText());
		return checkOutDateMsg;
	}

	public String noOfRoomErrorMsg() {

		String noOfroomMsg = getElementText(getNoOfRoomErrorMsgText());
		return noOfroomMsg;

	}

	public String noOfAdultsErrorMsg() {

		String noOfadultsMsg = getElementText(getNoOfAdultsErrorMsgText());
		return noOfadultsMsg;

	}

	public void exploreHotelWithMandatoryFields(String statename, String cityname, String checkIndate,
			String checkOutdate, String noOfroom, String noOfadult) {

		selectByVisibleText(getSelectState(), statename);
		selectByVisibleText(getSelectCity(), cityname);
		sendKeysJavaScript(getCheckIndate(), checkIndate);
		sendKeysJavaScript(getCheckOutdate(), checkOutdate);
		selectByVisibleText(getNoOfroom(), noOfroom);
		selectByVisibleText(getNoOfadult(), noOfadult);
		switchtoFrameByElement(getFrame());
		elementtClick(getSearchBtn());
		defaultContent();

	}

	public void exploreHotelWithOutAnyFieldsGetErrorMsg() {

		switchtoFrameByElement(getFrame());
		elementtClick(getSearchBtn());
		defaultContent();
	}
}