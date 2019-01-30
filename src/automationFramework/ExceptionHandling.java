package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExceptionHandling {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/v1/");
		WebElement saveButton=driver.findElement(By.id("Save"));
		try{
			if(saveButton.isDisplayed()){
				saveButton.click();
			}
		}
		catch (NoSuchElementException e) {
			e.printStackTrace(); 
		}
		System.out.println("Printed after exception catched");
	}

}
