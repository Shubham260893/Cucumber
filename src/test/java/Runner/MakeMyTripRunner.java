package Runner;

import java.io.File;
import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.vimalselvam.cucumber.listener.Reporter;

import WebDriverFactory.BrowserFactory;
import WebDriverFactory.WebDriverInstance;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions( features= {"classpath:features"},
			  glue= "stepdefinitions",
			  tags="@SearchFlight",
			  plugin= {"json:target/cucumber-reports/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})



public class MakeMyTripRunner extends AbstractTestNGCucumberTests {
	
	
	 @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	
	 @Parameters({ "browser" })
	    @BeforeMethod
	    public static void setUpScenario(String browser) throws MalformedURLException {
		 BrowserFactory browserfactory = new BrowserFactory();
		 WebDriverInstance.instanceOfDriver().setDriver(browserfactory.launchBrowser(browser));
	    }

}

