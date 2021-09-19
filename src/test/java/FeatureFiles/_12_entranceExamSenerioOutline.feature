Feature: DataTable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
  @Regression
  Scenario Outline: Entrance Exams
    And Click on the elements in the left nav
      | entranceExam         |
      | examSetup            |
      | entranceExamInserted |

    And Click on the elements in the dialog content
      | addButton |

    When User sending the keys in dialog content
      | nameInput | <examNames> |

    And Click on the elements in the form content
      | academicPeriod   |
      | <academicOption> |
      | gradeLevel       |
      | <gradeOption>    |
      | saveButton       |

    Then Success message should be displayed

    And Click on the elements in the left nav
      | entranceExam         |
      | examSetup            |
      | entranceExamInserted |

    When Delete the exam name as "<examNames>"
    Then Success message should be displayed

    Examples:
      | examNames  | academicOption | gradeOption |
      | Erdkunde   | academicOption | graOption1  |
      | Geschichte | academicOption | graOption2  |
