package com.tys.tests;

import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.generics.UtilityLib;
import com.tys.pages.HomePage;
import com.tys.pages.ShoppingBagPage;

public class RemoveItemTest extends BaseTest {

	@Test
	public void removeItemtest() throws InterruptedException {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 1);

		HomePage homepage = new HomePage(driver);

		homepage.ClickLogin();

		homepage.setUserName(un);

		homepage.setPassWord(pw);

		homepage.ClickSignIn();

		Thread.sleep(8000);

		homepage.ClicOnCart();

		Thread.sleep(3000);

		ShoppingBagPage shopingbagpage = new ShoppingBagPage(driver);
		shopingbagpage.clickOnRemoveLink();

		Thread.sleep(3000);

	}

}
