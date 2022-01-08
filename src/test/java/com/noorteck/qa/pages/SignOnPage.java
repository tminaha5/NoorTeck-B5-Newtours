package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignOnPage extends CommonUI{
	
	@FindBy(xpath = "//*[@name = 'userName']")
	WebElement userNameField;
	
	@FindBy(xpath = "//*[@name = 'password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//*[@name = 'submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//h3[contains(text(),'Login Successfully')]")
	WebElement verifyLogin;
	
	@FindBy(xpath = "//b[contains(text(),'Thank you for Loggin')]")
	WebElement verifyThankYou;
	
	public SignOnPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUserName(String userName) {
		enter(userNameField, userName);
		
	}

	public void enterPassword(String password) {
		enter(passwordField, password);
		
	}
	
	public void clickSubmit() {
		click(submitButton);
		
	}
	
	public String verifyLoginField() {
		return getText(verifyLogin);
		
	}
	
	public String verifyThankYouField() {
		return getText(verifyThankYou);
		
	}
}
