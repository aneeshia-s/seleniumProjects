import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linktext {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/link.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement linktext = driver.findElement(By.linkText("click here"));
		linktext.click();
		driver.navigate().back();
		WebElement partiallinktext = driver.findElement(By.partialLinkText("click"));
		partiallinktext.click();
		driver.navigate().back();
		WebElement nextlink = driver.findElement(By.xpath("/html/body/a[2]"));
		nextlink.click();

	}

}
