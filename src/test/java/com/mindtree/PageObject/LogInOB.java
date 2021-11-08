package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.LogInUI;

public class LogInOB {
	public WebDriver driver;

	public LogInOB(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement email(WebDriver driver) {
		return driver.findElement(LogInUI.email);
	}
	
	public WebElement passWord(WebDriver driver) {
		return driver.findElement(LogInUI.passWord);
	}
	
	public WebElement signin(WebDriver driver) {
		return driver.findElement(LogInUI.signIn);
	}
}
