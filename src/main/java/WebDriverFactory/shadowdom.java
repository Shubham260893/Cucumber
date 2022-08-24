package WebDriverFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class shadowdom {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='pact']")));
		WebElement a= driver.findElement(By.cssSelector("#snacktime")).getShadowRoot().findElement(By.cssSelector("#tea"));
		js.executeScript("arguments[0].scrollIntoView(true);",a);
		Thread.sleep(5000);	
		js.executeScript( "document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\").value='masala tea'");
		
		driver.switchTo().defaultContent();
		WebElement b= driver.findElement(By.cssSelector("#userName"));
		js.executeScript("arguments[0].scrollIntoView(true);",b);
		Thread.sleep(5000);	
		js.executeScript("document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\").value='dominos'");

	}}
				
		