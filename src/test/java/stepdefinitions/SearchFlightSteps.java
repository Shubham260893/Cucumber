package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import PageFactory.SearchFlightPageObject;
import WebDriverFactory.BrowserFactory;
import WebDriverFactory.WebDriverInstance;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFlightSteps {
	
	TestContext testcontext;
	SearchFlightPageObject searchflightpageobject;
	WebDriver driver;
	public static Scenario scenario;
	
	
	
	public SearchFlightSteps(TestContext context)
	{
		testcontext=context;
		driver= WebDriverInstance.instanceOfDriver().getDriver();
		searchflightpageobject= testcontext.getPageobjectManager().getsearchFlightPageObject();
		
		
		
	}
	
	
	@Given("I select round trip journey")
	public void i_select_round_trip_journey() {
	 
		
	}

	@Given("I select {string} in from journey")
	public void i_select_in_from_journey(String trip) {
		
		searchflightpageobject.JourneyType(trip);
	
		
	   
	}
	@When("I select {string} in To journey")
	public void i_select_in_to_journey(String string) {
	  
	}

	@When("I select departure date")
	public void i_select_departure_date() {
	    
	}

	@When("I select return date")
	public void i_select_return_date() {
	    
	}

	@Then("I click on search")
	public void i_click_on_search() {
	    
	}
	

}
