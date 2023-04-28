package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ActiTime01 {


		public static class Actitime01 {
			private static WebDriver o=null;

			public static void main(String[] args) {
				Open();
				navigate();
				login();
				minimize();
				CreateUser1();
				CreateUser2();
				CreateUser3();
				logout();
				loginUser1();
				Explore();
				logouUser1();
				loginUser2();
				Explore1();
				logouUser2();
				loginUser3();
				Explore2();
				logouUser3();
				loginre();
				modifyUser1();
				modifyUser2();
				modifyUser3();
				logout1();
				loginUser11();
				Explore();
				logouUser11();
				loginUser21();
				logouUser21();
				loginUser31();
				logouUser31();
				loginUserre();
				deleteUser();
				logoutre1();
				close();
				

			}
			private static void Open()
			{
				try
				{
					o=new ChromeDriver();
				}catch(Exception e)
				{
					e.addSuppressed(e);
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
			private static void login()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.id("username")).sendKeys("admin");
					o.findElement(By.name("pwd")).sendKeys("manager");
					o.findElement(By.xpath("//div[text()='Login ']")).click();
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
			private static void CreateUser1()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
					Thread.sleep(1000);
					o.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[1]")).click();
					Thread.sleep(1000);
					o.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("shweta");
					Thread.sleep(1000);
					o.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("BB");
					o.findElement(By.id("userDataLightBox_emailField")).sendKeys("shwetabiradar27@gmail.com");
					o.findElement(By.id("userDataLightBox_usernameField")).sendKeys("shweta");
					o.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456");
					o.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456");
					Thread.sleep(2000);
					o.findElement(By.id("userDataLightBox_commitBtn")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void CreateUser2()
			{
				try
				{
					Thread.sleep(1000);
					o.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[1]")).click();
					Thread.sleep(1000);
					o.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Anand");
					Thread.sleep(1000);
					o.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("B N");
					o.findElement(By.id("userDataLightBox_emailField")).sendKeys("anadbiradar26@gmail.com");
					o.findElement(By.id("userDataLightBox_usernameField")).sendKeys("sachin");
					o.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456");
					o.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456");
					Thread.sleep(2000);
					o.findElement(By.id("userDataLightBox_commitBtn")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void CreateUser3()
			{
				try
				{
					Thread.sleep(1000);
					o.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[1]")).click();
					Thread.sleep(1000);
					o.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Akasha");
					Thread.sleep(1000);
					o.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("S");
					o.findElement(By.id("userDataLightBox_emailField")).sendKeys("akash26@gmail.com");
					o.findElement(By.id("userDataLightBox_usernameField")).sendKeys("akash");
					o.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456");
					o.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456");
					Thread.sleep(2000);
					o.findElement(By.id("userDataLightBox_commitBtn")).click();
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
			private static void loginUser1()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.id("username")).sendKeys("akira");
					o.findElement(By.name("pwd")).sendKeys("123456");
					o.findElement(By.xpath("//div[text()='Login ']")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void Explore()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void logouUser1()
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
			private static void loginUser2()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.id("username")).sendKeys("akira");
					o.findElement(By.name("pwd")).sendKeys("123456");
					o.findElement(By.xpath("//div[text()='Login ']")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void Explore1()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void logouUser2()
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
			private static void loginUser3()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.id("username")).sendKeys("akira");

					o.findElement(By.name("pwd")).sendKeys("123456");
					o.findElement(By.xpath("//div[text()='Login ']")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void Explore2()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void logouUser3()
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
			private static void loginre()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.id("username")).sendKeys("admin");
					o.findElement(By.name("pwd")).sendKeys("manager");
					o.findElement(By.xpath("//div[text()='Login ']")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void modifyUser1()
			{
				try 
				{
					Thread.sleep(1000);
					o.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
					o.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
					Thread.sleep(2000);
					o.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456");
					o.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456");
					Thread.sleep(2000);
					o.findElement(By.id("userDataLightBox_commitBtn")).click();
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void modifyUser2()
			{
				try 
				{
					Thread.sleep(1000);
					
					o.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
					Thread.sleep(2000);
					o.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456");
					o.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456");
					Thread.sleep(2000);
					o.findElement(By.id("userDataLightBox_commitBtn")).click();
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
					
				}
			}
			private static void modifyUser3()
			{
				try 
				{
					Thread.sleep(1000);
					
					o.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
					Thread.sleep(2000);
					o.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456");
					o.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456");
					Thread.sleep(2000);
					o.findElement(By.id("userDataLightBox_commitBtn")).click();
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void logout1()
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
			
			private static void loginUser11()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.id("username")).sendKeys("akira");
					o.findElement(By.name("pwd")).sendKeys("123456");
					o.findElement(By.xpath("//div[text()='Login ']")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			/*private static void Explore11()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}*/
			private static void logouUser11()
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
			private static void loginUser21()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.id("username")).sendKeys("akira");
					o.findElement(By.name("pwd")).sendKeys("123456");
					o.findElement(By.xpath("//div[text()='Login ']")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void logouUser21()
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
			private static void loginUser31()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.id("username")).sendKeys("akira");
					o.findElement(By.name("pwd")).sendKeys("123456");
					o.findElement(By.xpath("//div[text()='Login ']")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void logouUser31()
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
			private static void loginUserre()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.id("username")).sendKeys("admin");
					o.findElement(By.name("pwd")).sendKeys("manager");
					o.findElement(By.xpath("//div[text()='Login ']")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void deleteUser()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\'userDataLightBox_accountInformationSection\']/div[2]")).click();
					o.switchTo().alert().accept();
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\'userDataLightBox_accountInformationSection\']/div[2]")).click();
					Thread.sleep(2000);
					o.switchTo().alert().accept();
					Thread.sleep(3000);
					o.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]")).click();
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\'userDataLightBox_accountInformationSection\']/div[2]")).click();
					o.switchTo().alert().accept();
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void logoutre1()
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
					o.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
		}
}



		
		
		
	
