import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmaillogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement create = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[3]/a"));
		create.click();
		
		String mainwindowHandle = driver.getWindowHandle();
	    for (String winhandle: driver.getWindowHandles()) 
	    	if(!mainwindowHandle.contentEquals(winhandle))
	    {
	    	driver.switchTo().window(winhandle);
	    	WebElement firstname = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
	    	firstname.sendKeys("Ani");
	    	WebElement secondname = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
	    	secondname.sendKeys("S");
	    	WebElement email = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		    email.sendKeys("aneeshiasasidharan123");
		    WebElement pwd1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[1]/div/div/div[1]/div/div[1]/div/div[1]/input"));
		    pwd1.sendKeys("krishnan123");
		    WebElement pwd2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input"));
		    pwd2.sendKeys("krishnan123");
		    
		    WebElement next = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]"));
		    next.click();
	    }
	    
	    
		

	}

}
