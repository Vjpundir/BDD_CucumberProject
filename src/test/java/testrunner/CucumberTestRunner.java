package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
                 glue = {"stepdefinitions","basetest"},

// Package where step definition will be
                 
		dryRun = false, // Important to generate missing step snippets
		plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json" })

public class CucumberTestRunner {

}
