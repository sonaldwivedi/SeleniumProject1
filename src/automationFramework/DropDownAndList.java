package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAndList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select oSelect=new Select(driver.findElement(By.id("continents")));
		oSelect.selectByVisibleText("Europe");
		Thread.sleep(2000);
		oSelect.selectByIndex(2);
		Thread.sleep(2000);
		//Print all the options for the selected drop down and select one option of your choice
		// Get the size of the Select element
		List<WebElement> oSize=oSelect.getOptions();
		System.out.println(oSize);
		int iListSize=oSize.size();
		//Loop for printing all options
		for (int i=0; i<iListSize; i++){
			//Store the value of the option
			String sValue=oSelect.getOptions().get(i).getText();
			System.out.println(sValue);
			if (sValue.equals("Africa")){
				oSelect.selectByIndex(i);
				break;
			}
		}
		//driver.quit();
	}

}