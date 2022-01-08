package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class FlightsPage extends CommonUI{
	
	@FindBy(xpath = "//*[@value = 'roundtrip']")
	WebElement roundtripRadio;
	
	@FindBy(xpath = "//*[@value = 'oneway']")
	WebElement onewayRadio;
	
	@FindBy(xpath = "//*[@name = 'passCount']")
	WebElement passengerDropdown;
	
	@FindBy(xpath = "//*[@name = 'fromPort']")
	WebElement departingFromDropdown;
	
	@FindBy(xpath = "//*[@name = 'fromMonth']")
	WebElement dMonthDropdown;
	
	@FindBy(xpath = "//*[@name = 'fromDay']")
	WebElement dDayDropdown;
	
	@FindBy(xpath = "//*[@name = 'toPort']")
	WebElement arrivingInDropdown;
	
	@FindBy(xpath = "//*[@name = 'toMonth']")
	WebElement aMonthDropdown;
	
	@FindBy(xpath = "//*[@name = 'toDay']")
	WebElement aDayDropdown;
	
	@FindBy(xpath = "//*[@value = 'Coach']")
	WebElement economyClassRadio;
	
	@FindBy(xpath = "//*[@value = 'Business']")
	WebElement businessClassRadio;
	
	@FindBy(xpath = "//*[@value = 'First']")
	WebElement firstClassRadio;
	
	@FindBy(xpath = "//*[@name= 'airline']")
	WebElement airlineDropdown;
	
	@FindBy(xpath = "//*[@name= 'findFlights']")
	WebElement continueButton;
	
	@FindBy(xpath = "//*[@size= '4']")
	WebElement verifyNoFlights;
	
	public FlightsPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickRoundtrip() {
		click(roundtripRadio);
	}
	public void clickOneway() {
		click(onewayRadio);
	}
	public void dropdownPassenger(String methodName, String indexTextValue) {
		selectFromDropdown(passengerDropdown, methodName, indexTextValue);
	}
	public void dropdownDeparting(String methodName, String indexTextValue) {
		selectFromDropdown(departingFromDropdown, methodName, indexTextValue);
	}
	public void dropdownDepMonth(String methodName, String indexTextValue) {
		selectFromDropdown(dMonthDropdown, methodName, indexTextValue);
	}
	public void dropdownDepDay(String methodName, String indexTextValue) {
		selectFromDropdown(dDayDropdown, methodName, indexTextValue);
	}
	public void dropdownArriving(String methodName, String indexTextValue) {
		selectFromDropdown(arrivingInDropdown, methodName, indexTextValue);
	}
	public void dropdownArrMonth(String methodName, String indexTextValue) {
		selectFromDropdown(aMonthDropdown, methodName, indexTextValue);
	}
	public void dropdownArrDay(String methodName, String indexTextValue) {
		selectFromDropdown(aDayDropdown, methodName, indexTextValue);
	}
	public void clickEconomyClass() {
		click(economyClassRadio);
	}
	public void clickBusinessClassRadio() {
		click(businessClassRadio);
	}
	public void clickFirstClass() {
		click(firstClassRadio);
	}
	public void dropdownAirline(String methodName, String indexTextValue) {
		selectFromDropdown(airlineDropdown, methodName, indexTextValue);
	}
	public void clickContinue() {
		click(continueButton);
	}
	public String verifyNoFlightsMessage() {
		return getText(verifyNoFlights);
	}
}
