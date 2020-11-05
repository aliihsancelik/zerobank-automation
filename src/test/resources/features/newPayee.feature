@wip
Feature: Add new payee under pay bills

  Scenario: Add a new payee
    Given the user logs in
    And the user navigates to "Pay Bills" tab and "Add New Payee" module
    Then the user adds a new payee using following informations
      | Payee Name    | The Law Offices of Hyde, Price & Scharks |
      | Payee Address | 100 Same st, Anytown, USA, 10001         |
      | Account       | Checking                                 |
      | Payee details | XYZ account                              |
    And the user should add a new payee successfully