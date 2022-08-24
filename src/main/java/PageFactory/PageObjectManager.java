package PageFactory;

import org.openqa.selenium.WebDriver;

import WebDriverFactory.WebDriverInstance;
import io.cucumber.java.Scenario;

public class PageObjectManager {
	
	SearchFlightPageObject  searchFlightPageObject;
	
	public SearchFlightPageObject getsearchFlightPageObject()
	{
		
		return(searchFlightPageObject==null? searchFlightPageObject= new SearchFlightPageObject(WebDriverInstance.instanceOfDriver().getDriver()): searchFlightPageObject);
	}
	
	

}
