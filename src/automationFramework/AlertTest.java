package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/usr/local/share/gecko_driver/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/selenium/delete_customer.php");
		WebElement custId=driver.findElement(By.name("cusid"));
		custId.sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		//switching to alert
		Alert alert = driver.switchTo().alert();
		System.out.println("alert is: " +alert);
		String alertMessage=alert.getText();
		System.out.println("Alert text:" +alertMessage);
		Thread.sleep(5000);
		alert.accept();
		System.out.println("Successfully accepted first alert box");
		Thread.sleep(5000);;
		alert.accept();
		driver.close();
	}

}
