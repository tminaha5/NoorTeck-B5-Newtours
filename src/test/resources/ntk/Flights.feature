Feature: Flights Functionality

    
   Scenario: Booking flights
    Given User is on flights page				 
    When User clicks on flight type					 
   	And User selects number of passengers
   	And User selects departing from which state
   	And User selects month of the departure
   	And User selects day of the departure
   	And User selects arrival location				 
    And User selects arrival month
    And User selects arrival day
    And User clicks service class
    And User selects airline
    And User clicks continue button		 
    Then User lands on dashboard page	 
