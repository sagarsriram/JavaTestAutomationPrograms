package com.sgtesting.assignmentTestNG;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AsignmtProgramTestNG7 extends Prerequisite{
	public static Logger log=Logger.getLogger("program -7");
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
	static void createTask()
	{
		try
		{
			log.info("creating Three different Task");
			getbrowser.findElement(By.xpath("//div[@class='addNewTaskButtonContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='item createNewTask ellipsis']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//tr[1]//input[@class='inputFieldWithPlaceholder']")).sendKeys("Task-1");Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//tr[2]//input[@class='inputFieldWithPlaceholder']")).sendKeys("Task-2");Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//tr[3]//input[@class='inputFieldWithPlaceholder']")).sendKeys("Task-3");Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@id='createTasksPopup_commitBtn']//span[@class='buttonTitle']")).click();
			Thread.sleep(4000);
			log.info("created Task");

		}catch(Exception e)
		{

		}
	}
	@Test(priority=5)
	static void deleteTask()
	{
		try
		{
			getbrowser.navigate().refresh();
			for(int i=1;i<=3;i++)
			{
				log.info("Deleting Task"+i);
				getbrowser.findElement(By.xpath("//table[@class='taskRowsTable']//tr[1]//div[@class='title ellipsis']")).click();
				Thread.sleep(2000);		
				getbrowser.findElement(By.xpath("//div[@class='edit_task_sliding_panel sliding_panel']//div[@class='actionButton']")).click();Thread.sleep(1000);
				getbrowser.findElement(By.xpath("//div[@class='edit_task_sliding_panel sliding_panel']//div[@class='deleteButton']")).click();Thread.sleep(1000);
				getbrowser.findElement(By.xpath("//div[@class='edit_task_sliding_panel sliding_panel']//span[@id='taskPanel_deleteConfirm_submitTitle']")).click();
				Thread.sleep(1000);
				log.info("Deleted Task"+i);
			}

		}catch(Exception e)
		{

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
