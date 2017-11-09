package com.tys.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tys.generics.BasePage;

public class ShoppingBagPage extends BasePage {

	public ShoppingBagPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*[@id='logo']")
	private WebElement logo;

	@FindBy(xpath = "//a[.=' Remove ']")
	private WebElement removeProdLink;
	// vv Place Order
//	@FindBy(xpath = "//a[.='Place Order ']")
//	private WebElement placeOrderLink;
	
	@FindBy(xpath = "//a[.='Place Order']")
	private WebElement placeOrderLink;

	public void clickOnLogo() {

		logo.click();

	}

	public void clickOnRemoveLink() {

		List<WebElement> removeItem = driver.findElements(By.xpath("//a[.=' Remove ']"));
		System.out.println("Removable item count" + removeItem);
		for (WebElement item : removeItem) {
			item.click();
		}

	}

	public void clickOnPlaceOrder() {

		placeOrderLink.click();

	}

}
