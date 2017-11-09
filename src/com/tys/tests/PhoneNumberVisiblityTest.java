package com.tys.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.pages.ContactUsPage;
import com.tys.pages.HomePage;

public class PhoneNumberVisiblityTest extends BaseTest {

	@Test
	public void phoneNumberUniqnessTest() throws InterruptedException {

		HomePage homepage = new HomePage(driver);

		String hederPhoneNum = homepage.getHeaderPhoneNumber();
		String footerPhoneNum = homepage.getFooterPhoneNumber();

		homepage.clickOnContactUsLink();

		Thread.sleep(5000);
		ContactUsPage contactuspage = new ContactUsPage(driver);

		String contactNo = contactuspage.getContactPhoneNumber();

		System.out.println(contactNo);

		if (hederPhoneNum.equals(footerPhoneNum) && contactNo.contains(footerPhoneNum)) {
			Reporter.log("Phone number mentioned in all pages are matching", true);
		} else {
			Reporter.log("Phone number mentioned in all  pages are not matching", true);
			Assert.fail();
		}

	}

}
