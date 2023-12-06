@Category
Feature: Product-Category flows

  Background: 
   Given user navigate to "https://qa.revestretail.com/auth/login/" login page
    When user enters "anvesh" and "Revest@123" username and password
    When user navigate to Product-Category page

  Scenario Outline: Product-Category creation
    And user navigate to New Product-Category page
    And user enters "<pccode>", "<pcname>", "<pcaltname>", "<pcextref>"  all the details Product-Category
    Then click on Save and new record is created

    Examples: 
      | pccode | pcname    | pcaltname | pcextref |
      | 4444440 | ENGLISH044 | ARABIC044  | PCEXTREF |

  Scenario: Product-Category view
    Then user verify the view functionality in Product-Category page

  Scenario Outline: Product-Category edit
    Then user verify to edit the "<pccode1>", "<pcname1>", "<pcaltname1>", "<pcextref1>" Product-Category page

    Examples: 
      | pccode1 | pcname1   | pcaltname1 | pcextref1 |
      |  0909093 | ENGLISH055 | ARABIC055   | PCEXTREF3 |

  Scenario: Product-Category delete
    And user verify the Delete icon functionality in Product-Category page
    Then user delete the record in Product-Category
