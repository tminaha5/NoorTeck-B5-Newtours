package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterStepDef extends ObjInitialize{
	
	String url = "https://demo.guru99.com/test/newtours/";

	
	@Given("User is on register page")
	public void user_is_on_register_page() {
		
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
	    
		homeObj.clickRegister();
		
	}

	@When("User enters first name")
	public void user_enters_first_name() {
	    
		registerObj.enterFirstName("John");
	}

	@When("User enters last name")
	public void user_enters_last_name() {
	   
		registerObj.enterLastName("Cena");
	}

	@When("User enters phone number")
	public void user_enters_phone_number() {
	   
		registerObj.enterPhone("70312345678");
	}

	@When("User enters email address")
	public void user_enters_email_address() {
	   
		registerObj.enterEmail("johncena123@gmail.com");
	}

	@When("User enters address")
	public void user_enters_address() {
	   
		registerObj.enterAddress("123 Main Street");
	}

	@When("User enters city")
	public void user_enters_city() {
		
		registerObj.enterCity("Reston");
		
	}

	@When("User enters state")
	public void user_enters_state() {
	   
		registerObj.enterState("VA");
	}

	@When("User enters zipcode")
	public void user_enters_zipcode() {
	    
		registerObj.enterZipcode("20191");
	}

	@When("User selects country from the dropdown")
	public void user_selects_country_from_the_dropdown() {
	   
		registerObj.dropdownCountry("value", "United States");
	}

	@When("User enters confirm password")
	public void user_enters_confirm_password() {
	    
		registerObj.enterConfirmPassword("johncena");
	}

	@When("User clicks submit button")
	public void user_clicks_submit_button() {
	   
		registerObj.clickSubmit();
	}




}
