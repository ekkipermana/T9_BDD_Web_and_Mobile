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
Feature: Login feature Invalid creditions

  @tag1
  Scenario Outline: Test Login with Invalid credentials
    Given User navigates to login page
    When User enters <username> and <password> Invalid
    And User click button login
    Then Go to Dashboard Invalid

    Examples: 
      | password   |    username |   
      |            |             |