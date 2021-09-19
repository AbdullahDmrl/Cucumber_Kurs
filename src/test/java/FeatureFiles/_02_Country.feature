Feature: Country Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Create Country
    And Navigate to country page
    When Create a country
    Then Success message should be displayed

    When Delete added country
    Then Success message should be displayed