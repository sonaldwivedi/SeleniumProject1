package automationFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();	
		driver.get("https://www.google.co.in/maps/place/Shilphata,+Navi+Mumbai,+Maharashtra/@19.1447525,73.0382731,15z/data=!4m5!3m4!1s0x3be7c07ef96d4251:0x4d7a3cbebf77d0fe!8m2!3d19.1435322!4d73.046473!5m1!1e1");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
