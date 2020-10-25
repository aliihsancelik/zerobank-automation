Feature: Account Summary


  Scenario: Account Summary Page
    Given the user logs in
    When the user should be able to login
    Then the user should see the title as "Zero - Account Summary"
    And the user should have the following account types
    |Cash Accounts|
    |Investment Accounts|
    |Credit Accounts|
    |Loan Accounts|
    And the user should see the Credit Account Table's columns
    |Account|
    |Credit Card|
    |Balance|






