package com.ObjectRepository;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class CarsPage {
	
	WebDriver driver;
	
		@FindBy(xpath="//a[@href='http://www.phptravels.net/cars']")
		private WebElement Car;
		
	
	  @FindBy(xpath="//h4[@class='RTL go-text-right mt0 list_title']//b")
	  private static WebElement AllCarNames;
	  
	  @FindBy(xpath="//a[@class='go-right ellipsisFIX go-text-right mob-fs14']")
	  private WebElement Carlocation;
	  
	  @FindBy(xpath="//td[@class='text-center']")
	  private WebElement Guest;
	  
	 
	  @FindBy(xpath="//button[@class='btn btn-action btn-block']")
	  private List<WebElement> AllCarbuttonDetails;
	  
	  @FindBy(xpath="//button[@class='btn btn-success btn-xs']")
	  private WebElement Airportpickup;
	  
	  @FindBy(xpath="//div[@class='text-success fs18 text-left go-text-right go-right review ']")
	  private List<WebElement> Costofthecar;
	  
	  @FindBy(xpath="//img[@class='center-block']")
	  private WebElement CarImage;
	  
	  @FindBy(xpath="//a[@href='http://www.phptravels.net/cars/listing/2']")
	  private WebElement Pagenumber;
	  
	  

	  
	  public CarsPage(WebDriver driver) {
		  
		  this.driver=driver;
			PageFactory.initElements(FunctionalLibrary.driver, this);
	
	  }
	  
	  
	// getter methods to access elements
	  
	public WebElement getCar()
	
	{
		return Car; 
	}
	
	  public WebElement getAllCarTitleField() {
			return AllCarNames;
			
		}

		public WebElement getGuestField() {
			return Guest;
		}
		
		
		public WebElement getCarlocation() {
			return Carlocation;
		}


		
		public List<WebElement> getAllCarDetailsButton() {
			return AllCarbuttonDetails;
		}
		
		public WebElement getAirportpickupField() {
			return Airportpickup;
		}
		
		public List<WebElement> getCostofthecarField() {
			return Costofthecar;
		}
		
		public WebElement getAllCarImage() {
			return CarImage;
			
		}
		
		public WebElement getAllPageNumber() {
			return Pagenumber;
			
		}
		
		
		public List<WebElement> getAllCarNames(String name)
		 	{
		 		WebElement	reqdBtn=null;
		 	List<WebElement> AllCarNames= getAllCarNames(name);
		 	List<WebElement> AllCarbuttonDetails=getAllCarDetailsButton();
		 	for(int i=0;i<=AllCarNames.size();i++)
		 	{
		 		String actualHtlNames=AllCarNames.get(i).findElement(By.xpath("..")).getText();
		 		if(actualHtlNames.equals(name))
		 		{
		 			reqdBtn =AllCarbuttonDetails.get(i);
		 			break;
		 		}
		 				
		 		}
		 			FunctionalLibrary.click(reqdBtn);
					return AllCarNames;
		 }
		 

	
		
		public void Pagenumbe(String name)
		 	{
		 		WebElement requiredElement=null;
		 		WebElement Pagenumbe=getAllPageNumber();
		 		List<WebElement> pages=Pagenumbe.findElements(By.tagName("li"));
		 		System.out.println(pages.size()+"no.of elements in the module");
		 		for(int i=0;i<pages.size();i++)
		 		{
		 			if(pages.get(i).getText().equals(name))
		 				
		 				{
		 				requiredElement=pages.get(i);
		 				break;
		 			}
		 				
		 		}
				FunctionalLibrary.click(requiredElement);
			}

		public void getCostofthecarField(String name)
		 {
		 	WebElement reqPage=null;
		 	List<WebElement> AllCarTitle=getCostofthecarField();
		   List<WebElement> AllCarbuttonDetails=getAllCarDetailsButton();
		   for(int i=0;i<AllCarTitle.size();i++)
		   {
		 	  String actualUSD=getCostofthecarField().get(i).findElement(By.xpath("..")).getText();
		 	  System.out.println(actualUSD);
		 	  if(actualUSD.equals(name))
		 	  {
		 		  reqPage=AllCarbuttonDetails.get(i);
		 		  
		 	  }
		 	
		   }
		 }
}
		 
		
		
		
		
		