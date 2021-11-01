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
Feature:Test Compose functionality of Gmail


  @tag1
  Scenario: Test compose button functionality of gmail
    Given I am on the gmail
    When I click on "compose" button
    Then a tab as "New" message tab should get opened


  @tag2
  Scenario: Send email to "Automation QA test for Incubyte"
  Given I am on the email box
  When I write an email to "lifi@incubyte.co"
  And I enter the email body as"Automation QA test for Incubyte"
  And I enter the subject as "Incubyte" 
  And I click on "send" button
  Then Email should be sent to lifi@incubyte.co
