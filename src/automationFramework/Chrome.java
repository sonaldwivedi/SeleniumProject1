package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {

	public static void main(String[] args) {
		String exePath = "/usr/local/share/chromedriver/chromedriver/";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.jiocinema.com/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/nav/div/ul[1]/li[3]/a")).click();
		System.out.println("profile icon clicked");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/button")).click();
		System.out.println("Clicked on Sign In using JioId");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pranalithakur-2609");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("poiuy123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}


