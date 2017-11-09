package com.tys.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.generics.UtilityLib;
import com.tys.pages.HomePage;
import com.tys.pages.RingsPage;
import com.tys.pages.WishListPage;

public class WishListTest extends BaseTest {

	@Test(priority = 1)
	public void wishListADDTest() throws InterruptedException {

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
		ringspage.clickOnWishListLink();

		Thread.sleep(5000);

		if (homepage.getWishListCount() == 1) {
			Reporter.log("Wish List is added succesfuly", true);
		}

		Thread.sleep(5000);

	}

	@Test(priority = 2)
	public void wishListRemoveTest() throws InterruptedException {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 1);

		HomePage homepage = new HomePage(driver);

		homepage.ClickLogin();

		homepage.setUserName(un);

		homepage.setPassWord(pw);

		homepage.ClickSignIn();

		homepage.clickOnWishListLink();

		Thread.sleep(8000);
		WishListPage wishlistpage = new WishListPage(driver);
		wishlistpage.clickOnRemoveButton();
	}

}
