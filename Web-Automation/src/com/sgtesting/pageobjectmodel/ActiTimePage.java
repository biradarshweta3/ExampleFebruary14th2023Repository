package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
     //WebElement for username
 	private WebElement username;
 	
 	public WebElement getusername()
 	{
 		return username;
 	}
 	
 	//WebElement for password text field
 	
 	private WebElement password()
 	
 	public getpassword()
 	{
 		return "pwd";
 	}
 	
 	//WebElement for login button
 	@FindAll xpath="//div[text()='Login']")
 	private WebElement oLogin;
 	
 	public WebElement getlogin()
 	{
 		return oLogin;
 	}
 	
 	//WebElement for Flyoutwindow
 	private WebElement gettingstartedshortcutpanelId;
	private WebElement oLogout;
 	
 	public WebElement getFlyoutwindow()
 	{
 		return gettingstartedshortcutpanelId;
 	}
 	
 	//WebElement for Logout link
 	@FindBy(linkText ="Logout")
    private WebElement oLogout()
    
    public WebElement getLogout()
    {
 		return oLogout;
    }	

}

