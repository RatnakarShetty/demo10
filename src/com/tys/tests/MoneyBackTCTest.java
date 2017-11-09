package com.tys.tests;

import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.pages.HomePage;
import com.tys.pages.ProductDetailsPage;
import com.tys.pages.RingsPage;
import com.tys.pages.ShoppingReturnsPage;

public class MoneyBackTCTest extends BaseTest {

	@Test
	public void moneyBackTCTest() throws InterruptedException {

		HomePage homepage = new HomePage(driver);

		homepage.ClicOnRings();

		Thread.sleep(8000);

		RingsPage ringspage = new RingsPage(driver);
		ringspage.clickOnFirstRing();

		Thread.sleep(8000);
		ProductDetailsPage prodetapage = new ProductDetailsPage(driver);
		prodetapage.clickOnMoneyBackLink();

		Set<String> allWinHans = driver.getWindowHandles();

		String firstWin = "";
		for (String winHan : allWinHans) {
			firstWin = winHan;
			driver.switchTo().window(winHan);
		}

		ShoppingReturnsPage shoppingretoage = new ShoppingReturnsPage(driver);
		shoppingretoage.verifyTitle("Shipping Return | BlueStone.com");

		if (driver.getTitle().equals("Shipping Return | BlueStone.com")) {
			Reporter.log("money back policy Page displayed", true);
		} else {
			Reporter.log("money back policy Page not displayed", true);
		}
		driver.switchTo().window(firstWin);

	}

}
