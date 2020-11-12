


Feature: Purchase Foreign Currency


  Background:
    Given the user logs in
    Given the user navigates to "Pay Bills" tab and "Purchase Foreign Currency" module


  Scenario: Available currencies
    Then following currencies should be available
      | Australia (dollar)    |
      | Canada (dollar)       |
      | Switzerland (franc)   |
      | China (yuan)          |
      | Denmark (krone)       |
      | Eurozone (euro)       |
      | Great Britain (pound) |
      | Japan (yen)           |
      | Mexico (peso)         |
      | Norway (krone)        |
      | New Zealand (dollar)  |
      | Singapore (dollar)    |


  Scenario: Error message for not selecting currency
    When user tries to calculate cost without selecting a currency
    Then error message should be displayed


  Scenario: Error message for not entering value
    When user tries to calculate cost without entering a value
    #Then error message should be displayed(we put the assertion in previous step!)


  Scenario: Success message should display
    When user put an amount and select a currency then success message should display


  Scenario: Conversion amount should display
    When user put an amount and select a currency then conversion amount should display