package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions( features= "C:./src/test/resources/features",
			  glue= "stepdefinitions",
			  tags="@SearchFlight",
			  plugin= "json:target/cucumber-reports/cucumber.json")



public class MakeMyTripRunner {
	

}
