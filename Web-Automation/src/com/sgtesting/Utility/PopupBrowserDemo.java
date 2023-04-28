package com.sgtesting.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupBrowserDemo {

	
		private static WebDriver oBrowser=null;
		public static void main(String[]args) {
			launchBrowser();
			navigate();
			handlepopups();
			
		}
		
private static void launchBrowser()
{
	try
	{
		oBrowser=new ChromeDriver();
		oBrowser.manage().window().maximize();
		
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
private static void handlepopups()
{
	try
	{
		oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(2000);
		boolean v1=Utility.ispopupPresent(oBrowser);
		int count=Utility.getpopupCount(oBrowser);
		System.out.println("# of popups are:"+count);
		if(v1)
		{
			System.out.println("Pop window is present");
		}
		else
		{
			System.out.println("Pop window is not present");
		}
   	}catch (Exception e)
	{
		e.printStackTrace();
	}
  }
}
		
	
 