Feature: Citizenship with scenario Outline


  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Citizenship page

  @Regression
  Scenario Outline: Citizenship create and delete with scenario Outline
    When User Create a Ctizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Success message should be displayed

    When User Create a Ctizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Already exist message should be displayed
    And  Click on close button

    When User delete the  "<CitizenshipName>"
    Then Success message should be displayed

    Examples:
      | CitizenshipName | ShortName |
      | osmani          | os1       |
      | musti           | ms1       |
      | aycani          | ay1       |
      | apoli           | ap1       |
