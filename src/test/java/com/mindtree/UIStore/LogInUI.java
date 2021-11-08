package com.mindtree.UIStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInUI {
	static WebDriver driver;

	public static By email = By.id("email");
	public static By passWord = By.id("pass");
	public static By signIn = By.xpath("//*[@id=\'send2\']/span");
}
