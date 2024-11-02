@tree
Feature: Tree Functionality

  Background: 
    Given The user is logged in with username "numpy@gmail.com" and password "Tester123$"
 
 	# Home Page  
  Scenario: Redirect to Tree page from Home page drop down menu 
  	Given The user is on the Home page	
  	When The user clicks the "Tree" item from the drop down menu
  	Then The user should be redirected to the "Tree" page

	Scenario: Redirect to Tree page from Home page Get Started button in Tree Panel 
		Given The user is on the Home page	
		When The user clicks the Get Started button in "Tree" Panel
		Then The user should be redirected to the "Tree" page  
    
  # Tree Page 
  Scenario: Redirect to Overview of Trees page from Tree page
  	Given The user is on the Tree page	
  	When The user clicks "Overview of Trees" link under Topics Covered in Tree page
  	Then The user should be redirected to the Overview of Trees page
  
  Scenario: Redirect to Terminologies page from Tree page	
  	Given The user is on the Tree page	
  	When The user clicks "Terminologies" link under Topics Covered in Tree page		 		
  	Then The user should be redirected to the Terminologies page
  
  Scenario: Redirect to Types of Trees page from Tree page		
		Given The user is on the Tree page	
		When The user clicks "Types of Trees" link under Topics Covered in Tree page			
		Then The user should be redirected to the Types of Trees page
	
	Scenario: Redirect to Tree Traversals page from Tree page		
		Given The user is on the Tree page	
		When The user clicks "Tree Traversals" link under Topics Covered in Tree page		
		Then The user should be redirected to the Tree Traversals page
		
	Scenario: Redirect to Traversals-Illustration page from Tree page	
		Given The user is on the Tree page	
		When The user clicks "Traversals-Illustration" link under Topics Covered in Tree page		 	
		Then The user should be redirected to the Traversals-Illustration page

	Scenario: Redirect to Binary Trees page from Tree page	
		Given The user is on the Tree page	
		When The user clicks "Binary Trees" link under Topics Covered in Tree page		 		
		Then The user should be redirected to the Binary Trees page
		
	Scenario: Redirect to Types of Binary Trees page from Tree page			
		Given The user is on the Tree page	
		When The user clicks "Types of Binary Trees" link under Topics Covered in Tree page		 	
		Then The user should be redirected to the Types of Binary Trees page
		
	Scenario: Redirect to Implementation in Python page from Tree page	
		Given The user is on the Tree page	
		When The user clicks "Implementation in Python" link under Topics Covered in Tree page		 	
		Then The user should be redirected to the Implementation in Python page
		
	Scenario: Redirect to Binary Tree Traversals page from Tree page	
		Given The user is on the Tree page	
		When The user clicks "Binary Tree Traversals" link under Topics Covered in Tree page			
		Then The user should be redirected to the Binary Tree Traversals page
		
	Scenario: Redirect to Implementation of Binary Trees page from Tree page	
		Given The user is on the Tree page	
		When The user clicks "Implementation of Binary Trees" link under Topics Covered in Tree page		 		
		Then The user should be redirected to the Implementation of Binary Trees page
		
	Scenario: Redirect to Applications of Binary trees page from Tree page		
		Given The user is on the Tree page	
		When The user clicks "Applications of Binary trees" link under Topics Covered in Tree page		 		
		Then The user should be redirected to the Applications of Binary trees page
		
	Scenario: Redirect to Binary Search Trees page from Tree page		
		Given The user is on the Tree page	
		When The user clicks "Binary Search Trees" link under Topics Covered in Tree page				
		Then The user should be redirected to the Binary Search Trees page

	Scenario: Redirect to Implementation Of BST page from Tree page	
		Given The user is on the Tree page	
		When The user clicks "Implementation Of BST" link under Topics Covered in Tree page		 		
		Then The user should be redirected to the Implementation Of BST page
		
	# Overview of Trees page
	Scenario: Redirect to Terminologies page from Overview of Trees page		
		Given The user is on the Overview of Trees page	
		When The user clicks Terminologies link		
		Then The user should be redirected to the Terminologies page
		
	Scenario: Redirect to Try Editor page from Overview of Trees page		
		Given The user is on the Overview of Trees page	
		When The user clicks Try Here button	
    Then The user should be redirected to the Try Editor page
  
  # Terminologies page  
	Scenario: Redirect to Types of Trees page from Terminologies page			
  	Given The user is on the Terminologies page	
  	When The user clicks Types of Trees link		
  	Then The user should be redirected to the Types of Trees page

	Scenario: Redirect to Try Editor page from Terminologies page		
		Given The user is on the Terminologies page	
		When The user clicks Try Here button	
		Then The user should be redirected to the Try Editor page
  
  # Types of Trees page	
  Scenario: Redirect to Tree Traversals page from Types of Trees page			
  	Given The user is on the Types of Trees page	
  	When The user clicks Tree Traversals link		
  	Then The user should be redirected to the Tree Traversals page

	Scenario: Redirect to Try Editor page from Types of Trees page		
		Given The user is on the Types of Trees page	
		When The user clicks Try Here button		
		Then The user should be redirected to the Try Editor page
	
	# Tree Traversals page
	Scenario: Redirect to Traversals-Illustration page from Tree Traversals page		
		Given The user is on the Tree Traversals page	
		When The user clicks Traversals-Illustration link		
		Then The user should be redirected to the Traversals-Illustration page

	Scenario: Redirect to Try Editor page from Tree Traversals page		
		Given The user is on the Tree Traversals page	
		When The user clicks Try Here button		
		Then The user should be redirected to the Try Editor page

	# Traversals-Illustration page	
	Scenario: Redirect to Binary Trees page from Traversals-Illustration page		
		Given The user is on the Traversals-Illustration page	
		When The user clicks Binary Trees link		
		Then The user should be redirected to the Binary Trees page

	Scenario: Redirect to Try Editor page from Traversals-Illustration page		
		Given The user is on the Traversals-Illustration page	
		When The user clicks Try Here button		
		Then The user should be redirected to the Try Editor page

	# Binary Trees page	
	Scenario: Redirect to Types of Binary Trees page from Binary Trees page		
		Given The user is on the Binary Trees page	
		When The user clicks Types of Binary Trees link		
		Then The user should be redirected to the Types of Binary Trees page

	Scenario: Redirect to Try Editor page from Binary Trees page		
		Given The user is on the Binary Trees page	
		When The user clicks Try Here button		
		Then The user should be redirected to the Try Editor page
	
	# Types of Binary Trees page			
	Scenario: Redirect to Implementation in Python page from Types of Binary Trees page		
		Given The user is on the Types of Binary Trees page	
		When The user clicks Implementation in Python link		
		Then The user should be redirected to the Implementation in Python page

	Scenario: Redirect to Try Editor page from Types of Binary Trees page		
		Given The user is on the Types of Binary Trees page	
		When The user clicks Try Here button		
		Then The user should be redirected to the Try Editor page
	
	# Implementation in Python page
	Scenario: Redirect to Binary Tree Traversals page from Implementation in Python page		
		Given The user is on the Implementation in Python page	
		When The user clicks Binary Tree Traversals link		
		Then The user should be redirected to the Binary Tree Traversals page

	Scenario: Redirect to Try Editor page from Implementation in Python page		
		Given The user is on the Implementation in Python page	
		When The user clicks Try Here button		
		Then The user should be redirected to the Try Editor page
	
	# Binary Tree Traversals page		
	Scenario: Redirect to Implementation of Binary Trees page from Binary Tree Traversals page		
		Given The user is on the Binary Tree Traversals page	
		When The user clicks Implementation of Binary Trees link		
		Then The user should be redirected to the Implementation of Binary Trees page

	Scenario: Redirect to Try Editor page from Binary Tree Traversals page		
		Given The user is on the Binary Tree Traversals page	
		When The user clicks Try Here button		
		Then The user should be redirected to the Try Editor page

	# Implementation of Binary Trees page		
	Scenario: Redirect to Applications of Binary trees page from Implementation of Binary Trees page		
		Given The user is on the Implementation of Binary Trees page	
		When The user clicks Applications of Binary trees link		
		Then The user should be redirected to the Applications of Binary trees page	

	Scenario: Redirect to Try Editor page from Implementation of Binary Trees page		
		Given The user is on the Implementation of Binary Trees page	
		When The user clicks Try Here button		
		Then The user should be redirected to the Try Editor page

	# Applications of Binary trees page		
	Scenario: Redirect to Binary Search Trees page from Applications of Binary trees page		
		Given The user is on the Applications of Binary trees page	
		When The user clicks Binary Search Trees link		
		Then The user should be redirected to the Binary Search Trees page

	Scenario: Redirect to Try Editor page from Applications of Binary trees page		
		Given The user is on the Applications of Binary trees page	
		When The user clicks Try Here button		
		Then The user should be redirected to the Try Editor page

	# Binary Search Trees page	
	Scenario: Redirect to Implementation Of BST page from Binary Search Trees page		
		Given The user is on the Binary Search Trees page	
		When The user clicks Implementation Of BST link		
		Then The user should be redirected to the Implementation Of BST page

	Scenario: Redirect to Try Editor page from Binary Search Trees page		
		Given The user is on the Binary Search Trees page	
		When The user clicks Try Here button		
		Then The user should be redirected to the Try Editor page
	
	# Implementation Of BST page		
	Scenario: Redirect to Practice Questions page from Implementation Of BST page			
		Given The user is on the Implementation Of BST page	
		When The user clicks Practice Questions link in Implementation Of BST page		
		Then The user should be redirected to the Practice Questions page in Tree

	Scenario: Redirect to Try Editor page from Implementation Of BST page		
		Given The user is on the Implementation Of BST page	
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










  	
  	
  
  
  
    
