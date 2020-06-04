Feature: Application Login

@RegTest
Scenario: Home page default login
Given User is on landing page
When User login into application with username "jim" and password "Carry"
Then Homepage is populated
And Cards are displayed are "true"

@MobileTest
Scenario: Home page default login
Given User is on landing page
When User login into application with username "jimmy" and password "Cann"
Then Homepage is populated
And Cards are displayed are "false"

@RegTest
Scenario: Home page default login
Given User is on landing page
When User sign up with following details
| priya | phiutomar92 | 12345 |
Then Homepage is populated
And Cards are displayed are "false"
@MobileTest
Scenario Outline: Home page default login
Given User is on landing page
When User login into application into username <Username> and password <Password>
Then Homepage is populated
And Cards are displayed are "true"

Examples:
|Username | Password |
|user1 	  | Pass1    |
|user2    | Pass2	 |
|user3	  | Pass3    |



