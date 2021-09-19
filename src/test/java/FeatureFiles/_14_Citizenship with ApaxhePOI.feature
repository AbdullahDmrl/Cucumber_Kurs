Feature: Citizenship with ApachePOI

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenship page

    Scenario: Citizenship create and delete from excel
      When User Create a citizenship with ApachePOI
      When User Delete a citizenship with ApachePOI