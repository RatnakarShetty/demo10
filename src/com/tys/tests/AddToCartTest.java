package com.tys.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.generics.UtilityLib;
import com.tys.pages.HomePage;
import com.tys.pages.RingsPage;
import com.tys.pages.ShoppingBagPage;

public class AddToCartTest extends BaseTest {

	@Test
	public void addToCartTest() throws InterruptedException {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 1);

		HomePage homepage = new HomePage(driver);

		homepage.ClickLogin();

		homepage.setUserName(un);

		homepage.setPassWord(pw);

		homepage.ClickSignIn();

		Thread.sleep(8000);
		homepage.ClicOnRings();

		Thread.sleep(8000);

		RingsPage ringspage = new RingsPage(driver);
		ringspage.clickOnFirstRing();

		Thread.sleep(5000);
		ringspage.selectRingSize();

		ringspage.clickOnBuyNowButton();

		Thread.sleep(3000);
		ShoppingBagPage shopingbagpage = new ShoppingBagPage(driver);
		shopingbagpage.clickOnLogo();

		Thread.sleep(5000);
		if (homepage.getCartItemCount() == 1) {
			Reporter.log("Product succesfuly added to the cart", true);
		} else {

			Reporter.log("Product not added to the cart", true);
			Assert.fail();
		}

		Thread.sleep(5000);

	}

}
