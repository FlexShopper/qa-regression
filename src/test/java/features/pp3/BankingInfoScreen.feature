@Chrome @Web @BankingInfo @PP3 @Regression
Feature: As user I should be able to land on the Banking Info Screen

  Scenario Outline: The user can see the bank name associated with the routing number entered
    Given the user is on the Banking Info screen with email: "decisionscreen@flexshopper.com"
    When the user enters a valid routing number: "<routingNumber>"
    Then the user sees the name of the bank: "<bankName>"
    Examples:
      | routingNumber | bankName             |
      | 325070760     | JPMorgan Chase       |
      | 026009593     | Bank of America N.A. |
      | 042000398     | PNC Bank             |
      | 022000020     | HSBC Bank USA, N.A   |
      | 122105155     | US Bank              |
      | 063107513     | Wells Fargo          |
      | 221172610     | Citibank             |
      | 061000104     | SunTrust             |

  Scenario Outline: The user cannot enter a routing number with less than 9 characters
    Given the user is on the Banking Info screen with email: "decisionscreen@flexshopper.com"
    When the user enters an invalid routing number: "<routingNumber>"
    Then the user should see the validation message: "<validationMsg>"
    Examples:
      | routingNumber | validationMsg        |
      | 222           | Must be 9 characters |
      | 12345         | Must be 9 characters |
      | 12345678      | Must be 9 characters |

  Scenario Outline: The user cannot submit the agreement without entering a valid Routing Number
    Given the user is on the Banking Info screen with email: "decisionscreen@flexshopper.com"
    When the user enters an invalid routing number: "<routingNumber>"
    Then the user should see the validation message: "<validationMsg>"
    Examples:
      | routingNumber | validationMsg                                           |
      | 000000000     | We do not accept this bank. Please try a different bank |
      | 084009519     | We do not accept this bank. Please try a different bank |

  Scenario Outline: After a Routing is rejected, the user can enter a valid one
    Given the user is on the Banking Info screen with email: "decisionscreen@flexshopper.com"
    And the user enters an invalid routing number: "<routingNumber>"
    And the user should see the validation message: "<validationMsg>"
    When the user enters a valid routing number: "<validRoutingNumber>"
    Then the user should not see the validation message: "<validationMsg>"
    Examples:
      | routingNumber | validationMsg                                           | validRoutingNumber |
      | 000000000     | We do not accept this bank. Please try a different bank | 325070760          |
      | 084009519     | We do not accept this bank. Please try a different bank | 021000021          |

  Scenario Outline: The user cannot entering an Account Number under 4 characters long
    Given the user is on the Banking Info screen with email: "decisionscreen@flexshopper.com"
    When the user enters an invalid account number: "<accountNumber>"
    Then the user should see the validation message: "<validationMsg>"
    Examples:
      | accountNumber | validationMsg        |
      | 23            | 4 characters or more |
      | 123           | 4 characters or more |

  #Scenario: The user cannot submit the agreement without entering a valid Account Number (10? or 3/17 characters?)
  ### NOTE: There's no validation for long account numbers

  Scenario Outline: The user cannot submit the agreement if the Account Number and the Confirm Account Number provided are not a match
    Given the user is on the Banking Info screen with email: "decisionscreen@flexshopper.com"
    When the user enters a valid account number: "<accountNumber>"
    And the user enters a non matching account number: "<confirmAccNumber>"
    Then the user should see the validation message: "<validationMsg>"
    Examples:
  | accountNumber | confirmAccNumber | validationMsg             |
  | 3333333333    | 9876543210       | Mismatched Account Number |

  Scenario Outline: The user can enter a matching Account Number after the first Confirm Account Number provided is not a match
    Given the user is on the Banking Info screen with email: "decisionscreen@flexshopper.com"
    And the user enters a valid account number: "<accountNumber>"
    And the user enters a non matching account number: "<notMatchingAccNumber>"
    And the user should see the validation message: "<validationMsg>"
    When the user enters a matching account number: "<confirmAccNumber>"
    Then the user should not see the validation message: "<validationMsg>"
    Examples:
      | accountNumber | notMatchingAccNumber | validationMsg             | confirmAccNumber |
      | 3333333333    | 9876543210           | Mismatched Account Number | 3333333333       |



