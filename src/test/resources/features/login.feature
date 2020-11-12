

Feature:


  Scenario: login with valid
    When the user logs in
    Then the user should be able to login

  @smoke
    Scenario: login with invalid or blank
      When the user logs in with " " and "asjdad"
      Then the user should NOT be able to login

