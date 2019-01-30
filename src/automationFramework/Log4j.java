package automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.DOMConfiguration;

public class Log4j {
	private static WebDriver driver;
	private static Logger Log=Logger.getLogger(Log4j.class.getName());

	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		driver=new FirefoxDriver();
		Log.info("New Driver instantiated");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/selenium-webdriver/test-case-with-log4j/");
		Log.info("Website launched");
		WebElement text=driver.findElement(By.xpath(".//*[@id='page']/div[4]/div/div/div/div[1]/h1"));
		System.out.println("text is:" +text);
		driver.quit();
		Log.info("Current webpage closed");

	}

}
