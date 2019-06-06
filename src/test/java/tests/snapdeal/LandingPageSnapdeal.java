package tests.snapdeal;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.snapdeal.LandingPageSnapdealObjects;
import resources.Base;

public class LandingPageSnapdeal extends Base{
	
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("snapdealUrl"));
		log.info("Navigated to Home Page");
		
		
	}
	
	@Test
	public void validateHomePage() {
		
		Actions action = new Actions(driver);
		LandingPageSnapdealObjects lpo = new LandingPageSnapdealObjects(driver);
		Assert.assertEquals(true, lpo.getImageLogo().isDisplayed());
		log.info("Successfully validated Logo");
	
		Assert.assertEquals(true, lpo.getLoginImage().isEnabled());
		log.info("Successfully validated Login image");
		
		
		action.moveToElement(lpo.getLoginImage()).moveToElement(lpo.getLoginImage()).click().build().perform();
		
	
	}
	
	@AfterTest
	public void shutdown() throws IOException {
	
		driver.close();
		driver=null;
		log.info("Browser closed");
	}
}
