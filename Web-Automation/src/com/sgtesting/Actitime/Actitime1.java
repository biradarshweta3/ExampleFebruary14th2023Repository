package com.sgtesting.Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime1 {
	public static WebDriver o=null;
     public static void main(String[] args) 
	{
		
                launch();
				open();
				login();
				minimize();
				createuser();
				clickUser();
				dataentry();
				deleteuser();
				logout();
				close();

			}
			public static void launch()
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
			private static void clickUser()
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
					
					o.findElement(By.name("firstName")).sendKeys("Shweta");
					o.findElement(By.name("lastName")).sendKeys("BB");
					o.findElement(By.name("email")).sendKeys("shwetabiradar27@gmail.com");
					o.findElement(By.name("username")).sendKeys("byte");
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
			private static void deleteuser()
			{
				try
				{
					
					o.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
					Thread.sleep(2000);
					o.findElement(By.id("userDataLightBox_deleteBtn")).click();
					Thread.sleep(2000);
					o.switchTo().alert().accept();
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

		

	

