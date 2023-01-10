@Chrome @Web @ForgotPassword @PP3 @Regression
Feature: As user I should be able to change the password

  Scenario Outline: User with full information in the profile can see the email and the phone number provided
    Given the user is on the Forgot Password screen with email: "<email>"
    Then the user should see the email: "<email>>"
    And the user should see the phone number: "<phoneNumber>"
    Examples:
      | email                | phoneNumber  |
      | startdrift@gmail.com | xxx-xxx-2917 |

  Scenario Outline: User is able to return to the Email screen
    Given the user is on the Forgot Password screen with email: "<email>"
    When the user clicks on the link: "Return to Password Sign In"
    Then the user lands on the Email screen
    Examples:
      | email                |
      | startdrift@gmail.com |

  Scenario Outline: User with email information in the profile should see the "Verification Code" screen
    Given the user is on the Forgot Password screen with email: "<email>"
    And the Send Email radio button is selected
    And the user clicks on the button: "Continue"
    Then the user lands on the Verification Code screen
    And the user should see the email: "<email>"
    Examples:
      | email                |
      | startdrift@gmail.com |

  Scenario Outline: User with phone information in the profile should see the "Verification Code" screen
    Given the user is on the Forgot Password screen with email: "<email>"
    And the Send SMS radio button is selected
    And the user clicks on the button: "Continue"
    Then the user lands on the Verification Code screen
    And the user should see the phone number: "<phoneNumber>"
    Examples:
      | email                | phoneNumber  |
      | startdrift@gmail.com | xxx-xxx-2917 |

  Scenario Outline: User should be able to click on the "No code received?" link when the Verification Code is not received in the email
    Given the user is on the Forgot Password screen with email: "<email>"
    And the Send Email radio button is selected
    And the user clicks on the button: "Continue"
    When the user lands on the Verification Code screen
    And the user clicks on the link: "No Code received?"
    Then the user lands on the Forgot Password screen
    And the user should see the email: "<email>"
    Examples:
      | email                |
      | startdrift@gmail.com |

  Scenario Outline: User should be able to click on the "No code received?" link when the Verification Code is not received on the phone
    Given the user is on the Forgot Password screen with email: "<email>"
    And the Send SMS radio button is selected
    And the user clicks on the button: "Continue"
    When the user lands on the Verification Code screen
    And the user clicks on the button: "No Code received?"
    Then the user lands on the Forgot Password screen
    And the user should see the email: "<email>"
    And the user should see the phone number: "<phoneNumber>"
    Examples:
      | email                | phoneNumber  |
      | startdrift@gmail.com | xxx-xxx-2917 |

  Scenario Outline: User should be able to retrieve the verification code from an email message
    Given the user is on the Forgot Password screen with email: "<email>"
    And the Send Email radio button is selected
    And the user clicks on the button: "Continue"
    And the user lands on the Verification Code screen
    When the user enters the Verification Code in the field
    And the user clicks on the button: "Submit"
    Then the user lands on the Change Password screen
    Examples:
      | email                           |
      | FlexShopperAutomation@gmail.com |

  Scenario Outline: User should be able to change the password after retrieving the verification code from an email message
    Given the user is on the Forgot Password screen with email: "<email>"
    And the Send Email radio button is selected
    And the user clicks on the button: "Continue"
    And the user lands on the Verification Code screen
    When the user enters the Verification Code in the field
    And the user clicks on the button: "Submit"
    And the user enters the password: "<newPassword>"
    And the user clicks on the Change Password button
    Then the user is able to change the password
    Examples:
      | email                           | newPassword |
      | FlexShopperAutomation@gmail.com | Test@12345  |

  Scenario Outline: User can login with the new password after changing the password
    Given the user is on the Password screen with email: "<email>"
    When the user enters the password: "<newPassword>"
    And the user clicks on the button: "Sign In"
    Then the user lands on the Decision Screen without referral
    Examples:
      | email                           | newPassword |
      | FlexShopperAutomation@gmail.com | Test@12345  |

  Scenario Outline: User cannot login with the old password after changing the password
    Given the user is on the Password screen with email: "<email>"
    When the user enters the password: "<oldPassword>"
    And the user clicks on the Sign in button
    Then the user should see the validation error message: "<validationMessage>"
    Examples:
      | email                           | oldPassword | validationMessage                                                  |
      | FlexShopperAutomation@gmail.com | Test@1234   | Invalid email or password: please check your details and try again |

  Scenario Outline: User should be able to change the password back to its initial value after retrieving the verification code from an email message
    Given the user is on the Forgot Password screen with email: "<email>"
    And the Send Email radio button is selected
    And the user clicks on the button: "Continue"
    And the user lands on the Verification Code screen
    When the user enters the Verification Code in the field
    And the user clicks on the button: "Submit"
    And the user enters the password: "<newPassword>"
    And the user clicks on the Change Password button
    Then the user is able to change the password
    Examples:
      | email                           | newPassword |
      | FlexShopperAutomation@gmail.com | Test@1234   |

  #Scenario Outline: User should be able to retrieve the verification code from an SMS message
  #  Given the user is on the Forgot Password screen with email: "<email>"
  #  And the Send SMS radio button is selected
  #  And the user clicks on the button: "Continue"
  #  And the user lands on the Verification Code screen
  #  When the user enters the Verification Code in the field
  #  And the user clicks on the button: "Submit"
  #  Then the user lands on the Change Password screen
  #  Examples:
  #    | email                           |
  #    | FlexShopperAutomation@gmail.com |

  #Scenario Outline: User should be able to change the password after retrieving the verification code from an SMS message
  #  Given the user is on the Forgot Password screen with email: "<email>"
  #  And the Send SMS radio button is selected
  #  And the user clicks on the button: "Continue"
  #  And the user lands on the Verification Code screen
  #  When the user enters the Verification Code in the field
  #  And the user clicks on the button: "Submit"
  #  And the user enters the password: "<newPassword>"
  #  And the user clicks on the Change Password button
  #  Then the user is able to change the password
  #  Examples:
  #    | email                           | newPassword |
  #    | FlexShopperAutomation@gmail.com | Test@12345  |

  #Scenario Outline: User should be able to change the password after retrieving the verification code from an SMS message
  #  Given the user is on the Forgot Password screen with email: "<email>"
  #  And the Send SMS radio button is selected
  #  And the user clicks on the button: "Continue"
  #  And the user lands on the Verification Code screen
  #  When the user enters the Verification Code in the field
  #  And the user clicks on the button: "Submit"
  #  And the user enters the password: "<newPassword>"
  #  And the user clicks on the Change Password button
  #  Then the user is able to change the password
  #  Examples:
  #    | email                           | newPassword |
  #    | FlexShopperAutomation@gmail.com | Test@12345  |

  #Scenario Outline: User can login with the new password after changing the password
  #  Given the user is on the Password screen with email: "<email>"
  #  When the user enters the password: "<newPassword>"
  #  And the user clicks on the button: "Sign In"
  #  Then the user lands on the Decision Screen without referral
  #  Examples:
  #    | email                           | newPassword |
  #    | FlexShopperAutomation@gmail.com | Test@12345  |

  #Scenario Outline: User cannot login with the old password after changing the password
  #  Given the user is on the Password screen with email: "<email>"
  #  When the user enters the password: "<oldPassword>"
  #  And the user clicks on the Sign in button
  #  Then the user should see the validation error message: "<validationMessage>"
  #  Examples:
  #    | email                           | oldPassword | validationMessage                                                  |
  #    | FlexShopperAutomation@gmail.com | Test@1234   | Invalid email or password: please check your details and try again |

  #Scenario Outline: User should be able to change the password back to its initial value after retrieving the verification code from an SMS message
  #  Given the user is on the Forgot Password screen with email: "<email>"
  #  And the Send SMS radio button is selected
  #  And the user clicks on the button: "Continue"
  #  And the user lands on the Verification Code screen
  #  When the user enters the Verification Code in the field
  #  And the user clicks on the button: "Submit"
  #  And the user enters the password: "<newPassword>"
  #  And the user clicks on the Change Password button
  #  Then the user is able to change the password
  #  Examples:
  #    | email                           | newPassword |
  #    | FlexShopperAutomation@gmail.com | Test@1234   |