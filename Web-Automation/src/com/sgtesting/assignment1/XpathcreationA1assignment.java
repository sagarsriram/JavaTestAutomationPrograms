package com.sgtesting.assignment1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathcreationA1assignment {

	public static WebDriver getbrowser=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
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

	static void createUser()
	{
		try
		{
			getbrowser.findElement(By.xpath("//td[@class='navItem navCell relative notSelected']//a[@class='content users']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='buttonText']")).click();
			Thread.sleep(2000);
			getbrowser.findElement(By.xpath("//div[@class='inputGroup']//input[@name='firstName']")).sendKeys("scott");
			getbrowser.findElement(By.xpath("//input[@type='text'and@name='lastName']")).sendKeys("king");
			getbrowser.findElement(By.xpath("//input[@type='text'and@name='email']")).sendKeys("scott123@gmail.com");
			getbrowser.findElement(By.xpath("//input[@type='text'and@name='username']")).sendKeys("Scott123");
			getbrowser.findElement(By.xpath("//input[@type='password'and@name='password']")).sendKeys("12getgo");
			getbrowser.findElement(By.xpath("//input[@type='password'and@name='passwordCopy']")).sendKeys("12getgo");
			getbrowser.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			getbrowser.navigate().refresh();
			getbrowser.findElement(By.xpath("//tr[1]//td[@class='userNameCell first']")).click();
			Thread.sleep(2000);				
			getbrowser.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			Alert obj=getbrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(1000);
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