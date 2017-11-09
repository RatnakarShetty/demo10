package com.tys.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.pages.HomePage;
import com.tys.pages.ProductDetailsPage;
import com.tys.pages.ProductListPage;

public class AutoSuggetionTest extends BaseTest {

	@Test
	public void autoSuggTest() throws InterruptedException {

		HomePage homepage = new HomePage(driver);
		Thread.sleep(2000);
		homepage.enterProductName("the oditi");

		Thread.sleep(5000);

		homepage.selectFirstSuggetion();
		
		Thread.sleep(8000);

		ProductListPage prodListPage = new ProductListPage(driver);

		prodListPage.clickProductDetails();

		ProductDetailsPage prodDetailsPage = new ProductDetailsPage(driver);

		Thread.sleep(10000);
		String actProdName = prodDetailsPage.getProdName();
		

		if (actProdName.equals("THE ODITI RING")) {

			Reporter.log("Searched product found" +  actProdName, true);
		} else {
			Reporter.log("Searched product not found", true);
			Assert.fail();
		}
		
		
		/*try {

			if (actProdName.equals("THE ODITI RINGd")) {

				Reporter.log("Searched product found" + actProdName, true);
			}

		} catch (Exception e) {

			Reporter.log("Searched product not found" + "THE ODITI RINGd", true);
			Assert.fail();
		}*/

	}

}
