$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Search.feature");
formatter.feature({
  "name": "Search and place order for vegetables",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for items and validate results",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "name": "User is on greencart landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.StepDefination2.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for \"Cucumber - 1 Kg\" vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.StepDefination2.user_searched_for_something_vegetable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Cucumber - 1 Kg\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.StepDefination2.something_results_are_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for items and then move to checkout page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "name": "User is on greencart landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinations.StepDefination2.user_is_on_greencart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for \"Brinjal - 1 Kg\" vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinations.StepDefination2.user_searched_for_something_vegetable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Brinjal - 1 Kg\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.StepDefination2.something_results_are_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "added items to cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination2.added_items_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user proceeded to checkout page for purchase",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinations.StepDefination2.user_proceeded_to_checkout_page_for_purchase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify selected \"Brinjal - 1 Kg\" items are displayed in checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinations.StepDefination2.verify_selected_something_items_are_displayed_in_checkout_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});