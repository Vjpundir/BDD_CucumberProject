# Author : Vijay Pundir SDET 


# This feature tests login functionality of naukri.com
# Created by: VJ Pundir


#| Keyword             | Use                                        |
#| ------------------- | ------------------------------------------ |
#| `Feature:`          | Describe the functionality you're testing. |
#| `Background:`       | Set common context for all scenarios.      |
#| `Scenario:`         | Define a single test case.                 |
#| `Given`             | Precondition or initial state.             |
#| `When`              | Action the user does.                      |
#| `Then`              | Expected outcome or result.                |
#| `And`               | Add more steps at the same level.          |
#| `But`               | Negative condition or exception.           |
#| `Examples:`         | Provide test data for Scenario Outline.    |
#| `Scenario Outline:` | Reusable scenario with different data.     |
#| `#`                 | Comment (ignored by the runner).           |

#######################################################################################

Feature: User Login Functionality

Scenario: User need to click on login btn

Given User navigate to home page 
When User click on login button
Then User see register free user text successfully 

 # This scenario verifies user login with valid credentials

Scenario: Successful login with valid credentials
 
Given User is on the Naukri login page
When User enters valid username "vijay177rajput@gmail.com" and password "Jan@12345"
And  User clicks the submit button
Then User should be logged in successfully
