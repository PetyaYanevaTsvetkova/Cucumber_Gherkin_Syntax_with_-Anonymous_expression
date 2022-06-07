## Project's Title:
	Cucumber: Gherkin Syntax with Anonymous expression

## Project Description:
		
	Theory:

	Cucumber anonymous expression: {}

	Gherkin Syntax: 

	Feature

	Rule (as of Gherkin 6)

	Example (or Scenario)

	Given, When, Then, And, But for steps (or *)

	Background

	Scenario Outline (or Scenario Template)

	Examples (or Scenarios)


	There are a few secondary Gherkin keywords as well:

	""" (Doc Strings)

	| (Data Tables)

	@ (Tags)

	Comments in feature files

 
	Practical task:  

	Write tests about a login and signup form

	Imagine you have to write Cucumber tests for a login form and registration form for new users with mandatory and optional fields. 
	Write as many tests you can think of showcasing examples of how you would use the Gherkin syntax.

	You can use Cucumber to generate the missing methods. 
	When using some kind of input for the steps - use the Anonymous cucumber expression - {}. 
	No actual functionality is needed in the step definitions, messages on the consoles describing 
	the actions would be enough for this story.

	List of Student names

	Using Gherkin Data Table, implemetent a step that accepts a table with only one column 
	that contains a list of student names and prints them on the console.

	Shopping list

	Using Gherkin Data Table, implemetent a step that accepts a table with multiple
	columns that contains a shopping list (for example: store, item, quantity, etc). 
	The step should print all the items and qty needed, grouped by the store name.

	Example input:

   |Store    |Item     |Quantity|
    |Store A  |Sugar    |2       |
    |Store XYZ|Flour    |1       |
    |Store XYZ|Waffles  |5       |
    |Store A  |Apples   |3       |
    |Store A  |Bananas  |7       |
    |Store XYZ|Cucumbers|4       |


	Example output on the console:

	I need to buy from Store A:

	2 Sugar

	3 Apples

	7 Bananas

	I need to buy from Store XYZ:

	1 Flour

	5 Waffles

	4 Cucumbers


	Credential list

	Using Gherkin Data Table, implemetent a step that accepts a table with multiple 
	columns that contain usernames and passwords and extracts it into a Map. 
	The step should print all the input credentials in the format “User <username> has <password> for password”

    |user_1@gmail.com|12345    |
    |user_2@yahoo.com|SECRET123|
    |user_3@abv.bg   |0000000  |

	Example output:

	User user_1@gmail.com has 12345 for password


	Acceptance criteria:

	As a QA Automation trainee, I want to gain knowledge of:

	how to use anonymous expression to capture any type of data input (int, String etc)

	how to write tests using Gherkin syntax

	Examples for all Gherkin keywords are demonstrated in the tasks.

	Test scenarios are running and are implemented as per definitions above.

	Comment on the top of the feature file(s) added with the name of the person who created the tests

	Only specific group or sub-group (suite) of tests can be executed through a JUnit Cucumber Test Runner class

## Table of Contents:
	ListOfStudents
	LoginForm
	ShoppingList
	README.md file
	.gitignore file
	

## How to Install and Run the Project:
	IDE need to execute the java project
	 
## How to Use the Project:
	Maven need

## Useful links:
	https://roytuts.com/cucumber-data-table-convert-one-column-table-to-a-list/

## Add a License
	no needed


