package com.omrbranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class LogInPage extends BaseClass {

	public LogInPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "email")
	private static WebElement txtUsername;

	@FindBy(id = "pass")
	private static WebElement txtPassword;

	@FindBy(xpath = "//button[text()='Login']")
	private static WebElement logInBtn;
	
	@FindBy(xpath="//a[text()='Book Hotel']")
	private WebElement bookHotel;

	@FindBy(xpath = "//a[@data-testid='username']")
	private static WebElement logInSuccessMsg;

	@FindBy(xpath = "//b[text()='Invalid Login details or Your Password might have expired. ']")
	private static WebElement logInError;

	public static WebElement getTxtUsername() {
		return txtUsername;
	}

	public static WebElement getTxtPassword() {
		return txtPassword;
	}

	public static WebElement getLogInBtn() {
		return logInBtn;
	}

	public static WebElement getLogInSuccessMsg() {
		return logInSuccessMsg;

	}
	public WebElement getBookHotel() {
		return bookHotel;
	}

	public static WebElement getLogInError() {
		return logInError;
	}

	// 1,Login with valid username & password
	public void login(String username, String password) throws InterruptedException {
		helpsWait1();
		sendKeys(getTxtUsername(), username);
		sendKeys(getTxtPassword(), password);
		elementtClick(getLogInBtn());
		helpsWait2();
		elementClickByJs(getBookHotel());

	}

	// 2,Login with valid username & password enter with robot class
	public void loginEnterKey(String username, String password) throws AWTException, InterruptedException {
		helpsWait1();
		sendKeys(getTxtUsername(), username);
		sendKeys(getTxtPassword(), password);
		enterKey();
		helpsWait2();
		elementClickByJs(getBookHotel());
		
	}

	// 3,Enter invalid password
	public void loginInValidCredentials(String username, String password) throws InterruptedException {
		helpsWait1();
		sendKeys(getTxtUsername(), username);
		sendKeys(getTxtPassword(), password);
		elementtClick(getLogInBtn());

	}

	// 4,Get the valid login successMsgText
	public String logInSuccessMsg() {

		String loginSuccText = getElementText(getLogInSuccessMsg());
		return loginSuccText;

	}

	// 5,Get the invalid password error msg
	public String getLoginErrorMsg() {

		String elementGetText = getElementText(getLogInError());
		return elementGetText;
	}
}