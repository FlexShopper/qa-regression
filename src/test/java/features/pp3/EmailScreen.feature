@Regression @Web @Email @PP3
Feature: As a customer I should be able to enter the email in the login email

  Scenario Outline: Existing Customer lands on the Password screen
    Given the user is on the Email screen
    When the user enters a valid existing email address: "<email>"
    And the user clicks on the button: "Continue"
    Then the user lands on the Password screen
    Examples:
      | email               |
      | nann40547@gmail.com |

  Scenario Outline: New Customer lands on the Profile Info screen
    Given the user is on the Email screen
    When the user enters a valid no-registered email address: "<email>"
    And the user clicks on the button: "Continue"
    Then the user lands on the Profile Info screen
    Examples:
      | email                     |
      | flexshopper1017@gmail.com |

  Scenario Outline: User cannot log in with an invalid email address
    Given the user is on the Email screen
    When the user enters an invalid email address: "<email>"
    And the user clicks on the button: "Continue"
    Then the user sees the following validation message: "<validationMsg>"
    Examples:
      | email               | validationMsg         |
      | abcde@flexshopper   | Invalid email address |
      | a.abcde@flexshopper | Invalid email address |
      | Abcde@flexshopper.c | Invalid email address |
      |                     | Invalid email address |

  Scenario Outline: User cannot log in with a bad constructed email address
    Given the user is on the Email screen
    When the user enters an invalid email address: "<email>"
    And the user clicks on the button: "Continue"
    Then the user sees the following HTML validation message: "<validationMsg>"
    Examples:
      | email   | validationMsg                               |
      | a       | Please include an '@' in the email address. |
      | @       | Please enter a part followed by '@'.        |
      | @aa     | Please enter a part followed by '@'.        |
      | @aa.com | Please enter a part followed by '@'.        |

  # Scenario: User can close the PP3's screen
  # Scenario: User remains in the PP3's screen after cancelling request of closing the PP3's screen
  # Scenario: User has an older account

  ######################## Header Verification ########################
  # Scenario: User can navigate to Frequently Asked Questions (FAQ)
  # Scenario: User can return to the PP3's screen after closing Frequently Asked Questions (FAQ)

  ######################## Footer Verification ########################
  # Scenario: User can navigate to Accessibility
  # Scenario: User can return to the PP3's screen after closing Accessibility
  # Scenario: User can navigate to Terms of Use
  # Scenario: User can return to the PP3's screen after closing Terms of Use
  # Scenario: User can return to the PP3's screen after closing Privacy Policy

