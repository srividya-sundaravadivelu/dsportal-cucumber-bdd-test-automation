Feature:  Testing Linked List feature in dsportalapp.herokuapp
 User should be able to be in Home page
 
  Background: 
    Given The user is logged in with username "numpy@gmail.com" and password "Tester123$"
    
    @tag1
  Scenario: Redirect to Linked List page from Home page drop down menu 
    Given The user is on the Home page
    When The user clicks the "Linked List" item from the drop down menu
    Then The user should be redirected to "Linked List" page
   
   Scenario: Redirect to Linked List page from Get Started button in Linked List Panel 
		Given The user is on the Home page	
		When The user clicks the Get Started button in "Linked List" Panel
		Then The user should be redirected to the "Linked List" page 
		
		#Introduction
		Scenario: Redirect to Introduction Page from Linked List Page
		Given The user is on the Linked List page
		When The user clicks Introduction link
		Then The user should be redirected to Introduction page
		
		Scenario: Redirect to Editor from Introduction Page
		Given The user is on the Introduction page
		When The user clicks "Try Here" button on "Introduction" Page
		Then The user should be redirected to a page having Editor and run button
		
		#Creating Linked List Link
		Scenario: Redirect to Creating Linked List Page from Linked List Page
		Given The user is on the Linked List page
		When The user clicks Creating Linked LIst link
		Then The user should be redirected to "Creating Linked List" page
		
		Scenario: Redirect to Editor from Creating Linked List page
		Given The user is on the Creating Linked List page
		When The user clicks "Try Here" button on "Creating Linked List" Page
		Then The user should be redirected to a page having Editor and run button
		
		#Types of Linked List		
		Scenario: Redirect to Types of Linked List from Linked List Page
		Given The user is on the Linked List page
		When The user clicks Types of Linked List link
		Then The user should be redirected to Types of Linked List page
		
		Scenario: Redirect to Editor from Types of Linked List Page
		Given The user is on the Types of Linked List page
		When The user clicks "Try Here" button on "Types of Linked List" Page
		Then The user should be redirected to a page having Editor and run button
		
		#Implement Linked List in Python
		Scenario: Redirect to Implement Linked List in Page from Linked List Page
		Given The user is on the Linked List page
		When The user clicks Implement Linked List in Python link
		Then The user should be redirected to Implement Linked List in Python page
		
		Scenario:
		Given The user is on the Implement Linked List in Python page
		When The user clicks "Try Here" button on "Implement Linked List in Python" Page
		Then The user should be redirected to a page having Editor and run button
		
		#Traversal
		Scenario: Redirect to Traversal Page from Linked List Page 
		Given The user is on the Linked List page
		When The user clicks Traversal link
		Then The user should be redirected to Traversal page
		
		Scenario: Redirect to Editor from Traversal Page
		Given The user is on the Traversal page
		When The user clicks "Try Here" button on "Traversal" Page
		Then The user should be redirected to a page having Editor and run button
		
		#Insertion
		Scenario: Redirect to Insertion Page from Linked List Page
		Given The user is on the Linked List page
		When The user clicks Insertion link
		Then The user should be redirected to Insertion page
		
		Scenario: Redirect to Editor from Insertion Page
		Given The user is on the Insertion page
		When The user clicks "Try Here" button on "Insertion" Page
		Then The user should be redirected to a page having Editor and run button
		
		#Deletion
		Scenario: Redirected to Deletion Page from Linked List Page
		Given The user is on the Linked List page
		When The user clicks Deletion link
		Then The user should be redirected to Deletion page.
		
		Scenario: Redirected to Editor from Deletion page
		Given The user is on the Deletion page
		When The user clicks "Try Here" button on "Deletion" Page
		Then The user should be redirected to a page having Editor and run button
		
		# Try Editor Page
  Scenario Outline:: Run Button with valid code in Python Code Editor Page
    Given The user is on the Try Editor page	
    When The user enters valid Python code from sheet "<SheetName>" and row <RowNumber> and clicks the Run button	
    Then The user is able to see the output inside the console
     Examples:
	    | SheetName  | RowNumber |
	    | PythonCode | 0         |
    
  Scenario Outline: Run Button with invalid code in Python Code Editor Page
    Given The user is on the Try Editor page	
    When  The user enters invalid Python code from sheet "<Sheetname>" and row <RowNumber> and clicks the Run button
    Then The user sees an error message in the alert window
      Examples:
    | SheetName  | RowNumber |
    | PythonCode | 1         |
    
  Scenario: Run Button without entering code in Python Code Editor Page
    Given The user is on the Try Editor page	
    When The user clicks the Run Button without entering code in the Editor	
    Then The focus remains in the same page and no error message is displayed
    
  Scenario: Handle alert message in Python Code Editor Page   
    Given The user is on the Try Editor page with an alert error message	
    When The user clicks the OK button in the alert window	
    Then The user is on the same page having the Editor and Run button
		
		