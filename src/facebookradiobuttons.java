import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookradiobuttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		List<WebElement> elements = driver.findElements(By.name("sex"));
		elements.get(0).click();
		Thread.sleep(1000);
		System.out.println(elements.get(0).getText());
	}

}
