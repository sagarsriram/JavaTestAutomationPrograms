package com.sgtesting.assignment1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM2assignment {
public static WebDriver getbrowser=null;
public static POMactitimeDemo getpage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
		closeBrowser();
		logout();
		
	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\TestAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			getbrowser= new ChromeDriver();
			getbrowser.manage().window().maximize();
			getpage=new POMactitimeDemo(getbrowser);

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
			getpage.getusername().sendKeys("admin");
			getpage.getpasswordlogin().sendKeys("manager");
			getpage.getloginbutton().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			
			getpage.getminimizepanelid().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser()
	{
		try
		{
			getpage.getusersradiobutton().click();	
			getpage.getaddusersradiobutton().click();Thread.sleep(2000);	
			getpage.getfirstname().sendKeys("user1");
			getpage.getlastname().sendKeys("lastname1");
			getpage.getemail().sendKeys("user1@gmai.com");
			getpage.getusername().sendKeys("user1");
			getpage.getpasswordcreateuser().sendKeys("password1");
			getpage.getpasswordCopy().sendKeys("password1");
			getpage.getusercreationcommitbtn().click();		Thread.sleep(3000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser()
	{
		try
		{
			getpage.getuserlistselectfromtable().click();Thread.sleep(2000);
			getpage.getusername().sendKeys("new");
			getpage.getlastname().sendKeys("new");
			getpage.getuseraltertedcommitbtn().click();Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			getpage.getuserlistselectfromtable().click(); Thread.sleep(2000);	
			getpage.getUserdataDeleteBtn().click();	Thread.sleep(2000);	
			Alert obj=getbrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			getpage.getlogoutLink().click();;
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