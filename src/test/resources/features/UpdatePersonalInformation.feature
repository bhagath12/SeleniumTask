Feature: Update Personal Information(FirstName) in My Account. & Further verify FirstName field appears updated.

  Background: prerequisite
    Given user enters the URL

  Scenario Outline: Test to update personal information
    When user clicks on sign in
    When user enters userName as "<UserName>" and password as "<Password>"
    When user clicks on my personal information
    And user updates first name as "<FirstName>"
    And user enters current password as "<Password>"
    When user clicks on save button
    When user clicks on back to your account
    When user clicks on my personal information
    Then verify first name field appears updated as "<FirstName>"

    Examples: 
      | UserName                      | Password      | FirstName |
      | automation.practice@gmail.com | Automation123 | Peter     |
