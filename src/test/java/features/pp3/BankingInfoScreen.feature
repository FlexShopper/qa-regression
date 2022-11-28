@Regression @Web @PP3 @BankingInfo
Feature: As user I should be able to land on the Banking Info Screen

  #Scenario: The user cannot submit the agreement without entering a Routing Number

  #Scenario: The user cannot submit the agreement without entering a valid Routing Number

  #Scenario: The user cannot submit the agreement without entering an Account Number

  #Scenario: The user cannot submit the agreement without entering a valid Account Number (10 characters)

  #Scenario: The user cannot submit the agreement if the Account Number and the Confirm Account Number provided are not a match

  Scenario Outline: The user should land on the Banking info screen
    Given the user is on the Banking Info screen with email: "bankinginfo@flexshopper.com"
    And the user enters a valid routing number: "<routingNumber>"
    And the user enters a valid account number: "<accountNumber>"
    And  the user enters a matching account number: "<confirmAccNumber>"
    And the user clicks on the agreement button
    When the user clicks on the button: "Submit"
    Then the user lands on the Decision Screen with decision: "FlexShopper User"
    Examples:
      | routingNumber | accountNumber | confirmAccNumber | decision     |
      | 325070760     | 3333333333    | 3333333333       | approved     |
      | 325070760     | 3333333333    | 3333333333       | not approved |
      | 325070760     | 3333333333    | 3333333333       | need to call |