@Translations
Feature: Translations module flows

  Background: 
    Given user navigate to "https://qa.revestretail.com/auth/login/" login page
    When user enters "anvesh" and "Revest@123" username and password
    When user navigate to Translations page

  Scenario Outline: Translations creation
    And user navigate to New Translations page
    And user enters "<lablename>", "<englishtranslation>", "<arabictranslation>", "<frenchtranslation>"  all the details in Translations
    Then click on Save and new record is created

    Examples: 
      | lablename | englishtranslation | arabictranslation | frenchtranslation |
      | TESTINGA  | EngTranslation     | AraTranslation    | Fretranslation    |

  Scenario: Translations view
    Then user verify the view functionality in Translations page

  Scenario Outline: Translations edit
    Then user verify to edit the "<lablename1>", "<englishtranslation1>", "<arabictranslation1>", "<frenchtranslation1>" Translations page

    Examples: 
      | lablename1 | englishtranslation1 | arabictranslation1 | frenchtranslation1 |
      | TESTINGUU  | EngTrans11          | AraTrans11         | Fretrans11         |

  Scenario: Translations delete
    And user verify the Delete functionality in Translations page
    Then user delete the record in Translations
