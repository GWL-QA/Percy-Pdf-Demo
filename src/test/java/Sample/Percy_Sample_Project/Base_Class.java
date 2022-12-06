package Sample.Percy_Sample_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.percy.selenium.Percy;

public class Base_Class 
{
	 public static WebDriver driver;
	    public static Percy percy;
	    @BeforeMethod
	    public void setup()
	    {
	    	 ChromeOptions option = new ChromeOptions();
	         option.setHeadless(true);
	         
	    	WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(option);
	       
	        percy = new Percy(driver);
	    }

	 @AfterMethod(alwaysRun = true)
	    public void tearDown() throws Exception {
	        driver.quit();

	    }
	}


