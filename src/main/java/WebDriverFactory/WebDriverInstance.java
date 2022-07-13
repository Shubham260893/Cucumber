package WebDriverFactory;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebDriverInstance {

	private static WebDriverInstance webdriverInstance;
	protected static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	private WebDriverInstance() {

	}

	public static WebDriverInstance instanceOfDriver() {
		if (webdriverInstance == null) {
			webdriverInstance = new WebDriverInstance();
		}

		return webdriverInstance;
	}

	public WebDriver getDriver() {

		return driver.get();
	}

	public void setDriver(WebDriver driverparm) {
		driver.set(driverparm);

	}

	public void tearDown() {
		if (driver != null) {
			driver.get().quit();
			driver.remove();
		}
	}

}
