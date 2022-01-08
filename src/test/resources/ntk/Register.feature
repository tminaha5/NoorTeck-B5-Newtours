Feature: Register Functionality

    
   Scenario: Registering an account
    Given User is on register page				 
    When User enters first name					 
    And User enters last name
    And User enters phone number
    And User enters email address
    And User enters address
    And User enters city
    And User enters state
    And User enters zipcode
    And User selects country from the dropdown
    And User enters username				 
    And User enters password
    And User enters confirm password
    And User clicks submit button			 
    Then User lands on dashboard page	 
