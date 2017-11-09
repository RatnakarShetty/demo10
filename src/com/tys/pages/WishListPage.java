package com.tys.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tys.generics.BasePage;

public class WishListPage extends BasePage {

	public WishListPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[.='Remove']")
	private WebElement removeButton;
	
	public void clickOnRemoveButton() {
		removeButton.click();
	}
	
	

}
