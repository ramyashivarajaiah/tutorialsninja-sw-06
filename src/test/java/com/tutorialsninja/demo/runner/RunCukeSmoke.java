package com.tutorialsninja.demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "src/test/resources/features", //path of feature
        glue = "com/tutorialsninja/demo/steps",// steps source root path
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json"},
        tags = "@smoke"

)
public class RunCukeSmoke extends AbstractTestNGCucumberTests {


}
