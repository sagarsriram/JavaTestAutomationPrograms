package com.sgtesting.assignment1;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMb1advanceassignment {
	protected static WebDriver getbrowser=null;
	protected static POMactitimeDemo getpage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginAdmin();
		minimizeFlyOutWindow();
		create3Users();
		logout();
		loginUserandLogout();
		loginAdmin();
		minimizeFlyOutWindow();
		deleteAll3Users();
		closeBrowser();

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
	static void loginAdmin()
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
	static void create3Users()
	{
		try
		{
			for(int i=1;i<=3;i++)
			{
				getpage.getusersradiobutton().click();	
				getpage.getaddusersradiobutton().click();Thread.sleep(1000);	
				getpage.getfirstname().sendKeys("user"+i);
				getpage.getlastname().sendKeys("lastname"+i);
				getpage.getemail().sendKeys("user"+i+"@gmai.com");
				getpage.getusername().sendKeys("user"+i);
				getpage.getpasswordcreateuser().sendKeys("password"+i);
				getpage.getpasswordCopy().sendKeys("password"+i);
				getpage.getusercreationcommitbtn().click();		Thread.sleep(1000);
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void loginUserandLogout()
	{
		try
		{
			for(int i=1;i<=3;i++)
			{
				getpage.getusername().sendKeys("user"+i);Thread.sleep(1000);
				getpage.getpasswordlogin().sendKeys("password"+i);Thread.sleep(1000);
				getpage.getloginbutton().click();Thread.sleep(2000);
				try
				{
					getpage.getwelcomescreenbox().click();Thread.sleep(1000);
					
				}catch(NoSuchElementException e)
				{
					e.printStackTrace();
				}
				getpage.getlogoutLink().click();Thread.sleep(1000);		
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteAll3Users()
	{
		try
		{

			for(int i=1;i<=3;i++)
			{
				getpage.getusersradiobutton().click();Thread.sleep(1000);
				getpage.getuserlistselectfromtablerow1().click();Thread.sleep(1000);
				getpage.getUserdataDeleteBtn().click();Thread.sleep(1000);
				getbrowser.switchTo().alert().accept();Thread.sleep(1000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			getpage.getlogoutLink().click();
			Thread.sleep(1500);
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
