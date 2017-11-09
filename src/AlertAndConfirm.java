import org.openqa.selenium.Alert;

public class AlertAndConfirm extends SetProperty {

	public static void main(String[] args) {

		driver.get("asdasdasd.com");
		Alert alWindow = driver.switchTo().alert();
		String alText = alWindow.getText();
		System.out.println(alText);
		alWindow.accept();
		alWindow.dismiss();
		

	}

}
