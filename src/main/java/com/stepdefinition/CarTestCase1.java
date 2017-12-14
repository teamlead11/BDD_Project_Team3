package com.stepdefinition;



import org.junit.Assert;

import com.ObjectRepository.CarsPage;
import com.ObjectRepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CarTestCase1 extends FunctionalLibrary {
	
	@Given("^I am in php travel car home page$")
	public void i_am_in_php_travel_car_home_page() throws Throwable {
	  FunctionalLibrary.driver.get("http://www.phptravels.net/cars");
	   
	    
	}

	@When("^Click the car \"([^\"]*)\"so the user can able to see all the cars$")
	public void click_the_car_so_the_user_can_able_to_see_all_the_cars(String CarName) throws Throwable {
	    CarsPage page = new CarsPage(driver);
	    getText(page.getAllCarTitleField()); 
	    clickjs(page.getAllCarTitleField());
	}

	
	
	

	@Then("^Verify the user able to click  the car name link$")
	public void verify_the_user_able_to_click_the_car_name_link(String CarName) throws Throwable {
		CarsPage page = new CarsPage(driver);
		switch (CarName) {
		case "Toyota Camry 2015":
			Assert.assertEquals(getValue(null), getText(page.getAllCarTitleField()));
			break;
	    
	}


}
}