Feature: Test to Order a TShirt & Verify the Order in order history

  Background: prerequisite
    Given user enters the URL

  Scenario Outline: Order a TShirt and Verify item exist in Order History
    When user clicks on sign in
    When user enters userName as "<UserName>" and password as "<Password>"
    And user clicks on T-Shirts
    And user selects a T-Shirt
    When user clicks on AddToCart
    And user clicks on Proceed to checkout button
    When user accepts terms and conditions
    And user clicks on Proceed to checkout
    And select payment type as PayByCheck
    When user confirms the order
    When user clicks on my orders
    And user clicks on order reference
    Then verity the "<Item>" exist in order history

    Examples: 
      | UserName                      | Password      | Item                                                   |
      | automation.practice@gmail.com | Automation123 | Faded Short Sleeve T-shirts - Color : Orange, Size : S |
