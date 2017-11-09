package com.tys.tests;

import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.pages.SignUpPage;

public class SignupTest extends BaseTest {

	@Test
	public void signUPTest() throws InterruptedException {

		SignUpPage lp = new SignUpPage(driver);

		lp.signup();

		Thread.sleep(2000);
		lp.name();

		Thread.sleep(2000);
		lp.email1();

		Thread.sleep(2000);
		lp.phone();

		Thread.sleep(2000);
		lp.agrement();

		Thread.sleep(2000);
		lp.Submit();
		
		lp.verifySuccessMag();

		Thread.sleep(4000);
		lp.CloseButton();
		Thread.sleep(4000);

	}

}
