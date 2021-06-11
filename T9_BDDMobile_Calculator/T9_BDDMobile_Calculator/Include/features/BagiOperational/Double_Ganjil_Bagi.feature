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
Feature: Devided Even Single
  Devided operational Even

  @tag1
  Scenario Outline: Devided operational cek Ganjil 
    Given I open the Calculator App
    When I Tap first even Number Three double
    And I tap Devided button
    And I Tap second even Number Five double
    Then I Tap equals for Result
    
    @tag2
    Examples: 
	      |  |  |
      	|  |  |