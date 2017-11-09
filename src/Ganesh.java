import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ganesh {

	static {
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Downloads/chromedriver");
	}

	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * WebDriver driver = new ChromeDriver(); // WebDriver driver = new
	 * FirefoxDriver();
	 * 
	 * driver.get("https://www.bluestone.com/");
	 * 
	 * WebElement ele =
	 * driver.findElement(By.xpath("//INPUT[@id='search_query_top']")); //
	 * ele.clear(); ele.sendKeys("Ganesh");
	 * 
	 * new WebDriverWait(driver, 1000).until(webDriver -> ((JavascriptExecutor)
	 * driver) .executeScript("return document.readyState").equals("complete"));
	 * 
	 * // Thread.sleep(1000); driver.quit(); }
	 */
	@Test
	public void demo() {
		Reporter.log("testing", true);
	}

}
