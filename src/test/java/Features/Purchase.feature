Feature: Purchase
  @Purchase_show
  Scenario: Add item to the card
    Given I open login page
    When I login  with data "standard_user" and password "secret_sauce"
    And open side bar and push Reset App state
    When I add first product to cart
    Then cart icon with value "1" is displayed
    And I push remote product and check that the cart is empty