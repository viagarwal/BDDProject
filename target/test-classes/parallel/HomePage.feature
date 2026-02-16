Feature: Home page feature

Background:
Given user is on login page

Scenario: Login page title
Given user gets the title of the page
Then page title should be "Google"

Scenario: Gmail link
Then gmail link should be displayed
When user click on SignIn link