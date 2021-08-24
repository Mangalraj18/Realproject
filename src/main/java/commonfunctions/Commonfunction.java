package commonfunctions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Commonfunction 
{
 	public static WebDriver driver;
	public static Properties prop=null;
	public static Logger log=LogManager.getLogger(Commonfunction.class.getName());
	public Properties loadpropertyfile() throws IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\Personal\\MyownProject\\Dataprovider\\holdingdata.properties");
		prop=new Properties();
		prop.load(file);
		return prop;
	}
	@BeforeSuite
	public WebDriver getBrowser() throws IOException
	{
		loadpropertyfile();
		log.info("file uploaded");
		String browser=prop.getProperty("browser");
		String driverlocation=prop.getProperty("driverlocation");
		String url=prop.getProperty("url");
		log.info("URL uploaded");
		if(browser.equalsIgnoreCase("chrome"))
		  {
			System.setProperty("webdriver.chrome.driver",driverlocation);
			driver=new ChromeDriver();
			log.info("Browser uploaded");
		   }
		   else if(browser.equalsIgnoreCase("edge"))
		   {
			   System.setProperty("webdriver.edge.driver", driverlocation);
				 driver=new EdgeDriver();
				 log.info("Browser uploaded");
		   }
		   else
		   {
		     System.setProperty("webdriver.gecko.driver",driverlocation);
			 driver=new FirefoxDriver();
			 log.info("Browser uploaded");
		   }
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		}
	@AfterSuite
	public void teardown()
	{
		
		driver.quit();
		log.info("All done bye");
	}	
}
