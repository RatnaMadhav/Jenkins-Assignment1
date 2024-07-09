package com.seleniumProject.tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.seleniumProject.scenarios.AddProductinCart;
import com.seleniumProject.scenarios.HotelBooking;

import baseclass.BaseTest;

public class HotelBookingTest extends BaseTest {

	@Test(priority = 10)
	public void FlightBook() {
		extentTest = extent.startTest("clicked to FLight Booking & Hotel");
		log.info("Click To Product");
		HotelBooking home = new HotelBooking(driver);
		home.clickFlightBooking();
		extentTest.log(LogStatus.PASS, "Test case Passed sucessfully.");
		try {
		    Thread.sleep(3000); // Pause execution for 3 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	}
	
//	@Test(priority = 11)
//	public void Hotel() {
//		extentTest = extent.startTest("clicked to Hotel");
//		log.info("Click To Product");
//		HotelBooking home = new HotelBooking(driver);
//		home.clickHotels();
//		extentTest.log(LogStatus.PASS, "Test case Passed sucessfully.");
//	}
//	
//	@Test(priority = 12)
//	public void DestinationCity() {
//		extentTest = extent.startTest("clicked to destination city");
//		log.info("Click To Product");
//		HotelBooking home = new HotelBooking(driver);
//		home.clickDestinationCity();
//		extentTest.log(LogStatus.PASS, "Test case Passed sucessfully.");
//	}
//	
//	@Test(priority = 13)
//	public void Searching() {
//		extentTest = extent.startTest("clicked to serch");
//		log.info("Click To Product");
//		HotelBooking home = new HotelBooking(driver);
//		home.clickSearch();
//		extentTest.log(LogStatus.PASS, "Test case Passed sucessfully.");
//	}

}
