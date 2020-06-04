Feature: Search and place order for vegetables
@SmokeTest
Scenario: Search for items and validate results
Given User is on greencart landing page
When User searched for "Cucumber - 1 Kg" vegetable
Then "Cucumber - 1 Kg" results are displayed
@RegressionTest
Scenario: Search for items and then move to checkout page
Given User is on greencart landing page
When User searched for "Brinjal - 1 Kg" vegetable
Then "Brinjal - 1 Kg" results are displayed
And added items to cart
And user proceeded to checkout page for purchase
Then verify selected "Brinjal - 1 Kg" items are displayed in checkout page



