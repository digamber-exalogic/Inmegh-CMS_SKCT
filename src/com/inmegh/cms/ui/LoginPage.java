package com.inmegh.cms.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;

public class LoginPage {



	@FindBy(how=How.ID, using = "inputEmail")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.XPATH, using = "//input[@id='inputPassword']")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH, using = "//button[@type='submit']")
	@CacheLookup
	WebElement loginButton;
	
	@FindBy(how=How.LINK_TEXT, using = "Forgot your password ?")
	@CacheLookup
	WebElement forgotLink;
	
	public void login_inmegh(String uid, String pid)
	{
		username.sendKeys(uid);
		password.sendKeys(pid);
		loginButton.click();
	}
	
}
