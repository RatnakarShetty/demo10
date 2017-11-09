package com.tys.tests;

import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.generics.UtilityLib;
import com.tys.pages.HomePage;

public class InvalidLogTest extends BaseTest {

	@Test
	public void invalidvalidLoginTest() throws InterruptedException {
		
		int rc = UtilityLib.getRowCount(INPUT_PATH, "InvalidValidLoginLogoutTest");
		
		//for (int i = 1; i <= rc; i++) {
			String un = UtilityLib.getCellValue(INPUT_PATH, "InvalidValidLoginLogoutTest", 1, 0);
			String pw = UtilityLib.getCellValue(INPUT_PATH, "InvalidValidLoginLogoutTest", 1, 1);

			HomePage homepage = new HomePage(driver);

			homepage.ClickLogin();

			homepage.setUserName(un);

			homepage.setPassWord(pw);

			homepage.ClickSignIn();

			Thread.sleep(2000);

			homepage.isEmailInvaliErrorMsgPresent();
	//	}

	}
}


