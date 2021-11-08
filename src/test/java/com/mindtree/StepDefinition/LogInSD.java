package com.mindtree.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.PageObject.LogInOB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LogInSD {
	static WebDriver driver;
	LogInOB ob = new LogInOB(driver);

	@Given("Getting driver from the HomePage")
	public void getting_driver_from_the_home_page() {
		driver = HomePageSD.getDriver();
	}

	@Then("User gives the Email as (.+) and Password as (.+)$")
	public void user_gives_the_Email_as_and_Password_as(String email, String password) {
		WebElement emailElement = ob.email(driver);
		emailElement.click();
		emailElement.sendKeys(email);
		System.out.println("Email entered" + email);
		WebElement passwordElement = ob.passWord(driver);
		passwordElement.click();
		passwordElement.sendKeys(password);
		System.out.println("Password entered" + password);
	}

	@Then("User click the login button")
	public void user_click_the_login_button() {
		WebElement signin = ob.signin(driver);
		signin.click();
		System.out.println("Sign in button clicked");
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
