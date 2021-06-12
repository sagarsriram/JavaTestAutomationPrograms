package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tasks {
	
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
	public static void createTasks(WebDriver getbrowser)
	{
		try
		{
			getbrowser.findElement(By.xpath("//div[@class='addNewTaskButtonContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='item createNewTask ellipsis']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//tr[1]//input[@class='inputFieldWithPlaceholder']")).sendKeys("Task-1");Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//tr[2]//input[@class='inputFieldWithPlaceholder']")).sendKeys("Task-2");Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//tr[3]//input[@class='inputFieldWithPlaceholder']")).sendKeys("Task-3");Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@id='createTasksPopup_commitBtn']//span[@class='buttonTitle']")).click();
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
	public static void modifyTasks(WebDriver getbrowser)
	{
		try
		{
			
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
	public static void deleteTasks(WebDriver getbrowser)
	{
		try
		{
			getbrowser.navigate().refresh();
			for(int i=1;i<=3;i++)
			{
				getbrowser.findElement(By.xpath("//table[@class='taskRowsTable']//tr[1]//div[@class='title ellipsis']")).click();
				Thread.sleep(2000);		
				getbrowser.findElement(By.xpath("//div[@class='edit_task_sliding_panel sliding_panel']//div[@class='actionButton']")).click();Thread.sleep(1000);
				getbrowser.findElement(By.xpath("//div[@class='edit_task_sliding_panel sliding_panel']//div[@class='deleteButton']")).click();Thread.sleep(1000);
				getbrowser.findElement(By.xpath("//div[@class='edit_task_sliding_panel sliding_panel']//span[@id='taskPanel_deleteConfirm_submitTitle']")).click();
				Thread.sleep(1000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
