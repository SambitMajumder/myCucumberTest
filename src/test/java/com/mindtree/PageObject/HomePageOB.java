package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.HomePageUI;

public class HomePageOB {
	public WebDriver driver;

	public HomePageOB(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement myAccount(WebDriver driver) {
		return driver.findElement(HomePageUI.myAccount);
	}
}
