package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{
	
	@FindBy(xpath = "//*[@href = 'register.php']")
	WebElement registerSite;
	
	@FindBy(xpath = "//*[@href = 'login.php']")
	WebElement signInSite;
	
	@FindBy(xpath = "//*[@href = 'reservation.php']")
	WebElement flightsSite;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}

	public void clickRegister() {
		click(registerSite);
		
	}
	
	public void clickSignIn() {
		click(signInSite);
		
	}
	
	public void clickFlights() {
		click(flightsSite);
	}
}
