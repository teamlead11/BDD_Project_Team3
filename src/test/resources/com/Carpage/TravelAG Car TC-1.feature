#Author: your.email@your.domain.com
@tag
Feature: Verify the car details functionality

  @tag2
  Scenario Outline: Verify the user able to see all the cars details
    Given I am in php travel car home page
    When Click the car "<CarName>"so the user can able to see all the cars
    Then Verify the user able to click  the car name link

    Examples: 
      | CarName           |
      | Toyota Camry 2015 |
      | Opel Astra 2014   |
      | Ford Mondeo 2012  |
      | Opel Corsa 2013   |
