package com.tys.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tys.generics.BasePage;

public class ProductListPage extends BasePage {

	public ProductListPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//img[@alt='The Oditi Ring']")
	private WebElement detailsButton;

	

	public void clickProductDetails() {
		detailsButton.click();
	}

	

}
