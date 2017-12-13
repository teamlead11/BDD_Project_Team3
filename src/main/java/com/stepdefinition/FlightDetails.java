package com.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightDetails {

	@Given("^I am on Fligh Details page$")
	public void i_am_on_Fligh_Details_page()  {
	}

	@When("^I enter the Booking Page by pressing on Book as Guest Button$")
	public void i_enter_the_Booking_Page_by_pressing_on_Book_as_Guest_Button() throws Throwable {
	}

	@When("^I enter the <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> in the Booking Summary page$")
	public void i_enter_the_in_the_Booking_Summary_page(String arg1, String arg2, String arg3, String arg4, String arg5,
			String arg6, String arg7) throws Throwable {
	}

	@Then("^I verify Booking has been Confirmed$")
	public void i_verify_Booking_has_been_Confirmed() throws Throwable {
	}

}
