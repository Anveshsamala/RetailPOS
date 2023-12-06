@ProductType
Feature: Customer group flows

  Background: 
    Given user navigate to "https://qa.revestretail.com/auth/login/" login page
    When user enters "anvesh" and "Revest@123" username and password
    When user navigate to Product Type page

  Scenario Outline: Product Type creation
    And user navigate to New Product Type page
    And user enters "<ptcode>", "<ptname>", "<ptaltname>", "<ptextref>"  all the details Product Type
    Then click on Save and new record is created

    Examples: 
      | ptcode  | ptname  | ptaltname  | ptextref  |
      | 1231223 | CGNAME2 | CGALTNAME2 | CGEXTREF2 |

  Scenario: Product Type view
    Then user verify the view functionality in Product Type page

  Scenario Outline: Product Type edit
    Then user verify to edit the "<ptcode1>", "<ptname1>", "<ptaltname1>", "<ptextref1>" Product Type page

    Examples: 
      | ptcode1 | ptname1  | ptaltname1  | ptextref1  |
      | 5665625 | CGNAME12 | CGALTNAME22 | CGEXTREF23 |

  Scenario: Product Type delete
    And user verify the Delete icon functionality in Product Type page
    Then user delete the record in Product Type
