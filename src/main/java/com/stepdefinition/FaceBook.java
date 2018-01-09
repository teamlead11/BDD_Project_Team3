package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ObjectRepository.BlogPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBook extends FunctionalLibrary {

	@Given("^I am on facebook pages$")
	public void i_am_on_facebook_pages() throws Throwable {
		// driverInit();
		driver.navigate().to("https://en-gb.facebook.com/login/");
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String username, String password) throws Throwable {
		BlogPage blog=new BlogPage();
		
	
	}

	@Then("^I verify the <status> in step$")
	public void i_verify_the_status_in_step() throws Throwable {
	}

}
