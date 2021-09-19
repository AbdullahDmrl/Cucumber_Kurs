Feature: Education Categories with scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to education category page

  @Regression
  Scenario Outline:Education categories create and delete with scenario Outline

    When User education categories name as "<subjectCategory>" code name as "<subjectCode>"
    Then Success message should be displayed

    When User delete the  "<subjectCategory>"
    Then Success message should be displayed


    Examples:
      | subjectCategory | subjectCode |
      | Aviation        | f101        |
      | Space          | f102        |

