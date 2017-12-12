package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/org/selenium/PHPTravels/src/test", glue = { "BDD_Automation" }, plugin = {
		"pretty", "html:target/cucumber-report"})

public class TestRunner {

	/*@BeforeClass
	public static void beforeClass() {
		LocalDateTime now = LocalDateTime.now();
		int year = now.getYear();
		int month = now.getMonthOfYear();
		int day = now.getDayOfMonth();
		int hour = now.getHourOfDay();
		int minute = now.getMinuteOfHour();
		int second = now.getSecondOfMinute();
		String snewFilename1 = year + "_" + month + "_" + day + "_" + hour + "_" + minute + "_" + second;
		String filePath = System.getProperty("user.dir") + "//src//main//resources//AutomationSuite//Report_"
				+ snewFilename1 + ".html";
		File file = new File(filePath);
		ExtentCucumberFormatter.setExtentHtmlReport(file);
	}*/
}