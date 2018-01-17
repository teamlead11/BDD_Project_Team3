package com.stepdefinition;

import com.ObjectRepository.BlogPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CategoriesDetails extends FunctionalLibrary {

	@Given("^I am on Blogpages$")
	public void i_am_on_Blogpages() throws Throwable {
		driverInit();
		driver.get("http://www.phptravels.net/blog");
	}

	@When("^I click checking for Categories All Details$")
	public void i_click_checking_for_Categories_All_Details() throws Throwable {
		BlogPage blog = new BlogPage();
		blog.CategoriesList("(.*)Shopping-and-Fashion(.*)");
	}

	@Then("^I validate CategoriesAllDetails$")
	public void i_validate_CategoriesAllDetails() throws Throwable {

	}

}
