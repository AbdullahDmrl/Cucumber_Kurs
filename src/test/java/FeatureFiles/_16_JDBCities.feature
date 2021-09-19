Feature: Testing JDBC Cities

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfully


  Scenario: Cities testing with JDBC
    When  Navigate to cities page and select "Deutschland" country name
    Then Send the query the database "select * from Cities" and control match
