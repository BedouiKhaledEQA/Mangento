Feature: Add to cart Functionality
  @AddToCart
  Scenario: Add item to cart
    Given User open the browser
    When  User select item from mens and add it to cart
    Then  Message that articl was added  should 166appear

    @RemoveFromcart
   Scenario: Remove from cart
     Given User open the browser
     When  User select item from mens and add it to cart
     And   User remove item from cart
     Then  Item should be removed