package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class RegisterPage extends CommonUI{
	
	@FindBy(xpath = "//*[@name = 'firstName']")
	WebElement firstNameField;
	
	@FindBy(xpath = "//*[@name = 'lastName']")
	WebElement lastNameField;
	
	@FindBy(xpath = "//*[@name = 'phone']")
	WebElement phoneField;
	
	@FindBy(css = "#userName")
	WebElement emailField;
	
	@FindBy(xpath = "//*[@name = 'address1']")
	WebElement addressField;
	
	@FindBy(xpath = "//*[@name = 'city']")
	WebElement cityField;
	
	@FindBy(xpath = "//*[@name = 'state']")
	WebElement stateField;
	
	@FindBy(xpath = "//*[@name = 'postalCode']")
	WebElement zipcodeField;
	
	@FindBy(xpath = "//*[@name = 'country']")
	WebElement countryDropdown;
	
	@FindBy(css = "#email")
	WebElement userNameField;
	
	@FindBy(xpath = "//*[@name = 'password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//*[@name = 'confirmPassword']")
	WebElement confirmPasswordField;
	
	@FindBy(xpath = "//*[@name = 'submit']")
	WebElement submitButton;
	
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")
	WebElement verifyRegistering;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	public void enterFirstName(String firstName) {
		enter(firstNameField, firstName);
	}
	public void enterLastName(String lastName) {
		enter(lastNameField, lastName);
	}
	public void enterPhone(String phone) {
		enter(phoneField, phone);
	}
	public void enterEmail(String email) {
		enter(emailField, email);
	}
	public void enterAddress(String address) {
		enter(addressField, address);
	}
	public void enterCity(String city) {
		enter(cityField, city);
	}
	public void enterState(String state) {
		enter(stateField, state);
	}
	public void enterZipcode(String zipcode) {
		enter(zipcodeField, zipcode);
	}
	public void dropdownCountry(String methodName, String indexTextValue) {
		selectFromDropdown(countryDropdown, methodName, indexTextValue);
	}
	public void enterUserName(String userName) {
		enter(userNameField, userName);
	}
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	public void enterConfirmPassword(String confirmPassword) {
		enter(confirmPasswordField, confirmPassword);
	}
	public void clickSubmit() {
		click(submitButton);
	}
	public String verifyRegisteringField() {
		return getText(verifyRegistering);
	}
	
	
}
