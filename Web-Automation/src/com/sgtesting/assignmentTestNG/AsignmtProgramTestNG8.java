package com.sgtesting.assignmentTestNG;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AsignmtProgramTestNG8 extends Prerequisite {
	public static Logger log=Logger.getLogger("program -8");
	public static WebElement add=null, fname=null, lname=null, email=null, uname=null, pwd=null, repwd=null, create=null, login=null, logout=null;

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
	static void create3Users()
	{	

		try
		{
			log.info("=====================================================================================================================");
			for(int i=1;i<=3;i++)
			{
				log.info("creating user "+i);
				getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
				add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();Thread.sleep(1000);
				fname=getbrowser.findElement(By.name("firstName"));		fname.sendKeys("user"+i);
				lname=getbrowser.findElement(By.name("lastName"));		lname.sendKeys("last"+i);
				email=getbrowser.findElement(By.name("email"));			email.sendKeys("user"+i+"@mail.com");
				uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user"+i);
				pwd=getbrowser.findElement(By.name("password"));		pwd.sendKeys("password"+i);
				repwd=getbrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password"+i);
				create=getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
				Thread.sleep(1500);
				log.info("created user "+i);
			}
			log.info("=====================================================================================================================");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	static void loginandlogoutuser1()
	{
		try
		{
			log.info("=====================================================================================================================");
			log.info("logging out as admin from ACTITIME website");
			postrequisite.logout();Thread.sleep(1000);
			log.info("logging in as user 1 ");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user1");		Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password1");	Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  Thread.sleep(2000);
			logout=getbrowser.findElement(By.linkText("Logout"));	logout.click(); 	Thread.sleep(1000);
			log.info("logging out as user 1  from ACTITIME website");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	static void loginandlogoutuser2()
	{
		try
		{
			log.info("logging in as user 2 ");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user2");		Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password2");	Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  Thread.sleep(2000);
			logout=getbrowser.findElement(By.linkText("Logout"));	logout.click(); Thread.sleep(200);
			log.info("logging out as user 2  from ACTITIME website");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	static void loginandlogoutuser3()
	{
		try
		{
			log.info("logging in as user 3 ");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user3");		Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password3");	Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  Thread.sleep(2000);
			logout=getbrowser.findElement(By.linkText("Logout"));	logout.click(); Thread.sleep(2000);
			log.info("logging out as user 3  from ACTITIME website");
			log.info("=====================================================================================================================");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6) 
	static void deleteUser()
	{
		try
		{	log.info("=====================================================================================================================");
			log.info("Logging in as admin");
			Prerequisite.loginAdmin();
			for(int i=1;i<=3;i++)
			{
				log.info("deleting user "+i);
				getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();		Thread.sleep(1000);
				getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]")).click(); 
				Thread.sleep(1500);
				getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();	Thread.sleep(1500);
				Alert check=getbrowser.switchTo().alert();	check.accept();	Thread.sleep(2000);
				log.info("deleted user "+i);
				
			}
			log.info("=====================================================================================================================");

			////*[@id="userListTableContainer"]/table/tbody/tr[1]- every time the row is shifted while deleting first in last out,
			//// therefore deleting the same row for every iteration.
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	static void postrequistes()
	{
		
		log.info("logging out from ACTITIME website");
		postrequisite.logout();
		log.info("closing the browser");
		log.info("************************************************************************");
		postrequisite.closeBrowser();

		
	}

}
