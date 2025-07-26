
Feature: User click on Login button options 
Scenario: User need to click on login btn

Given User navigate to home page 
When User click on login button
Then User see register free user text successfully 


Scenario: Successful login with valid credentials
 
Given User is on the Naukri login page
When User enters valid username "vijay177rajput@gmail.com" and password "Jan@12345"
And  User clicks the submit button
Then User should be logged in successfully
