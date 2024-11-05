 @array1
Feature:  Testing Array feature in dsportalapp.herokuapp
 
 
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
    
    #Practice Questions Page    
    @Tc_A13
    Scenario: The user is able to navigate to Practice page
    Given The user is on the Arrays in Python page after logged in
    When The user clicks Practice Questions link of Array Page
    Then The user should be redirected to Array practice Questions page 
  
 
