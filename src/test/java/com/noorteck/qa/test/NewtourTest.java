package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class NewtourTest extends ObjInitialize {

	public static void main(String[] args) {
		
		String url = "https://demo.guru99.com/test/newtours/";

		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);

		initializeClassObj();

		CommonUI.quitBrowser();

	
	}
	
	//Test case 1:
	public static void NewtourTestOne() {
		
		homeObj.clickSignIn();
		signOnObj.enterUserName("JohnCena");
		signOnObj.enterPassword("johncena");
		signOnObj.clickSubmit();
		
		String actMessageOne = signOnObj.verifyLoginField();
		String expMessageOne = "Login Successfully";

		if (actMessageOne.equals(expMessageOne)) {
			
			System.out.println("First message passed");
			
		} else {
			
			System.out.println("First message failed");
		}
		
		String actMessageTwo = signOnObj.verifyThankYouField();
		String expMessageTwo = "Login Successfully";

		if (actMessageTwo.equals(expMessageTwo)) {
			
			System.out.println("Second message passed");
			
		} else {
			
			System.out.println("Second message failed");
		}
		
	}
	
	//Test case 2:
	public static void NewtourTestTwo() {
		
		homeObj.clickRegister();
		registerObj.enterFirstName("John");
		registerObj.enterLastName("Cena");
		registerObj.enterPhone("70312345678");
		registerObj.enterEmail("johncena123@gmail.com");
		registerObj.enterAddress("123 Main Street");
		registerObj.enterCity("Reston");
		registerObj.enterState("VA");
		registerObj.enterZipcode("20191");
		registerObj.dropdownCountry("value", "United States");
		registerObj.enterUserName("JohnCena");
		registerObj.enterPassword("johncena");
		registerObj.enterConfirmPassword("johncena");
		registerObj.clickSubmit();
		
		String actThankYou = registerObj.verifyRegisteringField();
		String expThankYou = "Thank you for registering";

		if (actThankYou.equals(expThankYou)) {
			
			System.out.println("Registeration confirmation passed");
			
		} else {
			
			System.out.println("Registeration confirmation failed");
		}
		
	}
	
	//Test case 3:
	public static void NewtourTestThree() {
		
		homeObj.clickFlights();
		flightsObj.clickOneway();
		flightsObj.dropdownPassenger("value", "3");
		flightsObj.dropdownDeparting("value", "New York");
		flightsObj.dropdownDepMonth("value", "January");
		flightsObj.dropdownDepDay("value", "5");
		flightsObj.dropdownArriving("value", "London");
		flightsObj.dropdownArrMonth("value", "January");
		flightsObj.dropdownArrDay("value", "31");
		flightsObj.clickFirstClass();
		flightsObj.dropdownAirline("value", "Unified Airlines");
		flightsObj.clickContinue();
		
		String actFlights = flightsObj.verifyNoFlightsMessage();
		String expFlights = "After flight finder – No Seats Available";

		if (actFlights.equals(expFlights)) {
			
			System.out.println("Flight result passed");
			
		} else {
			
			System.out.println("Flight result failed");
		}
		
	}
	
}


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/