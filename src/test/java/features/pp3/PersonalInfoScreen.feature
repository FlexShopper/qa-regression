@Regression @Web @PP3
Feature: As user I should be able to land on the Personal Info Screen

  Scenario Outline: The user cannot enter an invalid date of birth
    Given the user is on the Personal Info screen with email: "personalinfo@flexshopper.com"
    When the user enters an invalid DOB: "<DOB>"
    Then the user should see the validation message: "<validationMsg>"
    Examples:
      | DOB      | validationMsg |
      | 00000000 | Invalid date  |
      | 13102000 | Invalid date  |
      | 12322000 | Invalid date  |

  Scenario Outline: The user cannot enter less than 9 characters in the SSN
    Given the user is on the Personal Info screen with email: "personalinfo@flexshopper.com"
    When the user enters an invalid SSN: "<SSN>"
    Then the user should see the validation message: "<validationMsg>"
    Examples:
      | SSN      | validationMsg        |
      | 12345678 | Must be 9 characters |
      | 1234     | Must be 9 characters |

  @PersonalInfo
  Scenario Outline: The user should land on Banking info screen when selecting pay frequency: "<payFrequency>"
    Given the user is on the Personal Info screen with email: "banking@flexshopper.com"
    And the user enters a valid date of birth: "<DOB>"
    And the user enters a valid SSN: "<SSN>"
    And  the user enters a valid gross income: "<income>"
    And the user selects a valid pay frequency: "<payFrequency>"
    And the user clicks on the agreement button
    When the user clicks on the button: "Continue"
    Then the user lands on the Banking Info Screen
    Examples:
      | DOB      | SSN       | income | payFrequency |
      | 01011971 | 362563215 | 1000   | Weekly       |
      | 01011980 | 078051120 | 2500   | Bi-Weekly    |
      | 01012000 | 666051120 | 3500   | Semi-Monthly |
      | 01011951 | 999051120 | 5000   | Monthly      |
      | 01012002 | 357002345 | 8000   | Monthly      |