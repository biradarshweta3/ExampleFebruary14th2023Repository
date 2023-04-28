package com.sgtesting.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesDemo {
	
    private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		handleFrames();

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
			oBrowser.get("file:///D:/HTML/ParentFramesDemo.html");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();		}
	}
	
	private static void handleFrames()
	{
		try
		{
	
			boolean first=Utility.getFramecontrol(oBrowser, "first");
			if(first)
			{
				boolean second=Utility.getFramecontrol(oBrowser, "second");
				if(second)
				{
					oBrowser.findElement(By.id("uid1user1name1")).sendKeys("Demouser1");
					oBrowser.findElement(By.id("pwd1pass1word1")).sendKeys("Welcome1");
					
				}	
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
