package com.sgtesting.assignmentTestNG;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class AsignmtProgramTestNG2 extends Prerequisite {
	public static Logger log=Logger.getLogger("program -2");
	@Test(priority=1)
	static void runPrerequisite()
	{
		log.info("opening Chrome browser Starting ChromeDriver 90.0.4430.24, ChromeDriver was started successfully.");
		log.info("navigating to ACTITIME url");
		Prerequisite.launchBrowserandNavigate();
		log.info("Logging in as admin");
		Prerequisite.loginAdmin();
		log.info("minimizing fly out window");
		Prerequisite.minimizeFlyOutWindow();
		try
		{
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	static void createUser()
	{
	
		try
		{
			log.info("creating  users");
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
			log.info("created  users");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	static void modifyUser()
	{
		try
		{
			log.info("modifying  users");
			getbrowser.navigate().refresh();Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//tr[1]//td[@class='userNameCell first']")).click();Thread.sleep(2000);	
			getbrowser.findElement(By.xpath("//div[@class='inputGroup']//input[@name='firstName']")).sendKeys("scottnew");
			getbrowser.findElement(By.xpath("//input[@type='text'and@name='lastName']")	).sendKeys("kingnew");
			getbrowser.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']//div//span[@class='buttonTitle']")).click();
			Thread.sleep(2000);
			log.info("modidfied   users");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void deleteUser()
	{
		try
		{
			log.info("Deleting users");
			getbrowser.navigate().refresh();
			getbrowser.findElement(By.xpath("//tr[1]//td[@class='userNameCell first']")).click();
			Thread.sleep(2000);				
			getbrowser.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
			Thread.sleep(2000);
			Alert obj=getbrowser.switchTo().alert();
			obj.accept();
			Thread.sleep(1000);
			log.info("Deleted users");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=5)
	static void postrequistes()
	{
		log.info("logging out from ACTITIME website");
		postrequisite.logout();
		log.info("closing the browser");
		log.info("************************************************************************");
		postrequisite.closeBrowser();
		
	}

}
