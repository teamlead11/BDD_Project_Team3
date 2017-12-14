package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class CarsPage {
	  @FindBy(xpath="//h4[@class='RTL go-text-right mt0 list_title']")
	  private static  WebElement AllCarTitle;
	  
	  @FindBy(xpath="//a[@class='go-right ellipsisFIX go-text-right mob-fs14']")
	  private WebElement Carlocation;
	  
	  @FindBy(xpath="//td[@class='text-center']")
	  private WebElement Guest;
	  
	 
	  @FindBy(xpath="//button[@class='btn btn-action btn-block']")
	  private WebElement AllCarDetails;
	  
	  @FindBy(xpath="//button[@class='btn btn-success btn-xs']")
	  private WebElement Airportpickup;
	  
	  @FindBy(xpath="//div[@class='text-success fs18 text-left go-text-right go-right review ']")
	  private WebElement Costofthecar;
	  
	  @FindBy(xpath="//img[@class='center-block']")
	  private WebElement CarImage;
	  
	  @FindBy(xpath="//a[@href='http://www.phptravels.net/cars/listing/2']")
	  private WebElement Pagenumber;
	  
	  

	  
	  public CarsPage() {
			PageFactory.initElements(FunctionalLibrary.driver, this);
	
	  }
	  
	  
	// getter methods to access elements
	  
		
	  public static WebElement getAllCarTitleField() {
			return AllCarTitle;
			
		}

		public WebElement getGuestField() {
			return Guest;
		}

		
		
		public WebElement getAllCarDetailsButton() {
			return AllCarDetails;
		}
		
		public WebElement getAirportpickupField() {
			return Airportpickup;
		}
		
		public WebElement getCostofthecarField() {
			return Costofthecar;
		}
		
		public WebElement getAllCarImage() {
			return CarImage;
			
		}
		
		public WebElement getAllPageNumber() {
			return Pagenumber;
			
		}
		
		
		public WebElement getAllCarTitleField(String name)
		{
	WebElement carname = getAllCarTitleField();
	List<WebElement>pages=carname.findElements(By.xpath("//img[@class='center-block']"));
	System.out.println(pages.size()+"no.of carImage");
	for(int i=0;i<pages.size();i++)
		if(pages.get(i).getText().equals(name))
				{
			
			carname=pages.get(i);
			break;
			}

				
		carname.click();
		return carname;
		}
		

	
		public void getAllCarImage(String Image)
		{
	WebElement carParent = getAllCarImage();
	List<WebElement>pages=carParent.findElements(By.xpath("//img[@class='center-block']"));
	System.out.println(pages.size()+"no.of carImage");
	for(int i=0;i<pages.size();i++)
		if(pages.get(i).getText().equals(Image))
				{
			
			carParent=pages.get(i);
			break;
			}

				
		carParent.click();
		}
		
		public void getAllCarDetailsButton(String name)
		{
			
			
			WebElement carbtnDetail =getAllCarDetailsButton();
				List<WebElement>pages=carbtnDetail.findElements(By.xpath("//button[@class='btn btn-action btn-block']"));
				System.out.println(pages.size()+"no.of car");
				for(int i=0;i<pages.size();i++)
					if(pages.get(i).getText().equals(name))
							{
						
						carbtnDetail=pages.get(i);
						break;
						}
			
							
					carbtnDetail.click();
			
			}

		
		
		public void getAllPageNumber(String pagenumber)
		{
			
		WebElement pageParent = getAllPageNumber();
			List<WebElement>pages=pageParent.findElements(By.tagName("li"));
			System.out.println(pages.size()+"no.of pages");
			for(int i=0;i<pages.size();i++)
				if(pages.get(i).getText().equals(pagenumber))
						{
					
					pageParent=pages.get(i);
					break;
					}
		
						
				pageParent.click();
		
		}

}
		