package pageofobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_page_object
{
	@FindBy(id="menu_dashboard_index")
     public static WebElement Dashboard;
	
	
	@FindBy(xpath="//*[@id=\"task-list-group-panel-menu_holder\"]/table/tbody/tr/td[1]")
    public static WebElement pending_list;
}
