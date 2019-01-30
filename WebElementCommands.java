package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		String appUrl= "http://www.DemoQA.com";
		driver.get(appUrl);
		WebElement element=driver.findElement(By.id("Username"));

	}

}