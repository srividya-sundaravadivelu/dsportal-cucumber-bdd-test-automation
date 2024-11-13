
 @Linkedlist
Feature:  Testing Linked List feature in dsportalapp.herokuapp
 User should be able to be in Home page
 
  Background: 
    Given The user is logged in with username "numpy@gmail.com" and password "Tester123$"
    
    @Llist
    Scenario: Redirect to Linked List page from Home page drop down menu 
    Given The user is on the Home page
    When The user clicks the "Linked List" item from the drop down menu
    Then The user should be redirected to the "Linked List" page
   @Llist
   Scenario: Redirect to Linked List page from Home page Get Started button in Array Panel 
		Given The user is on the Home page	
		When The user clicks the Get Started button in "Linked-List" Panel
		Then The user should be redirected to the "Linked List" page
    
		
		#Introduction
		@TC_Llist1
		
		 Scenario: User navigated to "Introduction" page
    Given The user is on the "Linked List" page after logged in
    When The user clicks Introduction link
    Then The user should be directed to "Introduction" of Linked List Page
    
		
			@TC_Llist2
		
		
		Scenario: User navigated to tryEditor page with Run button from Introduction page
    Given The user is on the "Introduction" page after logged in
    When The user clicks "Try Here" button in the "introduction" page
    Then The user redirected to the page having an tryEditor with a Run button to test
		
		#Creating Linked List Link
			@TC_Llist3
		
		
		Scenario: User navigated to "creating linked list" page
    Given The user is on the "Linked List" page after logged in
    When The user clicks creating linked list link
    Then The user should be directed to "Creating Linked LIst" of Linked List Page
		
			@TC_Llist4
		Scenario: Redirect to Editor from Creating Linked List page
		Given The user is on the "Creating Linked List" page after logged in
		When The user clicks "Try Here" button on "Creating Linked List" Page
		Then The user redirected to the page having an tryEditor with a Run button to test
		
		#Types of Linked List	
			@TC_Llist5	
		
		
		Scenario: User navigated to "Types of linked list" page
    Given The user is on the "Linked List" page after logged in
    When The user clicks the Types of Linked List link
    Then The user should be directed to "Types of Linked List" of Linked List Page
			@TC_Llist6
		Scenario: Redirect to Editor from Types of Linked List Page
		Given The user is on the "Types of Linked List" page after logged in
		When The user clicks "Try Here" button on "Types of Linked List" Page
		Then The user redirected to the page having an tryEditor with a Run button to test
		
		#Implement Linked List in Python
		@TC_Llist7
		Scenario: user navigated to "Implementation linked list in python" page
    Given The user is on the "Linked List" page after logged in
    When The user clicks the Implement Linked List in Python link
    Then The user should be directed to "Implement Linked List in Python" of Linked List Page
    
		@TC_Llist8
		Scenario: Redirect to Editor from Implement Linked List in Python page
		Given The user is on the "Implement Linked List in Python" page after logged in
		When The user clicks "Try Here" button on "Implement Linked List in Python" Page
		Then The user redirected to the page having an tryEditor with a Run button to test
		
		
		#Traversal
		@TC_Llist9		
		 Scenario: user navigated to "Traversal" page
		 Given The user is on the "Linked List" page after logged in
    When The user clicks the Traversal link
    Then The user should be directed to "Traversal" of Linked List Page
			@TC_Llist10
		Scenario: Redirect to Editor from Traversal Page
		Given The user is on the "Traversal" page after logged in
		When The user clicks "Try Here" button on "Traversal" Page
		Then The user redirected to the page having an tryEditor with a Run button to test
		
		#Insertion
			@TC_Llist11
		
		
		Scenario: user navigated to "Insertion" page
    Given The user is on the "Linked List" page after logged in
    When The user clicks the Insertion link
    Then The user should be directed to "Insertion" of Linked List Page
			@TC_Llist12
		Scenario: Redirect to Editor from Insertion Page
		Given The user is on the "Insertion" page after logged in
		When The user clicks "Try Here" button on "Insertion" Page
		Then The user redirected to the page having an tryEditor with a Run button to test
		
		#Deletion
			@TC_Llist13
		
		Scenario: user navigated to "Deletion" page
    Given The user is on the "Linked List" page after logged in
    When The user clicks the Deletion link
    Then The user should be directed to "Deletion" of Linked List Page
			@TC_Llist14
		Scenario: Redirected to Editor from Deletion page
		Given The user is on the "Deletion" page after logged in
		When The user clicks "Try Here" button on "Deletion" Page
		Then The user redirected to the page having an tryEditor with a Run button to test
		
		
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
     
		
		@TC_Llist15
		Scenario: The user validating "Practice Questions" page
    Given The user is on the "Linked List" page after logged in
    When The user clicks Introduction link
    And The user clicks on the Practice Questions
    Then The user should be directed to Practice Questions of Linked List Page
		
		