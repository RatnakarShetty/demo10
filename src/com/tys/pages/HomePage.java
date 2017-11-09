package com.tys.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.tys.generics.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@id='login']")
	private WebElement loginBTN;

	@FindBy(xpath = "//input[@id='email-id']")
	private WebElement emailIDF;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordF;

	@FindBy(xpath = "//input[@id='edit-login-account']")
	private WebElement signInBtn;

	@FindBy(xpath = "//form[@id='searchbox_elastic_search']//input[@id='search_query_top_elastic_search']")
	private WebElement searchBar;

	@FindBy(xpath = "//input[@name='submit_search']")
	private WebElement searchButton;

	@FindBy(xpath = "//span[@class='inner' and .='Rings ']")
	private WebElement ringsLink;

	@FindBy(xpath = "//li[@class='ico-wishlist ']")
	private WebElement wishListLink;

	@FindBy(xpath = "//span[@id='wishListCountHeader']")
	private WebElement wishListCount;

	@FindBy(xpath = "//span[@class='cart-count']")
	private WebElement cartItemCount;

	@FindBy(xpath = "//a[contains(.,'Cart')]")
	private WebElement cartIcon;

	@FindBy(xpath = "//a[@title='BlueStone']")
	private WebElement bluestoneLogo;

	@FindBy(xpath = "//span[.='All about Jewellery']")
	private WebElement allAboutjewLink;

	@FindBy(xpath = "//div[@class='formErrorContent']")
	private WebElement errorMsg;

	@FindBy(xpath = ".//*[@id='searchbox_elastic_search']/div/div/div[1]/a")
	private WebElement autoSuggFirstElement;

	@FindBy(xpath = "//div[@id='change-cc']/div")
	private WebElement countrySwitherDD;

	@FindBy(xpath = "//div[@id='change-cc']/ul/li[5]")
	private WebElement canadaCountry;

	@FindBy(xpath = "//input[@id='newsletter_subscriber']")
	private WebElement newsletterSubScriberInputFiled;

	@FindBy(xpath = "//input[@value='SUBSCRIBE']")
	private WebElement newsletterSubScriberButton;

	@FindBy(xpath = "//div[@class='msg-success']")
	private WebElement newsLetterSubScriptionSuccessMsg;

	@FindBy(xpath = "//li[@class='contact phone' and .='1800-419-0066']")
	private WebElement headerPhoneNumber;

	@FindBy(xpath = "//li[@class='phone-number']")
	private WebElement footerPhoneNumber;

	@FindBy(xpath = "//span[@class='prcs-d' and .='Contact Us']")
	private WebElement contactUsLink;

	@FindBy(xpath = "//div[@class='loggedin']")
	private WebElement loggedInUserLink;

	@FindBy(xpath = "//a[@id='bst-order-history']/span")
	private WebElement orderHistoryOption;

	@FindBy(xpath = ".//*[@id='bst-blue-cash']/span")
	private WebElement blueCashOption;

	@FindBy(xpath = ".//*[@id='bst-blue-credit']/span")
	private WebElement blueCreditOption;

	@FindBy(xpath = ".//*[@id='bst-shipping-address']/span")
	private WebElement blueShippingOption;

	@FindBy(xpath = ".//*[@id='bst-personal-information']/span")
	private WebElement personalInfoption;

	@FindBy(xpath = "//div[@id='follow-us']//div//span[@class='icon-ion-social-twitter']")
	private WebElement twitterButton;
	
	@FindBy(xpath = "//div[@id='follow-us']//div//span[@class='icon-ion-social-pinterest']")
	private WebElement pinterestButton;

	public void ClickLogin() {
		loginBTN.click();
	}

	public void setUserName(String un) {
		emailIDF.sendKeys(un);
	}

	public void setPassWord(String pw) {
		passwordF.sendKeys(pw);
	}

	public void ClickSignIn() {
		signInBtn.click();
	}

	public void enterProductName(String searchProdName) {
		searchBar.clear();
		searchBar.sendKeys(searchProdName);
	}

	public void clickSearchButton() {
		searchButton.click();
	}

	public void ClicOnRings() {
		ringsLink.click();

	}

	public int getWishListCount() {
		return Integer.parseInt(wishListCount.getText());

	}

	public int getCartItemCount() {
		return Integer.parseInt(cartItemCount.getText());

	}

	public void ClicOnCart() {
		cartIcon.click();

	}

	public void ScrollPage() {

		int x = allAboutjewLink.getLocation().getX();
		int y = allAboutjewLink.getLocation().getY();
		// JavascriptExecutor j = (JavascriptExecutor)driver;
		/*
		 * for (int i = 0; i <=10; i++) {
		 * j.executeScript("window.scrollBy(0,500)"); }
		 */

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(" + x + "," + y + ")");
		allAboutjewLink.click();

		// return new int[] {x,y};
	}

	public boolean verifyTooltip(String expTooltip) {

		String actTooltip = bluestoneLogo.getAttribute("title");
		System.out.println("dfsfsfds");
		System.out.println(actTooltip);

		if (actTooltip.equals(expTooltip)) {
			return true;
		} else {
			return false;
		}
	}

	public void selectFirstSuggetion() {
		autoSuggFirstElement.click();

	}

	public void clickOnCountrySwitherDD() {
		countrySwitherDD.click();
	}

	public void clickOnCanadaCountry() {
		canadaCountry.click();
	}

	public void enterSubScriberEmailId(String SubScriberEmailId) {
		newsletterSubScriberInputFiled.sendKeys(SubScriberEmailId);
	}

	public void ClickOnSubscribeButton() {
		newsletterSubScriberButton.click();
	}

	public boolean verifySuccessMsgIsPresent() {

		return verifyElementIsPresentnew(newsLetterSubScriptionSuccessMsg);

	}

	public String getHeaderPhoneNumber() {

		return headerPhoneNumber.getText();

	}

	public String getFooterPhoneNumber() {
		return footerPhoneNumber.getText();
	}

	public void clickOnContactUsLink() {
		contactUsLink.click();
	}

	public void clickOnWishListLink() {
		wishListLink.click();
	}

	public void clickOnLoggedInUser() {
		loggedInUserLink.click();
	}

	public void clickOnOrderHistoryLink() {
		orderHistoryOption.click();
	}

	public void clickOnBlueCashLink() {
		blueCashOption.click();
	}

	public void clickOnBlueCreditsLink() {
		blueCreditOption.click();
	}

	public void clickOnShippingAddLink() {
		blueShippingOption.click();
	}

	public void clickOnPersonalInfoLink() {
		personalInfoption.click();
	}

	public void clickOnTwitterButton() {
		twitterButton.click();
	}
	
	public void clickOnPinterestButton() {
		pinterestButton.click();
	}
	
	public void isEmailInvaliErrorMsgPresent() {
		verifyElementIsPresent(errorMsg);
	}

}
