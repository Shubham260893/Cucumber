package PageFactory;

import WebDriverFactory.WebDriverInstance;
import io.cucumber.java.Scenario;

public class PageObjectManager {
	
	SearchFlightPageObject  searchFlightPageObject;

	
	public SearchFlightPageObject getsearchFlightPageObject()
	{
		
		Scenario Scenario;
		return(searchFlightPageObject==null? searchFlightPageObject= new SearchFlightPageObject(WebDriverInstance.instanceOfDriver().getDriver()): searchFlightPageObject);
	}
	
	

}
