package com.qa.util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.factory.DriverFactory;

public class WaitUtil {
	static WebDriverWait wait ;
	
	
	public WaitUtil(int timeout) {
		wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(timeout));
	}
	
	public  void verifyTitle(String title) {
		wait.until(ExpectedConditions.titleIs(title));
	}
	
	public  void isTitle(String title) {
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public  void doWaitUntilClickable(By by) {		
		wait.until(ExpectedConditions.elementToBeClickable(by));
		ElementUtil.doClick(by);
	}
	
	public void doWaitPrence(By by) {
		wait.until(ExpectedConditions.presenceOfElementLocated(by));		
	}
	
	public void doWaitStalenes(WebElement elm) {
		wait.until(ExpectedConditions.stalenessOf(elm));
	}
	
	
	
	public  void doWaitUntilVisible(By by) {
		wait.until(ExpectedConditions.visibilityOf(DriverFactory.getDriver().findElement(by)));
		ElementUtil.isVisibilty(by);
	}
		
	public  void doWaitUntilSelected(By by, int timeout, String value) {
		ElementUtil.doSelected(by, value);
		wait.until(ExpectedConditions.elementToBeSelected(by));		
	}
	
	public  void isAlertPresent() {
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
}