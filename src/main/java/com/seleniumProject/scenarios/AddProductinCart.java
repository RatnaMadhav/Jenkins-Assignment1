package com.seleniumProject.scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddProductinCart {
	WebDriver driver;
	public AddProductinCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	@FindBy(how=How.XPATH, using="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement  addBrocolli;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[3]/button[1]")
	public WebElement  addCauliflower;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='root']/div[1]/div[1]/div[1]/div[8]/div[3]/button[1]")
	public WebElement  addBrinjal;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='root']/div[1]/div[1]/div[1]/div[10]/div[3]/button[1]")
	public WebElement  addMushroom;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='root']/div[1]/div[1]/div[1]/div[15]/div[3]/button[1]")
	public WebElement  addApple;
	
	
	public void clickaddBrocolli() {
		addBrocolli.click();
	}
	public void clickaddCauliflower() {
		addCauliflower.click();
	}
	public void clickaddBrinjal() {
		addBrinjal.click();
	}
    public void clickaddMushroom() {
    	addMushroom.click();
    }
    public void clickaddApple() {
    	addApple.click();
    }

}
