package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class ContactPage {

	@FindBy(className = "form_title title_rtl")
	private WebElement txtContact;

	@FindBy(className = "height44 form-control logpadding margtop10  contact_form")
	private WebElement labName;

	@FindBy(xpath = "//input[@placeholder=\'Email\']")
	private WebElement labEmail;

	@FindBy(className = "//input[@placeholder=\'Subject\']")
	private WebElement labSubject;

	@FindBy(className = "form-control margtop10")
	private WebElement labMessage;

	@FindBy(className = "col-md-4 opensans grey go-right RTL")
	private WebElement labAddress;

	@FindBy(className = "btn btn-primary btn-block btn-lg go-right")
	private WebElement btnSubmit;

	public WebElement getTxtContact() {
		return txtContact;
	}

	public WebElement getLabName() {
		return labName;
	}

	public WebElement getLabEmail() {
		return labEmail;
	}

	public WebElement getLabSubject() {
		return labSubject;
	}

	public WebElement getLabMessage() {
		return labMessage;
	}

	public WebElement getLabAddress() {
		return labAddress;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public ContactPage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}

}
