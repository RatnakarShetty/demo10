import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetProperty {

	static {
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Downloads/chromedriver");
	}

	public static WebDriver driver = new ChromeDriver();

}
