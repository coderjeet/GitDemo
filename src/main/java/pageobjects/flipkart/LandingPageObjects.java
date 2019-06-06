package pageobjects.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageObjects {
	
	public WebDriver driver;
	
	By dealstext = By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/div/h2");
	By logintext = By.xpath("/html/body/div[2]/div/div/div/div/div[1]/span/span");


	public LandingPageObjects(WebDriver driver) {
	
		this.driver = driver;
	}
	
	
	public WebElement getText() {
		return driver.findElement(dealstext);
	}
	
	public WebElement getLoginText() {
		return driver.findElement(logintext);
	}
	
	 
}
