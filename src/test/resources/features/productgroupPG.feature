@ProductGroup
Feature: Product-Group flows

  Background: 
    Given user navigate to "https://qa.revestretail.com/auth/login/" login page
    When user enters "anvesh" and "Revest@123" username and password
    When user navigate to Product-Group page

  Scenario Outline: Product-Group creation
    And user navigate to New Product-Group page
    And user enters "<pgcode>", "<pgname>", "<pgaltname>", "<pgextref>"  all the details Product-Group
    Then click on Save and new record is created

    Examples: 
      | pgcode | pgname | pgaltname | pgextref |
      | 1231231 | PGNAME1 | PGALTNAME1 | PGEXTREF1 |

  Scenario: Product-Group view
    Then user verify the view functionality in Product-Group page

  Scenario Outline: Product-Group edit
    Then user verify to edit the "<pgcode1>", "<pgname1>", "<pgaltname1>", "<pgextref1>" Product-Group page

    Examples: 
      | pgcode1 | pgname1 | pgaltname1 | pgextref1 |
      |  5665652 | PGNAME12 | PGALTNAME23 | PGEXTREF33 |

  Scenario: Product-Group delete
    And user verify the Delete icon functionality in Product-Group page
    Then user delete the record in Product-Group
