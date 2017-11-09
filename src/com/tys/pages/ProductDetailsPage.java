package com.tys.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tys.generics.BasePage;

public class ProductDetailsPage extends BasePage {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@id='details-top-right-inner']//form//h1")
	private WebElement productHeaddetails;

	@FindBy(xpath = "//span[@class='curr-txt']")
	private WebElement currSymbol;

	@FindBy(xpath = "//span[contains(.,'Money Back')]")
	private WebElement moneyBackLink;

	public String getProdName() {

		return productHeaddetails.getText();

	}

	public String getCurrencySymbol() {

		return currSymbol.getText();

	}

	public void clickOnMoneyBackLink() {

		moneyBackLink.click();

	}

}
