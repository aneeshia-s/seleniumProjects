import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class taskgoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement rdElement = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		Actions builder = new Actions(driver);
	    Action seriesofactions =  builder.moveToElement(rdElement).
	    		keyDown(rdElement,Keys.SHIFT).
	    		sendKeys(rdElement,"selenium").
	    		keyUp(rdElement,Keys.SHIFT).
	    		doubleClick().contextClick().
	    		build();
	   	Thread.sleep(2000);
	    seriesofactions.perform();
	    Thread.sleep(2000);
	    driver.close();

	}

}
