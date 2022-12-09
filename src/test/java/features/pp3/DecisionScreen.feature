@Regression @Web @PP3 @Decision
Feature: As user I should be able to apply for a lease/loan and land on the decision screen

  Scenario Outline: The user should land on the Decision Screen with an approval decision
    Given the user is on the Banking Info screen with email: "decisionscreen@flexshopper.com"
    And the user enters a valid routing number: "<routingNumber>"
    And the user enters a valid account number: "<accountNumber>"
    And the user enters a matching account number: "<confirmAccNumber>"
    When the user clicks on the button: "Submit Application"
    Then the user lands on the Decision Screen with decision: "<decision>"
    Examples:
      | routingNumber | accountNumber | confirmAccNumber | decision                                  |
      | 325070760     | 3333333333    | 3333333333       | You were approved for a spending limit of |
      | 021000021     | 9876543210    | 9876543210       | You were approved for a spending limit of |
      | 011401533     | 1357924680    | 1357924680       | You were approved for a spending limit of |
      | 011401533     | 1234567890    | 1234567890       | You were approved for a spending limit of |

  Scenario Outline: The user should be able to apply with different pay frequencies: "<payFrequency>"
    Given the user is on the Personal Info screen with email: "decisionscreen@flexshopper.com"
    And the user completes the Personal Info screen with pay frequency: "<payFrequency>"
    And the user completes the Banking Info screen
    When the user clicks on the button: "Submit Application"
    Then the user lands on the Decision Screen with decision: "<decision>"
    Examples:
      | payFrequency | decision                                  |
      | Weekly       | You were approved for a spending limit of |
      | Bi-Weekly    | You were approved for a spending limit of |
      | Semi-Monthly | You were approved for a spending limit of |
      | Monthly      | You were approved for a spending limit of |