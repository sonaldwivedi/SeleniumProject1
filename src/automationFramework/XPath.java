package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPath {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/v1/");
		//XPath using only name attribute
		WebElement userName=driver.findElement(By.xpath("//input[@name='uid']"));
		userName.sendKeys("Sonal");
		//XPath using contains keyword
//		WebElement submitButton=driver.findElement(By.xpath("//input[contains(@type,'sub')]"));
//		submitButton.click();
		//WebElement hereLink=driver.findElement(By.xpath("//*[contains(text(),'here')]"));
		//hereLink.click();
		//driver.navigate().back();
		//WebElement bSubmit=driver.findElement(By.xpath("//input[@type='submit' AND @name='btnLogin']"));
		
		//driver.quit();
	}

}
