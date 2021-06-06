package com.sgtesting.assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM6assignment {

	protected static WebDriver getbrowser=null;
	protected static POMactitimeDemo getpage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
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
	static void createCustomer()
	{
		try
		{
			getpage.gettaskRadioButton().click();Thread.sleep(2000);
			getpage.getaddCstmrorProjectRadioButton().click();
			getpage.getaddCustomrtRadioButton().click();
			getpage.getCustomernamefield().sendKeys("customer1");
			Thread.sleep(2000);
			getpage.getcustomercreationcommitbutton().click(); Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void createProject()
	{
		try
		{
			getpage.getaddCstmrorProjectRadioButton().click();Thread.sleep(2000);
			getpage.getaddProjectRadioButton().click();Thread.sleep(2000);
			getpage.getProjectnamefield().sendKeys("New-project");Thread.sleep(2000);
			getpage.getProjectcreationcommitbutton().click();Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyProject()
	{
		try
		{
			getpage.getProjectsettingsbutton().click();
			getpage.getmodifyProjectdescrptionarea().sendKeys("project descritption");Thread.sleep(2000);
			getpage.getProjectsettingclosebutton().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteProject()
	{
		try
		{
			getbrowser.navigate().refresh();Thread.sleep(2000);
			getpage.getProjectsettingsbutton().click();Thread.sleep(2000);
			getpage.getProjectsettingActionButton().click();Thread.sleep(1000);
			getpage.getProjectdeleteButton().click();Thread.sleep(1000);
			getpage.getprojectdeleteConfirmatinButton().click();Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteCustomer()
	{
		try
		{
			getbrowser.navigate().refresh();Thread.sleep(2000);
			getpage.getcustomersettingsbutton().click();Thread.sleep(2000);
			getpage.getcustomersettingActionButton().click(); Thread.sleep(2000);
			getpage.getcustomerdeleteButton().click();Thread.sleep(1000);
			getpage.getcustomerConfirmationdeleteButton().click();Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			getpage.getlogoutLink().click();Thread.sleep(1000);
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