package com.tys.tests;

import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.generics.UtilityLib;
import com.tys.pages.HomePage;
import com.tys.pages.RingsPage;

public class PriceFilterTest extends BaseTest {

	@Test
	public void ringsPriceFilterTest() throws InterruptedException {

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
		ringspage.clickOnPriceDD();

		Thread.sleep(5000);
		ringspage.selectPrice();
		Thread.sleep(5000);
		ringspage.getAllRingPrices();
		Thread.sleep(5000);

	}

}
