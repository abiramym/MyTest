package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
//@CucumberOptions(features="Features",glue={"Stepdefinition"})
@CucumberOptions(features="Features",glue= {"stepdefinition"})

public class Runner {

}
