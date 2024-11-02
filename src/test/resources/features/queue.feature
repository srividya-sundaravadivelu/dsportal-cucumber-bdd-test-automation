#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@queue
Feature: Queue page navigation

  Background: 
    Given The user is logged in with username "numpy@gmail.com" and password "Tester123$"
    
  # Home Page  
  Scenario: Redirect to Queue page from Home page drop down menu 
  	Given The user is on the Home page
  	When The user clicks the "Queue" item from the drop down menu
  	Then The user should be redirected to the "Queue" page

	Scenario: Redirect to Queue page from Home page Get Started button in Queue Panel 
		Given The user is on the Home page	
		When The user clicks the Get Started button in "Queue" Panel
		Then The user should be redirected to the "Queue" page
  
  #implementation_of_Queue_in_Python
  Scenario: Go to Implementation of Queue in Python page from Queue page
    Given The user is in the Queue page after logged in
    When The user clicks Implementation of Queue in Python link in Queue
    Then The user should be redirected to Implementation of Queue in Python page

  Scenario: TryButton in Implementation of Queue in Python page
    Given The user is in the Implementation of Queue in Python page
    When The user clicks Try Here button in Implementation of Queue in Python
    Then The user should be redirected to a page having a text editor

  #Try Editor Page
  Scenario Outline: Run Button with valid code in Python Code Editor Page
    Given The user is on the Try Editor page
    When The user enters valid Python code from sheet "<SheetName>" and row <RowNumber> and clicks the Run button
    Then The user is able to see the output inside the console

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         0 |

  Scenario Outline: Run Button with invalid code in Python Code Editor Page
    Given The user is on the Try Editor page
    When The user enters invalid Python code from sheet "<Sheetname>" and row <RowNumber> and clicks the Run button
    Then The user sees an error message in the alert window

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |         1 |

  Scenario: Run Button without entering code in Python Code Editor Page
    Given The user is on the Try Editor page
    When The user clicks the Run Button without entering code in the Editor
    Then The focus remains in the same page and no error message is displayed

  Scenario: Handle alert message in Python Code Editor Page
    Given The user is on the Try Editor page with an alert error message
    When The user clicks the OK button in the alert window
    Then The user is on the same page having the Editor and Run button
	
  #implementation_using_collections_deque
  Scenario: Go to Implementation using collections deque page from Queue page
    Given The user is in the Queue page after logged in
    When The user clicks Implementation using collections deque link in Queue
    Then The user should be redirected to Implementation using collections deque page

  Scenario: TryButton in Implementation using collections deque page
    Given The user is in the Implementation using collections deque page
    When The user clicks Try Here button in Implementation using collections deque
    Then The user should be redirected to a page having a text editor
	
  #implementation_using_array
  Scenario: Go to Implementation using array page from Queue page
    Given The user is in the Queue page after logged in
    When The user clicks Implementation using array link in Queue
    Then The user should be redirected to Implementation using array page

  Scenario: TryButton in Implementation using array page
    Given The user is in the Implementation using array page
    When The user clicks Try Here button in Implementation using array
    Then The user should be redirected to a page having a text editor
	
  #queue_Operations
  Scenario: Go to Queue Operations page from Queue page
    Given The user is in the Queue page after logged in
    When The user clicks Queue Operations link in Queue
    Then The user should be redirected to Queue Operations page

  Scenario: TryButton in Queue Operations page
    Given The user is in the Queue Operations page
    When The user clicks Try Here button in Queue Operations page
    Then The user should be redirected to a page having a text editor
	
  #practice_ques_in_queue
  Scenario: Go to Practice Questions page from Queue Operations page
    Given The user is in the Queue Operations page after logged in
    When The user clicks Practice Questions link in queue
    Then The user should be redirected to Practice Questions page