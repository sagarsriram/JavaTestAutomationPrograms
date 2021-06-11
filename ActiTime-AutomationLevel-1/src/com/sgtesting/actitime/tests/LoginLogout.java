package com.sgtesting.actitime.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginLogout extends Initialization{
	
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
	public static void login()
	{
		try
		{
			getbrowser.findElement(By.id("username")).sendKeys("admin");
			getbrowser.findElement(By.name("pwd")).sendKeys("manager");
			getbrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
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
	public static void logout()
	{
		try
		{
			getbrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
