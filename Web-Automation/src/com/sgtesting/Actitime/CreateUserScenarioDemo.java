package com.sgtesting.Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Alert;

 
public class CreateUserScenarioDemo {
    public static WebDriver oBrowser=null;
    
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		createuser();
		deleteuser();
		logout();
		closeApp();
		
	}
	
	private static void launchbrowser()
	{
		try
		{
			//System.setProperty("webdriver.chrome.driver",".\\library\\drivers\\chromedriver.exe");
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			 oBrowser=new ChromeDriver(option);
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
		 Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
  private static void minimizeflyoutwindow()
  {
	 try
	 {
		oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']/div[1]")).click();
		 Thread.sleep(2000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
  }	 
	private static void createuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			 Thread.sleep(2000);
			 
		 oBrowser.findElement(By.name("firstname")).sendKeys("demo");
		 oBrowser.findElement(By.name("lastname")).sendKeys("user1");
		 oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
		 oBrowser.findElement(By.name("username")).sendKeys("demouser1");
		 oBrowser.findElement(By.name("password")).sendKeys("welcome1");
		 oBrowser.findElement(By.name("passwordcopy")).sendKeys("welcome1");
		  Thread.sleep(2000);
		 oBrowser.findElement(By.xpath("//span[text()='Create user']")).click();
           Thread.sleep(50000);
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	private static void deleteuser()
	{
		try
		{
		 oBrowser.findElement(By.xpath("//*@id=userDataLightBox_deleteBtn")).click();
                Thread.sleep(2000);
                
         oBrowser.findElement(By.id("userDtatalightbox_deletebtn")).click();
          Thread.sleep(2000);
             Alert
       oAlert=oBrowser.switchTo().alert();
             String
         content= oAlert.getText();
             System.out.println(content);
             oAlert.accept();
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
		 oBrowser.findElement(By.linkText("logout")).click();
		 Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApp()
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
	
