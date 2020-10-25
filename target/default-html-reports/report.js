$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PayBills.feature");
formatter.feature({
  "name": "Pay Bills",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Amount and Date Field should not accept letters or characters",
  "description": "",
  "keyword": "Scenario",
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
  "name": "the user clicks to \"Pay Bills\" tab",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountActivityStepDefs.the_user_clicks_to_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the title as \"Zero - Pay Bills\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.AccountSummaryStepDefs.the_user_should_see_the_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user types letters or characters in \"Date\" field",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.PayBillsStepDefs.the_user_types_letters_or_characters_in_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Date\" field should not accept them",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.PayBillsStepDefs.field_should_not_accept_them(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});