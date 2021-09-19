Feature: DataTable Fees

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
  @Regression
  Scenario: Create Fees
    And Click on the elements in the left nav
      | setupOne   |
      | parameters |
      | fees       |
    And Click on the elements in the dialog content
      | addButton |
    When User sending the keys in dialog content
      | nameInput            | Nachhilfe |
      | codeInput            | nh1  |
      | integrationCodeInput | nh01 |
      | priorityInput        | 40  |
    And Click on the elements in the dialog content
      | saveButton |
    Then Success message should be displayed

    When User sending the keys in dialog content
      | searchInput            | Nachhilfe |
    And Click on the elements in the dialog content
      | searchButton |
      | deleteButton |
      | confirmDeleteBtn |
    Then Success message should be displayed

