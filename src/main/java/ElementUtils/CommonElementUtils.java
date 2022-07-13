package ElementUtils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import WebDriverFactory.WebDriverInstance;


public class CommonElementUtils {
	
	WebDriver driver;
	
	public CommonElementUtils(WebDriver driver) {
		
		this.driver = driver;
	}


	
	public void windowHandles()
	{
		Set<String> s= driver.getWindowHandles();
		
		Iterator<String> i= s.iterator();
		
		while(i.hasNext())
		{
			String child= i.next();
			
		
				driver.switchTo().window(child);
			}
		}
		
	
	public void brokenLinks()
	{
		
		
		
	}
	
	public void clickElement(WebElement element)
	{
		
		element.click();
	}
	
		
	}


