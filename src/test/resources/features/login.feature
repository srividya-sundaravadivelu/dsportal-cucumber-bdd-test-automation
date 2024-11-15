
@login
Feature: Login Functionality

   @TC_log1
  Scenario: verify login page
    Given The user is on login page
    When The user clicks on register link
    Then The user will be redirected to register page
    

 @TC_log2
  Scenario Outline: Verify login page with Invalid inputs

    Given The user is on login page
    When The user enter invalid "<username>" and "<password>" click login button to verify
    Then  User should get error message "Please fill out this field"

    Examples: 
      | username| password | 
      |         | Blankname |
      |  BlankPW|           |
      |          |          |
      
      
    @TC_log3  
 
    Scenario: Verify user is able to signout after signing in to application

    Given The user is on login page with valid username "numpy@gmail.com" and password "Tester123$"
    When  The user click sigout 
    Then  The user is redirected to homepage