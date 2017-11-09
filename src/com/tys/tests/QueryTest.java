package com.tys.tests;

import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.pages.ContactUsPage;
import com.tys.pages.HomePage;

public class QueryTest extends BaseTest {

	@Test
	public void queryTest() throws InterruptedException {

		HomePage homepage = new HomePage(driver);
		homepage.clickOnContactUsLink();

		Thread.sleep(5000);
		
		ContactUsPage contactpage = new ContactUsPage(driver);
		contactpage.enterTheName("Ganesh");

		contactpage.enterEmail("xyz@gmail.com");

		contactpage.enterPhone("7878787878");

		contactpage.enterQuery("gjksdghjdflghjg sdfgjh fgsdhg sdh gshfghfg ssdh gfhsdgf");
		
		Thread.sleep(3000);
		contactpage.clickOnSubmitButton();
		
		Thread.sleep(2000);
		contactpage.successMsgPresent();
		

	}
}
