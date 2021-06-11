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
Feature: Register Cek
  I want to Register with invalid credentials

  @tag1
  Scenario Outline: Register with invalid credentials
    Given User navigates to Register pages
    When User enters <username> and <password> Invalid data Register
    And User click button Register
    Then Go to Dashboard InvalidRegister

    Examples: 
      | username                |   password  |   
      | ekki.andro@gmail.com    |   xperia890  |