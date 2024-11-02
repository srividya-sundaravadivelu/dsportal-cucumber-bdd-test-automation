@home
Feature: Home Functionality

  Background: 
    Given The user is logged in with username "numpy@gmail.com" and password "Tester123$"
    
  # Graph Page  
  Scenario: Redirect to Graph page from Home page drop down menu 
  	Given The user is on the Home page
  	When The user clicks the "Graph" item from the drop down menu
  	Then The user should be redirected to the "Graph Home" page

	Scenario: Redirect to Graph page from Home page Get Started button in Graph Panel 
		Given The user is on the Home page	
		When The user clicks the Get Started button in "Graph" Panel
		Then The user should be redirected to the "Graph Home" page
    