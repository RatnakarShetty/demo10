import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserName extends SetProperty {

	public static void main(String[] args) {

		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browName = cap.getBrowserName();
		System.out.println(browName);
		driver.quit();

	}

}
