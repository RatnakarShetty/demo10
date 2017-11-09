package com.tys.tests;

import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.generics.UtilityLib;
import com.tys.pages.HomePage;
import com.tys.pages.OrderHistoryPage;

public class ValidLoginLogoutTest extends BaseTest {

	@Test
	public void validLoginTest() {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 1);
		String orderHisPageTitle = UtilityLib.getCellValue(INPUT_PATH, "OrderHistory", 1, 0);

		HomePage homepage = new HomePage(driver);
		
		
		log.info("Click on login button");

		homepage.ClickLogin();

		homepage.setUserName(un);

		homepage.setPassWord(pw);

		homepage.ClickSignIn();

		OrderHistoryPage orderHistory = new OrderHistoryPage(driver);
		orderHistory.verifyTitle(orderHisPageTitle);

	}

}
