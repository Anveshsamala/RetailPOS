@Customerclass
Feature: Customer Class flows

  Background: 
    Given user navigate to "https://dev.revestretail.com/auth/login/" login page
    When user enters "asachan@jazeeratech.in" and "anuj123456" username and password
    When user navigate to Customer Class page

  Scenario Outline: Customer class creation
    And user navigate to New Customer Class page
    And user enters "<cccode>", "<ccname>", "<ccaltname>", "<ccextref>"  all the details
    Then click on Save and new record is created

    Examples: 
      | ccname   | ccaltname   | ccextref   |
     | CCNAME32 | CCALTNAME32 | CCEXTREF32 |

  Scenario: Customer class view
    Then user verify the view functionality in Customer class page

  Scenario Outline: Customer class edit
    Then user verify to edit the "<cccode1>", "<ccname1>", "<ccaltname1>", "<ccextref1>" Customer class page

    Examples: 
     | ccname1   | ccaltname1   | ccextref1   |
     | CCNAME132 | CCALTNAME232 | CCEXTREF332 |

  Scenario: Customer class delete
    And user verify the Delete functionality in Customer class page
    Then user delete the record in customer class
