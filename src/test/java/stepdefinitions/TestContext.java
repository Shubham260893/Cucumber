package stepdefinitions;

import PageFactory.PageObjectManager;
import io.cucumber.java.Scenario;


public class TestContext {

	private PageObjectManager pageObjectManager;
	public Scenario s;

	public TestContext() {
		
		pageObjectManager = new PageObjectManager();

	}

	public PageObjectManager getPageobjectManager() {
		return pageObjectManager;
	}

}
