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
Feature: Multiple Odd Double
  Multiple operational Odd

  @tag1
  Scenario Outline: Multiple operational cek Genap 
    
    When I Tap first even Number Two double
    And I tap Multiple button
    And I Tap second even Number Six double
    Then I Tap equals for Result
    
    @tag2
    Examples: 
	      |  |  |
      	|  |  |