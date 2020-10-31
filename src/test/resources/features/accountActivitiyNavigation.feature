Feature: Navigating to specific accounts in Accounts Activity

  @wip
  Scenario Outline: Savings account redirect
    Given the user logs in
    When the user clicks on "<accountType>" link on the Account Summary page
    Then the user should see the title as "Zero - Account Activity"
    And Account drop down should have "<accountType>" selected
    Examples:
      | accountType |
      | Savings     |
      | Brokerage   |
      | Checking    |
      | Credit Card |
      | Loan        |