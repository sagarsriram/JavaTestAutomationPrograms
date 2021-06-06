package com.sgtesting.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathcreationA7assignment {
	public static WebDriver getbrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		createTask();
		deleteTask();
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
	static void createTask()
	{
		try
		{
			getbrowser.findElement(By.xpath("//div[@class='addNewTaskButtonContainer']//div[@class='addNewButton']//div[@class='title ellipsis']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='item createNewTask ellipsis']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//tr[1]//input[@class='inputFieldWithPlaceholder']")).sendKeys("Task-1");Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//tr[2]//input[@class='inputFieldWithPlaceholder']")).sendKeys("Task-2");Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//tr[3]//input[@class='inputFieldWithPlaceholder']")).sendKeys("Task-3");Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//div[@id='createTasksPopup_commitBtn']//span[@class='buttonTitle']")).click();
			Thread.sleep(4000);


		}catch(Exception e)
		{

		}
	}
	static void deleteTask()
	{
		try
		{
			getbrowser.navigate().refresh();
			for(int i=1;i<=3;i++)
			{
				getbrowser.findElement(By.xpath("//table[@class='taskRowsTable']//tr[1]//div[@class='title ellipsis']")).click();
				Thread.sleep(2000);		
				getbrowser.findElement(By.xpath("//div[@class='edit_task_sliding_panel sliding_panel']//div[@class='actionButton']")).click();Thread.sleep(1000);
				getbrowser.findElement(By.xpath("//div[@class='edit_task_sliding_panel sliding_panel']//div[@class='deleteButton']")).click();Thread.sleep(1000);
				getbrowser.findElement(By.xpath("//div[@class='edit_task_sliding_panel sliding_panel']//span[@id='taskPanel_deleteConfirm_submitTitle']")).click();
				Thread.sleep(1000);
			}
		
		}catch(Exception e)
		{

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
