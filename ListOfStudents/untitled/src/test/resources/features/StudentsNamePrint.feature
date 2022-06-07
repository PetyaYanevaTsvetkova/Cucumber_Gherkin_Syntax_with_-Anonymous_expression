# Created by Petya Yaneva-Tsvetkova

Feature: Print student's names
  Print a collection of the student's names

  Scenario: Print all students names
    Given I have the following table with the studentNames
    |Ivan|
    |Ivo|
    |Maria|
    |Lili|
    |Alice|
    |Bob|
    |Charlie|
    When I have collected students names in List
    Then print all studentNames


