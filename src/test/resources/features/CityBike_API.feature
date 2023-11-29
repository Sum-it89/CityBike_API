@Bike
Feature: User should be able to find Frankfurt is in Germany and get the longitude and latitude

  Scenario: I should be able to verify Frankfurt is in Germany and get the longitude and latitude of the city
    Given I should able to send API request
    When I receive the success response
    Then I should be able to verify the Longitude and latitude
    Then I should be able to verify Frankfurt is in Germany


