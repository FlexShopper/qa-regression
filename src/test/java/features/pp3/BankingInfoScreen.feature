@Regression @Web @PP3 @BankingInfo
Feature: As user I should be able to land on the Banking Info Screen

  #Scenario: The user cannot submit the agreement without entering a Routing Number

  #Scenario: The user cannot submit the agreement without entering a valid Routing Number

  #Scenario: The user cannot submit the agreement without entering an Account Number

  #Scenario: The user cannot submit the agreement without entering a valid Account Number (10 characters)

  #Scenario: The user cannot submit the agreement if the Account Number and the Confirm Account Number provided are not a match

  Scenario Outline: The user should land on the Banking info screen
    Given the user is on the Banking Info screen with email: "decisionscreen@flexshopper.com"
    And the user enters a valid routing number: "<routingNumber>"
    And the user enters a valid account number: "<accountNumber>"
    And  the user enters a matching account number: "<confirmAccNumber>"
    When the user clicks on the button: "Submit Application"
    Then the user lands on the Decision Screen with decision: "<decision>"
    Examples:
      | routingNumber | accountNumber | confirmAccNumber | decision                                  |
      | 325070760     | 3333333333    | 3333333333       | You were approved for a spending limit of |
      | 021000021     | 9876543210    | 9876543210       | You were approved for a spending limit of |
      | 011401533     | 1357924680    | 1357924680       | You were approved for a spending limit of |
      | 011401533     | 1234567890    | 1234567890       | You were approved for a spending limit of |