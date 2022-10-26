Feature: As user I should be able to land Banking Info Screen

  Scenario: The user sees the expected header
    When the user lands in the BankingInfo screen
    Then the user can see the close button
    And the user can see the title "FlexShopper"
    And the user can see the FAQ link

  Scenario Outline: The user sees the expected data in the Banking Screen
    When the user lands in the BankingInfo screen
    Then the user can see "BankingInfo:
    And the user can see text "<text>"
    And the user can see the "Routing Number" field
    And the user can see the "Account Number" field
    And the user can see the "Confirm Account Number" field
    And the user can see the "Submit" button grayed out
   Examples:
    |text|
    | After you receive your order, your weekly payments will be deducted from this account.   |

  Scenario: The user sees the expected footer
    When the user lands in the BankingInfo screen screen
    Then the user can see the copyright information
    And the user can see the "Accessibility" link
    And the user can see the "Terms" link
    And the user can see the "Privacy" link

  Scenario: The user can click on the "Accessibility" link in the footer
    Given the user is in the BankingInfo
    When the user clicks on the "Accessibility"  link
    Then the user can see the accessibility information

  Scenario: The user can click on the "Terms" link in the footer
    Given the user is in the BankingInfo
    When the user clicks on the "Terms"  link
    Then the user can see the terms information

  Scenario: The user can click on the "Privacy Policy" link in the footer
    Given the user is in the BankingInfo
    When the user clicks on the "Privacy Policy" link
    Then the user can see the privacy policy information


  Scenario Outline: The user cannot enter  than 9 characters in the Routing number
    Given the user is in the BankingInfo screen
    When the user enters an invalid length of Routing number: "<RoutingNumber>"
    Then the user should see the validation message: "<validationMess"
    Examples:
      | RoutingNumber | validationMess       |
      | 12345678      | Must be 9 characters |

  Scenario Outline: The user cannot enter  Account Number and Confirm Account Number
    Given the user is in the BankingInfo screen
    When then user enters valid Account Number: "<AccountNumber>"
    When the user enters invalid Confirm Account Number: "<ConfirmAccountNumber>"
    Then the user should see the validation message: "<validationMess"
    Examples:
      | AccountNumber | ConfirmAccountNumber | validationMess            |
      | 333333333     | 123456798            | Mismatched Account Number |


  Scenario: The approved customer should receive Congratulations message
    Given the user is in the BankingInfo screen
    When the user has entered information in "Routing Number" field
    And the user has entered information in "Account Number" field
    And  the user has entered information in "Confirm Account Number" field
    And the user clicks on the "Submit" button
    Then user can see "Congratulations," message
    And user can see "You were approved for a spending limit of"
    And user can see spending limit more than $100
    And user can see "Use your spending limit to shop now!"
    And user can see "Easy weekly payments"
    And user can see "Own in 12 months or less"
    And user can see "90 days same as cash"
    And user can see "Start Shopping" button

  Scenario: The approved customer sees the expected header
    When the user lands in the Congratulations screen
    Then the user can see the close button
    And the user can see the title "FlexShopper"
    And the user can see the FAQ link

  Scenario: The approved customer see expected footer
    Given the customer is in the Congratulations screen
    Then the user can see the copyright information
    And the user can see the "Accessibility" link
    And the user can see the "Terms" link
    And the user can see the "Privacy" link

  Scenario: The approved customer can click on the "Accessibility" link in the footer
    Given the customer is in the Congratulations screen
    When the user clicks on the "Accessibility"  link
    Then the user can see the accessibility information

  Scenario: The user can click on the "Terms" link in the footer
    Given the customer is in the Congratulations screen
    When the user clicks on the "Terms"  link
    Then the user can see the terms information

  Scenario: The user can click on the "Privacy Policy" link in the footer
    Given the customer is in the Congratulations screen
    When the user clicks on the "Privacy Policy" link
    Then the user can see the privacy policy information


  Scenario:The approved customer land to Dashboard page
      Given the user is in the BankingInfo screen
      When the user has entered information in "Routing Number" field
      And the user has entered information in "Account Number" field
      And  the user has entered information in "Confirm Account Number" field
      And the user clicks on the "Submit" button
      And user clicks "Start Shopping" button
      Then the user should see the Dashboard page
      And user can see "Shop Now" link


  Scenario: The denied customer should receive  message
    Given the user is in the BankingInfo screen
    When the user has entered information in "Routing Number" field
    And the user has entered information in "Account Number" field
    And  the user has entered information in "Confirm Account Number" field
    And the user clicks on the "Submit" button
    Then user can see "Thank You For Applying." message
    And user can see " You did not qualify for a spending limit. You will be sent an email with an explanation within 30 days. Thank you for your interest in FlexShopper."
    And user can see "Okay" button
    And user can see "View Arbitration Agreement"

  Scenario:The denied customer land to Dashboard page
    Given the user is in the BankingInfo screen
    When the user has entered information in "Routing Number" field
    And the user has entered information in "Account Number" field
    And  the user has entered information in "Confirm Account Number" field
    And the user clicks on the "Submit" button
    And user clicks "Okay" button
    Then the user should see the Dashboard page

  Scenario: The denied customer sees the expected header
    When the user lands in the Denied screen
    Then the user can see the close button
    And the user can see the title "FlexShopper"
    And the user can see the FAQ link

  Scenario: The denied customer see expected footer
    Given the customer is in the Denied screen
    Then the user can see the copyright information
    And the user can see the "Accessibility" link
    And the user can see the "Terms" link
    And the user can see the "Privacy" link

  Scenario: The denied customer can click on the "Accessibility" link in the footer
    Given the customer is in the Denied screen
    When the user clicks on the "Accessibility"  link
    Then the user can see the accessibility information

  Scenario: The denied customer can click on the "Terms" link in the footer
    Given the customer is in the Denied screen
    When the user clicks on the "Terms"  link
    Then the user can see the terms information

  Scenario: The denied customer click on the "Privacy Policy" link in the footer
    Given the customer is in the Denied screen
    When the user clicks on the "Privacy Policy" link
    Then the user can see the privacy policy information




















