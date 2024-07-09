package com.seleniumProject.tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.seleniumProject.scenarios.ViewTopDeals;

import baseclass.BaseTest;

	public class ViewTopDealsTest extends BaseTest {
		@Test(priority = 0)
		public void testDeals() {
			extentTest = extent.startTest("testDeals");
			log.info("Click Top Deals");
			ViewTopDeals home = new ViewTopDeals(driver);
			home.clickTopDeals();
			extentTest.log(LogStatus.PASS, "Test case Passed sucessfully.");

		}

//		@Test(priority=1)
//		public void testFruitName() {
//			log.info("Clicked to Food/Veg Name");
//			extentTest = extent.startTest("ClickNextSlide");
//			ViewTopDeals home=new ViewTopDeals(driver);
//			home.clickFruitName();
//			extentTest.log(LogStatus.PASS,"Test Case Passsesd successfully");
//			}



//		@Test(priority=2)
//
//	    public void testPrice(){
//			log.info("Clicked to price section");
//			extentTest = extent.startTest("ClicktoPrice");
//			ViewTopDeals home=new ViewTopDeals(driver);
//	        home.clickPrice();
//			extentTest.log(LogStatus.PASS,"Test Case Passsesd successfully");
//		}
//
//
//
//		@Test(priority=3)
//		public void testDiscountPrice() {
//			log.info("Clicked to discount price section");
//			extentTest = extent.startTest("DiscountPrice");
//			ViewTopDeals home=new ViewTopDeals(driver);
//			home.clickDiscountPrice();
//			extentTest.log(LogStatus.PASS, "Test Case Passed Successfully");
//
//		}
//
//
//		@Test(priority=4)
//		public void testNextPage() {
//			log.info("Clicked to next page");
//			extentTest = extent.startTest("nextPage");
//			ViewTopDeals home=new ViewTopDeals(driver);
//	        home.clickNextPage();
//			extentTest.log(LogStatus.PASS, "Test Case Passed Successfully");
//
//
//		}


}
