package utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	
	private static WebDriver driver;
	
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT = 5;
	public final static int PAGE_LOAD_TIMEOUT = 5;
	
	private SeleniumDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
//		Wait<WebDriver> wait=new WebDriverWait(driver, Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
		
				
				
	}
	
	public static void openPage(String url) throws InterruptedException
	{
		driver.get(url);
		Thread.sleep(3000);
		//driver.navigate().refresh();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static void SetUPDriver()
	{
		if(seleniumDriver==null)
		{
			seleniumDriver =new SeleniumDriver();
		}
	}
	
	public static void tearDown()
	{
		if(driver!=null)
		{
			driver.close();
			driver.quit();
		}
		seleniumDriver=null;
	}
	
}
