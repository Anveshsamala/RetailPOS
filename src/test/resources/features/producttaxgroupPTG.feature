@ProductTaxGroup1
Feature: Product Tax Group flows

  Background: 
    Given user navigate to "https://qa.revestretail.com/auth/login/" login page
    When user enters "anvesh" and "Revest@123" username and password
    When user navigate to Product Tax Group page

  Scenario Outline: Product Tax Group creation
    And user navigate to New Product Tax Group page
    And user enters "<ptgcode>", "<ptgname>", "<ptgaltname>", "<ptgextref>"  all the details Product Tax Group
    Then click on Save and new record is created

    Examples: 
      | ptgcode | ptgname  | ptgaltname  | ptgextref  |
      |  989898 | PTGNAME8 | PTGALTNAME8 | PTGEXTREF9 |

  Scenario: Product Tax Group view
    Then user verify the view functionality in Product Tax Group page

  Scenario Outline: Product Tax Group edit
    Then user verify to edit the "<ptgcode1>", "<ptgname1>", "<ptgaltname1>", "<ptgextref1>" Product Tax Group page

    Examples: 
      | ptgcode1 | ptgname1  | ptgaltname1 | ptgextref1 |
      |  7676768 | PTGNAME19 | PTGALTNAME9 | PTGEXTREF9 |

  Scenario: Product Tax Group delete
    And user verify the Delete icon functionality in Product Tax Group page
    Then user delete the record in Product Tax Group
