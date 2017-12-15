package com.stepdefinition;

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
		driver.get("http://www.phptravels.net");
		driver.findElement(By.xpath("//a[@href='http://www.phptravels.net/blog']")).click();
	}

	@When("^I click checking for all image$")
	public void i_click_checking_for_all_image() throws Throwable {
		BlogPage blog = new BlogPage();
		blog.pageNation("2");

	}

	@Then("^I validate images$")
	public void i_validate_images() throws Throwable {
		BlogPage blog = new BlogPage();
		if (blog.getGetSecondPage().getText().equals(blog.getGetSecondPage())) {
			System.out.println("valid");
			
		}
			
	else
	{
				System.out.println("Invalid");
			}

	}

}
