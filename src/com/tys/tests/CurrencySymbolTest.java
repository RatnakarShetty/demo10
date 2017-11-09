package com.tys.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.pages.HomePage;
import com.tys.pages.ProductDetailsPage;
import com.tys.pages.RingsPage;

public class CurrencySymbolTest extends BaseTest {

	@Test
	public void currencySymbolTest() {

		HomePage homepage = new HomePage(driver);
		
		homepage.clickOnCountrySwitherDD();

		homepage.clickOnCanadaCountry();

		homepage.ClicOnRings();

		RingsPage ringspage = new RingsPage(driver);
		ringspage.clickOnFirstRing();

		ProductDetailsPage productdetpage = new ProductDetailsPage(driver);

		if (productdetpage.getCurrencySymbol().equals("$")) {
			Reporter.log("Currency changed to canadian dollar",true);
		}else{
			Reporter.log("Currency not changed to canadian dollar",true);
			Assert.fail();
		}

	}

}
