package com.tys.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tys.generics.BasePage;

public class ContactUsPage extends BasePage {

	public ContactUsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='customer-delight']/p")
	private WebElement customerDelight;

	@FindBy(xpath = "//div[@class='success-container text-center']/div[@class='Test' and contains(.,'We will get back to you')]")
	private WebElement successMsg;

	@FindBy(xpath = "//input[@id='customername']")
	private WebElement nameField;

	@FindBy(xpath = "//input[@id='question-email']")
	private WebElement emailField;

	@FindBy(xpath = "//input[@id='question-phone']")
	private WebElement phoneField;

	@FindBy(xpath = "//textarea[@id='question']")
	private WebElement queryField;

	@FindBy(xpath = "//form[@id='question-form']//input[@name='Submit']")
	private WebElement submitButton;

	public String getContactPhoneNumber() {

		return customerDelight.getText();

	}

	public String getSuccessMsg() {
		return successMsg.getText();
	}

	public void enterTheName(String name) {
		nameField.sendKeys(name);
	}

	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}

	public void enterPhone(String phone) {
		phoneField.sendKeys(phone);
	}

	public void enterQuery(String query) {
		queryField.sendKeys(query);
	}

	public void clickOnSubmitButton() {
		submitButton.click();
	}

	public void successMsgPresent() {

		verifyElementIsPresent(successMsg);
	}

}
