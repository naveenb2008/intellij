Feature: validating the functionality of page facebook application
  Scenario: checking the Login with valid user credentials
    Given launch the facebook application
    When  user able to enter the username in the username field
    And  user able to  enter the password in the password field
    Then user able to click the Login button it navigates to search page