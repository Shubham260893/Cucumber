package stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import WebDriverFactory.BrowserFactory;
import WebDriverFactory.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	TestContext testcontext;
	Scenario scenario;

	public Hooks(TestContext context) {
		testcontext = context;

	}

	@Before
	public void beforeTest(Scenario scenario) {
		this.scenario=scenario;
		BrowserFactory browserfactory = new BrowserFactory();
		browserfactory.setScenario(scenario);
		WebDriverInstance.instanceOfDriver().setDriver(browserfactory.launchBrowser());
		WebDriver driver = WebDriverInstance.instanceOfDriver().getDriver();
		driver.get("https://www.makemytrip.com");

	}

	@After
	public void afterTest(Scenario scenario) {
	
			if (scenario.isFailed()) {

				byte[] screenshot = ((TakesScreenshot) WebDriverInstance.instanceOfDriver().getDriver())
						.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", scenario.getName());
				
			}
			WebDriverInstance.instanceOfDriver().tearDown();
	}
}
