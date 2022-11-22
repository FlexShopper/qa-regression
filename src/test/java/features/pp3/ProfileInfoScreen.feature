@Regression @Web @PP3 @ProfileInfo
Feature: As user I should be able to land Profile Info Screen

  Scenario Outline: User can navigate back to the Email screen if the email shown is not his
    Given the user is on the Profile Info screen with email: "<email>"
    And the email address shown is not his: "<expectedEmail>"
    When the user clicks on the link: "Not You?"
    Then the user lands on the Email screen
    Examples:
      | email                            |
      | profileinfouser@flexshopper.com |

  Scenario Outline: User should see additional fields when the user clicks on the "Enter Address Manually" link
    Given the user is on the Profile Info screen with email: "<email>"
    When the user clicks on the link: "Enter Address Manually"
    Then the user should see the hidden address fields
    Examples:
      | email                            |
      | profileinforuser@flexshopper.com |

  Scenario Outline: User cannot enter special characters in the First Name
    Given the user is on the Profile Info screen with email: "profileinfouser@flexshopper.com"
    When the user enters an invalid first name: "<firstName>"
    And the user clicks on the button: "Continue"
    Then the user should see the validation message: "<validationMsg>"
    Examples:
      | firstName | validationMsg         |
      | Flex@     | No special characters |
      | 12345     | No special characters |
      |           | No special characters |

  Scenario Outline: User cannot enter special characters in the Last Name
    Given the user is on the Profile Info screen with email: "profileinfouser@flexshopper.com"
    When the user enters an invalid last name: "<lastName>"
    And the user clicks on the button: "Continue"
    Then the user should see the validation message: "<validationMsg>"
    Examples:
      | lastName | validationMsg         |
      | Flex@    | No special characters |
      | 12345    | No special characters |
      |          | No special characters |

  Scenario Outline: User cannot enter less than 10 characters in the Mobile Number
    Given the user is on the Profile Info screen with email: "profileinfouser@flexshopper.com"
    When the user enters an invalid mobile number: "<mobileNumber>"
    And the user clicks on the button: "Continue"
    Then the user should see the validation message: "<validationMsg>"
    Examples:
      | mobileNumber | validationMsg         |
      | 12345        | Must be 10 characters |

  Scenario Outline: User cannot enter less than 5 characters in the Zip Code
    Given the user is on the Profile Info screen with email: "profileinfouser@flexshopper.com"
    When the user clicks on the link: "Enter Address Manually"
    And the user enters an invalid zip code: "<zipCode>"
    And the user clicks on the button: "Continue"
    Then the user should see the validation message: "<validationMsg>"
    Examples:
      | zipCode | validationMsg        |
      | 1234    | Must be 5 characters |
      | 1       | Must be 5 characters |

  Scenario Outline: User can select a valid matching address from the address suggestions list
    Given the user is on the Profile Info screen with email: "profileinfouser@flexshopper.com"
    When the user starts entering an address: "<partialAddress>"
    Then the user should see address suggestions
    And the user can select the address from the suggestions list with: "<withText>"
    Examples:
      | partialAddress      | withText |
      | 2700 N Military Trl | 33409    |
      | 6503 N Military Trl | Apt 2700 |
      | 901 Yama            | SC       |

  Scenario Outline: User cannot see address suggestions is an invalid address is entered
    Given the user is on the Profile Info screen with email: "profileinfouser@flexshopper.com"
    When the user starts entering an address: "<invalidAddress>"
    Then the user should not see address suggestions
    Examples:
      | invalidAddress |
      | 801 POOH RD    |
      | PO Box 2054    |

  #Scenario Outline: User should land on the Personal Info screen when the address is completed using Suggested Address functionality
  #  Given the user is on the Profile Info screen with email: "personalinfouser@flexshopper.com"
  #  And the user enters a valid first name: "<firstName>"
  #  And the user enters a valid last name: "<lastName>"
  #  And the user enters a valid mobile number: "<mobileNumber>"
  #  And the user starts entering an address: "<partialAddress>"
  #  When the user can select the address from the suggestions list with: "<withText>"
  #  And the user clicks on the button: "Continue"
  #  Then the user lands on the Personal Info screen
  #  Examples:
  #    | firstName    | lastName | mobileNumber | partialAddress      | withText |
  #    | PersonalInfo | User     | 12345678900  | 2700 N Military Trl | 33409    |
  #    | Personal     | InfoUser | 12345678910  | 6503 N Military Trl | Apt 2700 |

  #Scenario Outline: User should land on the Personal Info screen when the address is entered manually
  #  Given the user is on the Profile Info screen with email: "personalinfouser@flexshopper.com"
  #  And the user enters a valid first name: "<firstName>"
  #  And the user enters a valid last name: "<lastName>"
  #  And the user enters a valid mobile number: "<mobileNumber>"
  #  And the user starts entering an address: "<partialAddress>"
  #  When the user clicks on the link: "Enter Address Manually"
  #  And the user enters a valid unit number: "<unit>"
  #  And the user selects a valid state: "<state>"
  #  And the user enters a valid zip code: "<zipCode>"
  #  And the user clicks on the button: "Continue"
  #  Then the user lands on the Personal Info screen
  #  Examples:
  #    | firstName    | lastName | mobileNumber | address             | unit | state | zipCode |
  #    | PersonalInfo | User     | 12345678900  | 6503 N Military Trl | 2700 | FL    | 33496   |

  #Scenario Outline: User should land on Personal Info screen when Sign me up is not checked
  #  Given the user is on the Profile Info screen with email: "personalinfouser@flexshopper.com"
  #  And the user enters a valid first name: "<firstName>"
  #  And the user enters a valid last name: "<lastName>"
  #  And the user enters a valid mobile number: "<mobileNumber>"
  #  And the user starts entering an address: "<address>"
  #  When the user clicks on the link: "Enter Address Manually"
  #  And the user enters a valid unit number: "<unit>"
  #  And the user selects a valid state: "<state>"
  #  And the user enters a valid zip code: "<zipCode>"
  #  And the user clicks on the Sign me up checkbox
  #  And the user clicks on the button: "Continue"
  #  Then the user lands on the Personal Info screen
  #  Examples:
  #    | firstName    | lastName | mobileNumber | address             | unit | state | zipCode |
  #    | PersonalInfo | User     | 12345678900  | 6503 N Military Trl | 2700 | FL    | 33496   |
