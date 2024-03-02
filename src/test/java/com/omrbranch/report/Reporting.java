package com.omrbranch.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	
	public static void generatedJVMReport(String jsonFile){
		
 //1, Mention the path of the Jvm report where to store
		
		File file = new File("E:\\GreensSelenium\\OMRBranchHotelAutomation\\target");
		
 //2,Create object for configuration
		Configuration configuration = new Configuration(file, "OMRBranchHotelAutomation");
		
 //3, Browser, author, testng, sprint, version
		configuration.addClassifications("Browser", "chrome");
		configuration.addClassifications("Version", "114");
		configuration.addClassifications("Sprint", "34");
		configuration.addClassifications("OS", "WINDOWS 11");
		
 //4, Create the object for ReportBuilder class--->Json files
		
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonfiles, configuration);
		
 //5, Generate Report
		
		builder.generateReports();
	}
}
