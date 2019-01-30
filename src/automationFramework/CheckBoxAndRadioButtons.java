package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxAndRadioButtons {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		List<WebElement> rdBtnSex = driver.findElements(By.name("sex"));
		boolean bvalue = false;
		bvalue = rdBtnSex.get(0).isSelected();
		System.out.println("bvalue=" + bvalue);
		if (bvalue == true) {
			rdBtnSex.get(1).click();
		} else {
			rdBtnSex.get(0).click();
		}
		WebElement rdBtnExp = driver.findElement(By.id("exp-2"));
		rdBtnExp.click();

		List<WebElement> chkBxProfession = driver.findElements(By.name("profession"));
		int iSize = chkBxProfession.size();

		for (int i = 0; i < iSize; i++) {
			String sValue = chkBxProfession.get(i).getAttribute("value");
			if (sValue.equalsIgnoreCase("Automation Tester")) {
				chkBxProfession.get(i).click();
				break;
			}
		}
		WebElement oCheckBox=driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		oCheckBox.click();
		driver.quit();
	}
}