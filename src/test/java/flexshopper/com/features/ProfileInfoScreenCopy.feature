Feature: As user I should be able to land Profile Info Screen

  Scenario: The user sees the expected header
    When the user lands in the ProfileInfo screen
    Then the user can see the close button
    #And the user can see the title FlexShopper
    And the user can see the FAQ link

  Scenario Outline: The user sees the expected data in the Profile Screen
    When the user lands in the ProfileInfo screen
    Then the user can see "Profile Info":
    And the user can see the "<email>" address
    And the user can see the Not You? link
    And the user can see the First Name field
    And the user can see the Last Name field
    And the user can see the Mobile Number field
    And the user can see the Home Address field
    And the user can see the Enter Address Manually link
    And the user can see the text "<signMeUp>"
    And the user can see the link Privacy Policy
    And the sign me up is selected by default
    And the user can see the Continue button grayed out
    Examples:
      | signMeUp                                                                                                                                 | email                  |  |
      | Sign me up to receive the latest news on FlexShopper and MyFlexLending products and promotions. We respect your privacy. Please view our | user21@flexshopper.com |  |

  Scenario: The user can click on the "Privacy Policy" link in the "Sign Me Up" text
    Given the user lands in the ProfileInfo screen
    When  user clicks on the Privacy Policy link
    Then the user can see the privacy policy information

  Scenario: The user sees the expected footer
    When the user lands in the ProfileInfo screen
    Then the user can see the copyright information
    And the user can see the Accessiblity link
    And the user can see the Terms link
    And the user can see the Privacy link

  Scenario: The user can click on the "Accessibility" link in the footer
    Given the user lands in the ProfileInfo screen
    When the user clicks on the Accessibility  link
    #Then the user can see the accessibility information

  Scenario: The user can click on the "Terms" link in the footer
    Given the user lands in the ProfileInfo screen
    When the user clicks on the Terms  link
    Then the user can see the terms information

  Scenario: The user can click on the "Privacy Policy" link in the footer
    Given the user lands in the ProfileInfo screen
    When the user clicks on the Privacy link in the footer
    Then the user can see the privacy information

  Scenario: The user can navigate back to the Email screen if the email shown is not his
    Given the user lands in the ProfileInfo screen
    And the email address shown is not his
    When the user clicks on the Not You link
    Then the user lands in the Email screen

  Scenario Outline: The user cannot enter special characted in the First Name
    Given the user lands in the ProfileInfo screen
    When the user enters an invalid first name: "<firstName>"
    And the user clicks on the Continue button on Profile Page
    Then the user should see the validation message in first name filed: "<validationMess>"
    Examples:
      | firstName | validationMess        |
      | Flex@     | No special characters |
      | 12345     | No special characters |
      |           | No special characters |

  Scenario Outline: The user cannot enter special characted in the Last Name
    Given the user lands in the ProfileInfo screen
    When the user enters an invalid last name: "<lastName>"
    And the user clicks on the Continue button on Profile Page
    Then the user should see the validation message in last name field: "<validationMess"
    Examples:
      | lastName | validationMess        |
      | Flex@    | No special characters |
      | 12345    | No special characters |
      |          | No special characters |

  Scenario Outline: The user cannot enter less than 10 characters in the Mobile Number
    Given the user lands in the ProfileInfo screen
    When the user enters an invalid mobile number: "<mobileNumber>"
    And the user clicks on the Continue button on Profile Page
    Then the user should see the validation message: "<validationMess"
    Examples:
      | mobileNumber | validationMess        |
      | 12345        | Must be 10 characters |

  Scenario Outline: The user cannot enter less than 5 characters in the Zip Code
    Given the user lands in the ProfileInfo screen
    When the user enters an invalid zip code: "<zipCode>"
    Then the user should see the validation message in zip code filed: "<validationMess"
    Examples:
      | zipCode | validationMess       |
      | 1234    | Must be 5 characters |
      | 1       | Must be 5 characters |

 Scenario Outline: The user can select a valid matching address from the address suggestions
    Given the user lands in the ProfileInfo screen1
    When the user has entered "<customer>" information Profile page and  starts entering a valid addresssss
    Then the user should see address suggestionsss
    And the user can select the address from the suggestionssss
   Examples:
     | customer                      |
     | abcde.approve@flexshopper.com |

  Scenario: The user cannot see address suggestions is an invalid address is entered
    Given the user lands in the ProfileInfo screen1
    And the user has entered information in the First Name field
    And the user has entered information in the Last Name field
    And the user has entered information in the Mobile Number field
    When the user starts entering an invalid address
    Then the user should see address suggestions
    And the user can select the address from the suggestions


  Scenario Outline: The user can enter the address manually
    Given the user lands in the ProfileInfo screen1
    When the user has entered "<customer>" information
    When the user clicks on the Enter Address Manually links
    Then the user should see Home Address field
    And the usersssss should see the Apt/Unit fields
    And the user should see the City field
    And the user should see the State field
    And the user should see the Postal Code field
    Examples:
      | customer                      |
      | abcde.approve@flexshopper.com |
  @customer
  Scenario Outline: The user should land on Personal Info screen
    Given the user lands in the ProfileInfo screen1
    When the user has entered "<customer>" information
    And the user clicks on the Continue button on copy Profile Page
    Then the user should land "Personal Info" Screen
    Examples:
      | customer                      |
      | abcde.approve@flexshopper.com |
