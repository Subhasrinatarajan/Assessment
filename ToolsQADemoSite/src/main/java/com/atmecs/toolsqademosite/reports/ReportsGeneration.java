package com.atmecs.toolsqademosite.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportsGeneration {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;

	public void reportLog(String testname) {
		htmlReporter = new ExtentHtmlReporter("./test-output/report.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		test = extent.createTest(testname);
		test.log(Status.INFO, testname);
		test.log(Status.PASS, testname);
		extent.flush();
	}
}
