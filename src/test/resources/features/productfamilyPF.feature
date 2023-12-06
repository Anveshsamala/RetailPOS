@ProductFamily
Feature: Product-Family flows

  Background: 
    Given user navigate to "https://qa.revestretail.com/auth/login/" login page
    When user enters "anvesh" and "Revest@123" username and password
    When user navigate to Product-Family page

  Scenario Outline: Product-Family creation
    And user navigate to New Product-Family page
    And user enters "<pfcode>", "<pfname>", "<pfaltname>", "<pfextref>"  all the details Product-Family
    Then click on Save and new record is created

    Examples: 
      | pfcode | pfname | pfaltname | pfextref |
      | 1231213 | PFNAME1 | PFALTNAME1 | PFEXTREF1 |

  Scenario: Product-Family view
    Then user verify the view functionality in Product-Family page

  Scenario Outline: Product-Family edit
    Then user verify to edit the "<pfcode1>", "<pfname1>", "<pfaltname1>", "<pfextref1>" Product-Family page

    Examples: 
      | pfcode1 | pfname1 | pfaltname1 | pfextref1 |
      |  5665651 | PFNAME11 | PFALTNAME21 | PFEXTREF31 |

  Scenario: Product-Family delete
    And user verify the Delete icon functionality in Product-Family page
    Then user delete the record in Product-Family
