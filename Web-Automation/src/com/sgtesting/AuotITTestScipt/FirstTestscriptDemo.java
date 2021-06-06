package com.sgtesting.AuotITTestScipt;

public class FirstTestscriptDemo {


	public static void main(String[] args) {
		executeAutoITScript();
	}

	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("D:\\AutoIT\\SaveDemotestcase.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}