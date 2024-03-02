package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.omrbranch.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {

/*	
	@Before
	public void beforeScenario() throws FileNotFoundException, InterruptedException{
		
		try {
			launchBrowser();
			getDriver(getPropertyFileValue("browser"));
			enterAppUrl(getPropertyFileValue("url"));
			maximizeWindow();
			helpsWait1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void afterScenario(Scenario scenario) throws IOException{
		
		scenario.attach(takesScreenshot(), "image/png", "EveryScenario");
	}*/
}
