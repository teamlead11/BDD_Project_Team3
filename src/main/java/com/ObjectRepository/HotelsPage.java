package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HotelsPage {
	public WebDriver driver;
	
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

	
public HotelsPage()
{
	PageFactory.initElements(driver, this);
	
}

}
