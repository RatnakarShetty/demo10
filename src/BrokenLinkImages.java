
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenLinkImages extends SetProperty {

	public static void main(String[] args) {

		driver.get("http://only-testing-blog.blogspot.in/2013/09/testing.html");

		List<WebElement> totalLinks = driver.findElements(By.tagName("img"));

		boolean isValid = false;

		for (int i = 0; i < totalLinks.size(); i++) {
			String url = totalLinks.get(i).getAttribute("src");

			if (url != null) {
				isValid = getResponse(url);
				
				
				
				
				if (isValid) {
					System.out.println("Valid Link :-" + url);
					System.out.println("**************************************************");
					System.out.println();
				} else {
					System.out.println("InValid Link :-" + url);
					System.out.println("**************************************************");
					System.out.println();
				}
			} else {

				System.out.println("String null");
				System.out.println("*******************************************************");
				System.out.println();
				continue;

			}
		}
		driver.quit();

	}

	public static boolean getResponse(String chkurl) {

		boolean validResponse = false;

		try {

			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(chkurl);
			HttpResponse response = client.execute(request);
			int resCode = response.getStatusLine().getStatusCode();
			if (resCode != 200) {
				validResponse = false;
			} else {
				validResponse = true;
			}
		} catch (Exception e) {

		}

		return validResponse;
	}

}
