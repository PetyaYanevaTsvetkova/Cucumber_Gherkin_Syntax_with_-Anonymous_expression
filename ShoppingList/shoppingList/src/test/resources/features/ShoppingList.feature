# Created by Petya Yaneva-Tsvetkova

Feature: Print items and qty
  Print all the items and qty needed, grouped by the store name

  Scenario:  Print all the items and qty, bought from Stores:
    Given I have the following table with the shoppingList
    |Store    |Item     |Quantity|
    |Store A  |Sugar    |2       |
    |Store XYZ|Flour    |1       |
    |Store XYZ|Waffles  |5       |
    |Store A  |Apples   |3       |
    |Store A  |Bananas  |7       |
    |Store XYZ|Cucumbers|4       |
    When I have collected products in Map Collection
    Then print the shoppingList
