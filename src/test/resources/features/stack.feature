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
@stack
Feature: Stack page navigation

  Background: 
    Given The user is logged in with username "numpy@gmail.com" and password "Tester123$"

  # Home Page
  Scenario: Redirect to Stack page from Home page drop down menu
    Given The user is on the Home page
    When The user clicks the "Stack" item from the drop down menu
    Then The user should be redirected to the "Stack" page

  Scenario: Redirect to Stack page from Home page Get Started button in Stack Panel
    Given The user is on the Home page
    When The user clicks the Get Started button in "Stack" Panel
    Then The user should be redirected to the "Stack" page

  #operations
  Scenario: Go to Operations in Stack page
    Given The user is in the Stack page after logged in
    When The user clicks Operations link in Stack page
    Then The user should be redirected to Operations page

  Scenario: TryButton in Operations in Stack
    Given The user is in the Operations in Stack page
    When The user clicks Try Here button in operations page
    Then The user should be redirected to a page having a text editor

  # Try Editor Page
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

  #implementation
  Scenario: Go to Implementation in Stack page
    Given The user is in the Stack page after logged in
    When The user clicks Implementation link
    Then The user should be redirected to Implementation page

  Scenario: Try Button in Implementation in Stack
    Given The user is in the Implementation in Stack page
    When The user clicks Try Here button in Implementation
    Then The user should be redirected to a page having a text editor

  #applications
  Scenario: Go to Applications in Stack page
    Given The user is in the Stack page after logged in
    When The user clicks Applications link
    Then The user should be redirected to Applications page

  Scenario: Try Button in Applications in Stack
    Given The user is in the Applications in Stack page
    When The user clicks Try Here button in Applications
    Then The user should be redirected to a page having a text editor

  #practice_ques_in_stack
  Scenario: Go to Practice Questions page from Applications page
    Given The user is in the Applications page after logged in
    When The user clicks Practice Questions link in stack page
    Then The user should be redirected to Practice Questions page
