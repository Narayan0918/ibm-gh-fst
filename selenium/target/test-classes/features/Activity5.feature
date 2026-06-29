@activity5
Feature: Login test

Scenario Outline: Testing Login with Example
Given  the user is on the login page
When  the user enters <Username> and <Password>
And  clicks the submit button
Then  get the confirmation text and verify message as "Invalid credentials"

Examples: 
      | Usernames | Passwords      |
      | admin     | password123    |
      | admin     | wrongPassword  |