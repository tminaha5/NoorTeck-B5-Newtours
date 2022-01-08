package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignOnStepDef extends ObjInitialize{
	
	String url = "https://demo.guru99.com/test/newtours/";

	@Given("User is on sign-on page")
	public void user_is_on_sign_on_page() {
		
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		
		homeObj.clickSignIn();
		
	}

	@When("User enters username")
	public void user_enters_username() {
	    
		signOnObj.enterUserName("JohnCena");
			 
	}

	@When("User enters password")
	public void user_enters_password() {
	    
		signOnObj.enterPassword("johncena");
			
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
	    
		signOnObj.clickSubmit();
			
	}

	@Then("User lands on dashboard page")
	public void user_lands_on_dashboard_page() {
	    
		String actMessageOne = signOnObj.verifyLoginField();
		String expMessageOne = "Login Successfully";

		if (actMessageOne.equals(expMessageOne)) {
			
			System.out.println("First message passed");
			
		} else {
			
			System.out.println("First message failed");
		}
			
	}




}
