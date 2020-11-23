Feature: Find Transactions in Account Activity


  Scenario: Search date range
    Given the user logs in
    And the user navigates to "Account Activity" tab and "Find Transactions" module
    When the user enters date range from "2012-09-01" to "2012-09-06"
    Then results table should only show transactions dates between "2012-09-01" to "2012-09-06"
    When the user enters date range from "2012-09-02" to "2012-09-06"
    Then results table should only show transactions dates between "2012-09-02" to "2012-09-06"


  Scenario Outline: Search "<descriptions>"
    Given the user logs in
    Given the user navigates to "Account Activity" tab and "Find Transactions" module
    When the user enters "<descriptions>"
    And clicks search
    Then results table should only show descriptions containing "<descriptions>"
    Examples:
      | descriptions |
      | ONLINE       |
      | OFFICE       |
      | online       |


  Scenario Outline: Type
    Given the user logs in
    And the user navigates to "Account Activity" tab and "Find Transactions" module
    And clicks search
    Then results table should show at least one result under "<column1>"

    When user selects type "<column1>"
    And clicks search
    Then results table should show at least one result under "<column1>"
    But results table should show no result under "<column2>"

    Examples:
      | column1    | column2    |
      | Deposit    | Withdrawal |
      | Withdrawal | Deposit    |