package com.sgtesting.actitime.driverscript;

import com.sgtesting.actitime.tests.Customers;
import com.sgtesting.actitime.tests.HomePage;
import com.sgtesting.actitime.tests.Initialization;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Projects;
import com.sgtesting.actitime.tests.Tasks;
import com.sgtesting.actitime.tests.Users;

public class DriverScripts {

	public static void main(String[] args) {

		//Create User Scenario -1
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Users.createUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialization.closeApplication();

		//Modify User Scenario -2
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Users.createUser();
		Users.modifyUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialization.closeApplication();

		//Create Customer Scenario -3
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialization.closeApplication();

		//Modify Customer Scenario -4
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Customers.modifyCustomer();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialization.closeApplication();

		//Create Project Scenario -5
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Projects.createProject();
		Projects.deleteProject();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialization.closeApplication();

		//Modify Project Scenario -6
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Projects.createProject();
		Projects.modifyProject();
		Projects.deleteProject();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialization.closeApplication();

		//Create Tasks -7
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Projects.createProject();
		Tasks.createTasks();
		Tasks.deleteTasks();
		LoginLogout.logout();
		Initialization.closeApplication();

	}

}
