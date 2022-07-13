package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ElementUtils.CommonElementUtils;
import io.cucumber.java.Scenario;

public class SearchFlightPageObject {
	
	WebDriver driver;
	
	String tripType="//li[text()='%s']";
	public CommonElementUtils c;
	

	public SearchFlightPageObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		 c= new CommonElementUtils(driver); 
	}
	
	public void JourneyType(String journeyType)
	{
		 WebElement w= driver.findElement(By.xpath(String.format(tripType, journeyType)));
	//	 c.windowHandles();
		 c.clickElement(w);
		
	}
	
}
