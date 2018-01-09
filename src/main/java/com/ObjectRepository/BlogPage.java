package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class BlogPage extends FunctionalLibrary {
	@FindBy(xpath = "//div[@class='panel-body']//*[@class='col-md-8']")
	private List<WebElement> txtTitles;

	@FindBy(xpath = "//input[@class='form-control sub_email']")
	private WebElement txtinputsubEmail;

	@FindBy(xpath = "//*[@class='btn btn-primary']")
	private WebElement btnsearch;

	@FindBy(xpath = "//*[@class='nav nav-pills nav-justified']")
	private List<WebElement> btntablist;

	@FindBy(className = "list-group-item")
	private WebElement lnkCategories;

	@FindBy(className = "img-responsive post-img img-fade")
	private WebElement imgfade;

	@FindBy(className = "text-warning weak")
	private WebElement lnkpopular;

	@FindBy(className = "panel-heading title_rtl")
	private WebElement getSecondPage;

	public List<WebElement> getTxtTitles() {
		return txtTitles;
	}

	public WebElement getTxtinputsubEmail() {
		return txtinputsubEmail;
	}

	public List<WebElement> getBtntablist() {
		return btntablist;
	}

	public WebElement getGetSecondPage() {
		return getSecondPage;
	}

	public List<WebElement> getBtnTitles() {
		return txtTitles;
	}

	public List<WebElement> getBtnclicktab() {
		return btntablist;
	}

	public WebElement getLabsubEmail() {
		return txtinputsubEmail;
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
		PageFactory.initElements(driver, this);
	}

	public void BlogPagesNow(String indexvalue) {

		WebElement requiredElement = null;
		List<WebElement> Titles = getBtnTitles();
		for (int i = 0; i < Titles.size(); i++) {
			String Titles1 = Titles.get(i).findElement(By.tagName("h3")).getText();
			System.out.println(Titles1);
			if (Titles.get(i).findElement(By.tagName("h3")).getText().equals(indexvalue)) {
				System.out.println("Condition True");
				Titles.get(i).findElement(By.tagName("h3")).click();
				break;
			}

		}
	}

	public void pageNumbers(String PageNumber) {
		 WebElement req = null;
		List<WebElement> btntablist2 = getBtntablist();
		for (int i = 0; i < btntablist2.size(); i++) {
			String P = btntablist2.get(i).findElement(By.xpath("//a[contains(text(),'2')]")).getText();
			System.out.println(P);
			if (btntablist2.get(i).findElement(By.xpath("//a[contains(text(),'2')]")).getText().equals(PageNumber)) {
				System.out.println("Condition True");
				btntablist2.get(i).findElement(By.xpath("//a[contains(text(),'2')]")).click();
				break;
			}

		}

	}

	public void inputtxtvalue(String name) {
		WebElement inptxt = getLabsubEmail();
		inptxt.sendKeys(name);
	}

	public void btnSearch() {
		WebElement clickbtnSearch = getBtnsearch();
		clickbtnSearch.click();
	}

}
