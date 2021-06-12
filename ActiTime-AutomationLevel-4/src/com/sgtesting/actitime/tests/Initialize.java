package com.sgtesting.actitime.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Initialize {
	public static WebDriver getbrowser=null;
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
	public static WebDriver launchBrowser()
	{
		try
		{
			String sPath=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", sPath+"\\Library\\drivers\\chromedriver.exe");
			getbrowser=new ChromeDriver();
			getbrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return getbrowser;
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
	public static void navigate(WebDriver getbrowser)
	{
		try
		{
			getbrowser.get("http://localhost:81/login.do");
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
	public static void closeApplication(WebDriver getbrowser)
	{
		try
		{
			getbrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
