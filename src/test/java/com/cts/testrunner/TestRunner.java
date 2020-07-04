package com.cts.testrunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)//to execute this test case as cucumber test
@CucumberOptions(//this annotation is used to run your cucumber file with different parameters
		
		features = "C:/Users/lenovo/eclipse-workspace/CucumberDemo/project.feature",
		tags = {"@TC_01"},
		glue= {"com.cts.step"},
	    plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome=true
		)

@SuiteClasses({}) //its acts as collection of tests
public class TestRunner {



}
