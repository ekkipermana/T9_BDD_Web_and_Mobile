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
Feature: Added Item to Cart
  I want to add some item to cart

  @tag1
  Scenario Outline: Add some item to cart
    Given I open the Samsung Galaxy item
    When Click add to cart
    And I verify Product added
    Then I open the list cart

    @tag2
	Examples:
    |   |   |
    |	  |   |