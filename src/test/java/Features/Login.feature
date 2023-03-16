@login
Feature: Login

  @success_login
  Scenario: Success login
    Given I open login page
    When I enter "standard_user" to username input field
    And enter "secret_sauce" to password input filed
    When I push the Login button
    Then I am on the page Inventory

  @loginWithLockedPutUser
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

  @purchase
  Scenario Outline: Successful purchase
    Given I open login page
    When I enter "standard_user" to username input field
    And enter "secret_sauce" to password input filed
    When I push the Login button
    And I am on the page Inventory
    When Choose and click add to cart
    And Click on cart
    And Click on button Checkout
    And Fill "Your Information" "<FirstName>", "<LastName>", "<PostalCode>"
    And push the button Finish in Overview
    Then Checkout: Complete! show message"Thank you for your order!"

    Examples:
      | FirstName | LastName | PostalCode |
      | John      | Smith    | 3900       |


  @success_logOut
  Scenario: Success login
    Given I open login page
    When I login  with data "standard_user" and password "secret_sauce"
    And I click on SideBar
    Then I click button Logout
