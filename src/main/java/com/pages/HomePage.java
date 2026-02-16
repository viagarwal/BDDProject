package com.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import com.qa.util.WaitUtil;

public class HomePage  {
	private WebDriver driver;

	private By gmailLink = By.cssSelector("a[aria-label*='Gmail']");
	private By signIn = By.cssSelector("a[aria-label='Sign in']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isSignDisplay(int timeout) {
		WaitUtil waitUtil = new WaitUtil(timeout);
		waitUtil.doWaitUntilVisible(signIn);
		return driver.findElement(signIn).isDisplayed();
	}
	
	public  SignInPage doSignIn(int timeout) {
		WaitUtil waitUtil = new WaitUtil(timeout);
		waitUtil.doWaitUntilClickable(signIn);
		return new SignInPage(driver);		
	}

	public boolean isGmailLinkExist(int timeout) {
		WaitUtil waitUtil = new WaitUtil(timeout);
		waitUtil.doWaitUntilVisible(gmailLink);
		return driver.findElement(gmailLink).isDisplayed();
	}

}