package com.tys.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tys.generics.BasePage;

public class OrderHistoryPage extends BasePage {

	public OrderHistoryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//span[.='Shipping Address'])[2]")
	private WebElement shippingAddTab;
	
	
	@FindBy(xpath = "//input[@id='edit-submit-shipping-address' and @value='Edit']")
	private WebElement editButton;
	
	public void clickOnShippingAddTab() {
		shippingAddTab.click();
	}
	public void clickOnEditButton() {
		editButton.click();
	}

}
