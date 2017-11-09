package com.tys.tests;

import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.generics.UtilityLib;
import com.tys.pages.AddressDetailsPage;
import com.tys.pages.HomePage;
import com.tys.pages.PaymentOptionPage;
import com.tys.pages.RingsPage;
import com.tys.pages.ShoppingBagPage;

public class PlaceOrderTest extends BaseTest {

	@Test
	public void placeOrderTest() throws InterruptedException {

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

		Thread.sleep(8000);
		ShoppingBagPage shoppingbagpage = new ShoppingBagPage(driver);
		shoppingbagpage.clickOnPlaceOrder();

		AddressDetailsPage adrdetpage = new AddressDetailsPage(driver);
		adrdetpage.selectCountry("India");

		adrdetpage.enterPinCode("560078");

		adrdetpage.enterRecipientName("Ganesh");

		adrdetpage.enterMobileNo("8970616190");

		adrdetpage.enterAddress("HagaribommanaHalli");

		adrdetpage.enterCity("HBHALLi");

		adrdetpage.selectState("Assam");

	//	adrdetpage.clickOnSaveandContinue();

		Thread.sleep(8000);

		adrdetpage.clickOnPayement();

		Thread.sleep(8000);
		PaymentOptionPage paymentpage = new PaymentOptionPage(driver);
		paymentpage.verifyTitle("Payment Option | BlueStone.com");

	}
}
