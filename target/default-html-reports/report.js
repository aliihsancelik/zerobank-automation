$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/findTransactions.feature");
formatter.feature({
  "name": "Find Transactions in Account Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Type",
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
  "name": "the user navigates to \"Account Activity\" tab and \"Find Transactions\" module",
  "keyword": "And "
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.step({
  "name": "results table should show at least one result under \"\u003ccolumn1\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user selects type \"\u003ccolumn1\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.step({
  "name": "results table should show at least one result under \"\u003ccolumn1\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "results table should show no result under \"\u003ccolumn2\u003e\"",
  "keyword": "But "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "column1",
        "column2"
      ]
    },
    {
      "cells": [
        "Deposit",
        "Withdrawal"
      ]
    },
    {
      "cells": [
        "Withdrawal",
        "Deposit"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Type",
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
  "name": "the user navigates to \"Account Activity\" tab and \"Find Transactions\" module",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.the_user_navigates_to_tab_and_module(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.clicks_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show at least one result under \"Deposit\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.results_table_should_show_at_least_one_result_under(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects type \"Deposit\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.user_selects_type(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.clicks_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show at least one result under \"Deposit\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.results_table_should_show_at_least_one_result_under(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show no result under \"Withdrawal\"",
  "keyword": "But "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.results_table_should_show_no_result_under(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Type",
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
  "name": "the user navigates to \"Account Activity\" tab and \"Find Transactions\" module",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.the_user_navigates_to_tab_and_module(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.clicks_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show at least one result under \"Withdrawal\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.results_table_should_show_at_least_one_result_under(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects type \"Withdrawal\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.user_selects_type(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.clicks_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show at least one result under \"Withdrawal\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.results_table_should_show_at_least_one_result_under(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results table should show no result under \"Deposit\"",
  "keyword": "But "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.results_table_should_show_no_result_under(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});