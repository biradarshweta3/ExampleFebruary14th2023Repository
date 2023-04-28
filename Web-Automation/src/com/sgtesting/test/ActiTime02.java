package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ActiTime02 {
		
		public static class Actitime02 {
			private static WebDriver o=null;

			public static void main(String[] args) {
				Open();
				navigate();
				login();
				minimize();
				CreateUser1();
				logout11(); 
				loginUser1();
				Explore20();
				savechanges1();
				CreateUser2();
				logout11();
				loginUser2();
				Explore1();
				savechanges11();
				CreateUser3();
				logout2();
				loginUser3();
				Explore2();
				savechanges111();
				logoutre2();
				loginUserre1();
				modifyUserre2();
				logoutre21();
				loginUser21();
				logout_a();
				login_b();
				modifyUser1_c();
				logout_d();
				loginUser_e();
				deleteUser3();
				logout_f();
				loginUser_g();
				DeleteUser2();
				logout_h();
				login_i();
				DeleteUser1();
				logout11();
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
					o.findElement(By.id("userDataLightBox_usernameField")).sendKeys("shwe");
					o.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456");
					o.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456");
					Thread.sleep(2000);
					o.findElement(By.id("userDataLightBox_commitBtn")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void logout11()
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
					Thread.sleep(4000);
					o.findElement(By.id("username")).sendKeys("shweta");
					o.findElement(By.name("pwd")).sendKeys("123456");
					o.findElement(By.xpath("//div[text()='Login ']")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void Explore20()
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
			private static void savechanges1()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\'SubmitTTButton\']")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}

			private static void CreateUser2()
			{
				try
				{
					Thread.sleep(4000);
					o.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
					Thread.sleep(1000);
					o.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[1]")).click();
					Thread.sleep(2000);
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
			private static void loginUser2()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.id("username")).sendKeys("shweta");
					o.findElement(By.name("pwd")).sendKeys("123456");
					o.findElement(By.xpath("//div[text()='Login ']")).click();
					Thread.sleep(1000);
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
			private static void savechanges11()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\'SubmitTTButton\']")).click();
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
					o.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
					Thread.sleep(1000);
					o.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[1]")).click();
					Thread.sleep(2000);
					o.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("ambrish");
					Thread.sleep(1000);
					o.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("A");
					o.findElement(By.id("userDataLightBox_emailField")).sendKeys("ambrishambe27@gmail.com");
					o.findElement(By.id("userDataLightBox_usernameField")).sendKeys("amar");
					o.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456");
					o.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456");
					Thread.sleep(2000);
					o.findElement(By.id("userDataLightBox_commitBtn")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void logout2()
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
					o.findElement(By.id("username")).sendKeys("amar");

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
			private static void savechanges111()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\'SubmitTTButton\']")).click();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void logoutre2()
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
			private static void loginUserre1()
			{
				try
				{
					Thread.sleep(4000);
					o.findElement(By.id("username")).sendKeys("amar");
					o.findElement(By.name("pwd")).sendKeys("123456");
					o.findElement(By.xpath("//div[text()='Login ']")).click();
					Thread.sleep(3000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void modifyUserre2()
			{
				try 
				{
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
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
			private static void logoutre21()
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
					o.findElement(By.id("username")).sendKeys("ambrish");
					o.findElement(By.name("pwd")).sendKeys("123456");
					o.findElement(By.xpath("//div[text()='Login ']")).click();
					Thread.sleep(1000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void logout_a()
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
			private static void login_b()
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
			private static void modifyUser1_c()
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
			private static void logout_d()
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
			private static void loginUser_e()
			{
				try
				{
					Thread.sleep(2000);
					o.findElement(By.id("username")).sendKeys("amar");
					o.findElement(By.name("pwd")).sendKeys("123456");
					o.findElement(By.xpath("//div[text()='Login ']")).click();
					Thread.sleep(1000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void deleteUser3()
			{
				try
				{
					Thread.sleep(2000);
					//o.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
					o.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\'userDataLightBox_accountInformationSection\']/div[2]")).click();
					o.switchTo().alert().accept();
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
			private static void logout_f()
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
			private static void loginUser_g()
			{
				try
				{
					Thread.sleep(4000);
					o.findElement(By.id("username")).sendKeys("amar");
					o.findElement(By.name("pwd")).sendKeys("123456");
					o.findElement(By.xpath("//div[text()='Login ']")).click();
					Thread.sleep(3000);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void DeleteUser2()
			{
				try
				{
					o.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
					o.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
					Thread.sleep(2000);
					o.findElement(By.xpath("//*[@id=\'userDataLightBox_accountInformationSection\']/div[2]")).click();
					o.switchTo().alert().accept();
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void logout_h()
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
			private static void login_i()
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
			private static void DeleteUser1()
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
					o.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			
		}
	
}



