Feature: Login

  Scenario: Success login
    Given I open login page
    When I enter "standard_user" to username input field
    And enter "secret_sauce" to password input filed
    When I push the Login button
    Then I am on the page Inventory

  Scenario: Login with locked put user
    Given I open login page
    When I enter "locked_out_user" to username input field
    And enter "secret_sauce" to password input filed
    When I push the Login button
    Then Receive a sad message

  Scenario: Login with invalid put user
    Given I open login page
    When I enter "Mister_Smith" to username input field
    And enter "secret_sdvd" to password input filed
    When I push the Login button
    Then Error message