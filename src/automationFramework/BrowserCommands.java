package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		String url="http://yahoo.com";
		driver.get(url);
		String title=driver.getTitle();
		int titleLength=driver.getTitle().length();
		System.out.println("Title is:" +title);
		System.out.println("Title length is:" +titleLength);
		String actualUrl=driver.getCurrentUrl();
		if (actualUrl.equals(actualUrl)){
			System.out.println("Verification successful");
		}
		else{
			System.out.println("Verification failed");
			System.out.println("Actual Url is:" +actualUrl);
			System.out.println("Expected url is" +url);
		}
		String pageSource=driver.getPageSource();
		int pageSourceLength=pageSource.length();
		System.out.println("Page Source length is:" +pageSourceLength);
		driver.close();
	}

}