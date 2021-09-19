Feature: DataTable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
  @Regression
  Scenario: Entrance Employee
    And Click on the elements in the left nav
      | humanResource |
      | emploYee      |

    And Click on the elements in the dialog content
      | addButton |

    When User sending the keys in form content
      | empFirstName | Aycan  |
      | empLastName  | Dem    |
      | EmployeeId   | s11367 |
      | documentNum  | dk2678 |

    And Click on the elements in the form content
      | gender       |
      | male         |
      | employeeType |
      | supervisor   |
      | documentType |
      | personalId   |
      | saveButton   |

    Then Success message should be displayed

    And Click on the elements in the left nav
      | humanResource |
      | emploYee      |

    When Delete the element in the form content
      | empsearchInput | Aycan  |

    Then Success message should be displayed
