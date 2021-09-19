Feature: Country Multi Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to country page

  @SmokeTest
  Scenario: Create a country
    When Create a country
    Then Success message should be displayed

    When Delete added country
    Then Success message should be displayed

  @SmokeTest
  Scenario:  Create a country parameter data
    When Create a country name as "Aycanus" code as "ay21"
    Then Success message should be displayed

    When Delete the country name as "Aycanus"
    Then Success message should be displayed

