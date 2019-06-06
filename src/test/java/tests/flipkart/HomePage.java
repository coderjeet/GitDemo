package tests.flipkart;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.flipkart.HomePageObjects;
import resources.Base;

public class HomePage extends Base {
	

	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("flipkartUrl"));
		log.info("Navigated to Home Page");
		System.out.println("Git Test sdsd");
	}

	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String password) throws IOException {
			
		HomePageObjects lg = new HomePageObjects(driver);
		lg.getLogin().sendKeys(Username);
		lg.getPasswd().sendKeys(password);
		lg.getSubmitBtn().click();
		log.info("Successfully signedin");
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[1][2];
		
		data[0][0] = prop.getProperty("username");
		data[0][1] = prop.getProperty("password");
		
		return data;	
	}
	
	@AfterTest
	public void shutdown() throws IOException {
	
		driver.close();
		driver=null;
		log.info("Browser closed");
	}
}
		