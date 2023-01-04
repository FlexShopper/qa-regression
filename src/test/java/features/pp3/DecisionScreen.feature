@Chrome @Web @Decision @PP3 @Regression
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

  Scenario Outline: The user should land on the Decision Screen with a denied decision
    Given the user is on the Banking Info screen with email: "decisionscreen.deny@flexshopper.com"
    And the user enters a valid routing number: "<routingNumber>"
    And the user enters a valid account number: "<accountNumber>"
    And the user enters a matching account number: "<confirmAccNumber>"
    When the user clicks on the button: "Submit Application"
    Then the user lands on the Decision Screen with decision: "<decision>"
    Examples:
      | routingNumber | accountNumber | confirmAccNumber | decision                                 |
      | 325070760     | 3333333333    | 3333333333       | You did not qualify for a spending limit |

  # Fix for JIRA ticket FPAY-2178 Fix double login when customer gets decision
  #Scenario Outline: The user should land in the homepage as a logged in user after receiving an approval decision

  #Scenario Outline: The user should land in the homepage as a logged in user after receiving a denial decision

  #Scenario Outline: The user should land in the homepage as a logged in user after receiving a manual verification decision

  # Check the following URLs:
  # https://pp3-pr2287.staging.flexint.net/direct-lending
  # https://pp3-pr2287.staging.flexint.net/omni-app
  # https://pp3-pr2287.staging.flexint.net/loans
  # https://pp3-pr2287.staging.flexint.net/central