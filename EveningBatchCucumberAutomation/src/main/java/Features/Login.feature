Feature: Login Functionality

Scenario: Verify user is able to login to application

Given user is already in login Page
When user enters username and password
Then user clicks the login button
And user close the browser