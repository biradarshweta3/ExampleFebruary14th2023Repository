package com.sgtesting.Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

		
		public class Actitime5 {
			private static WebDriver o=null;

			public static void main(String[] args) {
				open();
				navigate();
				openapp();
				minimize();
				createproject();
				delete();
				logout();
				close();

			}
			public static void open()
			{
				try
				{
					o=new ChromeDriver();
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			public static void navigate()
			{
				try
				{
					o.get("http://localhost/login.do");
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void openapp()
			{
				try
				{
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
			private static void createproject()
			{
				try
				{
				o.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();
				o.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
				o.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
				Thread.sleep(2000);
				o.findElement(By.xpath("//*[@id=\'projectPopup_projectNameField\']")).sendKeys("hi");
				o.findElement(By.xpath("//*[@id=\'ext-gen29\']/td[2]/em")).click();
				o.findElement(By.xpath("//*[@id=\'ext-gen104\']")).click();
				o.findElement(By.xpath("//*[@id=\'projectPopup_newCustomerNameField\']")).sendKeys("helloo");
				o.findElement(By.xpath("//*[@id=\'projectPopup_projectDescriptionField\']")).sendKeys("Hello selenium");
				o.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div")).click();
					
				}catch(Exception e)
				{
					
					e.printStackTrace();
					
				}
			}
			private static void delete()
			{
				try
				
				{
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
					Thread.sleep(1000);
					o.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
					Thread.sleep(1000);
					o.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
					Thread.sleep(1000);
					o.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")).click();
					//o.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();

					
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
		
		
	
