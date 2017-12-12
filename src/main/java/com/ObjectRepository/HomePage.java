package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;


public class HomePage {
	
	WebDriver driver;

	@FindBy(xpath="//*[@class='dropdown-toggle']")
	private WebElement HomeButton;
	
	@FindBy(xpath="//span[@class='select2-chosen']")
	private WebElement HSearchHotel;
	
	@FindBy(name="checkin")
	private WebElement HCheckindate;
	
	@FindBy(name="checkout")
	private WebElement HCheckoutdate;
	
	@FindBy(name="travellers")
	private WebElement HGuest;
	
	@FindBy(xpath="//*[@class='btn-danger btn btn-lg btn-block pfb0 loader-wrap']")
	private WebElement HSearchbtn;
	
	
	@FindBy(xpath="//*[@class='dropdown-toggle go-text-right']")
	private WebElement HeaderMyacct;
	
	@FindBy(xpath="//*[@class='active']")
	private WebElement Hoteltabbtn;
	
	
	@FindBy(xpath="//*[@class='select2-chosen']")
	private WebElement Locsearch;
	
	

	@FindBy(name="checkin")
	private WebElement Hotelchkin;
	
	
	@FindBy(name="checkout")
	private WebElement Hotelchkout;
	
	
	@FindBy(xpath="//*[@class='btn-danger btn btn-lg btn-block pfb0 loader-wrap']")
	private WebElement Searchbtn;
	
	
	@FindBy(xpath="//*[@class='form-control fs12']")
	private WebElement flighteconomy;
	
	@FindBy(name="departure")
	private WebElement flightdepart;
	
	
	@FindBy(name="arrival")
	private WebElement flightreturn;
	
	@FindBy(name="totalPassenger")
	private WebElement flightguest;
	
	
	@FindBy(xpath="//*[text()='Search by Listing or City Name']")
	private WebElement tourloc;
	
	
	@FindBy(name="date")
	private WebElement tourchkin;
	
	
	@FindBy(id="adults")
	private WebElement touradult;
	
	@FindBy(id="departcar")
	private WebElement cardepart;
	
	
	@FindBy(id="pickupTime")
	private WebElement carpickuptime;
	
	
	@FindBy(id="dropoffDate")
	private WebElement cardropoff;
	
	
	@FindBy(id="dropoffTime")
	private WebElement cardropofftime;
	
	
	@FindBy(xpath="//*[text()='Easy & Fast Booking']")
	private WebElement heasyfastbook;
	
	
	
	@FindBy(xpath="//*[text()='Secure Payment']")
	private WebElement hsecpay;
	
	
	@FindBy(xpath="//*[text()='24/7 Customer Support']")
	private WebElement hcustsupp;
	
	
	@FindBy(xpath="//*[text()='100% Secure payments']")
	private WebElement hsecpay1;
	
	public void getMenu()
	
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.phptravels.net/");
		

		WebElement CT1=driver.findElement(By.xpath("//*[@class='nav nav-tabs RTL nav-justified']"));
		
		List<WebElement> CCT1=CT1.findElements(By.tagName("li"));
		for(int i = 0;i<CCT1.size();i++)
				{
			String CCT2=CCT1.get(i).getText();
			System.out.println(CCT2);
				}
		
	}

	
}
