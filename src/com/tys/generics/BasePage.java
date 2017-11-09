package com.tys.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {

	public static WebDriver driver;

	public BasePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyTitle(String eTitle) {
		WebDriverWait wait = new WebDriverWait(driver, 21);
		try {
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching  ---" + eTitle, true);
		} catch (Exception e) {
			Reporter.log("Title is not matching ---" + eTitle, true);
			Assert.fail();
		}
	}

	public void verifyElementIsPresent(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 21);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is visible ---" + element, true);
		} catch (Exception e) {
			Reporter.log("Element is not visible ---" + element, true);
			Assert.fail();
		}
	}

	public boolean verifyElementIsPresentnew(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 21);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			if (element.getText().equalsIgnoreCase("You have already subscribed to our newsletter")
					|| element.getText().equalsIgnoreCase("Thank you for subscribing to our newsletter.")) {
				// Reporter.log("Element is visible ---" + element, true);
				return true;

			} else {
				// Reporter.log("Element is not visible ---" + element, true);
				return true;
			}

		} catch (Exception e) {
			Reporter.log("Element is not visible ---" + element, true);
			Assert.fail();
			return false;
		}
	}

}
