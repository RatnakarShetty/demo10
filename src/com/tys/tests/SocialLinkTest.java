package com.tys.tests;

import java.util.Set;

import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.generics.UtilityLib;
import com.tys.pages.HomePage;
import com.tys.pages.TwitterPage;

public class SocialLinkTest extends BaseTest {

	@Test(priority=1)
	public void twitterTest() throws InterruptedException {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 1);

		HomePage homepage = new HomePage(driver);

		// log.info("Click on login button");

		homepage.ClickLogin();

		homepage.setUserName(un);

		homepage.setPassWord(pw);

		homepage.ClickSignIn();

		Thread.sleep(3000);

		homepage.clickOnTwitterButton();

		Thread.sleep(5000);

		Set<String> allWinHans = driver.getWindowHandles();

		String firstWin = "";
		for (String winHan : allWinHans) {
			firstWin = winHan;
			driver.switchTo().window(winHan);
		}
		

		Thread.sleep(5000);
		TwitterPage twitterpage = new TwitterPage(driver);
		twitterpage.verifyTitle("BlueStone (@bluestone_com) | Twitter");
		driver.switchTo().window(firstWin);

	}
	
	@Test(priority=2)
	public void pinterestTest() throws InterruptedException {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 1);

		HomePage homepage = new HomePage(driver);

		homepage.ClickLogin();

		homepage.setUserName(un);

		homepage.setPassWord(pw);

		homepage.ClickSignIn();

		Thread.sleep(3000);

		homepage.clickOnPinterestButton();

		Thread.sleep(5000);

		Set<String> allWinHans = driver.getWindowHandles();

		String firstWin = "";
		for (String winHan : allWinHans) {
			firstWin = winHan;
			driver.switchTo().window(winHan);
		}
		

		Thread.sleep(5000);
		TwitterPage twitterpage = new TwitterPage(driver);
		twitterpage.verifyTitle("BlueStone (bluestonedotcom) on Pinterest");
		driver.switchTo().window(firstWin);

	}

}
