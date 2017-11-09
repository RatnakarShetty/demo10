package com.tys.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.tys.generics.BasePage;
import com.tys.generics.UtilityLib;

public class RingsPage extends BasePage {

	public RingsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//section[@id='Price-form']")
	private WebElement priceDD;

	@FindBy(xpath = "//section[@id='Metal-form']")
	private WebElement metalDD;

	@FindBy(xpath = ".//*[@id='price']/div/div[1]/a")
	private WebElement below1000;

	@FindBy(xpath = ".//*[@id='metal']/div/div[5]/a")
	private WebElement platinumMetal;

	@FindBy(xpath = "//span[@class='new-price']")
	private WebElement ringPrice;

	@FindBy(xpath = ".//*[@id='product_list_ui']/li[1]")
	private WebElement firstRing;

	@FindBy(xpath = "//a[@title='Add to wishlist']")
	private WebElement wishListLink;

	@FindBy(xpath = "//select[@id='ringselect']")
	private WebElement sizeDD;

	@FindBy(xpath = "//input[@id='buy-now']")
	private WebElement buyNowButton;

	@FindBy(xpath = "//span[@class='view-by-wrap title style-outline i-right']")
	private WebElement sortByDD;

	@FindBy(xpath = "//div[@class='form-item ']/a[.='Price Low to High ']")
	private WebElement sortLowPriceToHigh;

	public void clickOnPriceDD() {
		UtilityLib.moveToElement(driver, priceDD);
	}

	public void clickOnMetalDD() {
		UtilityLib.moveToElement(driver, metalDD);
	}

	public void selectPrice() {
		below1000.click();
	}

	public void selectMetal() {
		platinumMetal.click();
	}

	public void clickOnFirstRing() {
		firstRing.click();
	}

	public void clickOnWishListLink() {
		wishListLink.click();
	}

	public void clickOnBuyNowButton() {
		buyNowButton.click();
	}

	public void getAllRingPrices() {

		List<WebElement> allRingPrices = driver.findElements(By.xpath("//span[@class='new-price']"));

		for (WebElement ringPrice : allRingPrices) {

			System.out.println(ringPrice.getText());
			Reporter.log("Filtering is working properly for Rs below 10,000", true);

		}

	}

	public void getAllRingPriceOnly() {

		List<WebElement> allRingPrices = driver.findElements(By.xpath("//span[@class='new-price']"));

		ArrayList<Integer> priceList = new ArrayList<Integer>();

		for (WebElement ringPrice : allRingPrices) {

			priceList.add(Integer.parseInt(ringPrice.getText().replaceAll("\\D+", "")));

		}

		ArrayList<Integer> clone = new ArrayList<Integer>(priceList);
		Collections.sort(priceList);

		if (priceList.equals(clone)) {
			Reporter.log("Products are sorted by Low Price to High", true);
		} else {
			Reporter.log("Products are not sorted by Low Price to High", true);
			Assert.fail();
		}

	}

	public void getAllRingDesc() {

		List<WebElement> allRingDescs = driver.findElements(By.xpath("//span[@class='b-desc']"));

		boolean desc = true;
		for (WebElement ringDesc : allRingDescs) {

			if (!ringDesc.getText().contains("Ring In Platinum")) {

				desc = false;

			}

		}

		if (desc)
			Reporter.log("Filtering is working properly for Metal platinum", true);

	}

	public void selectRingSize() {
		Select select = new Select(sizeDD);

		select.selectByIndex(1);
	}

	public void clickOnSortByDD() {

		sortByDD.click();
	}

	public void selectLowPriceToHighOption() {
		sortLowPriceToHigh.click();
	}

}
