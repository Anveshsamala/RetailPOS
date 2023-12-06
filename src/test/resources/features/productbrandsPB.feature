@ProductBrands
Feature: Product-Brands flows

  Background: 
    Given user navigate to "https://qa.revestretail.com/auth/login/" login page
    When user enters "anvesh" and "Revest@123" username and password
    When user navigate to Product-Brands page

  Scenario Outline: Product-Brands creation
    And user navigate to New Product-Brands page
    And user enters "<pbcode>", "<pbname>", "<pbaltname>", "<pbextref>"  all the details Product-Brands
    Then click on Save and new record is created

    Examples: 
      | pbcode | pbname | pbaltname | pbextref |
      | 1231213 | PBNAME1 | PBALTNAME1 | PBEXTREF1 |

  Scenario: Product-Brands view
    Then user verify the view functionality in Product-Brands page

  Scenario Outline: Product-Brands edit
    Then user verify to edit the "<pbcode1>", "<pbname1>", "<pbaltname1>", "<pbextref1>" Product-Brands page

    Examples: 
      | pbcode1 | pbname1 | pbaltname1 | pbextref1 |
      |  5665615 | PBNAME11 | PBALTNAME21 | PBEXTREF31 |

  Scenario: Product-Brands delete
    And user verify the Delete icon functionality in Product-Brands page
    Then user delete the record in Product-Brands
