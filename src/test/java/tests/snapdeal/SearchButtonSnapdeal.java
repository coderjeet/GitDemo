package tests.snapdeal;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageobjects.snapdeal.SearchButtonSnapdealObjects;
import resources.Base;

public class SearchButtonSnapdeal extends Base {
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("snapdealUrl"));
		log.info("Navigated to Home Page");
	}
	
	@Test
	public void testSearchButton() {
		SearchButtonSnapdealObjects lpo = new SearchButtonSnapdealObjects(driver);
		if(lpo.getInputBox().isEnabled()) {
			 lpo.getInputBox().sendKeys("Electronics"); } 
		lpo.getSearchBtn().click();
		log.info("Clicked on submit button by typing electronics.");
			
		 if(lpo.getResultDiv().isEnabled()) {
			 log.info("Search button successfully verified.");
		 }
		 
		 if(lpo.getInputBox().isEnabled()) {
			 lpo.getInputBox().clear();
			 lpo.getInputBox().sendKeys("SmartPhones");} 
		lpo.getSearchBtn().click();
		log.info("Clicked on submit button by typing SmartPhones.");
			
		 if(lpo.getResultDiv().isEnabled()) {
			 log.info("Search button successfully verified.");
		 }
		 
		 if(lpo.getInputBox().isEnabled()) {
			 lpo.getInputBox().clear();
			 lpo.getInputBox().sendKeys("Camera"); } 
		lpo.getSearchBtn().click();
		log.info("Clicked on submit button by typing Camera.");
			
		 if(lpo.getResultDiv().isEnabled()) {
			 log.info("Search button successfully verified.");
		 }
	}
	
	
	
	@AfterTest
	public void shutdown() throws IOException {
	
		driver.close();
		driver=null;
		log.info("Browser closed");
	}
}
