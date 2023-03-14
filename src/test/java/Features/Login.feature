Feature: Login

  Scenario: Success login
    Given I open login page
    When I enter "standard_user" to username input field
    And enter "secret_sauce" to password input filed
    When I push the Login button
    Then I am on the page Inventory

  Scenario Outline: Login with locked put user
    Given I open login page
    When I enter "<userName>" to userName input field
    And enter "secret_sauce" to password input filed
    When I push the Login button
    Then Receive a sad message with text "<errorMessageText>"
    Examples:
      | userName        | errorMessageText                                            |
      | locked_out_user | Sorry, this user has been locked out                        |
      | Mister_Smith    | Username and password do not match any user in this service |

  Scenario: Successful purchase
    Given I open login page
    When I enter "standard_user" to username input field
    And enter "secret_sauce" to password input filed
    When I push the Login button
    And I am on the page Inventory
    And Choose and click "add to cart"
    And Click on cart
    And Click on button Checkout
    And Fill "Your Information"
    And push the button Finish in Overview
    Then Checkout: Complete! show message"Thank you for your order!"