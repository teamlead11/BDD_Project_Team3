package com.stepdefinition;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.ObjectRepository.BlogPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Titles extends FunctionalLibrary {

	@Given("^I  am on Blog page$")
	public void i_am_on_Blog_page() throws Throwable {
		driver.navigate().to("http://www.phptravels.net/blog");
	}

	@When("^I click checking for Text Box$")
	public void i_click_checking_for_Text_Box() throws Throwable {
		BlogPage blog = new BlogPage();
		blog.inputtxtvalue("It Wasn’t Supposed to Rain");
		blog.btnSearch();
		Thread.sleep(3000);
	}

	@Then("^I validate the Text Box$")
	public void i_validate_the_Text_Box() throws Throwable {
		BlogPage blog = new BlogPage();
		if (blog.getBtnsearch().getText().equals(blog.getBtnsearch())) {
			System.out.println("valid");
		}
		else 
		{
			System.out.println("Invalid");
		}

	}

}
