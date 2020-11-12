
@smoke
Feature:


  Scenario: login with valid
    When the user logs in
    Then the user should be able to login


    Scenario: login with invalid or blank
      When the user logs in with " " and "asjdad"
      Then the user should be able to login

