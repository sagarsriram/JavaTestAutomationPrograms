package com.sgtesting.assignment1;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMb2advanceassignment {
	protected static WebDriver getbrowser=null;
	protected static POMactitimeDemo getpage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginAdmin();
		minimizeFlyOutWindow();
		//creating users
		createUser1();logout();loginuser1();
		createUser2();logout();loginuser2();
		createUser3();logout(); 
		//modifying users	
		loginAdmin(); modifyUser1();	logout();
		loginuser1(); modifyUser2();logout(); 
		loginuser2(); modifyUser3();logout(); 
		//deleting users 
		loginuser2();deleteuser3();logout(); 
		loginuser1();deleteuser2();logout();
		loginAdmin();deleteuser1();
		logout();
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
	static void createUser1()
	{
		try
		{
			getpage.getusersradiobutton().click();	
			getpage.getaddusersradiobutton().click();Thread.sleep(1000);	
			getpage.getfirstname().sendKeys("user1");
			getpage.getlastname().sendKeys("lastname1");
			getpage.getemail().sendKeys("user1@gmai.com");
			getpage.getusername().sendKeys("user1");
			getpage.getpasswordcreateuser().sendKeys("password1");
			getpage.getpasswordCopy().sendKeys("password1");
			getpage.getusercreationcommitbtn().click();		Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginuser1()
	{
		try
		{
			getpage.getusername().sendKeys("user1"); Thread.sleep(1000);
			getpage.getpasswordlogin().sendKeys("password1");Thread.sleep(1000);
			getpage.getloginbutton().click();	Thread.sleep(1000);
			getpage.getwelcomescreenbox().click();Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser2()
	{	

		try
		{
			getpage.getusersradiobutton().click();	
			getpage.getaddusersradiobutton().click();Thread.sleep(1000);	
			getpage.getfirstname().sendKeys("user2");
			getpage.getlastname().sendKeys("lastname2");
			getpage.getemail().sendKeys("user2@gmai.com");
			getpage.getusername().sendKeys("user2");
			getpage.getpasswordcreateuser().sendKeys("password2");
			getpage.getpasswordCopy().sendKeys("password2");
			getpage.getusercreationcommitbtn().click();		Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginuser2()
	{
		try
		{
			getpage.getusername().sendKeys("user2"); Thread.sleep(1000);
			getpage.getpasswordlogin().sendKeys("password2");Thread.sleep(1000);
			getpage.getloginbutton().click();	Thread.sleep(1000);
			getpage.getwelcomescreenbox().click();Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser3()
	{	

		try
		{
			getpage.getusersradiobutton().click();	
			getpage.getaddusersradiobutton().click();Thread.sleep(1000);	
			getpage.getfirstname().sendKeys("user3");
			getpage.getlastname().sendKeys("lastname3");
			getpage.getemail().sendKeys("user3@gmai.com");
			getpage.getusername().sendKeys("user3");
			getpage.getpasswordcreateuser().sendKeys("password3");
			getpage.getpasswordCopy().sendKeys("password3");
			getpage.getusercreationcommitbtn().click();		Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser1()
	{
		try
		{
			getpage.getusersradiobutton().click();	Thread.sleep(1000);
			getpage.getuserlistselectfromtablerow1().click();Thread.sleep(2000);
			getpage.getlastname().clear(); getpage.getlastname().sendKeys("lastname1a");Thread.sleep(1000);
			getpage.getemail().clear();getpage.getemail().sendKeys("usernew1@gmai.com");Thread.sleep(1000);
			getpage.getuseraltertedcommitbtn().click();Thread.sleep(1000);Thread.sleep(1000);
			//getbrowser.navigate().refresh();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	static void modifyUser2()
	{
		try
		{
			getpage.getusersradiobutton().click();		Thread.sleep(1000);
			getpage.getuserlistselectfromtablerow2().click();Thread.sleep(1000);
			getpage.getlastname().clear(); getpage.getlastname().sendKeys("lastname2b");Thread.sleep(1000);
			getpage.getemail().clear();getpage.getemail().sendKeys("usernew2@gmai.com");Thread.sleep(1000);
			getpage.getuseraltertedcommitbtn().click();Thread.sleep(1000);Thread.sleep(1000);
			//getbrowser.navigate().refresh();
		}catch(Exception e)
		{

		}
	}

	static void modifyUser3()
	{
		try
		{	
			getpage.getusersradiobutton().click();		Thread.sleep(1000);
			getpage.getuserlistselectfromtablerow3().click();Thread.sleep(1000);
			getpage.getlastname().clear(); getpage.getlastname().sendKeys("lastname3c");Thread.sleep(1000);
			getpage.getemail().clear();getpage.getemail().sendKeys("usernew3@gmai.com");Thread.sleep(1000);
			getpage.getuseraltertedcommitbtn().click();Thread.sleep(1000);Thread.sleep(1000);
			//getbrowser.navigate().refresh();
		}catch(Exception e)
		{

		}
	}

	static void deleteuser3()
	{
		try
		{
			getpage.getusersradiobutton().click();		Thread.sleep(1000);
			getpage.getuserlistselectfromtablerow3().click(); Thread.sleep(2000);	
			getpage.getUserdataDeleteBtn().click();	Thread.sleep(2000);	
			Alert obj=getbrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser2()
	{
		try
		{
			getpage.getusersradiobutton().click();		Thread.sleep(1000);
			getpage.getuserlistselectfromtablerow2().click();	Thread.sleep(2000);	
			getpage.getUserdataDeleteBtn().click();	Thread.sleep(2000);	
			Alert obj=getbrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser1()
	{
		try
		{
			getpage.getusersradiobutton().click();		Thread.sleep(1000);
			getpage.getuserlistselectfromtablerow1().click();	Thread.sleep(2000);	
			getpage.getUserdataDeleteBtn().click();	Thread.sleep(2000);	
			Alert obj=getbrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);

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
