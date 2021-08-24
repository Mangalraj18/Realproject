package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import commonfunctions.Commonfunction;
import pageofobjects.logindetails;
import pageofobjects.user_page_object;

public class Admin_role extends Commonfunction
{
	public static Logger log=LogManager.getLogger( Admin_role.class.getName());
	public void method1()
	{
		PageFactory.initElements(driver,user_page_object.class);
		   Actions action=new Actions(driver);
		   action.moveToElement(user_page_object.Adminclick);
		   log.info("Admin link is clicked");
		   action.moveToElement(user_page_object.Adminmanagement);
		   log.info("Management link is clicked");
		   action.moveToElement(user_page_object.Adminusers);
		   log.info("Users link is clicked");
		   action.click().build().perform();
		   log.info("Now is in clicked");
	}
	public void select()
	{
		PageFactory.initElements(driver,user_page_object.class);
		user_page_object.username.sendKeys("mangal");
		 log.info("Username done");
		   Select select=new Select(user_page_object.userrole);
		  select.selectByIndex(1);
		  log.info("selected this value");
		  user_page_object.empname.sendKeys("mangal");
		  Select selects=new Select(user_page_object.status);
		  selects.selectByIndex(1);
		  log.info("selected this value");
	}
	@Test
	public void login()
	{
		method1();
	   select();
	   PageFactory.initElements(driver,user_page_object.class);
	   user_page_object.search.click();   
	   log.info("selected all done");
	}
	
}
