package pageobjects.snapdeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPageSnapdealObjects {
	
	public WebDriver driver;

	public LandingPageSnapdealObjects(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	By signin= By.cssSelector("img.notIeLogoHeader");
	By loginImage = By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[2]/i");
	By iconBar = By.cssSelector("menuIconBar");
	
	public WebElement getImageLogo() {
		return driver.findElement(signin);
	}
	
	
	public WebElement getLoginImage() {
		return driver.findElement(loginImage);
	}
	
	public WebElement getIconBar() {
		return driver.findElement(iconBar);
	}

}
