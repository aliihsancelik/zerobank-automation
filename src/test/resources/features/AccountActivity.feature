Feature: Account Activity


  Scenario: Account Activity Page
    Given the user logs in
    When the user clicks to "Account Activity" tab
    Then the user should see the title as "Zero - Account Activity"
    And the Account dropdown default option should be Savings
    And the Account dropdown should have the following options
    |Savings|
    |Checking|
    |Savings|
    |Loan|
    |Credit Card|
    |Brokerage|
    And Transactions table should have the following column names
    |Date|
    |Description|
    |Deposit|
    |Withdrawal|
