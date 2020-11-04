Feature: Find Transactions in Account Activity


  Scenario: Search date range
    Given the user logs in
    And the user navigates to "Account Activity" tab and "Find Transactions" module
    When the user enters date range from "2012-09-01" to "2012-09-06"
    And clicks find
    Then results table should only show transactions dates between "2012-09-01" to "2012-09-06"
    And the results should be sorted by most recent date
    When the user enters date range from "2012-09-02" to "2012-09-06"
    And clicks find
    Then results table should only show transactions dates between "2012-09-02" to "2012-09-06"
    And the results table should only not contain transactions dated "2012-09-01"

  @wip
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