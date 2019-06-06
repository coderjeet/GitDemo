package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.apache.commons.io.FileUtils;




public class Base {
	
	public static WebDriver driver;
	public Properties prop = new Properties();
	public static Logger log = LogManager.getLogger(Base.class.getName());

	public WebDriver initializeDriver() throws IOException{
		
		
		FileInputStream fis = new FileInputStream("D:\\Selenium\\FinalProject\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName =prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D://Selenium//chromedriver.exe");
		    driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE")) {
			driver = new InternetExplorerDriver();
		}
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;
	}
	
	public void getScreenShot(String result) throws IOException {
		
			
			File screenshots =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		  FileUtils.copyFile(screenshots, new File("D://Selenium//FailureScreenShots.png"));
		}
		
	}

