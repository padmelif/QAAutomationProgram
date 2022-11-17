@login @regression

Feature: hepsiburada - Login Page

  Scenario: Validate - Successful Login
    Given I access the hepsiburada login page
    When enter a username elifparlak@yahoo.com
    And click on the login button
    And enter a password Se96022*
    And click on the login button
    Then the my_account link button is shown

  Scenario: Validate - Unsuccessful Login
    Given I access the hepsiburada login page
    When enter a username elifparlak@yahoo.com
    And click on the login button
    And enter a password Test123*
    And click on the login button
    Then the error message is shown


