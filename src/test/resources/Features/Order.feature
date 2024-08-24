
@order @regression @End
Feature: Order the items

  Scenario: Verify the website item order functionalty
    Given Select add the item to cart
    And Checkout the item
    And Enter the information
    Then Finish the order
    And Get Thank You Screen

 
