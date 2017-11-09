package com.tys.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.generics.UtilityLib;
import com.tys.pages.HomePage;
import com.tys.pages.ProductDetailsPage;
import com.tys.pages.ProductListPage;

public class ProductSearchTest extends BaseTest {

	@Test
	public void searchProductTest() throws InterruptedException {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 1);
		String searchProdName = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 2);

		HomePage homepage = new HomePage(driver);

		homepage.ClickLogin();

		homepage.setUserName(un);

		homepage.setPassWord(pw);

		homepage.ClickSignIn();

		Thread.sleep(8000);

		homepage.enterProductName(searchProdName);

		homepage.clickSearchButton();

		Thread.sleep(5000);

		ProductListPage prodListPage = new ProductListPage(driver);

		prodListPage.clickProductDetails();

		ProductDetailsPage prodDetailsPage = new ProductDetailsPage(driver);

		Thread.sleep(10000);
		String actProdName = prodDetailsPage.getProdName();
		assertEquals(actProdName, "THE ODITI RINGd");
		System.out.println("Searched product found "+ actProdName);

	}

}
