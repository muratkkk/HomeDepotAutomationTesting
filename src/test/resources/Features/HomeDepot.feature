Feature: Automate the basic flow of adding a product to the cart, registering a new user account and checking out.
         Also, write automation test cases to test this flow.

  @temp
  Scenario: Verify that user can purchase product and create a new account
    Given Client wants to go "http://automationpractice.com"
    When Client wants to see "Women" category
    And Client wants to see "Summer Dresses"
    And Client wants to quick view first "Printed Summer Dresses"
    Then Client wants to select size "s"
    And Client wants to Add to cart
    And Client wants to Continue shopping
    And Clint wants to see cart
    And Clint wants to checkout
    And Clint wants to proceed to checkout
    And Client wants to create an new account
    And Client wants to fill mandatory fields
    |CName  |CLastName |Password |Address        |City  |State     |PostCode |Country       |MobilePhone|
    |Murat  |Kaplan    |Murat123 |4345 collins 21|Miami |Florida   |33140    |United States |7868560000 |
    And Client wants to register
    And Client wants to proceed
    And client wants to accept Terms and conditions
    And Client wants to verify order "Printed Summer Dress" with "s" size