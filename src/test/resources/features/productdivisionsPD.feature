@ProductDivisions
Feature: Product-Divisions flows

  Background: 
    Given user navigate to "https://qa.revestretail.com/auth/login/" login page
    When user enters "anvesh" and "Revest@123" username and password
    When user navigate to Product-Divisions page

  Scenario Outline: Product-Divisions creation
    And user navigate to New Product-Divisions page
    And user enters "<pdcode>", "<pdname>", "<pdaltname>", "<pdextref>"  all the details Product-Divisions
    Then click on Save and new record is created

    Examples: 
      | pdcode  | pdname  | pdaltname  | pdextref  |
      | 1231233 | PDNAME1 | PDALTNAME2 | PDEXTREF2 |

  Scenario: Product-Divisions view
    Then user verify the view functionality in Product-Divisions page

  Scenario Outline: Product-Divisions edit
    Then user verify to edit the "<pdcode1>", "<pdname1>", "<pdaltname1>", "<pdextref1>" Product-Divisions page

    Examples: 
      | pdcode1 | pdname1  | pdaltname1  | pdextref1  |
      | 5665652 | PDNAME12 | PDALTNAME23 | PDEXTREF34 |

  Scenario: Product-Divisions delete
    And user verify the Delete icon functionality in Product-Divisions page
    Then user delete the record in Product-Divisions
