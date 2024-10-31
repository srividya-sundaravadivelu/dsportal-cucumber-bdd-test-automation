
Feature:  Testing Array feature in dsportalapp.herokuapp
 
 
  Background: 
    Given The user is logged in with username "numpy@gmail.com" and password "Tester123$"
	
  @tag1
  Scenario: Redirect to Array page from Home page drop down menu 
    Given The user is on the Home page
    When The user clicks the "Arrays" item from the drop down menu
    Then The user should be redirected to "Array" page
   
   Scenario: Redirect to Array page from Home page Get Started button in Array Panel 
		Given The user is on the Home page	
		When The user clicks the Get Started button in "Array" Panel
		Then The user should be redirected to the "Array" page 
		
		# Arrays in Python 
  Scenario: Redirect to Overview of Arrays in Python page from Array page
  	Given The user is on the Home page	
  	When The user clicks Arrays in Python link 		
  	Then The user should be redirected to the Overview of Arrays in Python page 
  	
  	 Scenario: Redirect to Python Editor page from Arrays in Python Page
    Given The user is on the Arrays in Python page	
    When The user clicks "Try Here" button on "Arrays in Python" Page
    Then The user should be redirected to the Try Editor page 
  	
  	# Arrays Using List 
  Scenario: Redirect to Overview of Arrays Using List page from Home page
  	Given The user is on the Home page	
  	When The user clicks of Arrays Using List link 		
  	Then The user should be redirected to the Overview of Arrays Using List page 
  	
  	Scenario: Redirect to Python Editor page from Arrays Using List Page
    Given The user is on the Arrays Using List page	
    When The user clicks "Try Here" button on "Arrays Using List" Page
    Then The user should be redirected to the Try Editor page
    
  	
  	# Basic Operations in Lists
  Scenario: Redirect to Overview of Basic Operations in Lists from Home page
  	Given The user is on the Home page	
  	When The user clicks  of Basic Operations in Lists link 		
  	Then The user should be redirected to the Basic Operations in Lists page  
  	
  	Scenario: Redirect to Python Editor page from Basic Operations in Lists Page
    Given The user is on the Basic Operations in Lists page	
    When The user clicks "Try Here" button on "Basic Operations in Lists" Page
    Then The user should be redirected to the Try Editor page
  	
  	# Applications of Array
  	Scenario: Redirect to Overview of Applications of Array from Home page
  	Given The user is on the Home page	
  	When The user clicks  Applications of Array link		
  	Then The user should be redirected to the Applications of Array page  
  
  
  Scenario: Redirect to Python Editor page from Applications of Array Page
    Given The user is on the Applications of Array page	
    When The user clicks "Try Here" button on "Applications of Array" Page
    Then The user should be redirected to the Try Editor page
    
    #Practice Question Page
    
  Scenario: Redirect to Practice Questions page from Applications of Array page	 
    Given The user is on the Arrays in Python page 
    When The user clicks Practice Questions link	
    Then The user should be redirected to the Practice Questions page
    
     #Practice page 
  Scenario: Redirect to QUESTION page from Search the array link
    Given The user is on Practice Questions page	
    When The user clicks search the array link	
    Then The user should be redirected to QUESTION page contains a question,an tryEditor with Run and Submit buttons 
    
  Scenario: Redirect to QUESTION page from Max Consecutive Ones link
    Given The user is on Practice Questions page	
    When The user clicks Max Consecutive Ones link	
    Then The user should be redirected to QUESTION page contains a question,an tryEditor with Run and Submit buttons 
    
  Scenario: Redirect to QUESTION page from Find Numbers with Even Number of Digits
    Given The user is on Practice Questions page	
    When The user clicks Find Numbers with Even Number of Digits link	
    Then The user should be redirected to QUESTION page contains a question,an tryEditor with Run and Submit buttons 
    
    
Scenario: Redirect to QUESTION page from Squares of a Sorted Array
    Given The user is on Practice Questions page	
    When The user clicks Squares of a Sorted Array link	
    Then The user should be redirected to QUESTION page contains a question,an tryEditor with Run and Submit buttons
     
   #Practice Page Editor 
   
 Scenario: Checking functionality by clicking Run Button without entering code in Python Code Editor Practice Page
   Given The user is on the Python Editor of Practice Page
   When The user clicks the Run Button without entering the code in the Editor of Practice Page
   Then Nothing happens to the page and no error message is displayed in Practice Page
   
 Scenario Outline: user get error message in Python Code Editor Page of Practice Page
   Given The user is on the Python Editor of Practice Page
   When The user write the invalid code in Editor of Practice Page Click the Run Button
   Then The user should able to see an error message in alert window of Practice Page
    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
   
 Scenario Outline: user able to run code in Python Code Editor Page of Practice Page
   Given The user is on the Python Editor of Practice Page
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question Click the Run Button
   Then The user should able to see output in the console of PracticePage
     Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         2 |
   
   
 Scenario Outline: User able to submit the output
 Given The user is on the Python Editor of Practice Page
 When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question Clicks on Submit button
    
 Then The user see an error message Error occurred during submission
 Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |
    
    
    # Try Editor Page
  Scenario Outline: Run Button with valid code in Python Code Editor Page
    Given The user is on the Try Editor page	
     When The user enters valid Python code from sheet "<SheetName>" and row <RowNumber> and clicks the Run button
    Then The user is able to see the output inside the console
    Examples:
    | SheetName  | RowNumber |
    | PythonCode | 0         |
    
  Scenario Outline: Run Button with invalid code in Python Code Editor Page
    Given The user is on the Try Editor page	
     When The user enters invalid Python code from sheet "<Sheetname>" and row <RowNumber> and clicks the Run button	
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
     
  
 
