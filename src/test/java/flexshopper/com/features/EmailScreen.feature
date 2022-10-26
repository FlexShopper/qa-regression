@email
Feature: As a customer I should be able to enter the email in the login email


  Scenario Outline: Existing Customer - User lands on the Password screen
    Given the user is in the Email screen
    When the user enters a valid existing email address: "<email>"
    And the user clicks on the Continue button
    Then the user lands on the Password screen
    Examples:
      | email               |
      | nann40547@gmail.com |

  Scenario Outline: New Customer - User lands on the Profile Info screen
    Given the user is in the Email screen
    When the user enters a valid no-registered email address: "<email>"
    And the user clicks on the Continue button
    Then the user lands on the Profile Info screen
    Examples:
      | email                     |
      | flexshopper1017@gmail.com |

  Scenario Outline: Login with an invalid email fails
    Given the user is in the Email screen
    When the user enters an invalid email address: "<email>"
    And the user clicks on the Continue button
    Then the user sees the following validation message: "<errorMsg>"
    Examples:
      | email               | errorMsg              |
      | abcde@flexshopper   | Invalid email address |
      | a.abcde@flexshopper | Invalid email address |
      | Abcde@flexshopper.c | Invalid email address |
      |                     | Invalid email address |
