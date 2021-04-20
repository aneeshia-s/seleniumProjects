import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TaskLocater1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("Aneeshia");
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("Sasidharan");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("meroonrosa@yahoo.com");
		WebElement number = driver.findElement(By.id("userNumber"));
		number.sendKeys("1234567890");
		//WebElement subject = driver.findElement(By.id("SubjectsContainer"));
		//subject.sendKeys("hello");
		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("Kalarickal house, Ernakulam");
		//WebElement gender = driver.findElement(By.name("gender"));
		//gender.sendKeys("Female");
		WebElement element = driver.findElement(By.id("submit")); 
		element.submit();
		//driver.close();
		
	}

}
