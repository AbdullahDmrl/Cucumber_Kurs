Feature: DataTable Country

  @Regression
  Scenario: Create a country
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

 #   And Navigate to country page  bunun yerine alttakini yaziyoruz

    And Click on the elements in the left nav
      | setupOne   |
      | parameters |
      | Countries  |

    And Click on the elements in the dialog content
      | addButton |

    When User sending the keys in dialog content
      | nameInput | Demirelus |
      | codeInput | dem01     |

    And Click on the elements in the dialog content
      | saveButton |
    Then Success message should be displayed
  @Regression
  Scenario: Delete created country
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully

    And Click on the elements in the left nav
      | setupOne   |
      | parameters |
      | Countries  |
    When User sending the keys in dialog content
      | searchInput | Demirelus |
    And Click on the elements in the dialog content
      | searchButton |
      | deleteButton |
      | confirmDeleteBtn |
    Then Success message should be displayed