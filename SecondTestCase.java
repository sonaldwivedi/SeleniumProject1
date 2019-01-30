package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondTestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println("Successfully opened");
		Thread.sleep(5000);
		driver.quit();
	}
}