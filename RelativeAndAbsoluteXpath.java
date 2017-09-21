package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeAndAbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://store.demoqa.com/");
		Thread.sleep(3000);
		//Using absolute xpath of RSS Feed
		driver.findElement(By.xpath("html/body/div[2]/div/div/footer/section[3]/div/ul/li[3]/a")).click();
		System.out.println("RSS clicked using absolute xpath");
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Navigated back");
		Thread.sleep(3000);
		//Using relative xpath of RSS Feed
		driver.findElement(By.xpath(".//*[@id='social-media']/ul/li[3]/a")).click();
		System.out.println("Again clicked on RSS using relative xpath");

	}

}
