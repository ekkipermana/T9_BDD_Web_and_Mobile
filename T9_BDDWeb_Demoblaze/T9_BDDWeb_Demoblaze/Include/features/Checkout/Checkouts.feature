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
Feature: Checkouts
  I want to checkout my item on cart

  @tag1
  Scenario Outline: Checkout steps 
    Given I click Place order to checkout
    When Show checkout window to fill following data
    And I input my name <name>
    And I input my country <country>
    And I input my city <city>
    And I input my cc <creditcart> number
    And I input date month <month>
    And I input date year <year>
    And I click purchase to finish
    Then Show window order confirmation and klik oke

		@tag3
    Examples: 
      | name  | country | city    | creditcart   | month  | year    |
      | name1 |     5   | success | 53434        |   June | 2020    |