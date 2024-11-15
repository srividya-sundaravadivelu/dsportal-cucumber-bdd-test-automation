@register
Feature: Testing Registration feature in dsportalapp.herokuapp
 User should be able to launch the application

  
  Scenario: Register Scenario
    Given User open browser with url https://dsportalapp.herokuapp.com
    When User clicks Get Started button
    Then User should see Home page
   


@TC_reg1
Scenario: Register Scenario for all empty fields
    Given The user is on Register page
    When The user clicks "Register" button with all empty fields
    Then User should get error message "Please fill out this field." below Username texbox
    
    @TC_reg2
    Scenario: Only Username field is enter
    Given The user is on Register page
    When The user clicks "Register" button with entering only username field 
    |username|
    |NumpyTest1|
    Then User should get error message "Please fill out this field." below Password texbox
    
  @TC_reg3
    Scenario: Only Username and Password field is enter
    Given The user is on Register page
    When The user clicks "Register" button with entering only "username" and "password"
    |username|password|
    |NumpyTest1| Testpassword2|
    Then User should get error message "Please fill out this field." below Confirmation texbox 
    
    @TC_reg4
     Scenario: Invalid username
    Given The user is on Register page
    When The user enters a "username" with characters other than Letters, digits and "@/./+/-/_"
    |username|password|password confirmation|
    |*abcd*%| Testpassword2|Testpassword2|
    Then User should get error messages "Please enter a valid username"
    
    @TC_reg5
    Scenario: Password with less than 8 character
    Given The user is on Register page
    When The user enters a valid "username" and "password" with less than 8 characters 
    |username|password|password confirmation|
    |Numpyninja|lessnum |lessnum|
    Then User should get error message "Password should contain at least 8 characters"
    
    
    
    
    