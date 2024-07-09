package com.seleniumProject.tests;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.seleniumProject.scenarios.AddProductinCart;
import com.seleniumProject.scenarios.ViewTopDeals;

import baseclass.BaseTest;

public class AddProductinCartTest extends BaseTest {
	@Test(priority=5)
	public void AddProduct1() {
		extentTest=extent.startTest("addedtocart");
		log.info("Click To Product");
		AddProductinCart home = new AddProductinCart(driver);
		home.clickaddBrocolli();
		extentTest.log(LogStatus.PASS, "Test case Passed sucessfully.");
		try {
		    Thread.sleep(3000); // Pause execution for 3 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}

	}
	

	@Test(priority = 6)
	public void AddProduct2() {
		extentTest = extent.startTest("addedtocart");
		log.info("Click To the Product");
		AddProductinCart home = new AddProductinCart(driver);
		home.clickaddCauliflower();
		extentTest.log(LogStatus.PASS, "Test case Passed sucessfully.");
		try {
		    Thread.sleep(3000); // Pause execution for 3 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}

	}
	
	@Test(priority=7)
	public void AddProduct3() {
		extentTest=extent.startTest("addedtocart");
		log.info("Click To the Product");
		AddProductinCart home = new AddProductinCart(driver);
		home.clickaddBrinjal();
		extentTest.log(LogStatus.PASS, "Test case Passed sucessfully.");
		try {
		    Thread.sleep(3000); // Pause execution for 3 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	}
	
	@Test(priority=8)
	public void AddProduct4() {
		extentTest=extent.startTest("addedtocart");
		log.info("Click To the Product");
		AddProductinCart home = new AddProductinCart(driver);
		home.clickaddMushroom();
		extentTest.log(LogStatus.PASS, "Test case Passed sucessfully.");
		try {
		    Thread.sleep(3000); // Pause execution for 3 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	}
	
	@Test(priority=9)
	public void AddProduct5() {
		extentTest=extent.startTest("addedtocart");
		log.info("Click To the Product");
		AddProductinCart home = new AddProductinCart(driver);
		home.clickaddApple();
		extentTest.log(LogStatus.PASS, "Test case Passed sucessfully.");
		try {
		    Thread.sleep(3000); // Pause execution for 3 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	}
	
	

}
