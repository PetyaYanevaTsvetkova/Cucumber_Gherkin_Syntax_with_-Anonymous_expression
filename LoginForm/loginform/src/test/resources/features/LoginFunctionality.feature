Feature: Login Functionality
  As a customer I want to login with credentials

  Scenario: Login in with invalid credentials
    Given print "Welcome to home page!"
    When I fill the account username textBox with value "incorrectUsername"
    And I fill the password textBox with value "incorrectPassword"
    And click the login button
    Then output message appears "Incorrect username and password. Try again."

  Scenario: Login in with valid credentials
    Given print "Welcome to home page!"
    When I fill the account username textBox with value "correctUsername"
    And I fill the password textBox with value "correctPassword"
    And click the login button
    Then output message appears "Successfully login."