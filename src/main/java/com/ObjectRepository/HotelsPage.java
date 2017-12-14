package com.ObjectRepository;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;


	


public class HotelsPage extends FunctionalLibrary {
	WebDriver driver;

	@FindBy(xpath = "//img[@alt='PHPTRAVELS'and @class='logo']")
	private WebElement phpLogo;
	@FindBy(xpath = "//a//strong[text()='PHPTRAVELS']")
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
	@FindBy(xpath = "//ul[@class='footerlist go-right go-text-right'][1]")
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
		jsScrollPageDown(getExtranetLogin());
		List<WebElement> options = getCompanyDetails().findElements(By.tagName("li"));
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
	@FindBy(xpath="//*[@href='http://www.phptravels.net/hotels']")
	private WebElement hotelPage;
	
	public WebElement getHotelPage()
	{
		return hotelPage;
	}

	@FindBy(xpath="//h4[@class='RTL go-text-right mt0 list_title']//b")
	private List<WebElement> hotelNames;
	
	public List<WebElement> getHotelNames() {
		return hotelNames;
	}
	
	@FindBy(xpath="//button[text()= 'Details']")
	private List<WebElement> btnDetail;
	
	
	public List<WebElement> getBtnDetail() {
		return btnDetail;
	}

	@FindBy(xpath="//a[@class='go-right ellipsisFIX go-text-right mob-fs14']")
	private List<WebElement> htlLocation;

	public List<WebElement> getHtlLocation() {
		return htlLocation;
	}

	@FindBy(xpath="//span[@class='go-right mob-fs10']")
	private List<WebElement> starSymbol;
	
	public List<WebElement> getStarSymbol()
	{
		return starSymbol;
	}
	
	@FindBy(xpath="//ul[@class='hotelpreferences go-right hidden-xs']")
	private List<WebElement> allSymbol;
	
	public List<WebElement> getAllSymbol()
	{
		return allSymbol;
	}
	
	@FindBy(xpath="//b//small")
	private List<WebElement> allUsd;
	
	public List<WebElement> getAllUsd()
	{
		return allUsd;
	}
	
		
@FindBy(xpath="//ul[@class='nav nav-pills nav-justified pagination-margin']")
private WebElement paginationParent; 

public WebElement getPaginationParent()
{
	return paginationParent;
}

@FindBy(xpath="//div[@class='img_list']")
private List<WebElement> images;

public List<WebElement> getImages()
{
	return images;
}


@FindBy(xpath="//b//small")
private List<WebElement> usd;

public List<WebElement> getUsd()
{
return usd;
}

public void getUSD(String name)
{
	WebElement reqPage=null;
	List<WebElement> allUSD=getUsd();
  List<WebElement> reqBtnDetail=getBtnDetail();
  for(int i=0;i<allUSD.size();i++)
  {
	  String actualUSD=getUsd().get(i).findElement(By.xpath("..")).getText();
	  System.out.println(actualUSD);
	  if(actualUSD.equals(name))
	  {
		  reqPage=reqBtnDetail.get(i);
		  
	  }
	
	
}
	
  FunctionalLibrary.click(reqPage);

}


public void goToHotelDetailPage(String name)
	{
		WebElement	reqdBtn=null;
	List<WebElement> allHotelNames= getHotelNames();
	List<WebElement> reqBtnDetail=getBtnDetail();
	for(int i=0;i<=allHotelNames.size();i++)
	{
		String actualHtlNames=allHotelNames.get(i).findElement(By.xpath("..")).getText();
		if(actualHtlNames.equals(name))
		{
			reqdBtn =reqBtnDetail.get(i);
			break;
		}
				
		}
			FunctionalLibrary.click(reqdBtn);
}


public void gotoPage(String PageNumber)
	{
		WebElement requiredElement=null;
		WebElement pageParent=getPaginationParent();
		List<WebElement> pages=pageParent.findElements(By.tagName("li"));
		System.out.println(pages.size()+"no.of elements in the module");
		for(int i=0;i<pages.size();i++)
		{
			if(pages.get(i).getText().equals(PageNumber))
				
				{
				requiredElement=pages.get(i);
				break;
			}
				
		}
		FunctionalLibrary.click(requiredElement);
	}

	


}
