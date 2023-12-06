@ProductSubCategory
Feature: Product-Sub-Category flows

  Background: 
    Given user navigate to "https://qa.revestretail.com/auth/login/" login page
    When user enters "anvesh" and "Revest@123" username and password
    When user navigate to Product-Sub-Category page

  Scenario Outline: Product-Sub-Category creation
    And user navigate to New Product-Sub-Category page
    And user enters "<psccode>", "<pscname>", "<pscaltname>", "<pscextref>"  all the details Product-Sub-Category
    Then click on Save and new record is created

    Examples: 
      | psccode | pscname | pscaltname | pscextref |
      |  123123 | PSCNAME | PSCALTNAME | PSCEXTREF |

  Scenario: Product-Sub-Category view
    Then user verify the view functionality in Product-Sub-Category page

  Scenario Outline: Product-Sub-Category edit
    Then user verify to edit the "<psccode1>", "<pscname1>", "<pscaltname1>", "<pscextref1>" Product-Sub-Category page

    Examples: 
      | psccode1 | pscname1 | pscaltname1 | pscextref1 |
      |   566565 | PSCNAME1 | PSCALTNAME2 | PSCEXTREF3 |

  Scenario: Product-Sub-Category delete
    And user verify the Delete icon functionality in Product-Sub-Category page
    Then user delete the record in Product-Sub-Category
