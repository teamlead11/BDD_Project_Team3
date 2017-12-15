package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HomePageMiddle extends FunctionalLibrary{
	
	@FindBy(xpath = "//*[@class='featured-back hidden-xs hidden-sm']")
	private static WebElement lnkHotels;

	@FindBy(xpath = "//*[@class='glyphicon-chevron-right icon-angle-left flight-left']")
	private static WebElement lnkHotelsLeftArrow;

	@FindBy(xpath = "//*[@class='glyphicon-chevron-right icon-angle-right flight-right']")
	private static WebElement lnkHotelsRightArrow;

	@FindBy(xpath = "//*[@class='container  hidden-xs hidden-sm']")
	private static WebElement lnkTours;

	@FindBy(xpath = "(//*[@class='container hidden-xs hidden-sm'])[4]")
	private static WebElement lnkCars;
	
	@FindBy(xpath = "//*[@class='btn btn-danger btn-block p16']")
	private static WebElement btnViewMoreOffers;
	
	@FindBy(xpath = "(//*[@class='container hidden-xs hidden-sm'])[5]")
	private static WebElement lnkBlog;

	public static WebElement getLnkHotels() {
		return lnkHotels;
	}

	public static WebElement getLnkHotelsLeftArrow() {
		return lnkHotelsLeftArrow;
	}

	public static WebElement getLnkHotelsRightArrow() {
		return lnkHotelsRightArrow;
	}

	public static WebElement getLnkTours() {
		return lnkTours;
	}

	public static WebElement getLnkCars() {
		return lnkCars;
	}

	public static WebElement getBtnViewMoreOffers() {
		return btnViewMoreOffers;
	}

	public static WebElement getLnkBlog() {
		return lnkBlog;
	}
	
	public HomePageMiddle() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}
	
	private void goToHotels() {
	WebElement fetch = null;
	List<WebElement> lnk = ((WebElement) getLnkHotels()).findElements(By.tagName("div"));
	System.out.println(lnk.size());
	int size = lnk.size();
	for (int i = 0; i < size; i++) {
		if (lnk.get(i).getText().contains(null)) {
			fetch = lnk.get(i);

		}
		click(fetch);
	}

	

	}
	
}

