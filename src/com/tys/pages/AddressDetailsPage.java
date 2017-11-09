package com.tys.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.tys.generics.BasePage;

public class AddressDetailsPage extends BasePage {

	public AddressDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*[@id='countryId_delivery']")
	private WebElement countryDD;

	@FindBy(xpath = ".//input[@id='postcode_delivery']")
	private WebElement pincodeField;

	@FindBy(xpath = ".//input[@id='fullname']")
	private WebElement recipientNameField;

	@FindBy(xpath = ".//input[@id='contactNumber']")
	private WebElement mobileNoField;

	@FindBy(xpath = ".//textarea[@id='address']")
	private WebElement addressField;

	@FindBy(xpath = ".//input[@id='cityName_delivery']")
	private WebElement cityField;

	@FindBy(xpath = ".//select[@id='stateId_delivery']")
	private WebElement stateField;

	@FindBy(xpath = "//input[@value='Save & Continue']")
	private WebElement savencontButton;
	
	
	@FindBy(xpath = "//span[.='Proceed to Payment']")
	private WebElement procetopayementField;
	
	
	@FindBy(xpath = ".//*[@id='submit']")
	private WebElement updateButton;

	public void selectCountry(String country) {
		Select select = new Select(countryDD);
		select.selectByVisibleText(country);
	}

	public void enterPinCode(String pincode) {
		pincodeField.clear();
		pincodeField.sendKeys(pincode);
	}

	public void enterRecipientName(String recipName) {
		recipientNameField.clear();
		recipientNameField.sendKeys(recipName);
	}

	public void enterMobileNo(String mobileNo) {
		mobileNoField.clear();
		mobileNoField.sendKeys(mobileNo);
	}

	public void enterAddress(String address) {
		addressField.clear();
		addressField.sendKeys(address);
	}

	public void enterCity(String city) {
		cityField.clear();
		cityField.sendKeys(city);
	}

	public void selectState(String state) {
		Select select = new Select(stateField);
		select.selectByVisibleText(state);
	}
	
	

	public void clickOnSaveandContinue() {
		savencontButton.click();
	}
	
	public void clickOnPayement() {
		procetopayementField.click();
	}
	public void clickOnUpdateButton() {
		updateButton.click();
	}
	

}
