
@home
Feature: User wants to lauch application and test Home page for DsAlgo

  @TC_01_Home
  Scenario: User launch home page
    Given The user open the browser
     When The user enter the DS_Algo Portal <URL>
    Then The user should landed on the DS_Algo Get Started page with message "You are at the right place"
    
  
  @TC_02_Home
  Scenario: User is on home page and sees Register and Sign in link
    Given The user should open the DS Algo Portal URL in any supported browser
    When The user clicks the "Get Started" button
    Then The user should land in Data Structure Introduction Page with "Register" and "Sign in" links
    
  
 
      
    Scenario: User is on Home page and click on dropdown without sign in
    Given The user is on the DS Home page
    When The user selects any data structures item from the drop down without Sign in
    Then The user get warning message "You are not logged in"
    
     
    Scenario: User is on Home page and click getstarted link "<option>" on home page without sign in
    Given The user is on the DS Home page
    When The user clicks any "Get Started" buttons of data structures on the DS Introduction page
    Then The user get warning message "You are not logged in"
    
     
    Scenario: User is on Home page and click on Register
    Given The user is on the DS Home page
    When The user clicks Register link on the DS Introduction page
    Then The user redirected to Register 
    
   
    Scenario: User is on Home page and click on sign In
    Given The user is on the DS Algo Introduction Page
    When The user should click the Sign in link
    Then The user redirected to login page
   