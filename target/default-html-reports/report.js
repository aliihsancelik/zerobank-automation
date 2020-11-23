$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/newPayee.feature");
formatter.feature({
  "name": "Add new payee under pay bills",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a new payee",
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
  "name": "the user navigates to \"Pay Bills\" tab and \"Add New Payee\" module",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.findTransactionsStepDefs.the_user_navigates_to_tab_and_module(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user adds a new payee using following informations",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.newPayeeStepDefs.the_user_adds_a_new_payee_using_following_informations(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should add a new payee successfully",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.newPayeeStepDefs.the_user_should_add_a_new_payee_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});