package com.sgtesting.pageobjectmodel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

		public class ActiTime2 {
			public static WebDriver oBrowser=null; 
			public static ActitimePageNew oPage=null;

			public static void main(String[] args) {
				launchBrowser();
				navigate();
				login();
				minimize();
				User();
				Modify();
				Delete();
				close();

			}
			private static void launchBrowser()
			{
				try
				{
					oBrowser= new ChromeDriver();
					oPage=new ActitimePageNew(oBrowser);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void navigate()
			{
				try
				{
					oBrowser.get("http://localhost/login.do");

				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}private static void login()
			{
				try
				{
					Thread.sleep(2000);
					oPage.getUser().sendKeys("admin");
					oPage.getPassword().sendKeys("manager");
					Thread.sleep(2000);
					oPage.getLogin().click();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void minimize()
			{
				try
				{
					Thread.sleep(2000);

					oPage.minimize().click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void User()
			{
				try
				{
					Thread.sleep(2000);
					oPage.cUser().click();
					Thread.sleep(2000);
					oPage.oAddUserButton().click();
					Thread.sleep(2000);
					oPage.Fname().sendKeys("shweta");
					oPage.Lname().sendKeys("BB");
					oPage.email().sendKeys("shwetabiradar27@gmail.com");
					oPage.Username().sendKeys("shweta");
					oPage.Password().sendKeys("123456");
					oPage.RePassWord().sendKeys("123456");
					Thread.sleep(2000);
					oPage.createUserButton().click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void Modify()
			{
				try
				{
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
					Thread.sleep(1000);
					oPage.Password().sendKeys("123456789");
					oPage.RePassWord().sendKeys("123456789");
					oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
					//oPage.createUserButton().click();
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void Delete()
			{
				try
				{
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
					Thread.sleep(1000);
					oPage.deleteUserbutton().click();
					Thread.sleep(1000);
					oBrowser.switchTo().alert().accept();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void close()
			{
				try
				{
					oBrowser.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}

		}	
		
