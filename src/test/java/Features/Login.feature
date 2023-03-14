Feature: Login

  Scenario: Success login
    Given I open login page
    When I enter "standard_user" to username input field
    And enter "secret_sauce" to password input filed
    When I push the Login button
    Then I am on the page Inventory