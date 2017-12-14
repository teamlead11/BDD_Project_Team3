package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CarspageSteps {
public static WebDriver driver;
	
	public CarspageSteps() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//*[@class='RTL go-text-right mt0 list_title']//a//b")
	private List<WebElement> cars_name;

	public List<WebElement> getCars_name() {
		return cars_name;
	}

	@FindBy(how = How.XPATH, using = "//*[@class='col-md-4 col-xs-6 col-sm-4 go-left']//a//button")
	private List<WebElement> details_button;

	public List<WebElement> getDetails_button() {
		return details_button;
	}

	public void carNames(String carname) {
		WebElement detailsbutton = null;
		List<WebElement> allcarname = getCars_name();
		List<WebElement> alldetailbuttons = getDetails_button();
		for (int i = 0; i < allcarname.size(); i++) {

			String actualcarnames = allcarname.get(i).getText();
			System.out.println(actualcarnames);
			 if(actualcarnames.equals(carname)){

			 detailsbutton=alldetailbuttons.get(i);

			 }

		}
		detailsbutton.click();

	}


}
