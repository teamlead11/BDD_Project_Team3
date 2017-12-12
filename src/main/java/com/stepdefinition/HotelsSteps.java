package com.stepdefinition;

import junit.framework.Assert;

import com.ObjectRepository.HotelsPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelsSteps  {
	HotelsPage page= new HotelsPage();
	

	@Given("^When i click on Hotel details$")
	public void when_i_click_on_Hotel_details() throws Throwable {
		FunctionalLibrary.driverInit();
		FunctionalLibrary.driver.get("http://www.phptravels.net/");
		FunctionalLibrary.click(page.gethotels());
		FunctionalLibrary.click(page.getbtndetails());
		
	}

	@When("^I enter noofrooms and extra beds$")
	public void i_enter_noofrooms_and_extra_beds() throws Throwable {
	  page.BookHotel();
	}

	@SuppressWarnings("deprecation")
	@Then("^I click on book now$")
	public void i_click_on_book_now() throws Throwable {
		Assert.assertEquals(FunctionalLibrary.getText(page.getbookingsummery()), "Booking Summary");
	   
	}
	
}
