package com.tys.generics;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;



@Listeners(FWListners.class)
public class BaseTest implements IAutoConsts {

	public static WebDriver driver;
	
	public Logger log = Logger.getLogger("log4j.properties");

	@BeforeSuite
	public void setPath() {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}

	@BeforeMethod
	public void openApp() {
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(21, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		//driver.get("https://www.caratlane.com/");
	}

	@AfterMethod
	public void closeApp() {
		driver.quit();
	}

}
