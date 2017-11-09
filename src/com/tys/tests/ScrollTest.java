package com.tys.tests;

import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.pages.HomePage;

public class ScrollTest extends BaseTest {

	@Test
	public void scrollTest() {

		HomePage homepage = new HomePage(driver);
		homepage.ScrollPage();
	}

}
