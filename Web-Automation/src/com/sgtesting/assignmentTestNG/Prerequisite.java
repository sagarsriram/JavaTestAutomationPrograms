package com.sgtesting.assignmentTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class postrequisite
{
	public static WebDriver getbrowser=null;
	static void logout()
	{
		try
		{
			getbrowser.findElement(By.xpath("//a[@class='logout']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeBrowser()
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

 public class Prerequisite extends postrequisite {

	
	static void launchBrowserandNavigate()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\driver\\chromedriver.exe");
			getbrowser = new ChromeDriver();
			getbrowser.manage().window().maximize();
			Thread.sleep(1000);
			getbrowser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginAdmin()
	{
		try
		{
			getbrowser.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			getbrowser.findElement(By.xpath("//div[@id='gettingStartedShortcutsPanelId']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}

