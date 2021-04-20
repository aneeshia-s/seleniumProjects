import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/");
		String Title = driver.getTitle();
		int length = Title.length();
		System.out.println("Title is: "+ Title+" and length is: "+length);
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		String str= "https://demoqa.com/";
		if(CurrentUrl.equals(str))
		{
			System.out.println("Correct page ");
		}
		String pagesource= driver.getPageSource();
		int sourcelength = pagesource.length();
		System.out.println("Page length is : "+ sourcelength);
		driver.close();
	
	}

}
