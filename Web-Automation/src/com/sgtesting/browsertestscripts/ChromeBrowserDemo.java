package com.sgtesting.browsertestscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {

	//public  WebDriver oBrowser4=null;
	//public WebDriver oBrowser1=null;
	//public WebDriver oBrowser2=null;
	//public WebDriver oBrowser3=null;
	public  static WebDriver oBrowser=null;		
	public static void main(String[] args) {
	
		launchBrowser();
		navigate();
	//calling by obj outside method		
		//launchBrowser1();
		//navigate1();
	//calling by obj inside method		
		//launchBrowserandnavigate2();
	//calling using obj created for main class
		//ChromeBrowserDemo obj=new ChromeBrowserDemo();
		//obj.launchBrowser3();
		//obj.navigate3();
		
		

	}
	
	static void  launchBrowser()
	{
		String path=null;

		try
		{
			path=System.getProperty("user.dir");
			System.out.println(path);
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\driver\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "D:\\TestAutomation\\Automation\\Web-Automation"+"\\Library\\driver\\chromedriver.exe");	
			//WebDriver obj=new ChromeDriver(); --> can create obj and access directly if only one method means
			oBrowser =new ChromeDriver();
		}catch(Exception e)
		{

			e.printStackTrace();
		}

	}
	static void navigate()
	{
		try	
		{
		ChromeDriver obj=new ChromeDriver();
		
		//oBrowser.get("http://localhost:81/login.do");
		oBrowser.get("https://www.youtube.com");
		String name=oBrowser.getCurrentUrl();
		//String name1 =oBrowser.getPageSource();
		System.out.println(name);
		//System.out.println(name1);
		obj.quit();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
/*	// 2nd method to call by creating obj outside the methods
	static ChromeBrowserDemo obj=new ChromeBrowserDemo();
	static void  launchBrowser1()
	{
		String path=null;

		try
		{

			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\driver\\chromedriver.exe");
			System.out.println(path);

			obj.oBrowser1 =new ChromeDriver();
		}catch(Exception e)
		{

			e.printStackTrace();
		}

	}
	static void navigate1()
	{
		try	
		{
			obj.oBrowser1.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//3rd method using obj inside methods
	static void  launchBrowserandnavigate2()
	{
		String path=null;

		try
		{
			ChromeBrowserDemo obj=new ChromeBrowserDemo();
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\driver\\chromedriver.exe");
			System.out.println(path);
			obj.oBrowser2 =new ChromeDriver();
			obj.oBrowser2.get("http://localhost:81/login.do");
		}catch(Exception e)
		{

			e.printStackTrace();
		}

	}
	// 4th method make everthing non-static
	ChromeBrowserDemo obj3=new ChromeBrowserDemo();
	void launchBrowser3()
	{
		String path=null;

		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\driver\\chromedriver.exe");
			System.out.println(path);
			obj3.oBrowser3 =new ChromeDriver();

		}catch(Exception e)
		{

			e.printStackTrace();
		}

	}
	void navigate3()
	{
		try	
		{
			obj3.oBrowser3.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} */

}

