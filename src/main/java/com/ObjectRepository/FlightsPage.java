package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class FlightsPage extends FunctionalLibrary{

	@FindBy(className = "col-sm-2 col-md-2 col-xs-3 padding-zero")
	private static List<WebElement> btnDetails;

	@FindBy(id = "email")
	private WebElement txtEmailId;

	@FindBy(id = "pwd")
	private WebElement txtPassword;

	@FindBy(className = "btn btn-primary btn-block btn-lg")
	private WebElement btnLogin;

	@FindBy(className = "btn btn-success btn-block btn-lg")
	private WebElement btnGuest;

	@FindBy(id = "title")
	private WebElement ddTitle;

	@FindBy(id = "firstname")
	private WebElement txtFirstName;

	@FindBy(id = "lastname")
	private WebElement txtLastName;

	@FindBy(id = "phone")
	private WebElement txtPhone;

	@FindBy(id = "email")
	private WebElement txtEmail;

	@FindBy(id = "nationality")
	private WebElement txtNationality;

	@FindBy(id = "cardtype")
	private WebElement drpDwnCardType;

	@FindBy(id = "card-number")
	private WebElement txtCardNumber;

	@FindBy(id = "expiry-month")
	private WebElement drpDwnExpiryMonth;
	
	@FindBy(id = "expiry-year")
	private WebElement drpDwnExpiryYear;
	
	@FindBy(id = "cvv")
	private WebElement txtCVV;
	
	
	public static List<WebElement> getBtnDetails() {
		return btnDetails;
	}


	public WebElement getTxtEmailId() {
		return txtEmailId;
	}


	public WebElement getTxtPassword() {
		return txtPassword;
	}


	public WebElement getBtnLogin() {
		return btnLogin;
	}


	public WebElement getBtnGuest() {
		return btnGuest;
	}


	public WebElement getDdTitle() {
		return ddTitle;
	}


	public WebElement getTxtFirstName() {
		return txtFirstName;
	}


	public WebElement getTxtLastName() {
		return txtLastName;
	}


	public WebElement getTxtPhone() {
		return txtPhone;
	}


	public WebElement getTxtEmail() {
		return txtEmail;
	}


	public WebElement getTxtNationality() {
		return txtNationality;
	}


	public WebElement getDrpDwnCardType() {
		return drpDwnCardType;
	}


	public WebElement getTxtCardNumber() {
		return txtCardNumber;
	}


	public WebElement getDrpDwnExpiryMonth() {
		return drpDwnExpiryMonth;
	}


	public WebElement getDrpDwnExpiryYear() {
		return drpDwnExpiryYear;
	}
	public WebElement getTxtCVV() {
		return txtCVV;
	}


	public FlightsPage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
	public static void flightBookNow(String indexValue) {
		WebElement required = null;
		try {
			List<WebElement> btn = ((WebElement) getBtnDetails()).findElements(By.tagName("button"));
			System.out.println(btn.size());
			int size = btn.size();
			for (int i = 0; i < size; i++) {
				if (btn.get(i).getText().equals(indexValue)) {
					required = btn.get(i);

				}
				click(required);
			}
		} catch (NullPointerException e) {
			e.getMessage();
			System.out.println(e);
		}
	}

}

