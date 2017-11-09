package com.tys.tests;

import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.generics.UtilityLib;
import com.tys.pages.HomePage;
import com.tys.pages.OrderHistoryPage;

public class NavigationTest extends BaseTest {

	@Test
	public void navToOrderHisTest() throws InterruptedException {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 1);
		String orderHisPageTitle = UtilityLib.getCellValue(INPUT_PATH, "OrderHistory", 1, 0);

		HomePage homepage = new HomePage(driver);

		log.info("Click on login button");

		homepage.ClickLogin();

		homepage.setUserName(un);

		homepage.setPassWord(pw);

		homepage.ClickSignIn();

		Thread.sleep(3000);

		homepage.clickOnLoggedInUser();

		Thread.sleep(3000);
		homepage.clickOnOrderHistoryLink();

		Thread.sleep(6000);
		OrderHistoryPage ohp = new OrderHistoryPage(driver);
		ohp.verifyTitle("Order History - My Account | BlueStone.com");

	}

	@Test
	public void navToBlueCashTest() throws InterruptedException {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 1);
		String orderHisPageTitle = UtilityLib.getCellValue(INPUT_PATH, "OrderHistory", 1, 0);

		HomePage homepage = new HomePage(driver);

		log.info("Click on login button");

		homepage.ClickLogin();

		homepage.setUserName(un);

		homepage.setPassWord(pw);

		homepage.ClickSignIn();

		Thread.sleep(3000);

		homepage.clickOnLoggedInUser();

		Thread.sleep(3000);
		homepage.clickOnBlueCashLink();

		Thread.sleep(6000);
		OrderHistoryPage ohp = new OrderHistoryPage(driver);
		ohp.verifyTitle("Blue Cash - My Account | BlueStone.com");

	}

	@Test
	public void navToBlueCreditTest() throws InterruptedException {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 1);
		String orderHisPageTitle = UtilityLib.getCellValue(INPUT_PATH, "OrderHistory", 1, 0);

		HomePage homepage = new HomePage(driver);

		log.info("Click on login button");

		homepage.ClickLogin();

		homepage.setUserName(un);

		homepage.setPassWord(pw);

		homepage.ClickSignIn();

		Thread.sleep(3000);

		homepage.clickOnLoggedInUser();

		Thread.sleep(3000);
		homepage.clickOnBlueCreditsLink();

		Thread.sleep(6000);
		OrderHistoryPage ohp = new OrderHistoryPage(driver);
		ohp.verifyTitle("Blue Credit - My Account | BlueStone.com");

	}

	@Test
	public void navToShippingAddressTest() throws InterruptedException {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 1);
		String orderHisPageTitle = UtilityLib.getCellValue(INPUT_PATH, "OrderHistory", 1, 0);

		HomePage homepage = new HomePage(driver);

		log.info("Click on login button");

		homepage.ClickLogin();

		homepage.setUserName(un);

		homepage.setPassWord(pw);

		homepage.ClickSignIn();

		Thread.sleep(3000);

		homepage.clickOnLoggedInUser();

		Thread.sleep(3000);
		homepage.clickOnShippingAddLink();

		Thread.sleep(6000);
		OrderHistoryPage ohp = new OrderHistoryPage(driver);
		ohp.verifyTitle("Shipping Address - My Account | BlueStone.com");

	}

	@Test
	public void navToPersonalInfoTest() throws InterruptedException {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 1);
		String orderHisPageTitle = UtilityLib.getCellValue(INPUT_PATH, "OrderHistory", 1, 0);

		HomePage homepage = new HomePage(driver);

		log.info("Click on login button");

		homepage.ClickLogin();

		homepage.setUserName(un);

		homepage.setPassWord(pw);

		homepage.ClickSignIn();

		Thread.sleep(3000);

		homepage.clickOnLoggedInUser();

		Thread.sleep(3000);
		homepage.clickOnPersonalInfoLink();

		Thread.sleep(6000);
		OrderHistoryPage ohp = new OrderHistoryPage(driver);
		ohp.verifyTitle("Personal Information - My Account | BlueStone.com");

	}

}
