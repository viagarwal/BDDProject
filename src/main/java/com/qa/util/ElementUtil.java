package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.qa.factory.DriverFactory;

public class ElementUtil {

	public static void doClick(By by) {
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public static void doSelected(By by, String  value) {
		Select select = new Select(DriverFactory.getDriver().findElement(by));
		select.selectByValue(value);
	}
	
	public static void doEnterValue(By by, String  value) {
		DriverFactory.getDriver().findElement(by).sendKeys(value);
	}

	public static void isVisibilty(By by) {
		DriverFactory.getDriver().findElement(by).isDisplayed();
	}

	public static void isEnable(By by) {
		DriverFactory.getDriver().findElement(by).isEnabled();
	}

	public static void isSelected(By by) {
		DriverFactory.getDriver().findElement(by).isSelected();
	}
	

}