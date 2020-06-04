Feature: Application Login

@SmokeTest
Scenario: Home page default login
Given User is on landing page
When User login into application with username "jim" and password "Carry"
Then Homepage is populated
And Cards are displayed are "true"




