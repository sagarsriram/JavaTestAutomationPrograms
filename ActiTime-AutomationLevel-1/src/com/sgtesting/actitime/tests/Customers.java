package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;

public class Customers extends Initialization{
	
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
	public static void createCustomer()
	{
		try
		{
			getbrowser.findElement(By.xpath("//td[@class='navItem navCell relative notSelected']//a[@class='content tasks']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='addNewContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("Google");
			getbrowser.findElement(By.xpath("//div[@id='customerLightBox_commitBtn']//div//span[@class='buttonTitle']")).click();Thread.sleep(1000);
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
	public static void modifyCustomer()
	{
		try
		{
			getbrowser.findElement(By.xpath("//div[@class='node customerNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);				
			getbrowser.findElement(By.xpath("//textarea[@class='textarea'][@placeholder='Enter customer description...']")).sendKeys("Customer-Descrption");
			Thread.sleep(2000);	
			getbrowser.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div//div[@class='closeButton']")).click();
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
	public static void deleteCustomer()
	{
		try
		{
			getbrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
