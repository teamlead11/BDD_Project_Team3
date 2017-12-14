package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class BlogPage extends FunctionalLibrary {

	@FindBy(className = "go-right RTL mtb0")
	private List<WebElement> btnTitles;

	@FindBy(className = "img-responsive")
	private WebElement imgDetails;

	@FindBy(className = "nav nav-pills nav-justified")
	private WebElement btntablist;

	@FindBy(className = "form-control sub_email")
	private WebElement labsubEmail;

	@FindBy(className = "btn btn-primary")
	private WebElement btnsearch;

	@FindBy(className = "list-group-item")
	private WebElement lnkCategories;

	@FindBy(className = "img-responsive post-img img-fade")
	private WebElement imgfade;

	@FindBy(className = "text-warning weak")
	private WebElement lnkpopular;

	@FindBy(className = "panel-heading title_rtl")
	private WebElement getSecondPage;

	public WebElement getGetSecondPage() {
		return getSecondPage;
	}

	public List<WebElement> getBtnTitles() {
		return btnTitles;
	}

	public WebElement getImgDetails() {
		return imgDetails;
	}

	public WebElement getBtnclicktab() {
		return btntablist;
	}

	public WebElement getLabsubEmail() {
		return labsubEmail;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}

	public WebElement getLnkCategories() {
		return lnkCategories;
	}

	public WebElement getImgfade() {
		return imgfade;
	}

	public WebElement getLnkpopular() {
		return lnkpopular;
	}

	public BlogPage() {
		PageFactory.initElements(FunctionalLibrary.driver, this);
	}

	public void BlogPagesNow(String indexvalue) {
		WebElement req = null;
		List<WebElement> btn = getBtnTitles();
		System.out.println(btn.size());
		int size = btn.size();
		for (int i = 0; i < size; i++) {
			if (btn.get(i).getText().equals(indexvalue)) {
				req = btn.get(i);
				break;
			}
			click(req);
		}

	}

	public void pageNation(String pageNumber) {
		WebElement req = null;
		List<WebElement> btnNation = getBtnclicktab().findElements(By.tagName("li"));
		System.out.println(btnNation.size());
		int size = btnNation.size();
		for (int i = 0; i < size; i++) {
			if (btnNation.get(i).getText().equals(pageNumber)) {
				req = btnNation.get(i);
				break;
			}
			click(req);
		}

	}

}
