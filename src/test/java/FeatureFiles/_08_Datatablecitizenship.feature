Feature: DataTable Citizenship

  @Regression
  Scenario: Create citizenship
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the elements in the left nav
      | setupOne    |
      | parameters  |
      | citizenShip |
    And Click on the elements in the dialog content
      | addButton |
    When User sending the keys in dialog content
      | nameInput | Uranus |
      | shortName | Ur     |
    And Click on the elements in the dialog content
      | saveButton |
    Then Success message should be displayed
    When User sending the keys in dialog content
      | searchInput | Uranus |
    And Click on the elements in the dialog content
      | searchButton     |
      | deleteButton     |
      | confirmDeleteBtn |
    Then Success message should be displayed