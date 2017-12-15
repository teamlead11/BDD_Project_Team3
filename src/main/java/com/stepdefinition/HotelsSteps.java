package com.stepdefinition;



import org.junit.Assert;

import com.ObjectRepository.HotelsPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class HotelsSteps extends FunctionalLibrary {
	
	//HotelsPage hotelpage = new HotelsPage();
	
	@Given("^I am in hotel page of PHP Travels site$")
	public void i_am_in_hotel_page_of_PHP_Travels_site() throws Throwable {
		driver=driverInit();
		driver.get("http://www.phptravels.net/hotels");
	}

	@When("^I click the PHPTravel Link$")
	public void i_click_the_PHPTravel_Link() throws Throwable {
		click(new HotelsPage().getPhpText());
		switchToWindow();
	}

	@Then("^I verify i am in PHPTravels page$")
	public void i_verify_i_am_in_PHPTravels_page() throws Throwable {
	  String url=driver.getCurrentUrl();
	  System.out.println(url);
	 Assert.assertEquals("http://phptravels.com/", url); 
	}
	@When("^I click the Contact Link$")
	public void i_click_the_Contact_Link() throws Throwable {
		new HotelsPage().companyLinks("Contact");
		switchToWindow();
		
	}

	@Then("^I verify i am in Contact page$")
	public void i_verify_i_am_in_Contact_page() throws Throwable {
		String url=driver.getCurrentUrl();
		  System.out.println(url);
		 Assert.assertEquals("http://www.phptravels.net/contact-us", url); 
	}


}
