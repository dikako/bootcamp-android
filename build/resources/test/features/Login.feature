Feature: Login feature

  Scenario: Login with wrong password
    Given User click entry point login
    When User input username "dika"
    And User input password "stockbit2"
    And User click login button

  Scenario: Login with wrong password 1
    Given User click entry point login
    When User input username "dika"
    And User input password "stockbit2"
    And User click login button