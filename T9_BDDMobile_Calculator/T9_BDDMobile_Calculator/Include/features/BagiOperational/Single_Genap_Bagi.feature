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
Feature: Devided Odd single
  Devided operational Odd

  @tag1
  Scenario Outline: Devided operational cek Genap 
    
    When I Tap first even Number Two
    And I tap Devided button
    And I Tap second even Number Six
    Then I Tap equals for Result
    
    @tag2
    Examples: 
	      |  |  |
      	|  |  |