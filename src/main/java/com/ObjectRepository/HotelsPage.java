package com.ObjectRepository;

import java.util.List;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HotelsPage extends FunctionalLibrary {
	
	@FindBy(xpath = "//img[@src='http://www.phptravels.net/uploads/global/phptravels.png']")
	private WebElement phpLogo;
	@FindBy(xpath = "//p//a//strong[text()='PHPTRAVELS']")
	private WebElement phpText;
	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailNewsletter;
	@FindBy(xpath = "//button[@class='btn btn-default btncustom sub_newsletter']")
	private WebElement btnNewsletter;
	@FindBy(xpath = "//img[@src='http://www.phptravels.net/uploads/images/social/slufm6otpasooc.png']")
	private WebElement fbLink;
	@FindBy(xpath = "//img[@src='http://www.phptravels.net/uploads/images/social/9ztbr148kh4o8c8.png']")
	private WebElement twitterLink;
	@FindBy(xpath = "//img[@src='http://www.phptravels.net/uploads/images/social/946746yt.png.png']")
	private WebElement youtubeLink;
	@FindBy(xpath = "//img[@src='http://www.phptravels.net/uploads/images/social/2wz814aq9mgw04k.png']")
	private WebElement googleLink;
	@FindBy(xpath = "//img[@src='http://www.phptravels.net/uploads/images/social/729370rs.png.png']")
	private WebElement sitemapLink;
	@FindBy(xpath = "//a//img[@src='http://www.phptravels.net/uploads/global/logo.png' and @class='foot-brand center-block img-responsive']")
	private WebElement travelagencyLink;
	@FindBy(xpath = "//*[@id='footer']//div[1]//div[2]//ul")
	private WebElement companyDetails;
	@FindBy(xpath = "//ul[@class='footerlist go-right go-text-right'][2]")
	private WebElement businessDetails;
	@FindBy(xpath = "//ul[@class='footerlist go-right go-text-right'][3]")
	private WebElement footerDetails;
	@FindBy(xpath = "//a[text()='Supplier Sign Up']")
	private WebElement supplierSignup;
	@FindBy(xpath = "//a[text()='Extranet Login']")
	private WebElement extranetLogin;
	@FindBy(xpath = "//i[@class='icon-up-open-big']")
	private WebElement icon;

	public HotelsPage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}

	public WebElement getIcon() {
		return icon;
	}

	public WebElement getPhpLogo() {
		return phpLogo;
	}

	public WebElement getPhpText() {
		return phpText;
	}

	public WebElement getEmailNewsletter() {
		return emailNewsletter;
	}

	public WebElement getBtnNewsletter() {
		return btnNewsletter;
	}

	public WebElement getFbLink() {
		return fbLink;
	}

	public WebElement getTwitterLink() {
		return twitterLink;
	}

	public WebElement getYoutubeLink() {
		return youtubeLink;
	}

	public WebElement getGoogleLink() {
		return googleLink;
	}

	public WebElement getSitemapLink() {
		return sitemapLink;
	}

	public WebElement getTravelagencyLink() {
		return travelagencyLink;
	}

	public WebElement getCompanyDetails() {
		return companyDetails;
	}

	public WebElement getBusinessDetails() {
		return businessDetails;
	}

	public WebElement getFooterDetails() {
		return footerDetails;
	}

	public WebElement getSupplierSignup() {
		return supplierSignup;
	}

	public WebElement getExtranetLogin() {
		return extranetLogin;
	}

	// custom method
	public void companyLinks(String companylink) {
		WebElement element = null;
		try {
		System.out.println(companylink);
		List<WebElement> options = getCompanyDetails().findElements(By.tagName("li"));
		int size = options.size();
		System.out.println(size);
		String text1=options.get(0).findElement(By.tagName("a")).getText();
		System.out.println(text1);
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			System.out.println(text);
			if (text.equals(companylink)) {
				element = options.get(i).findElement(By.tagName("a"));
				break;
				}
			}
		click(element);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}	
	public void businessLinks(String businesslink) {
		WebElement element = null;
		List<WebElement> options = getBusinessDetails().findElements(By.tagName("li"));
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			System.out.println(text);
			if (text.equals(businesslink)) {
				element = options.get(i).findElement(By.tagName("a"));
				break;
			}
		}
		click(element);
	}

	public void footerlinks(String footerlink) {
		WebElement element = null;
		List<WebElement> options = getFooterDetails().findElements(By.tagName("li"));
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			System.out.println(text);
			if (text.equals(footerlink)) {
				element = options.get(i).findElement(By.tagName("a"));
				break;
			}
		}
		click(element);
	}
}
