package pageobjects.snapdeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchButtonSnapdealObjects {

	public WebDriver driver;

	public SearchButtonSnapdealObjects(WebDriver driver) {

		this.driver = driver;
	}
	
	By resultDiv = By.xpath("//*[@id=\"content_wrapper\"]/div[7]/div[5]/div[3]");
	By searchBtn = By.cssSelector("button.searchformButton");
	By inputBox = By.cssSelector("#inputValEnter");
	
	public WebElement getResultDiv() {
		return driver.findElement(resultDiv);
	}
	
	public WebElement getSearchBtn() {
		return driver.findElement(searchBtn);
	}
	
	public WebElement getInputBox() {
		return driver.findElement(inputBox);
	}
	
	
	 
}
