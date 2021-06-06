package com.sgtesting.assignment1;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// ASSIGNMENT 1). lanchBrowser --> navigate --> login --> createUser --> deleteUser --> logout --> closeApplication

public class A1AssignmentAutomation {
	public static WebDriver getbrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
	/*	login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeBrowser();*/

	}
	public static Logger log=Logger.getLogger("For Loop Output");
	static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\driver\\chromedriver.exe");
			getbrowser = new ChromeDriver();
			log.info("The Execution  Here!!!!!");
			getbrowser.manage().window().maximize();
			//Thread.sleep(2000);
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
	static void navigate()
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
	static void login()
	{
		try
		{
			getbrowser.findElement(By.id("username")).sendKeys("admin");
			getbrowser.findElement(By.name("pwd")).sendKeys("manager");
			getbrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			getbrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			getbrowser.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser()
	{
		try
		{
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
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			getbrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);				
			getbrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj=getbrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
}
