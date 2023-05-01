package com.sgtesting.Users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Users {

	@Test
	public void createuser()
	{
		System.out.println("the user demouser1 has created successfully");
	
	}
	
	@Test
	public void modifyuser()
	{
		System.out.println("the user demouser1 has modified successfully");
	}
	
	@Test
	public void deleteuser()
	{
		System.out.println("the user demouser1 has deleted successfully");
	}
	
	@BeforeClass()
	public void setup()
	{
		System.out.println("Launch Browser,navigate URL and login into the application");
	}
	
	@AfterClass()
	public void tearDown()
	{
		System.out.println("Logout from the application and close the application");
		System.out.println("+++++++++++++++++++++");
	}
}
		
