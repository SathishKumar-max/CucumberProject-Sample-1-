package com.omrbranch.stepdefinition;

import java.awt.AWTException;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Given("User is on the OMR Branch Hotel page")
	public void user_is_on_the_omr_branch_hotel_page() {
         
		
		launchBrowser();
		implicityWait();
		maximizeWindow();
		getUrl("https://www.omrbranch.com/");

	}

	@When("User login {string} and {string}")
	public void user_login_and(String username, String password) throws InterruptedException {

		pom.getLoginPage().login(username, password);

	}

	@Then("User should verify after login success message {string}")
	public void user_should_verify_after_login_success_message(String expLoginSuccessMsg) {
		
		String actLoginSuccessMsg = pom.getLoginPage().logInSuccessMsg();
		Assert.assertEquals("Verify after login", expLoginSuccessMsg, actLoginSuccessMsg);
	}

	@When("User login {string},{string}")
	public void user_login(String username, String password) throws AWTException, InterruptedException {
		
		pom.getLoginPage().loginEnterKey(username, password);
	}

	@Then("User should verify login error message {string}")
	public void user_should_verify_login_error_message(String expLoginErrorMsg) throws InterruptedException {
		
		String actLoginErrorMsgText = pom.getLoginPage().getLoginErrorMsg();
		System.out.println(actLoginErrorMsgText);

		boolean b = actLoginErrorMsgText.contains(expLoginErrorMsg);
		Assert.assertTrue("Verify login Error msg", b);

	}

}