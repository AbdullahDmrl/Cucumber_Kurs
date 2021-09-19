Feature: Item Categories with Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to item category page
  @Regression
  Scenario Outline:Item categories create and delete with outline

    When User item categories name as "<inventoryItemName>" user type name as "<userTypeOption>"
    Then Success message should be displayed

    When User delete the  "<inventoryItemName>"
    Then Success message should be displayed

    Examples:
      | inventoryItemName | userTypeOption |
      | Red cart          | Student        |
      | Red pen           | Teacher        |

