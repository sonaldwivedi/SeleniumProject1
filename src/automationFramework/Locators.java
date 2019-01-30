package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
//Locators are:
//Id, Name, Identifier, Link, DOM, XPath, 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://store.demoqa.com/tools-qa/");
		WebElement elementUsername=driver.findElement(By.name("log"));
		elementUsername.sendKeys("Sonal");
		WebElement linkBacktosore=driver.findElement(By.linkText("← Back to ONLINE STORE"));
		linkBacktosore.click();
		System.out.println("Back to online link clicked");
		Thread.sleep(5000);
		driver.navigate().back();
		System.out.println("Back clicked");
	}

}
