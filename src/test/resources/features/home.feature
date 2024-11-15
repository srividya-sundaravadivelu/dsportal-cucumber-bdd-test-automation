@home
Feature: User wants to lauch application and test Home page for DsAlgo

  @TS_H1
  Scenario: User launch home page of an dsalgo project
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage

  @TS_H2
  Scenario Outline: User is on Home page and click getstarted link "<item>" on home page without sign in
    Given The user is on Home page
    When The user clicks on Get Started link on homepage "<item>" without login
    Then The user get warning message "You are not logged in"

    Examples: 
      | item                         |
      | Data-structures-introduction |
      | Array                        |
      | Linked-list                  |
      | Stack                        |
      | Queue                        |
      | Tree                         |
      | Graph                        |

  @TS_H3
  Scenario Outline: User is on Home page and click on dropdown "<item>" without sign in
    Given The user is on Home page
    When The user clicks on dropdown "<item>"
    Then The user get warning message "You are not logged in"

    Examples: 
      | item        |
      | Arrays      |
      | Linked List |
      | Stack       |
      | Queue       |
      | Tree        |
      | Graph       |

  @TS_H4
  Scenario: User is on Home page and click on sign in
    Given The user is on Home page
    When The user clicks on signin link
    Then The user redirected to login page

  @TS_H5
  Scenario: User is on Home page and click on Register
    Given The user is on Home page
    When The user clicks on register link of Home page
    Then The user redirected to Registration page
