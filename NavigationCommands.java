package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		String appUrl= "http://www.DemoQA.com";
		driver.get(appUrl);
		//driver.findElement(By.xpath(".//*[@id=’menu-item-374′]/a")).click();
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		System.out.println("Registration link clicked");
		driver.navigate().back();
		System.out.println("Performed back from registration page. Now in home screen");
		driver.navigate().forward();
		System.out.println("Tapped on forward icon and landed on registration page");
		driver.navigate().to(appUrl);
		System.out.println("Navigaeted to app Url through navigate().to() command");
		driver.navigate().refresh();
		System.out.println("Page refreshed");
		driver.close();
	}

}