package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimepagePractice {


	public ActitimepagePractice(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
		
	}
  //WebElement for username text field
 private WebElement username;	
 public WebElement getusername()
 {
	 return username;
 }
//WebElement for password text field
 private WebElement pwd;
 public WebElement getpassword()
 {
	 return pwd;
 }
//WebElement for login button
 @FindBy(xpath="//div[text()='login ']")
 private WebElement oLogin;
public WebElement getLogin()
{
	return oLogin;
}
//WebElement for Flyoutwindow
private WebElement gettingstartedshortcutpanelid;
public WebElement getflyoutwindow()
{
	return gettingstartedshortcutpanelid; 
}
//WebElement for Logout link
@FindBy(linkText="Logout")
private WebElement ologout;
public WebElement getlogout()
{
	return ologout;
}
	

	}
