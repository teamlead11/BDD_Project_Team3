package com.stepdefinition;

import org.openqa.selenium.By;

import com.ObjectRepository.FlightsPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightDetails extends FunctionalLibrary {

	String url = "www.phptravels.net";

	@Given("^I am on Fligh Details page$")
	public void i_am_on_Fligh_Details_page() {
		driver.get("http://www.phptravels.net");
		driver.findElement(By.xpath("//a[@href='http://www.phptravels.net/air']")).click();
	}

	@When("^I enter the Booking Page by pressing on Book as Guest Button$")
	public void i_enter_the_Booking_Page_by_pressing_on_Book_as_Guest_Button() {
		FlightsPage F = new FlightsPage();
		click(F.getBtnBookNow());
		System.out.println(F.getBtnBookNow().getText());
		clickjs(F.getBtnGuest());

	}

	@When("^I enter the <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> <\"([^\"]*)\"> in the Booking Summary page$")
	public void i_enter_the_in_the_Booking_Summary_page(String firstName, String lastName, String phone, String email,String cardType,
			String nationality, String cardNumber, String cvvNumber) throws Throwable {
		FlightsPage F = new FlightsPage();
		setText(F.getTxtFirstName(), firstName);
		setText(F.getTxtLastName(), lastName);
		setText(F.getTxtEmailId(), email);
		setText(F.getTxtPhone(), phone);
		setText(F.getTxtNationality(), nationality);
		dropDownSelectedValue(F.getDrpDwnCardType());
		setText(F.getTxtCardNumber(), cardNumber);
		dropDownSelectedValue(F.getDrpDwnExpiryMonth());
		setText(F.getTxtCVV(), cvvNumber);
	}

	@Then("^I verify Booking has been Confirmed$")
	public void i_verify_Booking_has_been_Confirmed() throws Throwable {

	}

}
