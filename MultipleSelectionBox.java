package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Waited for 10 secs");
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		// Step 3: Select 'Selenium Commands' Multiple select box ( Use Name locator to identify the element )
		Select oSelect=new Select(driver.findElement(By.name("selenium_commands")));
		// Step 4: Select option 'Browser Commands' and then deselect it (Use selectByIndex and deselectByIndex)
		oSelect.selectByIndex(0);
		Thread.sleep(2000);
		oSelect.deselectByIndex(0);
		oSelect.selectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		oSelect.deselectByVisibleText("Navigation Commands");
		
		// Step 6: Print and select all the options for the selected Multiple selection list.
		List<WebElement> oSize=oSelect.getOptions();
		int iListSize=oSize.size();
		for (int i=0;i<iListSize;i++){
			// Storing the value of the option	
			String sValue=oSelect.getOptions().get(i).getText();
			System.out.println(sValue);
			// Selecting all the elements one by one
			oSelect.selectByIndex(i);
			Thread.sleep(2000);
		}
		//Deselect All
		oSelect.deselectAll();
		driver.close();
	}

}