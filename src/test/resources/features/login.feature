
#@login
#Feature: Login Functionality
#
  # verify register link of login page
  #Scenario: verify login page
    #Given The user is on login page
    #When The user clicks on register link
    #Then The user will be redirected to register page
    #
#
#
  #Scenario Outline: Verify login page with Invalid inputs
  #verify with Invalid input
    #Given The user is on login page
    #When The user enter invalid <username>and <password>
    #Then  Error messahe is displayed "Invalid Username and Password"
#
    #Examples: 
      #| username| password | 
      #|         | Blankname |
      #|  BlankPW|           |
#
        # verify signout link
  #Scenario: verify login page
    #Given The user is on login page with valid username "numpy@gmail.com" and password "Tester123$"
    #When The user clicks on signout button
    #Then The user will be redirected to homepage