package com.tys.tests;

import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.generics.UtilityLib;
import com.tys.pages.AddressDetailsPage;
import com.tys.pages.HomePage;
import com.tys.pages.OrderHistoryPage;

public class UpdateAddressTest extends BaseTest {

	@Test
	public void addressUpdateTest() throws InterruptedException {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 1);
		// String orderHisPageTitle = UtilityLib.getCellValue(INPUT_PATH,
		// "OrderHistory", 1, 0);

		HomePage homepage = new HomePage(driver);

		homepage.ClickLogin();

		homepage.setUserName(un);

		homepage.setPassWord(pw);

		homepage.ClickSignIn();

		Thread.sleep(5000);
		OrderHistoryPage orderHistory = new OrderHistoryPage(driver);
		orderHistory.clickOnShippingAddTab();

		orderHistory.clickOnEditButton();

		AddressDetailsPage adrdetpage = new AddressDetailsPage(driver);
		adrdetpage.selectCountry("India");

		adrdetpage.enterPinCode("560078");

		adrdetpage.enterRecipientName("Ganesh");

		adrdetpage.enterMobileNo("8970616190");

		adrdetpage.enterAddress("HagaribommanaHalli");

		adrdetpage.enterCity("HBHALLi");

		adrdetpage.selectState("Assam");

		adrdetpage.clickOnUpdateButton();
	}

}
