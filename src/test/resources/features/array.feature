@array
Feature: Testing Array feature in dsportalapp.herokuapp

  Background: 
    Given The user is logged in with username "numpy@gmail.com" and password "Tester123$"

  Scenario: Redirect to Array page from Home page drop down menu
    Given The user is on the Home page
    When The user clicks the "Arrays" item from the drop down menu
    Then The user should be redirected to the "Array" page

  Scenario: Redirect to Array page from Home page Get Started button in Array Panel
    Given The user is on the Home page
    When The user clicks the Get Started button in "Array" Panel
    Then The user should be redirected to the "Array" page

  #Array Page
  @TC_A1
  Scenario: Redirect to Arrays in Python Page from Array  page
    Given The user is on the Array page
    When The user clicks "Arrays in Python" link under Topics Covered in Array page
    Then The user should be redirected to the Overview of Arrays in Python page

  @TC_A2
  Scenario: Redirect to Arrays Using List Page from Array page
    Given The user is on the Array page
    When The user clicks "Arrays Using List" link under Topics Covered in Array page
    Then The user should be redirected to the Overview of Arrays Using List page

  @TC_A3
  Scenario: Redirect to Basic Operations in Lists Page from Array  page
    Given The user is on the Array page
    When The user clicks "Basic Operations in Lists" link under Topics Covered in Array page
    Then The user should be redirected to the Basic Operations in Lists page

  @TC_A4
  Scenario: Redirect to Applications of Array Page from Array page
    Given The user is on the Array page
    When The user clicks "Applications of Array" link under Topics Covered in Array page
    Then The user should be redirected to the Applications of Array page

  # Arrays in Python
  @TC_A5
  Scenario: Redirect to Overview of Arrays in Python page from Array page
    Given The user is on the Array page
    When The user clicks Arrays in Python link
    Then The user should be redirected to the Overview of Arrays in Python page

  @TC_A6
  Scenario: Redirect to Python Editor page from Arrays in Python Page
    Given The user is on the Arrays in Python page
    When The user clicks "Try Here" button on "Arrays in Python" Page
    Then The user should be redirected to the Try Editor page from Array page

  # Arrays Using List
  @TC_A7
  Scenario: Redirect to Overview of Arrays Using List page from Home page
    Given The user is on the Array page
    When The user clicks of Arrays Using List link
    Then The user should be redirected to the Overview of Arrays Using List page

  @TC_A8
  Scenario: Redirect to Python Editor page from Arrays Using List Page
    Given The user is on the Arrays Using List page
    When The user clicks "Try Here" button on "Arrays Using List" Page
    Then The user should be redirected to the Try Editor page from Array page

  # Basic Operations in Lists
  @TC_A9
  Scenario: Redirect to Overview of Basic Operations in Lists from Home page
    Given The user is on the Array page
    When The user clicks  of Basic Operations in Lists link
    Then The user should be redirected to the Basic Operations in Lists page

  @TC_A10
  Scenario: Redirect to Python Editor page from Basic Operations in Lists Page
    Given The user is on the Basic Operations in Lists page
    When The user clicks "Try Here" button on "Basic Operations in Lists" Page
    Then The user should be redirected to the Try Editor page from Array page

  # Applications of Array
  @TC_A11
  Scenario: Redirect to Overview of Applications of Array from Home page
    Given The user is on the Array page
    When The user clicks  Applications of Array link
    Then The user should be redirected to the Applications of Array page

  @TC_A12
  Scenario: Redirect to Python Editor page from Applications of Array Page
    Given The user is on the Applications of Array page
    When The user clicks "Try Here" button on "Applications of Array" Page
    Then The user should be redirected to the Try Editor page from Array page

  # Try Editor Page
  @try-editor
  Scenario: Run Button with valid code in Python Code Editor Page
    Given The user is on the Try Editor page
    When The user enters valid Python code from sheet "PythonCode" and row 1 and clicks the Run button
    Then The user is able to see the output inside the console

  @try-editor
  Scenario: Run Button with invalid code in Python Code Editor Page
    Given The user is on the Try Editor page
    When The user enters invalid Python code from sheet "PythonCode" and row 2 and clicks the Run button
    Then The user sees an error message in the alert window

  @try-editor
  Scenario: Run Button without entering code in Python Code Editor Page
    Given The user is on the Try Editor page
    When The user clicks the Run Button without entering code in the Editor
    Then The focus remains in the same page and no error message is displayed

  @try-editor
  Scenario: Handle alert message in Python Code Editor Page
    Given The user is on the Try Editor page with an alert error message
    When The user clicks the OK button in the alert window
    Then The user is on the same page having the Editor and Run button

  #Practice Questions Page
  @Tc_A13
  Scenario: The user is able to navigate to Practice page
    Given The user is on the Arrays in Python page after logged in
    When The user clicks Practice Questions link of Array Page
    Then The user should be redirected to Array practice Questions page

  #Practice Questions
  @TC_A14
  Scenario Outline: The user is able to navigate to question page
    Given The user is on the Array practice Questions page
    When The user clicks on the link for question "<questionTitle>"
    Then The user should be redirected to the expected "<questionTitle>" page

    Examples: 
      | questionTitle                           |
      | Search the array                        |
      | Max Consecutive Ones                    |
      | Find Numbers with Even Number of Digits |
      | Squares of  a Sorted Array              |

  #Practice Page Editor
  @TC_A15
  Scenario Outline: The user is able to run code in tryEditor for practice questions
    Given The user is on Question page of "<questionTitle>" after logged in
    When The user enter valid python code in tryEditor from sheet "validPythonCode" and "<questionTitle>" for the question
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | questionTitle                           |
      | Search the array                        |
      | Max Consecutive Ones                    |
      | Find Numbers with Even Number of Digits |
      | Squares of a Sorted Array               |

  @TC_A16
  Scenario Outline: The user is able to submit code in tryEditor for practice questions
    Given The user is on Question page of "<questionTitle>" after logged in
    When The user enter valid python code in tryEditor from sheet "submitPythonCode" and "<questionTitle>" for the question
    And The user clicks on submit button
    Then The user should be presented with successful submission message

    Examples: 
      | questionTitle                           |
      | Search the array                        |
      | Max Consecutive Ones                    |
      | Find Numbers with Even Number of Digits |
      | Squares of a Sorted Array               |

  @TC_A17
  Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor practice question page
    Given The user is on Question page of "<questionTitle>" after logged in
    When The user enter  python code with invalid syntax in tryEditor from sheet "invalidPythonCode" and "<questionTitle>" for the question
    And The user clicks on run button
    Then The user should be presented with error message as "SyntaxError: bad input on line 1"

    Examples: 
      | questionTitle                           |
      | Search the array                        |
      | Max Consecutive Ones                    |
      | Find Numbers with Even Number of Digits |
      | Squares of a Sorted Array               |
