package com.sgtesting.assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMactitimeDemo {

	protected POMactitimeDemo(WebDriver getbrowser)
	{
		PageFactory.initElements(getbrowser, this);
	}
	//Create WebElement for UserName text field
	private WebElement username;
	public WebElement getusername()
	{
		return  username;
	}
	//Create WebElement for password text field
	private WebElement pwd;
	public WebElement getpasswordlogin()
	{
		return  pwd;
	}
	//Create WebElement for usercreation username text field
	private WebElement firstName;
	public WebElement getfirstname()
	{
		return  firstName;
	}
	//Create WebElement for usercreation lastname text field
	private WebElement lastName;
	public WebElement getlastname()
	{
		return  lastName;
	}
	//Create WebElement for usercreation email text field
	private WebElement email;
	public WebElement getemail()
	{
		return  email;
	}
	//Create WebElement for usercreation passwordcopy text field
	private WebElement password;
	public WebElement getpasswordcreateuser()
	{
		return  password;
	}
	//Create WebElement for usercreation passwordcopy text field
	private WebElement passwordCopy;
	public WebElement getpasswordCopy()
	{
		return  passwordCopy;
	}
	//Create WebElement for login button
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement BtnLogin;
	public WebElement getloginbutton()
	{
		return BtnLogin;
	}
	//Create WebElement for minimize window pannel 
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getminimizepanelid()
	{
		return gettingStartedShortcutsPanelId;
	}
	//Create WebElement for welcomescreen box pop up  
	@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
	private WebElement welcomescreenbox;
	public WebElement getwelcomescreenbox()
	{
		return welcomescreenbox;
	}
	
	
	//************************************************************************
	//Create WebElement for USERS creation radio button on mainpage
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement usersradiobutton;
	public WebElement getusersradiobutton()
	{
		return usersradiobutton;
	}
	//Create WebElement for user creation add user button
	@FindBy(xpath="//*[@id='createUserDiv']/div/div[2]")
	private WebElement addusersradiobutton;
	public WebElement getaddusersradiobutton()
	{
		return addusersradiobutton;
	}
	//Create WebElement for user creation committ button after creating user 
	@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
	private WebElement usercreationcommitbtn;
	public WebElement getusercreationcommitbtn()
	{
		return usercreationcommitbtn;
	}
	//Create WebElement to select the userlist name from the userlist table
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")	
					//*[@id="userListTableContainer"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]
					//*[@id="userListTableContainer"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]
					//*[@id="userListTableContainer"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]
	private WebElement userlistselectfromtable;
	public WebElement getuserlistselectfromtable()
	{
		return userlistselectfromtable;
	}
	//@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]")
	private WebElement userlistselectfromtablerow1;
	public WebElement getuserlistselectfromtablerow1()
	{
		return userlistselectfromtablerow1;
	}
	//@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]")
	private WebElement userlistselectfromtablerow2;
	public WebElement getuserlistselectfromtablerow2()
	{
		return userlistselectfromtablerow2;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]")
	//*[@id="userListTableContainer"]/table/tbody/tr[1]

	private WebElement userlistselectfromtablerow3;
	public WebElement getuserlistselectfromtablerow3()
	{
		return userlistselectfromtablerow3;
	}
	
	
	//Create WebElement for  delete button to delete created user from exsiting table after selecting the respective user  
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getUserdataDeleteBtn()
	{
		return  userDataLightBox_deleteBtn;
	}
	//create WebElement for commitbutton after altering the user created data.
	@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
	private WebElement useraltertedcommitbtn;
	public WebElement getuseraltertedcommitbtn()
	{
		return useraltertedcommitbtn;
	}
	//create WebElement for logout radio button
	private WebElement logoutLink;
	public WebElement getlogoutLink()
	{
		return logoutLink;
	}
	//create WebElement for TASKS(customer&project) creation radio button on mainpage
	@FindBy(xpath="//*[@id='topnav']/tbody/tr/td[3]/a/div[2]")
	private WebElement taskRadioButton;
	public WebElement gettaskRadioButton()
	{
		return taskRadioButton;
	}
	//create WebElement for TASKS(customer/project) addcustomer/project radio button on taskpage
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement addCstmrorProjectRadioButton;
	public WebElement getaddCstmrorProjectRadioButton()
	{
		return addCstmrorProjectRadioButton;
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	//create WebElement for  addcustomer radio button on taskpage
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement addCustomerRadioButton;
	public WebElement getaddCustomrtRadioButton()
	{
		return addCustomerRadioButton;
	}
	//create WebElement for Customer name field
	private WebElement customerLightBox_nameField;
	public WebElement getCustomernamefield()
	{
		return customerLightBox_nameField;
	}
	//create WebElement for commit button after creation of customer
	@FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]/div/span")
	private WebElement customercreationcommitbutton;
	public WebElement getcustomercreationcommitbutton()
	{
		return customercreationcommitbutton;
	}
	//create WebElement of settings for created customer
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement customersettingsbutton;
	public WebElement getcustomersettingsbutton()
	{
		return customersettingsbutton;
	}
	//create WebElement modifying customer by wrirint in description area
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement modifycusomterdescrptionarea;
	public WebElement getcusomtermodifydescrptionarea()
	{
		return modifycusomterdescrptionarea;
	}
	//create WebElement for close button for selected customer settings
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
	private WebElement customersettingclosebutton;
	public WebElement getcustomersettingclosebutton()
	{
		return customersettingclosebutton;
	}
	//create WebElement for customer setting action drop down button
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")
	private WebElement customersettingActionButton;
	public WebElement getcustomersettingActionButton()
	{
		return customersettingActionButton;
	}
	//create WebElement for delet customer buttom
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	//*[@id="taskListBlock"]/div[2]/div[4]/div/div[3]/div
	//*[@id="taskListBlock"]/div[2]/div[4]/div/div[3]
	private WebElement customerdeleteButton;  
	public WebElement getcustomerdeleteButton()
	{
		return customerdeleteButton;
	}
	//create WebElement to cofimr customer deletion button
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getcustomerConfirmationdeleteButton()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	//create WebElement for  addproject radio button on taskpage
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement addProjectRadioButton;
	public WebElement getaddProjectRadioButton()
	{
		return addProjectRadioButton;
	}
	//create WebElement for Project name field
	@FindBy(xpath="//*[@id=\"projectPopup_projectNameField\"]")
	private WebElement Projectnamefeild;
	public WebElement getProjectnamefield()
	{
		return Projectnamefeild;
	}
	//create WebElement for commit button after creation of Project
	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
	private WebElement Projectcreationcommitbutton;
	public WebElement getProjectcreationcommitbutton()
	{
		return Projectcreationcommitbutton;
	}
	//create WebElement of settings for created Project
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement Projectsettingsbutton;
	public WebElement getProjectsettingsbutton()
	{
		return Projectsettingsbutton;
	}
	//create WebElement modifying Project by writing in description area
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement modifyProjectdescrptionarea;
	public WebElement getmodifyProjectdescrptionarea()
	{
		return modifyProjectdescrptionarea;
	}
	//create WebElement for close button for selected Project settings
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
	private WebElement Projectsettingclosebutton;
	public WebElement getProjectsettingclosebutton()
	{
		return Projectsettingclosebutton;
	}
	//create WebElement for Project setting action drop down button
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement ProjectsettingActionButton;
	public WebElement getProjectsettingActionButton()
	{
		return ProjectsettingActionButton;
	}
	//create WebElement for delete Project buttom
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")

	private WebElement ProjectdeleteButton;  
	public WebElement getProjectdeleteButton()
	{
		return ProjectdeleteButton;
	}
	//create WebElement to confirm Project deletion button
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getprojectdeleteConfirmatinButton()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//create WebElement for  addtask radio button on taskpage
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement addTaskRadioButton;
	public WebElement getaddTaskRadioButton()
	{
		return addTaskRadioButton;
	}
	//create WebElement for  addtask create radio button on taskpage
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement addTaskCreateRadioButton;
	public WebElement getaddTaskCreateRadioButton()
	{
		return addTaskCreateRadioButton;
	}
	//create WebElement for  insert task details on taskpage
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement TaskInsertontablerow1;
	public WebElement getTaskInsertontablerow1()
	{
		return TaskInsertontablerow1;
	}
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")
	private WebElement TaskInsertontablerow2;
	public WebElement getTaskInsertontablerow2()
	{
		return TaskInsertontablerow2;
	}
	//create WebElement for  confirmation button after creating task on taskpage
	@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
	private WebElement TaskcreatedconfirmationButton;
	public WebElement getTaskcreatedconfirmationButton()
	{
		return TaskcreatedconfirmationButton;
	}
	//create WebElement for  clicking on created task on table on taskpage
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div")
					//	no need for mentioning the row number since the deletd will go fifo and the second row will come in first row//tr[1]			
	//*[@id="taskListBlock"]/div[1]/div[2]/div[1]/table[2]/tbody/tr/td[2]/div
	private WebElement TaskSelectionfromtabletask1;
	public WebElement getTaskSelectionfromtabletask1()
	{
		return TaskSelectionfromtabletask1;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[2]/tbody/tr/td[2]/div")
	private WebElement TaskSelectionfromtabletask2;
	public WebElement getTaskSelectionfromtabletask2()
	{
		return TaskSelectionfromtabletask2;
	}
	//create WebElement for selected task action button 
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement TaskSelectedActionButton;
	public WebElement getTaskSelectedActionButton()
	{
		return TaskSelectedActionButton;
	}
	//create WebElement for delete button for selected task 
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement TaskSelectedDeleteButton;
	public WebElement getTaskSelectedDeleteButton()
	{
		return TaskSelectedDeleteButton;
	}
	//create WebElement for delete comfirmation button for selected task 
	//@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement  getTaskSelectedDeleteConfirmationButton()
	{
		return  taskPanel_deleteConfirm_submitTitle;
	}
}
