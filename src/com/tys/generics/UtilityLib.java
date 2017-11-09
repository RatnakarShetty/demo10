package com.tys.generics;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class UtilityLib {

	public static void getScreenShot(WebDriver driver, String path) {

		try {
			TakesScreenshot t = (TakesScreenshot) driver;
			File srcFile = t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File(path));
		} catch (Exception e) {
			Reporter.log("Error While Taking the ScreenShot of the browser", true);
		}

	}

	public static void getScreenShot(String path) {

		try {
			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			Robot r = new Robot();
			BufferedImage img = r.createScreenCapture(new Rectangle(d));
			ImageIO.write(img, "png", new File(path));

		} catch (Exception e) {
			Reporter.log("Error While Taking the ScreenShot of the Desktop or multi browser", true);
		}

	}

	public static String now() {
		SimpleDateFormat s = new SimpleDateFormat("dd_MM_yy");
		return s.format(new Date());

	}

	public static String getCellValue(String path, String sheet, int r, int c) {
		String v = "";
		try {
			Workbook wb = WorkbookFactory.create(new File(path));
			v = wb.getSheet(sheet).getRow(r).getCell(c).toString();

		} catch (Exception e) {

		}
		return v;
	}

	public static int getRowCount(String path, String sheet) {
		int r = 0;
		try {
			Workbook wb = WorkbookFactory.create(new File(path));
			r = wb.getSheet(sheet).getLastRowNum();
			return r;
		} catch (Exception e) {
		}
		return r;
	}

	public static void moveToElement(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).click().perform();
	}

}
