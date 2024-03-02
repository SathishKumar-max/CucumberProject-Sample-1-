package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = ("@Login"),features ="src/test/resources/Features", glue = "com.omrbranch.stepdefinition",  dryRun = false, stepNotifications = true)
public class TestRunnerClass {

	@AfterClass
	public static void afterClass() {

		Reporting.generatedJVMReport("E:\\GreensSelenium\\OMRBranchHotelAutomation\\target\\index.json");
	}
}

