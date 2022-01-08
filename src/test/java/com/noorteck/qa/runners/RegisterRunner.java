package com.noorteck.qa.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(
		
					features = "src/test/resources/ntk/Register.feature", 
					glue = { "com.noorteck.qa.steps" } 				   
		
				)


public class RegisterRunner {

}
