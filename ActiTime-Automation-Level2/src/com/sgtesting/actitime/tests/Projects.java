package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Projects {
	
	/**
	 * Test case ID:
	 * Test case Name:
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * return Value:
	 * Purpose:
	 * Description:
	 */
	public static void createProject(WebDriver getbrowser)
	{
		try
		{
			getbrowser.findElement(By.xpath("//div[@class='addNewContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@class='item createNewProject ellipsis']")).click();
			Thread.sleep(1000);			
			getbrowser.findElement(By.xpath("//input[@id='projectPopup_projectNameField']")).sendKeys("New-Project");Thread.sleep(1000);	
			getbrowser.findElement(By.xpath("//div[@id='projectPopup_footer']//span[@class='buttonTitle']")).click();Thread.sleep(1000);	

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Test case ID:
	 * Test case Name:
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * return Value:
	 * Purpose:
	 * Description:
	 */
	public static void modifyProject(WebDriver getbrowser)
	{
		try
		{
			getbrowser.findElement(By.xpath("//div[@class='node projectNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//textarea[@class='textarea'][@placeholder='Enter project description...']")).sendKeys("Project description");
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='closeButton']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Test case ID:
	 * Test case Name:
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * return Value:
	 * Purpose:
	 * Description:
	 */
	public static void deleteProject(WebDriver getbrowser)
	{
		try
		{
			getbrowser.findElement(By.xpath("//div[@class='node projectNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='action']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='deleteButton']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//span[@id='projectPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
