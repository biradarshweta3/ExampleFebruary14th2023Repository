package com.sgtesting.products;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Products {

		@Test
		public void createProduct()
		{
			System.out.println("the user demouser1 has created successfully");
		
		}
		
		@Test
		public void modifyProduct()
		{
			System.out.println("the user demouser1 has modified successfully");
		}
		
		@Test
		public void deleteProduct()
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
			


