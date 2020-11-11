$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PurchaseForeignCurrency.feature");
formatter.feature({
  "name": "Purchase Foreign Currency",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "name": "the user navigates to \"Pay Bills\" tab and \"Purchase Foreign Currency\" module",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.the_user_navigates_to_tab_and_module(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Conversion amount should display",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "user put an amount and select a currency then conversion amount should display",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.PurchaseForeignCurrencyStepDefs.user_put_an_amount_and_select_a_currency_then_conversion_amount_should_display()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});