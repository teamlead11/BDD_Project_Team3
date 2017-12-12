package com.ObjectRepository;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.resources.FunctionalLibrary;

public class HotelsPage {
	WebDriver driver;
	public HotelsPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//button[@class='btn btn-action btn-block'])[1]")
	private WebElement btndetails;
	
	@FindBy(xpath="//a[@href='http://www.phptravels.net/hotels']")
	private WebElement hotels;
	
	@FindBy(name="extrabeds")
	private WebElement drpdwnextrabed;
	
	@FindBy(xpath="//button[@class='hidden-xs btn btn-danger btn-block btn-md collapsed']")
	private WebElement moredetails;
	
	@FindBy(xpath="(//button[@class='btn btn-md btn-action btn-block btn-block chk mob-fs10'])[1]")
	private WebElement subbmit;
	
	@FindBy(xpath="(//select[@class='selectx input-sm none'])[1]")
	private WebElement drpdwnnorooms;
	
	@FindBy(xpath="//button[@class='hidden-xs btn-block btn btn-info btn-md']")
	private List<WebElement> availability;
	
	@FindBy(name="firstname")
	private WebElement fname;
	
	@FindBy(name="lastname")
	private WebElement lname;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="confirmemail")
	private WebElement cemail;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(xpath="//span[@class='select2-chosen']")
	private WebElement drpdwncountry;
	
	@FindBy(xpath="//textarea[@placeholder='You can enter any additional notes or information you want included with your order here...']")
	private List<WebElement> notes;
	
	@FindBy(xpath="//button[@class='btn btn-action btn-lg btn-block completebook']")
	private WebElement confirmbooking;
	
	@FindBy(xpath="//*[contains(text(),'Booking Summary')]")
	private WebElement bookingsummery;
	
public WebElement getbookingsummery(){
	return bookingsummery;
}
	
	
public WebElement getbtndetails(){
	return btndetails;
}
	
public WebElement gethotels(){
	return hotels;
}
public WebElement getextrabed(){
	return drpdwnextrabed;
}

public WebElement getmoredetails(){
	return moredetails;
}

public WebElement getbooknow(){
	return subbmit;
}

public WebElement getdrpdwnnorooms(){
	return drpdwnnorooms;
}

public List<WebElement> getavailability(){
	return availability;
}

public WebElement getfname(){
	return fname;
}

public WebElement getlname(){
	return lname;
}

public WebElement getemail(){
	return email;
	}

public WebElement getcemail(){
	return cemail;
}

public WebElement getphone(){
	return phone;
}

public WebElement getaddress(){
	return address;
}

public WebElement getdrpdwncountry(){
	return drpdwncountry;
}

public List<WebElement> getnotes(){
	return notes;
}

public WebElement getconfirmbookin(){
	return confirmbooking;
}

public void BookHotel() {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,500)", "");
	FunctionalLibrary.click(getdrpdwnnorooms());
	Select s1= new Select(getdrpdwnnorooms());
	s1.selectByValue("2");
	FunctionalLibrary.click(getextrabed());
	Select s= new Select(getextrabed());
	s.selectByValue("1");
	FunctionalLibrary.click(getbooknow());
	
}
}
