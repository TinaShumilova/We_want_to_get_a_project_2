@CheckoutLink
Feature: Checkout Button Appearance And Redirect To Checkout Page

  Background:
    Given I moves to on shop page
    When I add one item in Shopping Cart

  Scenario: Direct link to Checkout on top menu
    And I click on Checkout in top menu
    Then I am on the Checkout page

  Scenario: Shopping cart page there is a link to Checkout
    Then I click on Shopping Cart in top menu
    Then I click on Checkout Button in Shopping Cart
    And I am on the Checkout page


  Scenario: In shopping cart popup on right side there is a link to Checkout
    Then I click on Shopping Cart popup
    And I see the the Shopping Cart dropdown menu displayed
    Then I click on Checkout
    And I am on the Checkout page