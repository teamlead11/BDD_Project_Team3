package com.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HomePageFooter {

	@FindBy(xpath = "(//*[@class='footerlist go-right go-text-right'])[1]")
	private WebElement underCompanyHeading;

	@FindBy(xpath = "(//*[@class='footerlist go-right go-text-right'])[2]")
	private WebElement underBusinessHeading;

	@FindBy(xpath = "(//*[@class='footerlist go-right go-text-right'])[3]")
	private WebElement underFooterHeading;

	@FindBy(xpath = "(//*[@class='col-md-4 fl'])")
	private WebElement mobileApplication;

	@FindBy(linkText = "PHPTRAVELS")
	private WebElement poweredByPHP;

	@FindBy(xpath = "(//*[@class='navbar-right <!--go-left-->'])")
	private WebElement socialWebsites;

	@FindBy(xpath = "(//*[@class='form-control fccustom2 sub_email'])")
	private WebElement newsLetterTxtBox;

	@FindBy(xpath = "(//*[@class='btn btn-default btncustom sub_newsletter'])")
	private WebElement newsLetterBtnClick;

	@FindBy(xpath = "//*[@class='foot-brand center-block img-responsive']")
	private WebElement travelAgency;

	@FindBy(xpath = "(//*[@class='row'])[24]")
	private WebElement signUpNlogin;

	public WebElement getUnderCompanyHeading() {
		return underCompanyHeading;
	}

	public WebElement getUnderBusinessHeading() {
		return underBusinessHeading;
	}

	public WebElement getUnderFooterHeading() {
		return underFooterHeading;
	}

	public WebElement getMobileApplication() {
		return mobileApplication;
	}

	public WebElement getPoweredByPHP() {
		return poweredByPHP;
	}

	public WebElement getSocialWebsites() {
		return socialWebsites;
	}

	public WebElement getNewsLetterTxtBox() {
		return newsLetterTxtBox;
	}

	public WebElement getNewsLetterBtnClick() {
		return newsLetterBtnClick;
	}

	public WebElement getTravelAgency() {
		return travelAgency;
	}

	public WebElement getSignUpNlogin() {
		return signUpNlogin;
	}

	public HomePageFooter() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
}
