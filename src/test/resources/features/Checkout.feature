@Checkout
Feature: Team3 Test Case 10 execution
  As a Bootcamp participant
  I want to be able to write and execute 1 scenario for Checkout page

  Scenario Outline: a new scenario for to login in Checkout page
    Given I moves to on shop page
    When I add one item in Shopping Cart
    Then I click on Checkout in top menu
    Then I am on the Checkout page
    And I input e-mail and password:
      | email    | <email>   |
      | password | <password> |
    And I click on Login button
    And I check Step 2: Billing Details block is available and opened

    Examples:
      | email                        | password |
      | ostnoayzckfnslmlkg@nthrl.com | 11111111 |