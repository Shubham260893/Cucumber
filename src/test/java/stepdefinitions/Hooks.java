package stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import PropertyFileUtils.ReadPropertyFile;
import WebDriverFactory.BrowserFactory;
import WebDriverFactory.WebDriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	TestContext testcontext;
	

	public Hooks(TestContext context) {
		testcontext = context;
	}
	
	@Before
	public void beforeTest(Scenario scenario) {
		ReadPropertyFile prop= new ReadPropertyFile();
		prop.readPropertyFile();
		WebDriver driver = WebDriverInstance.instanceOfDriver().getDriver();
		driver.get(prop.getProperty("url"));

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
	
	@AfterStep
	public void screenshotaftereverystep(Scenario scenario)
	{
		byte[] screenshot = ((TakesScreenshot) WebDriverInstance.instanceOfDriver().getDriver())
				.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", scenario.getName());
	}
}
