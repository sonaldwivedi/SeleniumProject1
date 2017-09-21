package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement alertButton=driver.findElement(By.xpath(".//*[@id='content']/p[4]/button"));
		System.out.println(alertButton.getText());
		//Click on alert
		driver.findElement(By.xpath(".//*[@id='content']/p[4]/button")).click();;
		//Tap anywhere on screen to dismiss alert. This will not be done and NoElemenyFound exception will be thown
		driver.findElement(By.xpath(".//*[@id='content']/p[16]/button")).click();
		System.out.println("Nothing achieved");
	}

}
