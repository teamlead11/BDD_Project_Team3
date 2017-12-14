package com.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.ObjectRepository.CarsPage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CarTestCase2 extends FunctionalLibrary{
	
	
	@Given("^I am in php car travel home page$")
	public void i_am_in_php_car_travel_home_page() throws Throwable {
		 FunctionalLibrary.driver.get("http://www.phptravels.net/cars");
	}

	@When("^Click the car images to see the image of the car$")
	public void click_the_car_images_to_see_the_image_of_the_car(String carImage) throws Throwable {
	    CarsPage page=new CarsPage(driver);
	    getText(page.getAllCarImage());
	    click(page.getAllCarImage());
	    
	    
	}

	
	

	@Then("^Verify the user able to click the car image$")
	public void verify_the_user_able_to_click_the_car_image() throws Throwable {
		 CarsPage page=new CarsPage(driver);
		Assert.assertEquals(getValue(null), getText(page.getAllCarTitleField()));
	}



}
