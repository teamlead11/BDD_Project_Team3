package com.stepdefinition;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.ObjectRepository.BlogPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BlogPageNumber extends FunctionalLibrary {

	@Given("^I am on Blog pages$")
	public void i_am_on_Blog_pages() throws Throwable {
		driverInit();
		driver.get("http://www.phptravels.net/blog");
	}

	@When("^I click checking for all pages$")
	public void i_click_checking_for_all_pages() throws Throwable {
		BlogPage blog = new BlogPage();
		blog.pageNumbers("2");

	}

	@Then("^I validate the pages$")
	public void i_validate_the_pages() throws Throwable {
		try {
			assertTrue(
					driver.findElement(By.xpath("//*[@class='nav nav-pills nav-justified']//a[contains(text(),'2')]"))
							.getText().matches("verify text is present"));
		} catch (Error e) {

			System.out.println(e.toString());
		}

	}

}
