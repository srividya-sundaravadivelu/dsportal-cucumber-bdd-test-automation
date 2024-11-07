@data-structures-introduction
Feature: Data Structures Introduction Functionality

  Background: 
    Given The user is logged in with username "numpy@gmail.com" and password "Tester123$"
    
  # Home Page
	Scenario: Redirect to Data Structures Introduction page from Home page Get Started button in Data Structures Introduction Panel 
		Given The user is on the Home page	
		When The user clicks the Get Started button in "Data-Structures-Introduction" Panel
		Then The user should be redirected to the "Data-Structures-Introduction" page
		
	# Data Structures Introduction Page
	Scenario: Redirect to Time Complexity Page from Data Structures Introduction page
    Given The user is on the Data Structures Introduction page	
    When The user clicks "Time Complexity" link under Topics Covered in Data Structures Introduction page
    Then The user should be redirected to the Time Complexity page
    
  # Time Complexity Page
  Scenario: Redirect to Practice Questions page from Time Complexity page	 
    Given The user is on the Time Complexity page	 
    When The user clicks Practice Questions link in Time Complexity page	
    Then The user should be redirected to the Practice Questions page in Data Structures Introduction
    
  Scenario: Redirect to Python Editor page from Time Complexity page
    Given The user is on the Time Complexity page	
    When The user clicks Try Here button	
    Then The user should be redirected to the Try Editor page
    
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
