package com.stepdefinition;

import org.junit.Assert;

import com.ObjectRepository.ToursPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ToursSteps {
	@Given("^user on the PhpTravel tours page$")
	public void user_on_the_PhpTravel_tours_page() throws Throwable {
	    FunctionalLibrary.driver.get("http://www.phptravels.net/tours");
	    
	}

	@When("^the user click the select link$")
	public void the_user_click_the_select_link() throws Throwable {
	    ToursPage tp = new ToursPage();
	    tp.printAllTourLinks("Spectaculars Of The…");
	}

	@Then("^the page for the selected link detials should be displayed$")
	public void the_page_for_the_selected_link_detials_should_be_displayed() throws Throwable {
		String CurrentTitle = FunctionalLibrary.driver.getTitle();
	    Assert.assertEquals("Spectaculars Of The Nile 3 Nights", CurrentTitle);
	    System.out.println("Expected result passed");
	}
}
