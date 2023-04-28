package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
	    public static WebDriver oBrowser;
		public static ActiTimePage opage=null;
		public static void main(String[]args) {
			launchbrowser();
			navigate();
			login();
			minimizeflyoutwindow();
			logout();
			closeapplication();
			
		}

		private static void launchbrowser()
		{
			try
			{
				
				oBrowser=new ChromeDriver();
				}catch (Exception e)
			    {
                  e.printStackTrace();
			    }
		}
		
		private static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost/login.do");
				Thread.sleep(4000);
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void login()
		{
			try 
			{ 
				opage.getusername().sendKeys("admin");
				opage.getpassword().sendKeys("manager");
				opage.getlogin().click();
				Thread.sleep(2000);
				
			}
		}
		
		private static void minimizeflyoutwindow() 
		{
			try 
			{
			 opage.getFlyoutwindow().click();
			Thread.sleep(2000);
			}catch (Exception e)
			{
				e.printStackTrace();
			}	
			
		}
			
		private static void logout()
		{
			try
			{
				opage.getLogout().click();
				Thread.sleep(2000);
			}catch (Exception e)
			{
				e.printStackTrace();
				
			}
		}
		private static void closeapplication()
		{
			try
			{
				WebDriver obrowser;
				obrowser.close();
			}catch (Exception e)
			{
				e.printStackTrace();
				
			}
		}
				
}