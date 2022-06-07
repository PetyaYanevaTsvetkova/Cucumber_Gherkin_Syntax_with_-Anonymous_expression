# Created by Petya Yaneva-Tsvetkova

Feature: List of credentials
  Using Gherkin Data Table, implement a step that accepts a table with multiple columns that
  contain usernames and passwords and extracts it into a Map.
  The step should print all the input credentials in the format “User <username> has <password> for password”

  Scenario: print all the input credentials in the format “User <username> has <password> for password”
    Given I have the following table with the credentialsList
    |user_1@gmail.com|12345    |
    |user_2@yahoo.com|SECRET123|
    |user_3@abv.bg   |0000000  |
    When I have collected credentials in a Map
    Then print all the input values from credentialsList