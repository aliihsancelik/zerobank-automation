$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/findTransactions.feature");
formatter.feature({
  "name": "Find Transactions in Account Activity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search \"\u003cdescriptions\u003e\"",
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
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters \"\u003cdescriptions\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.step({
  "name": "results table should only show descriptions containing \"\u003cdescriptions\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "descriptions"
      ]
    },
    {
      "cells": [
        "ONLINE"
      ]
    },
    {
      "cells": [
        "OFFICE"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search \"ONLINE\"",
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
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.the_user_navigates_to_tab_and_module(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"ONLINE\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.the_user_enters(java.lang.String)"
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
  "name": "results table should only show descriptions containing \"ONLINE\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.results_table_should_only_show_descriptions_containing(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search \"OFFICE\"",
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
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.the_user_navigates_to_tab_and_module(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"OFFICE\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.the_user_enters(java.lang.String)"
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
  "name": "results table should only show descriptions containing \"OFFICE\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.results_table_should_only_show_descriptions_containing(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});