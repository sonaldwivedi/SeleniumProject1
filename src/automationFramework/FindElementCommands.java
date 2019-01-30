package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementCommands {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
		driver.findElement(By.partialLinkText("Partial")).click();
		System.out.println("Partial Link test pass");
		String sClass=driver.findElements(By.tagName("button")).toString();
		System.out.println(sClass);
		driver.findElement(By.linkText("Link Test")).click();
		System.out.println("Link Test pass");
	}

}