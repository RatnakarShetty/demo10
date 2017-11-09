package com.tys.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.pages.HomePage;

public class verifyTooltipTest extends BaseTest {

	@Test
	public void verifyIconTooltiptest() {

		HomePage homepage = new HomePage(driver);
		boolean verified = homepage.verifyTooltip("BlueStone");
		if (verified) {
			Reporter.log("Tooltip is verifyied successfuly", true);
		} else {
			Reporter.log("Tooltip is not verifyied successfuly", true);
			Assert.fail();
		}
	}

}
