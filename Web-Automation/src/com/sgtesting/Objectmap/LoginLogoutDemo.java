package com.sgtesting.Objectmap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
    
	private static WebDriver oBrowser=null;
	public static ObjectMap om=null;
	
	
	public static void main(String[] args) {
		
		launchbrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		logout();
		
	}
	private static void launchbrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			
			om=new ObjectMap(".\\Library\\ObjectMap\\objectmap.properties");
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
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(om.getLocator("loginpageusername")).sendKeys("admin");
			oBrowser.findElement(om.getLocator("loginpagepassword")).sendKeys("manager");
			oBrowser.findElement(om.getLocator("loginpageloginbtn")).click();
			Thread.sleep(5000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}	
		
	}
	private static void minimizeflyoutwindow()
	{
		try
		{
			
		oBrowser.findElement(om.getLocator("homepageflyoutwindow")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}

}
private static void logout()
{
	try
	{
		oBrowser.findElement(om.getLocator("homepagelogoutlink")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	
	}
}
}