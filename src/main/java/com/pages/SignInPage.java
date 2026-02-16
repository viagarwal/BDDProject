package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.WaitUtil;

public class SignInPage {

	private WebDriver driver;

	private By email = By.cssSelector("input[aria-label='Email or phone']");
	private By nextButton = By.cssSelector("div#identifierNext");
	private By passwordElm = By.cssSelector("input[type='password']");

	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getSignInPageTitle() {
		return driver.getTitle();
	}

	public void clickOnNextButton(int timeout) {
		WaitUtil waitUtil = new WaitUtil(timeout) ;
		waitUtil.doWaitUntilClickable(nextButton);
	}
	
	public void enterEmailId(String userName) {
		driver.findElement(email).sendKeys(userName);
	}
	
	public void enterPassword(String password, int timeout) {
		WaitUtil waitUtil = new WaitUtil(timeout) ;
		waitUtil.doWaitPrence(passwordElm);
		waitUtil.doWaitStalenes(driver.findElement(passwordElm));
		driver.findElement(passwordElm).sendKeys(password);
	}
}