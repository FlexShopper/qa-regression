Feature: As user I should be able to land Personal Info Screen

  Scenario: The user sees the expected header
    When the user lands in the PersonalInfo screen
    Then the user can see the close button
    #And the user can see the title "FlexShopper"
    And the user can see the FAQ link

  Scenario Outline: The user sees the expected data in the Personal Screen
    When the user lands in the PersonalInfo screen
    Then the user can see "PersonalInfo:
    And the user can see the "Date of Birth" field
    And the user can see the "Social Security Number or ITIN" field
    And the user can see the "Gross Monthly Income" field
    And the user can see the "Pay Frequency" drop down button
    And the user can see the following options:
    And the user can see one of the options
      | Weekly       |
      | Bi-Weekly    |
      | Semi-Monthly |
      | Monthly      |
    And the user can see the text "<signMeUp>"
    And the user can see the link "Privacy Policy"
    And the sign me up is selected by default
    And the user can see the "Continue" button grayed out
    Examples:
      | signMeUp |
      | Sign me up to receive the latest news on FlexShopper and MyFlexLending products and promotions. We respect your privacy. Please view our |

  Scenario: The user can click on the "Privacy Policy" link in the "Sign Me Up" text
    Given the user is in the PersonalInfo
    When the user clicks on the "Privacy Policy" link
    Then the user can see the privacy policy information

  Scenario: The user sees the expected footer
    When the user lands in the PersonalInfo screen
    Then the user can see the copyright information
    And the user can see the "Accessibility" link
    And the user can see the "Terms" link
    And the user can see the "Privacy" link

  Scenario: The user can click on the "Accessibility" link in the footer
    Given the user is in the ProfileInfo
    When the user clicks on the "Accessibility"  link
    Then the user can see the accessibility information

  Scenario: The user can click on the "Terms" link in the footer
    Given the user is in the ProfileInfo
    When the user clicks on the "Terms"  link
    Then the user can see the terms information

  Scenario: The user can click on the "Privacy Policy" link in the footer
    Given the user is in the PersonalInfo
    When the user clicks on the "Privacy Policy" link
    Then the user can see the privacy policy information

  Scenario Outline: The user cannot enter less than 10 characters in the SSN
    Given the user is in the PersonalInfo screen
    When the user enters an invalid length of SSN: "<SSN>"
    Then the user should see the validation message: "<validationMess"
    Examples:
      | SSN      | validationMess       |
      | 12345678 | Must be 9 characters |

  Scenario Outline: The user cannot enter characters more than 12 in the Month and more than 31 in Date
    Given the user is in the PersonalInfo screen
    When the user enters an invalid of DOB: "<Month>" and "<Date>"
    Then the user should see the validation message: "<validationMess"
    Examples:
      | Month    | validationMess       | Date | validationMess |
      | 12345678 | Must be 9 characters | 33   | Invalid date   |

  Scenario: The user should land on Banking info screen
    Given the user is in the PersonalInfo screen
    When the user has entered information in the DOB field
    And the user has entered information in the SSN field
    And  the user has entered information in the Gross Income field
    And the user has entered Gross Monthly Income field
    And the user clicks on the Pay Frequency dropdown button and select frequency option
    And clicks sign me up
    Then the user should land "Banking Info" Screen
