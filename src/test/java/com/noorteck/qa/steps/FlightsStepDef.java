package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FlightsStepDef extends ObjInitialize{
	
	String url = "https://demo.guru99.com/test/newtours/";

	
	@Given("User is on flights page")
	public void user_is_on_flights_page() {
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		
		homeObj.clickFlights();
	}

	@When("User clicks on flight type")
	public void user_clicks_on_flight_type() {
	   
		flightsObj.clickOneway();
	}

	@When("User selects number of passengers")
	public void user_selects_number_of_passengers() {
	    

		flightsObj.dropdownPassenger("value", "3");
	}

	@When("User selects departing from which state")
	public void user_selects_departing_from_which_state() {
	    

		flightsObj.dropdownDeparting("value", "New York");
	}

	@When("User selects month of the departure")
	public void user_selects_month_of_the_departure() {
	   
		flightsObj.dropdownDepMonth("value", "January");
	}

	@When("User selects day of the departure")
	public void user_selects_day_of_the_departure() {
	   
		flightsObj.dropdownDepDay("value", "5");
	}

	@When("User selects arrival location")
	public void user_selects_arrival_location() {
	   
		flightsObj.dropdownArriving("value", "London");
	}

	@When("User selects arrival month")
	public void user_selects_arrival_month() {
	    
		flightsObj.dropdownArrMonth("value", "January");
	}

	@When("User selects arrival day")
	public void user_selects_arrival_day() {
	    
		flightsObj.dropdownArrDay("value", "31");
	}

	@When("User clicks service class")
	public void user_clicks_service_class() {
	    
		flightsObj.clickFirstClass();
	}

	@When("User selects airline")
	public void user_selects_airline() {
	    
		flightsObj.dropdownAirline("value", "Unified Airlines");
	}

	@When("User clicks continue button")
	public void user_clicks_continue_button() {
	    
		flightsObj.clickContinue();
		
	}




}
