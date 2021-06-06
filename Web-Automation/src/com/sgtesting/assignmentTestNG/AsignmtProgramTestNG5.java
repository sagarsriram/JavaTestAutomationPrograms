package com.sgtesting.assignmentTestNG;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AsignmtProgramTestNG5 extends Prerequisite {
	public static Logger log=Logger.getLogger("program -5");
	@Test(priority=1)
	static void runPrerequisite()
	{
		log.info("opening Chrome browser Starting ChromeDriver 90.0.4430.24, ChromeDriver was started successfully.");
		log.info("navigating to ACTITIME url");
		Prerequisite.launchBrowserandNavigate();
		log.info("Logging in as admin");
		Prerequisite.loginAdmin();
		log.info("minimizing fly out window");
		Prerequisite.minimizeFlyOutWindow();
		try
		{
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	static void createCustomer()
	{
		try
		{
			log.info("creating  customers");
			getbrowser.findElement(By.xpath("//td[@class='navItem navCell relative notSelected']//a[@class='content tasks']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='addNewContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("Google");
			getbrowser.findElement(By.xpath("//div[@id='customerLightBox_commitBtn']//div//span[@class='buttonTitle']")).click();Thread.sleep(1000);
			log.info("created  customers");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=3)
	static void createProject()
	{
		try
		{	
			log.info("creating project");
			getbrowser.findElement(By.xpath("//div[@class='addNewContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@class='item createNewProject ellipsis']")).click();
			Thread.sleep(1000);			
			getbrowser.findElement(By.xpath("//input[@id='projectPopup_projectNameField']")).sendKeys("New-Project");Thread.sleep(1000);	
			getbrowser.findElement(By.xpath("//div[@id='projectPopup_footer']//span[@class='buttonTitle']")).click();Thread.sleep(1000);	
			log.info("created project");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@Test(priority=4)
	static void deleteProject()
	{
		try
		{
			log.info("deleting project");
			getbrowser.findElement(By.xpath("//div[@class='node projectNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='action']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='deleteButton']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//span[@id='projectPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(4000);
			log.info("deleted project");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void deleteCustomer()
	{
		try
		{
			log.info("Deleting  customers");
			getbrowser.findElement(By.xpath("//div[@class='node customerNode notSelected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);		
			getbrowser.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='img']/following-sibling::div[@class='action']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@class='dropdownContainer actionsMenu']//div//div[@class='deleteButton'][@style='display: inline-block;']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//span[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			log.info("Deleted  customers");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=6)
	static void postrequistes()
	{
		log.info("logging out from ACTITIME website");
		postrequisite.logout();
		log.info("closing the browser");
		log.info("************************************************************************");
		postrequisite.closeBrowser();
	}
}
