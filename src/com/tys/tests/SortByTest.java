package com.tys.tests;

import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.generics.UtilityLib;
import com.tys.pages.HomePage;
import com.tys.pages.RingsPage;

public class SortByTest extends BaseTest {

	@Test
	public void sortByPriceLowToHigh() throws InterruptedException {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 1);

		HomePage homepage = new HomePage(driver);

		/*
		 * homepage.ClickLogin();
		 * 
		 * homepage.setUserName(un);
		 * 
		 * homepage.setPassWord(pw);
		 * 
		 * homepage.ClickSignIn();
		 */

		Thread.sleep(8000);
		homepage.ClicOnRings();

		Thread.sleep(8000);

		RingsPage ringpage = new RingsPage(driver);
		ringpage.clickOnSortByDD();

		Thread.sleep(1000);
		ringpage.selectLowPriceToHighOption();
		
		Thread.sleep(3000);
		ringpage.getAllRingPriceOnly();
		
		

	}

}
