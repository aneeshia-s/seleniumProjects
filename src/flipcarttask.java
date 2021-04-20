
//import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.support.ui.WebDriverWait;

public class flipcarttask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Open flipkart
		
		driver.get("https://www.flipkart.com/");
		
		
		//login
		Actions builder = new Actions(driver);
		WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		Action loginaction = builder.moveToElement(login).
				sendKeys(login,"9497279704").
				build();
		loginaction.perform(); 
		Thread.sleep(1000);
		WebElement loginpwd = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		Action loginaction1 = builder.moveToElement(loginpwd).
				sendKeys(loginpwd,"krishnan").
				build();
		loginaction1.perform();
		Thread.sleep(1000);
		
		WebElement login1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
		Action loginaction2 = builder.moveToElement(login1).
				click().
				build();
		loginaction2.perform();
		
			//Search the particular item	
		Thread.sleep(2000);
		WebElement rdElement = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		Action seriesofactions =  builder.moveToElement(rdElement).
	    		sendKeys(rdElement,"ikigai").
	    		build();
		Thread.sleep(2000);
	    seriesofactions.perform();
	    Thread.sleep(2000);
	    
	    
	    WebElement searchbutton = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/button"));
	    Action search = builder.moveToElement(searchbutton).click().build();
	    search.perform();
	    Thread.sleep(2000);
	    
	    WebElement ikigai = driver.findElement(By.xpath ("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]"));
	    Action iki = builder.moveToElement(ikigai).click().build();
	    iki.perform();
	    
	    Thread.sleep(1000);
	    
	    String mainwindowHandle = driver.getWindowHandle();
	    for (String winhandle: driver.getWindowHandles()) 
	    	if(!mainwindowHandle.contentEquals(winhandle))
	    {
	    	driver.switchTo().window(winhandle);
	    	System.out.println("entering new window");
	    	
	    	WebDriverWait wait = new WebDriverWait(driver,30);
	    	WebElement addtocart;
	 	    addtocart = wait.until(ExpectedConditions.visibilityOfElementLocated
	 	    		(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")));
	 	    addtocart.click();
	    	
	    }
	    	
	    
	    //Thread.sleep(3000);
	    	 
		 	    
		 	    
		 	  /* 
		 	   working code
		 	   WebElement addtocart = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
		 	    Action cart = builder.moveToElement(addtocart).doubleClick().build();
		 	    cart.perform();*/
	    
	  
	    
	    
	}

}
