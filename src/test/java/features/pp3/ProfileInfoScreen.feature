@Chrome @Regression @Web @PP3
Feature: As user I should be able to land Profile Info Screen

  Scenario Outline: User can navigate back to the Email screen if the email shown is not his
    Given the user is on the Profile screen with email: "<email>"
    And the email address shown is not his
    When the user clicks on the link: "Not You?"
    Then the user lands on the Email screen
    Examples:
      | email                            |
      | profileinforuser@flexshopper.com |

  Scenario: User should see additional fields when the user clicks on the "Enter Address Manually" link
    Given the user is on the Profile screen with email: "profileinforuser@flexshopper.com"
    When the user clicks on the link: "Enter Address Manually"
    Then the user should see the field: "Home Address"
    And the user should see the field: "Apt/Unit"
    And the user should see the field: "City"
    And the user should see the field: "State"
    And the user should see the field: "Postal Code"

  Scenario Outline: User cannot enter special characters in the First Name
    Given the user is on the Profile screen with email: "profileinforuser@flexshopper.com"
    When the user enters an invalid first name: "<firstName>"
    And the user clicks on the Continue button
    Then the user should see the validation message: "<validationMsg>"
    Examples:
      | firstName | validationMsg         |
      | Flex@     | No special characters |
      | 12345     | No special characters |
      |           | No special characters |

  Scenario Outline: User cannot enter special characters in the Last Name
    Given the user is on the Profile screen with email: "profileinforuser@flexshopper.com"
    When the user enters an invalid last name: "<lastName>"
    And the user clicks on the Continue button
    Then the user should see the validation message: "<validationMsg>"
    Examples:
      | lastName | validationMsg         |
      | Flex@    | No special characters |
      | 12345    | No special characters |
      |          | No special characters |

  Scenario Outline: User cannot enter less than 10 characters in the Mobile Number
    Given the user is on the Profile screen with email: "profileinforuser@flexshopper.com"
    When the user enters an invalid mobile number: "<mobileNumber>"
    And the user clicks on the Continue button
    Then the user should see the validation message: "<validationMsg"
    Examples:
      | mobileNumber | validationMsg         |
      | 12345        | Must be 10 characters |

  Scenario Outline: User cannot enter less than 5 characters in the Zip Code
    Given the user is on the Profile screen with email: "profileinforuser@flexshopper.com"
    When the user enters an invalid zip code: "<zipCode>"
    And the user clicks on the Continue button
    Then the user should see the validation message: "<validationMsg"
    Examples:
      | zipCode | validationMsg        |
      | 1234    | Must be 5 characters |
      | 1       | Must be 5 characters |

  Scenario: User can select a valid matching address from the address suggestions
    Given the user is on the Profile screen with email: "profileinforuser@flexshopper.com"
    When the user starts entering a valid address
    Then the user should see address suggestions
    And the user can select the address from the suggestions

  Scenario: User cannot see address suggestions is an invalid address is entered
    Given the user is on the Profile screen with email: "profileinforuser@flexshopper.com"
    When the user starts entering an invalid address
    Then the user should not see address suggestions
    And the user cannot select the address from the suggestions

  Scenario: User should land on Personal Info screen when the address is entered using Suggested Address functionality
    Given the user is on the Profile screen with email: "profileinforuser@flexshopper.com"
    When the user selects the address from the suggestions
    And the user clicks on the Continue button
    Then the user lands on the Personal Info screen

  Scenario: User should land on Personal Info screen when the address is entered manually
    Given the user is on the Profile screen with email: "profileinforuser@flexshopper.com"
    When the user clicks on the link: "Enter Address Manually"
    And the user enters valid information in all fields
    And the user clicks on the Continue button
    Then the user lands on the Personal Info screen

  Scenario: User should land on Personal Info screen when Sign me up is not checked
    Given the user is on the Profile screen with email: "profileinforuser@flexshopper.com"
    When the user clicks on the link: "Enter Address Manually"
    And the user enters valid information in all fields
    And the user clicks on the Sign me up checkbox
    And the user clicks on the Continue button
    Then the user lands on the Personal Info screen
