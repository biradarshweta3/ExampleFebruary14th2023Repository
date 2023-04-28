package com.sgtesting.Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime2 {
	private static WebDriver o=null;

	public static void main(String[] args) {
		OpenBrowser();
		open();
		login();
		minimize();
		createuser();
		clickuser();
		dataentry();
		modifyUser();
		Deleteuser();
		logout();
		close();
		

		
	}
	private static void OpenBrowser()
	{
		try
		{
			o=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void open()
	{
		try
		{
			o.get("http://localhost/login.do");
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			Thread.sleep(5000);
			o.findElement(By.id("username")).sendKeys("admin");
			o.findElement(By.name("pwd")).sendKeys("manager");
			o.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try
		{
			Thread.sleep(5000);
			o.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try
		{
			Thread.sleep(5000);
			o.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[5]")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void clickuser()
	{
		try
		{
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void dataentry()
	{
		try
		{
Thread.sleep(2000);
			
			o.findElement(By.name("firstName")).sendKeys("shweta");
			o.findElement(By.name("lastName")).sendKeys("bd");
			o.findElement(By.name("email")).sendKeys("Shwetabiradar97@gmail.com");
			o.findElement(By.name("username")).sendKeys("golu");
			o.findElement(By.name("password")).sendKeys("123456");
			o.findElement(By.name("passwordCopy")).sendKeys("123456");
			Thread.sleep(2000);
			o.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser()
	{
		try
		{
			 o.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.name("password")).sendKeys("1234567");
			o.findElement(By.name("passwordCopy")).sendKeys("1234567");
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Deleteuser()
	{
		try
		{
			Thread.sleep(5000);
			o.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			o.switchTo().alert().accept();
		}catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			Thread.sleep(2000);
			o.findElement(By.linkText("Logout")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close()
	{
		try
		{
			Thread.sleep(5000);
			o.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

	
