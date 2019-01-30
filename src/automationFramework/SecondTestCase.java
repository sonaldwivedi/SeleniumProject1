package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondTestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath(".//*[@id='sb_ifc0']"));
		Thread.sleep(2000);
		System.out.println("Successfully opened");
		Thread.sleep(5000);
		driver.quit();
	}
}