import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Actions builder = new Actions(driver);
		//first drag
		WebElement drag1= driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]/a"));
		WebElement drop1= driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/div/ol/li"));
		Thread.sleep(2000);
		Action dragging1= builder.dragAndDrop(drag1, drop1).build();
		Thread.sleep(2000);
		dragging1.perform();
		
		//second drag
		WebElement drag2= driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]/a"));
		WebElement drop2= driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol/li"));
		Thread.sleep(2000);
		Action dragging2= builder.dragAndDrop(drag2, drop2).build();
		Thread.sleep(2000);
		dragging2.perform();
		
		//third drag
		WebElement drag3= driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[6]/a"));
		WebElement drop3= driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/ol/li"));
		Thread.sleep(2000);
		Action dragging3= builder.dragAndDrop(drag3, drop3).build();
		Thread.sleep(2000);
		dragging3.perform();
		Thread.sleep(2000);
		
		//fourth drag
		WebElement drag4= driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[4]/a"));
		WebElement drop4= driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/ol/li"));
		Thread.sleep(2000);
		Action dragging4= builder.dragAndDrop(drag4, drop4).build();
		Thread.sleep(2000);
		dragging4.perform();
		Thread.sleep(2000);
		
		//checking for perfect
		String str=("Perfect!");
		String str1= driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[5]/a")).getText();
		if(str.equals(str1))
				{
					System.out.println("Correct output");
				}
		//Thread.sleep(6000);
		//driver.close();
	}

}
