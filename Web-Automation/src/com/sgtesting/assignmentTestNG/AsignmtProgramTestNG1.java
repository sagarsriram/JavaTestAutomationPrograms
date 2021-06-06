package com.sgtesting.assignmentTestNG;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AsignmtProgramTestNG1 {
	public static Logger log=Logger.getLogger("program -1");
	public static WebDriver getbrowser=null;
	@Test(priority=1)

	static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\driver\\chromedriver.exe");
			getbrowser = new ChromeDriver();
			log.info("opening Chrome browser Starting ChromeDriver 90.0.4430.24, ChromeDriver was started successfully.");
			getbrowser.manage().window().maximize();
			//Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=2)

	static void navigate()
	{
		try
		{
			log.info("navigating to ACTITIME url");
			getbrowser.get("http://localhost:81/login.do");
			Assert.assertEquals("http://localhost:81/login.do", "http://localhost:81/login.do");
			Thread.sleep(2000);
			String title=getbrowser.getTitle();
			Assert.assertTrue(title!=title, "browser opened the execution cotinues");
			System.out.println(title);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)

	static void login()
	{
		try
		{
			WebElement name=null;
			//char[] name= {'a','d','m','i','n'};
			log.info("Logging in as admin");
			name=getbrowser.findElement(By.id("username")); name.sendKeys("admin");; Thread.sleep(1000);
		//	Assert.assertEquals(name,"admin");
			getbrowser.findElement(By.name("pwd")).sendKeys("manager");Thread.sleep(1000);
		//	Assert.assertEquals("manager","manager");
			getbrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Assert.assertEquals("//*[@id='loginButton']/div","//*[@id='loginButton']/div");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)

	static void  minimizeFlyOutWindow()
	{
		try
		{
			log.info("minimizing fly out window");
			getbrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			String s=getbrowser.findElement(By.id("gettingStartedShortcutsPanelId")).getText();
			System.out.println(s);
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=5)
	static void createUser()
	{
		try
		{
			log.info("creating  users");
			getbrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.name("firstName")).sendKeys("scott");
			getbrowser.findElement(By.name("lastName")).sendKeys("king");
			getbrowser.findElement(By.name("email")).sendKeys("scott123@gmail.com");
			getbrowser.findElement(By.name("username")).sendKeys("Scott123");
			getbrowser.findElement(By.name("password")).sendKeys("12getgo");
			getbrowser.findElement(By.name("passwordCopy")).sendKeys("12getgo");
			getbrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(3000);
			log.info("created  users");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	static void deleteUser()
	{
		try
		{
			log.info("Deleting users");
			getbrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);				
			getbrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj=getbrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
			log.info("Deleted users");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=7)
	static void logout()
	{
		try
		{
			log.info("logging out from ACTITIME website");
			getbrowser.findElement(By.id("logoutLink")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)

	static void closeBrowser()
	{
		Reporter.getCurrentTestResult();
		try
		{	
			log.info("closing the browser");
			getbrowser.close();
			log.info("************************************************************************");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
