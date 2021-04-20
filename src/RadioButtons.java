import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement rdElement = driver.findElement(By.id("vfb-7-1"));
		rdElement.click();
		if (rdElement.isEnabled()){
			System.out.println("Radio button 1 is enabled");
		}
		if (rdElement.isDisplayed()){
			System.out.println("Radio button 1 is displayed");
		}
		if (rdElement.isSelected()){
			System.out.println("Radio button 1 is selected");
		}
		List<WebElement> elements = driver.findElements(By.name("webform"));
		System.out.println("no: of elements:"+elements.size());
		
		for(int i=0;i<elements.size();i++) {
			elements.get(i).click();
			Thread.sleep(1000);
		}
		WebElement chkElement1 = driver.findElement(By.id("vfb-6-0"));
		if(chkElement1.isSelected()) {
			chkElement1.click();
		}
		WebElement chkElement2 = driver.findElement(By.id("vfb-6-1"));
		if(chkElement2.isSelected()) {
			chkElement2.click();
		}
		WebElement chkElement3 = driver.findElement(By.id("vfb-6-2"));
		if(chkElement3.isSelected()) {
			chkElement3.click();
		}
		
	
	}

}
