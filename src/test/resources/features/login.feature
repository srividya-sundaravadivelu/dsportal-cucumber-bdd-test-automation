

Feature: Login Functionality
@login
   @TC_l1
  Scenario: verify login page
    Given The user is on login page
    When The user clicks on register link
    Then The user will be redirected to register page
    

 @TC_l2
  Scenario Outline: Verify login page with Invalid inputs

    Given The user is on login page
    When The user enter invalid "<username>" and "<password>" click login button to verify
    Then  User should get error message "Please fill out this field"

    Examples: 
      | username| password | 
      |         | Blankname |
      |  BlankPW|           |
      

  