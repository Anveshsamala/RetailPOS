@Customerdivision1
Feature: Customer Division flows

  Background: 
    Given user navigate to "https://qa.revestretail.com/auth/login/" login page
    When user enters "Shahabuddin" and "revest123" username and password
    When user navigate to Customer Division page

  Scenario Outline: Customer Division creation
    And user navigate to New Customer Division page
    And user enters "<cdcode>", "<cdname>", "<cdaltname>", "<cdextref>"  all the details Customer Division
    Then click on Save and new record is created

    Examples: 
      | cdcode | cdname | cdaltname | cdextref |
      | 123123 | CDNAME | CDALTNAME | CDEXTREF |

  Scenario: Customer Division view
    Then user verify the view functionality in Customer Division page

  Scenario Outline: Customer Division edit
    Then user verify to edit the "<cdcode1>", "<cdname1>", "<cdaltname1>", "<cdextref1>" Customer Division page

    Examples: 
      | cdcode1 | cdname1 | cdaltname1 | cdextref1 |
      |  566565 | CDNAME1 | CDALTNAME2 | CDEXTREF3 |

  Scenario: Customer Division delete
    And user verify the Delete icon functionality in Customer Division page
    Then user delete the record in customer Division
