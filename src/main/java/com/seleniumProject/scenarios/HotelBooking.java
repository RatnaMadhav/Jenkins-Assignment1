package com.seleniumProject.scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HotelBooking {
	WebDriver driver;
	public HotelBooking(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;

	}
	
	
	
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Flight Booking')]")
	public WebElement flightBooking;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Hotels')]")
	public WebElement hotels;

    
	@FindBy(how=How.XPATH, using="//input[@id='ctl00_mainContent_txtOriginStation1_MST']")
	public WebElement destinationCity;
	
	@FindBy(how=How.XPATH, using="//input[@id='ctl00_mainContent_ButtonSubmit_MST']")
	public WebElement search;
	
	
	public void clickFlightBooking() {
		flightBooking.click();
	}

	public void clickHotels() {
		hotels.click();
	}
	public void clickDestinationCity() {
		destinationCity.click();
	}
	

	public void clickSearch() {
		search.click();
	}


	
}