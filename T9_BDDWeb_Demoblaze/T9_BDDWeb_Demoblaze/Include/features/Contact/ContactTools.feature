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
Feature: Contact Feature
  Contact Feature Menu

  @tag1
  Scenario Outline: Feature Contact Demoblaze
    Given I click contact menu
    When I input my <email> , <contact> and <message>
    And I click button send message to send
    Then Show message and back to homepage

    Examples: 
      | email                   |  contact        | message            |
      | ekki.permana@gmail.com  |  085293765760   | Sekolah QA Batch 7 |