package com.sgtesting.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathcreationA6assignment {
	public static WebDriver getbrowser=null;

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
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\driver\\chromedriver.exe");
			getbrowser = new ChromeDriver();
			getbrowser.manage().window().maximize();
			Thread.sleep(1000);
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
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
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
	static void createCustomer()
	{
		try
		{
			getbrowser.findElement(By.xpath("//td[@class='navItem navCell relative notSelected']//a[@class='content tasks']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='addNewContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("Google");
			getbrowser.findElement(By.xpath("//div[@id='customerLightBox_commitBtn']//div//span[@class='buttonTitle']")).click();Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void createProject()
	{
		try
		{	
			getbrowser.findElement(By.xpath("//div[@class='addNewContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@class='item createNewProject ellipsis']")).click();
			Thread.sleep(1000);			
			getbrowser.findElement(By.xpath("//input[@id='projectPopup_projectNameField']")).sendKeys("New-Project");Thread.sleep(1000);	
			getbrowser.findElement(By.xpath("//div[@id='projectPopup_footer']//span[@class='buttonTitle']")).click();Thread.sleep(1000);	

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void modifyProject()
	{
		try
		{
			getbrowser.findElement(By.xpath("//div[@class='node projectNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//textarea[@class='textarea'][@placeholder='Enter project description...']")).sendKeys("Project description");
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='closeButton']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void deleteProject()
	{
		try
		{
			getbrowser.findElement(By.xpath("//div[@class='node projectNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='action']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='deleteButton']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//span[@id='projectPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteCustomer()
	{
		try
		{

			getbrowser.findElement(By.xpath("//div[@class='node customerNode notSelected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);		
			getbrowser.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='img']/following-sibling::div[@class='action']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@class='dropdownContainer actionsMenu']//div//div[@class='deleteButton'][@style='display: inline-block;']")).click();
			Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//span[@id='customerPanel_deleteConfirm_submitTitle']")).click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	static void logout()
	{
		try
		{
			getbrowser.findElement(By.xpath("//a[@class='logout']")).click(); Thread.sleep(1000);
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
