$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/accountActivitiyNavigation.feature");
formatter.feature({
  "name": "Navigating to specific accounts in Accounts Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Savings account redirect",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user logs in",
  "keyword": "Given "
});
formatter.step({
  "name": "the user clicks on \"\u003caccountType\u003e\" link on the Account Summary page",
  "keyword": "When "
});
formatter.step({
  "name": "the user should see the title as \"Zero - Account Activity\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Account drop down should have \"\u003caccountType\u003e\" selected",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "accountType"
      ]
    },
    {
      "cells": [
        "Savings"
      ]
    },
    {
      "cells": [
        "Brokerage"
      ]
    },
    {
      "cells": [
        "Checking"
      ]
    },
    {
      "cells": [
        "Credit Card"
      ]
    },
    {
      "cells": [
        "Loan"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Savings account redirect",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefs.the_user_logs_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Savings\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.accountActivityNavigationStepDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the title as \"Zero - Account Activity\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountSummaryStepDefs.the_user_should_see_the_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have \"Savings\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.accountActivityNavigationStepDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Savings account redirect",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefs.the_user_logs_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Brokerage\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.accountActivityNavigationStepDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the title as \"Zero - Account Activity\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountSummaryStepDefs.the_user_should_see_the_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have \"Brokerage\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.accountActivityNavigationStepDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Savings account redirect",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefs.the_user_logs_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Checking\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.accountActivityNavigationStepDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the title as \"Zero - Account Activity\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountSummaryStepDefs.the_user_should_see_the_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have \"Checking\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.accountActivityNavigationStepDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Savings account redirect",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefs.the_user_logs_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Credit Card\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.accountActivityNavigationStepDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the title as \"Zero - Account Activity\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountSummaryStepDefs.the_user_should_see_the_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have \"Credit Card\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.accountActivityNavigationStepDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Savings account redirect",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefs.the_user_logs_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on \"Loan\" link on the Account Summary page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.accountActivityNavigationStepDefs.the_user_clicks_on_link_on_the_Account_Summary_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the title as \"Zero - Account Activity\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountSummaryStepDefs.the_user_should_see_the_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have \"Loan\" selected",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.accountActivityNavigationStepDefs.account_drop_down_should_have_selected(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});