package com.mindtree.StepDefinition;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.PageObject.HomePageOB;
import com.mindtree.Utilities.BrowserConnection;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSD {
	static WebDriver driver;

	@Given("User opens the browser")
	public void user_opens_the_browser() throws IOException, InterruptedException {
		BrowserConnection.intializeDriver();
		driver = BrowserConnection.getDriver();
	}

	@When("User enters the url {string}")
	public void user_enters_the_url(String string) {
		driver.get(string);
		System.out.println("The url is successfully opened");
	}

	@Then("I go to the myaccount section")
	public void i_go_to_the_myaccount_section() {
		HomePageOB ob = new HomePageOB(driver);
		WebElement myAccount = ob.myAccount(driver);
		myAccount.click();
		System.out.println("The my account is successfully clicked");
	}
	
	
	public static WebDriver getDriver() {
		return driver;
	}
}
