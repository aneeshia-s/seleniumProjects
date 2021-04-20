import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		Select oselect = new Select(driver.findElement(By.id("fruits")));
		oselect.selectByVisibleText("Apple");
		Thread.sleep(1000);
		if(oselect.isMultiple())
		{
			System.out.println("multiple can be selected");
			oselect.selectByIndex(0);
			
		}else {
		System.out.println("only single can be selected");
		}
		Thread.sleep(1000);
		oselect.deselectAll();
		Thread.sleep(1000);
		oselect.selectByValue("grape");
		Thread.sleep(1000);
		driver.close();
		}
	
}
