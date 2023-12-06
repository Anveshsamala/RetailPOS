@Customergroup1
Feature: Customer group flows

  Background: 
    Given user navigate to "https://dev.revestretail.com/auth/login/" login page
    When user enters "asachan@jazeeratech.in" and "anuj123456" username and password
    When user navigate to Customer Group page

  Scenario Outline: Customer group creation
    And user navigate to New Customer group page
    And user enters "<cgname>", "<cgaltname>", "<cgextref>"  all the details Customer group
    Then click on Save and new record is created

    Examples: 
      | cgname | cgaltname | cgextref |
      | CGNAME | CGALTNAME | CGEXTREF |

  Scenario: Customer group view
    Then user verify the view functionality in Customer group page

  Scenario Outline: Customer group edit
    Then user verify to edit the "<cgname1>", "<cgaltname1>", "<cgextref1>" Customer group page

    Examples: 
      | cgname1 | cgaltname1 | cgextref1 |
      | CGNAME1 | CGALTNAME2 | CGEXTREF3 |

  Scenario: Customer group delete
    And user verify the Delete icon functionality in Customer group page
    Then user delete the record in customer group
