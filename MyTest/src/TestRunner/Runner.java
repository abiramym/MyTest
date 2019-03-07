package TestRunner;

import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
//@CucumberOptions(features="Features",glue={"Stepdefinition"})
@Cucumber.Options(features="Features",glue= {"Stepdefinition"})

public class Runner {

}
