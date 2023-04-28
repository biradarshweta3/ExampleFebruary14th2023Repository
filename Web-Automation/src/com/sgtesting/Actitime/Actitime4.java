package com.sgtesting.Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


		
		public class Actitime4 {
			private static WebDriver o=null;

			public static void main(String[] args) {
				open();
				navigate();
				login();minimize();
				clickCustomer();
				createUser();
				modify();
				delete();
				logout();
				close();

			}
			private static void open()
			{
				try
				{
					o=new ChromeDriver();

				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void navigate()
			{
				try
				{
					o.get("http://localhost/login.do");
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void minimize()
			{
				try
				{
					Thread.sleep(1000);
					o.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void login()
			{
				try
				{
					Thread.sleep(1000);
					o.findElement(By.id("username")).sendKeys("admin");
					o.findElement(By.name("pwd")).sendKeys("manager");
					o.findElement(By.xpath("//*[@id='loginButton']/div")).click();
					Thread.sleep(1000);

				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			public static void clickCustomer()
			{
				try {

					o.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a")).click();

				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void createUser()
			{
				try
				{
					Thread.sleep(1000);
					o.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")).click();
					Thread.sleep(1000);
					o.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
					Thread.sleep(1000);
					o.findElement(By.id("customerLightBox_nameField")).sendKeys("sharat");
					Thread.sleep(1000);
					o.findElement(By.id("customerLightBox_descriptionField")).sendKeys("hello selenium");
					Thread.sleep(1000);
					o.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div")).click();
					Thread.sleep(1000);

				}catch(Exception e)
				{

					e.printStackTrace();
				}
			}
			private static void modify()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
					Thread.sleep(1000);
					
					o.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("hello!");
					
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
					o.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
					o.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
					o.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")).click();

					
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
					o.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}	
		
