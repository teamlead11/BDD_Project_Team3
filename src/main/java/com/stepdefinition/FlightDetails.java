package com.stepdefinition;

import org.openqa.selenium.By;

import com.ObjectRepository.FlightsPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightDetails {

	FunctionalLibrary func = new FunctionalLibrary();
	FlightsPage flightPage = new FlightsPage();

	String url = "www.phptravels.net";

	@Given("^I am on Fligh Details page$")
	public void i_am_on_Fligh_Details_page() {
		func.driverInit();
		func.navigateToUrl(url);
		func.driver.findElement(By.xpath("//a[@href='http://www.phptravels.net/flight']")).click();
	}

	@When("^I enter the Booking Page by pressing on Book as Guest Button$")
	public void i_enter_the_Booking_Page_by_pressing_on_Book_as_Guest_Button() {
		func.click(flightPage.getBtnBookNow());
		func.click(flightPage.getBtnGuest());

	}

	@When("^I enter the <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> in the Booking Summary page$")
	public void i_enter_the_in_the_Booking_Summary_page(String arg1, String arg2, String arg3, String arg4, String arg5,
			String arg6, String arg7) throws Throwable {

		func.setText(flightPage.getTxtFirstName(), "Rajasekar");
		func.setText(flightPage.getTxtLastName(), "Arunachalam");
		func.setText(flightPage.getTxtEmailId(), "raj@gmail.com");
	}

	@Then("^I verify Booking has been Confirmed$")
	public void i_verify_Booking_has_been_Confirmed() throws Throwable {
	}

}
