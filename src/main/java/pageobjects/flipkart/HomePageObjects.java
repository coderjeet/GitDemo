package pageobjects.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
	public WebDriver driver;
	
	By signin= By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input");
	By passwd = By.cssSelector("input[type='password']");
	By continBtn = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/button");
	By submitbtn = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
	
	
	public HomePageObjects(WebDriver driver) {
		
		this.driver = driver;
	}


	public WebElement getLogin() {
		return driver.findElement(signin);
	}
	
	public WebElement getPasswd() {
		return driver.findElement(passwd);
	}
	
	public WebElement getSubmitBtn() {
		return driver.findElement(submitbtn);
	}
	
	public WebElement getContiBtn() {
		return driver.findElement(continBtn	);
	}
}
