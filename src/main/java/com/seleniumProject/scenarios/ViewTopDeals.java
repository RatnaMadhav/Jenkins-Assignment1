package com.seleniumProject.scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewTopDeals {
	WebDriver driver;
	public ViewTopDeals(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}

	@FindBy(how=How.XPATH, using="//a[contains(text(),'Top Deals')]")
	public WebElement  topDeals;

	@FindBy(how=How.XPATH, using="//span[contains(text(),'Veg/fruit name')]")
	public WebElement  fruitName;

	@FindBy(how=How.XPATH, using="//span[contains(text(),'Price')]")
	public WebElement  price;

	@FindBy(how=How.XPATH, using="//span[contains(text(),'Discount price')]")
	public WebElement  discountPrice;

	@FindBy(how=How.XPATH, using="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]")
	public WebElement  nextPage;


	public void clickTopDeals() {
		topDeals.click();
	}

	public void clickFruitName() {
		fruitName.click();
	}

	public void clickPrice() {
		price.click();
	}

	public void clickDiscountPrice() {
		discountPrice.click();
	}

	public void clickNextPage() {
		nextPage.click();
		}

}
