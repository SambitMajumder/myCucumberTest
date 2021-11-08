#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Created for Login Testing

 Scenario Outline: Trying to login in the system
   Given Getting driver from the HomePage
   Then User gives the Email as <email> and Password as <password>
   And User click the login button

   Examples: 
     | email  | password 	 |	
     | paliwalaman23@gmail.com 	| JackNJill@123  | 
     