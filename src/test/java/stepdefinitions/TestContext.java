package stepdefinitions;

import org.openqa.selenium.WebDriver;

import PageFactory.PageObjectManager;
import WebDriverFactory.BrowserFactory;
import WebDriverFactory.WebDriverInstance;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class TestContext {

	private PageObjectManager pageObjectManager;
	private WebDriverInstance instance;
	Scenario scenario;

	public TestContext() {
		
		
		pageObjectManager = new PageObjectManager();
		
	}

	public PageObjectManager getPageobjectManager() {
		return pageObjectManager;
	}


	

	
}
