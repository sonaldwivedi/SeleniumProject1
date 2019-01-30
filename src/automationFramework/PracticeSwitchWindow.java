package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.*;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeSwitchWindow {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		String mainWindow=driver.getWindowHandle();
		//to handle all new opened windows
		Set<String> s1=driver.getWindowHandles();	
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())
		{
			String childWindow=i1.next();
			if(!mainWindow.equalsIgnoreCase(childWindow))
			{
				//Switching to child window
				driver.switchTo().window(childWindow);
				driver.findElement(By.name("emailid")).sendKeys("gaurav.2n@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				//Closing the child window
				driver.close();
			}
		}
		//Switching to parent window
		driver.switchTo().window(mainWindow);
	}

}
