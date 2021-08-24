package pageofobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class user_page_object
{	
	@FindBy(id="menu_admin_viewAdminModule")
	public static WebElement Adminclick;
	
	@FindBy(id="menu_admin_UserManagement")
	public static WebElement Adminmanagement;
	
	@FindBy(xpath="//*[@id='menu_admin_viewSystemUsers']")
	public static WebElement Adminusers;
	
	 @FindBy(id="searchSystemUser_userName")
	 public static WebElement username;
	 
	 @FindBy(id="searchSystemUser_userType")
	 public static WebElement userrole;
	 

	 @FindBy(xpath="//*[@id='searchSystemUser_employeeName_empName']")
	 public static WebElement empname;
	 
	 @FindBy(id="searchSystemUser_status")
	 public static WebElement status;
	 
	 @FindBy(id="searchBtn")
	 public static WebElement search;			
}
