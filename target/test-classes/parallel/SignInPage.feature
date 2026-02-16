Feature: Sign Page Feature

Background:
Given user is on login page
When user click on SignIn link

@InvalidLogin
Scenario Outline: Login with Invalid Creddentailse
Given user enter valid "<emailid>"
When user clicks on next button
#Then user enter "<password>"
#And user clicks on the next button
Examples:
      | emailid | password |
      | iet.vipul@gmail.com   | pass1234 |
      | vipul.agrawal56@gmail.com | Pass1235 |




