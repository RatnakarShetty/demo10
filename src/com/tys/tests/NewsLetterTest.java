package com.tys.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.pages.HomePage;

public class NewsLetterTest extends BaseTest {

	@Test
	public void newsLetterTest() throws InterruptedException {

		HomePage homepage = new HomePage(driver);
		
		Thread.sleep(2000);
		homepage.enterSubScriberEmailId("ratnakarsgb21");
		Thread.sleep(2000);
		homepage.ClickOnSubscribeButton();
		Thread.sleep(2000);
		boolean isSuccess = homepage.verifySuccessMsgIsPresent();
		
		if(isSuccess){
			Reporter.log("news letter added ",true);
		}else{
			Reporter.log("news letter not added ",true);
		}
		Thread.sleep(2000);
	}

}
