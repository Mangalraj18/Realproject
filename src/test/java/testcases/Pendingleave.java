package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfunctions.Commonfunction;
import junit.framework.Assert;
import pageofobjects.Dashboard_page_object;
import pageofobjects.logindetails;

public class Pendingleave extends Commonfunction

{

	public static Logger log=LogManager.getLogger(Pendingleave.class.getName());
	String actual;
	String expected;
	public void login()
	{
		PageFactory.initElements(driver,logindetails.class);
		logindetails.username.sendKeys(prop.getProperty("username"));
		logindetails.password.sendKeys(prop.getProperty("password"));
		logindetails.submit.click();
	}
    
	public void dashboard()
	{
		PageFactory.initElements(driver, Dashboard_page_object.class);
		 Dashboard_page_object.Dashboard.click();
		 actual=Dashboard_page_object.pending_list.getText();
		  expected="No Records are Available";
		 
	}
	@Test
	public void pendingleave()
	{
		login();
		log.info("Login success");
		dashboard();
		log.info("Dashboard selected");

		Assert.assertEquals(actual, expected);	
		log.info("Functions are equal");
	}	
}
