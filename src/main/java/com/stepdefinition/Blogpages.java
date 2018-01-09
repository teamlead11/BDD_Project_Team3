package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.ObjectRepository.BlogPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Blogpages extends FunctionalLibrary {
	@Given("^I am on Blog page$")
	public void i_am_on_Blog_page() throws Throwable {
		driverInit();
		driver.get("http://www.phptravels.net/blog");
	}

	@When("^I click checking for all image$")
	public void i_click_checking_for_all_image() throws Throwable {
		BlogPage blog = new BlogPage();
		blog.BlogPagesNow("Peace Train A Long Time Coming");

	}

	@Then("^I validate images$")
	public void i_validate_images() throws Throwable {
		String CurrentTitle = FunctionalLibrary.driver.getTitle();
		Assert.assertEquals("Peace Train A Long Time Coming", CurrentTitle);
		System.out.println("Expected result passed:Peace Train A Long Time Coming");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		FunctionalLibrary.closeBrowser();
	}
}
