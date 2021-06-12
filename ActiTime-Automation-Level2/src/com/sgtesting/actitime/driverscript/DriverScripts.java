package com.sgtesting.actitime.driverscript;

import org.openqa.selenium.WebDriver;

import com.sgtesting.actitime.tests.Customers;
import com.sgtesting.actitime.tests.HomePage;
import com.sgtesting.actitime.tests.Initialization;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Projects;
import com.sgtesting.actitime.tests.Tasks;
import com.sgtesting.actitime.tests.Users;

public class DriverScripts {

	public static void main(String[] args) {
		WebDriver getbrowser=null;

		//Create User Scenario -1
		getbrowser=Initialization.launchBrowser();
		Initialization.navigate(getbrowser);
		LoginLogout.login(getbrowser);
		HomePage.minimizeFlyOutWindow(getbrowser);
		Users.createUser(getbrowser);
		Users.deleteUser(getbrowser);
		LoginLogout.logout(getbrowser);
		Initialization.closeApplication(getbrowser);

		//Modify User Scenario -2
		getbrowser=Initialization.launchBrowser();
		Initialization.navigate(getbrowser);
		LoginLogout.login(getbrowser);
		HomePage.minimizeFlyOutWindow(getbrowser);
		Users.createUser(getbrowser);
		Users.modifyUser(getbrowser);
		Users.deleteUser(getbrowser);
		LoginLogout.logout(getbrowser);
		Initialization.closeApplication(getbrowser);

		//Create Customer Scenario -3
		getbrowser=Initialization.launchBrowser();
		Initialization.navigate(getbrowser);
		LoginLogout.login(getbrowser);
		HomePage.minimizeFlyOutWindow(getbrowser);
		Customers.createCustomer(getbrowser);
		Customers.deleteCustomer(getbrowser);
		LoginLogout.logout(getbrowser);
		Initialization.closeApplication(getbrowser);

		//Modify Customer Scenario -4
		getbrowser=Initialization.launchBrowser();
		Initialization.navigate(getbrowser);
		LoginLogout.login(getbrowser);
		HomePage.minimizeFlyOutWindow(getbrowser);
		Customers.createCustomer(getbrowser);
		Customers.modifyCustomer(getbrowser);
		Customers.deleteCustomer(getbrowser);
		LoginLogout.logout(getbrowser);
		Initialization.closeApplication(getbrowser);

		//Create Project Scenario -5
		getbrowser=Initialization.launchBrowser();
		Initialization.navigate(getbrowser);
		LoginLogout.login(getbrowser);
		HomePage.minimizeFlyOutWindow(getbrowser);
		Customers.createCustomer(getbrowser);
		Projects.createProject(getbrowser);
		Projects.deleteProject(getbrowser);
		Customers.deleteCustomer(getbrowser);
		LoginLogout.logout(getbrowser);
		Initialization.closeApplication(getbrowser);

		//Modify Project Scenario -6
		getbrowser=Initialization.launchBrowser();
		Initialization.navigate(getbrowser);
		LoginLogout.login(getbrowser);
		HomePage.minimizeFlyOutWindow(getbrowser);
		Customers.createCustomer(getbrowser);
		Projects.createProject(getbrowser);
		Projects.modifyProject(getbrowser);
		Projects.deleteProject(getbrowser);
		Customers.deleteCustomer(getbrowser);
		LoginLogout.logout(getbrowser);
		Initialization.closeApplication(getbrowser);

		//Create Tasks -7
		getbrowser=Initialization.launchBrowser();
		Initialization.navigate(getbrowser);
		LoginLogout.login(getbrowser);
		HomePage.minimizeFlyOutWindow(getbrowser);
		Customers.createCustomer(getbrowser);
		Projects.createProject(getbrowser);
		Tasks.createTasks(getbrowser);
		Tasks.deleteTasks(getbrowser);
		Customers.deleteCustomer(getbrowser);
		LoginLogout.logout(getbrowser);
		Initialization.closeApplication(getbrowser);



	}

}
