package com.tys.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tys.generics.BasePage;

public class SignUpPage extends BasePage {

	public SignUpPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[.='Signup']")
	private WebElement SignUp;

	@FindBy(name = "userName")
	private WebElement un;

	@FindBy(name = "email")
	private WebElement SignUPEmail;

	@FindBy(name = "customerPhone")
	private WebElement phone;

	@FindBy(name = "submitAccount")
	private WebElement submit;

	@FindBy(name = "terms_condition")
	private WebElement Agreement;

	@FindBy(xpath = "//a[@title='Close']")
	private WebElement CloseButton;

	@FindBy(xpath = "//div[@class='success-container']//div[@class='success-container-inner']")
	private WebElement successMsg;

	public void signup() {
		SignUp.click();
	}

	public void email1() {
		SignUPEmail.sendKeys("your@gmail.com");
	}

	public void name() {
		un.sendKeys("yourName");
	}

	public void phone() {
		phone.sendKeys("8553223476");
	}

	public void agrement() {
		Agreement.click();
	}

	public void Submit() {
		submit.click();

	}

	public void CloseButton() {
		CloseButton.click();
	}

	public void verifySuccessMag() {
		verifyElementIsPresent(successMsg);
	}

}
