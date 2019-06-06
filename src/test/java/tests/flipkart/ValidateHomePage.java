package tests.flipkart;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.flipkart.LandingPageObjects;
import resources.Base;


public class ValidateHomePage extends Base{
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		driver.get((prop.getProperty("flipkartUrl")));	
		log.info("Navigated to the URL");
	}

	
	@Test	
	public void basePageNavigation() {
		
		LandingPageObjects  lp = new LandingPageObjects(driver);
		Assert.assertEquals("Login", lp.getLoginText().getText());
		log.info("Successfully validated Login text");
	}

	
	@AfterTest
	public void shutdown() throws IOException {
		
		driver.close();
		driver=null;
	}
}
