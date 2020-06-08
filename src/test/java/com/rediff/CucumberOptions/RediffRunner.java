package com.rediff.CucumberOptions;

import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/rediff/features",
     glue="com.rediff.stepDefinations"
		)
public class RediffRunner extends AbstractTestNGCucumberTests {

}
