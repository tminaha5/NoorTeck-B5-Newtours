Feature: SignOn Functionality

  Scenario: Verify User able to signon correct credentials
    Given User is on sign-on page
    When User enters username
    And User enters password
    And User clicks login button
    Then User lands on dashboard page
