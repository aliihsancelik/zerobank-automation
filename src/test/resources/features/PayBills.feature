Feature: Pay Bills


  Scenario: Pay Bills Page - Successful Payment
    Given the user logs in
    And the user clicks to "Pay Bills" tab
    And the user should see the title as "Zero - Pay Bills"
    When the user completes the blanks for the payment operation
    Then the user gets "The payment was successfully"


  Scenario: Pay Bills Page - Unsuccessful Payment
   Given the user logs in
   And the user clicks to "Pay Bills" tab
   And the user should see the title as "Zero - Pay Bills"
   When the user doesn't fill the blanks and click
   Then the user see required warning pop-up message for filling the missing parts


  Scenario: Amount and Date Field should not accept letters or characters
    Given the user logs in
    And the user clicks to "Pay Bills" tab
    And the user should see the title as "Zero - Pay Bills"
    When the user types letters or characters in "Date" field
    Then "Date" field should not accept them




