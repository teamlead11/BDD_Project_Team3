package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class ToursPage extends FunctionalLibrary {
	@FindBy(xpath = "//div[@class='col-md-4 col-xs-6 col-sm-4 go-left']")
	private WebElement toursDetails;

	@FindBy(xpath = "//h4[@class='RTL go-text-right mt0 list_title']")
	private List<WebElement> tourslinks;

	@FindBy(xpath = "//div[@class='text-success fs18 text-left go-text-right go-right review ']/b/small")
	private WebElement toursUSD;

	@FindBy(xpath = "//i[@class='icon-thumbs-up-4']")
	private WebElement toursThumbsRatings;

	@FindBy(xpath = "//a[@class='go-right ellipsisFIX go-text-right mob-fs14']")
	private WebElement toursLocations;

	@FindBy(xpath = "//span[@class='go-right mob-fs10']")
	private WebElement toursStarRatings;

	@FindBy(xpath = "//img[@class='center-block']")
	private WebElement toursImageLink;

	@FindBy(xpath = "//div[@class='offset-3 offset-RTL']")
	private WebElement toursNavigationButton;

	@FindBy(xpath = "//div[@data-original-title='Add to wishlist']")
	private WebElement toursWishlist;

	@FindBy(xpath = "//div[@class='add_info hidden-sm hidden-xs go-right RTL']")
	private WebElement toursType;

	@FindBy(xpath = "//div[@data-original-title='Add to wishlist']")
	private WebElement toursExperience;

	public WebElement getToursDetails() {
		return toursDetails;
	}

	public void setToursDetails(WebElement toursDetails) {
		this.toursDetails = toursDetails;
	}

	public List<WebElement> getTourslinks() {
		return tourslinks;
	}

	public void printAllTourLinks(String linkname) throws InterruptedException {
		WebElement requiredElement = null;
		List<WebElement> pages = getTourslinks();

		for (int i = 0; i < pages.size(); i++) {
			String pages1 = pages.get(i).findElement(By.xpath("..")).getText();
			System.out.println(pages1);
			Thread.sleep(3000);
			if (pages.get(i).getText().equals(linkname)) {
				System.out.println("Condition True");
				requiredElement = pages.get(i).findElement(By.xpath("//*[@class='btn btn-action btn-block']"));
				break;
			}

		}
		requiredElement.click();
	}

	public void setTourslinks(List<WebElement> tourslinks) {
		this.tourslinks = tourslinks;
	}

	/*
	 * public List<WebElement> getToursUSD() { return (List<WebElement>)
	 * toursUSD; }
	 * 
	 * public void getExpectedUSD(String reqiuredusd) { List<WebElement> allUSD
	 * = getToursUSD(); WebElement requiredElement = null; for (int i = 0; i <
	 * allUSD.size(); i++) { String actualusd =
	 * allUSD.get(i).findElement(By.xpath("..")).getText(); if
	 * (actualusd.equals(reqiuredusd)) {
	 * 
	 * } }
	 * 
	 * }
	 */

	public void setToursUSD(WebElement toursUSD) {
		this.toursUSD = toursUSD;
	}

	public WebElement getToursThumbsRatings() {
		return toursThumbsRatings;
	}

	public void setToursThumbsRatings(WebElement toursThumbsRatings) {
		this.toursThumbsRatings = toursThumbsRatings;
	}

	public WebElement getToursLocations() {
		return toursLocations;
	}

	public void setToursLocations(WebElement toursLocations) {
		this.toursLocations = toursLocations;
	}

	public WebElement getToursStarRatings() {
		return toursStarRatings;
	}

	public void setToursStarRatings(WebElement toursStarRatings) {
		this.toursStarRatings = toursStarRatings;
	}

	public WebElement getToursImageLink() {
		return toursImageLink;
	}

	public void setToursImageLink(WebElement toursImageLink) {
		this.toursImageLink = toursImageLink;
	}

	public WebElement getToursNavigationButton() {
		return toursNavigationButton;
	}

	public void goToPage(String pageNumber) {
		WebElement requiredElement = null;
		WebElement pageParent = getToursNavigationButton();
		List<WebElement> pages = pageParent.findElements(By.tagName("li"));
		System.out.println(pages.size() + "\t no of pages in the module");

		for (int i = 0; i < pages.size(); i++) {
			System.out.println(pages.get(i).getText());
			if (pages.get(i).getText().equals(pageNumber)) {
				requiredElement = pages.get(i);
				break;
			}

		}
		requiredElement.click();

	}

	public void goToDetails() {
		// WebElement requiredElement = null;
		WebElement pageParent = getToursDetails();
		List<WebElement> pages = pageParent.findElements(By.tagName("@href"));
		System.out.println(pages.size() + "\t no of pages in the module");

		for (int i = 0; i < pages.size(); i++) {
			System.out.println(pages.get(i).getText());
			/*
			 * if (pages.get(i).getText().equals(pageNumber)) { requiredElement
			 * = pages.get(i); break; }
			 */

		}
		// requiredElement.click();

	}

	public void setToursNavigationButton(WebElement toursNavigationButton) {
		this.toursNavigationButton = toursNavigationButton;
	}

	public WebElement getToursWishlist() {
		return toursWishlist;
	}

	public void setToursWishlist(WebElement toursWishlist) {
		this.toursWishlist = toursWishlist;
	}

	public WebElement getToursType() {
		return toursType;
	}

	public void setToursType(WebElement toursType) {
		this.toursType = toursType;
	}

	public WebElement getToursExperience() {
		return toursExperience;
	}

	public void setToursExperience(WebElement toursExperience) {
		this.toursExperience = toursExperience;
	}

	public ToursPage() {
		PageFactory.initElements(driver, this);
	}
}
