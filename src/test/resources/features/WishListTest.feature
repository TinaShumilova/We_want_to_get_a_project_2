@Team2
Feature: 3.As a registered user I should be able to add products to Wish List

  1 Wish List link should be present on the Top menu and show the count of items in the Wish List
  2 From Products List page there should be a link "Add to Wish List" with heart icon which add item to the Wish List
  3 From Product page there should be a link "Add to Wish List" with heart icon to add item to the Wish list
  4 Wish List should display all items added by the User
  5 In Wish List page there should be an options to remove item from the list by clicking "Remove" icon
  6 In Wish List page there should be an option to add this item to cart by clicking "Add to cart" icon

  Highlights for testing:
  For out of stock product use product - tablet "Space Tab 10.1"


  Scenario: User adds 1 item to wishlist
    Given I am logged it to registered account
    And I navigate to homepage
    And I click See all Desktops
    When I add Apple Cinema product to wishlist
    And I see success message for Apple Cinema
    And I open wishlist page
    And I see that url contains next path: "/index.php?route=account/wishlist"
    Then I see previously selected Apple Cinema product in wishlist

@NotWorking
  Scenario: User adds 1 item to wishlist and removes it
    Given I am logged it to registered account
    And I navigate to homepage
    And I click See all Desktops
    When I add Apple Cinema product to wishlist
    And I see success message for Apple Cinema
    And I open wishlist page
    Then I click remove Apple Cinema from wishlist
    And Apple Cinema is removed from wishlist
    And I see remove success message


  Scenario: User adds 1 item to wishlist and from wishlist to cart
    Given I am logged it to registered account
    And I navigate to homepage
    And I click Cameras menu
    When I add Canon EOS product to wishlist
    And I see success message for Canon EOS
    And I open wishlist page
    Then I see previously selected Canon EOS in wishlist
# below is bug, should not be redirected to PDP page, move to cart button must send item to cart
    And I click move to cart button
# bug, impossible to add Canon EOS to cart
    And I click add item to cart on PDP page
    And I navigate to shopping cart
    Then I see previously selected Canon EOS in cart







