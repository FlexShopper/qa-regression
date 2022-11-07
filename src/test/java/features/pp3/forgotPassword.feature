@Chrome @Regression @ChangePassword
Feature: As user I should be able to change the password

  Scenario Outline: User with full information in the profile can see the email and the phone number provided
    Given the user is on the Forgot Password screen with email: "<email>"
    Then the user should see the email: "<email>>"
    And the user should see the phone number: "<phoneNumber>"
    Examples:
      | email                | phoneNumber  |
      | startdrift@gmail.com | xxx-xxx-2917 |

  Scenario Outline: User without full information in the profile can see the email address provided
    Given the user is on the Forgot Password screen with email: "<email>"
    Then the user should see the email: "<email>"
    And the user should not see the phone number: "<phoneNumber>"
    Examples:
      | email               | phoneNumber  |
      | nann40547@gmail.com | xxx-xxx-3966 |

  Scenario Outline: User is able to return to the Email screen
    Given the user is on the Forgot Password screen with email: "<email>"
    When the user clicks on the link: "Return to Password Sign In"
    Then the user is on the Email screen
    Examples:
      | email                |
      | startdrift@gmail.com |

  Scenario Outline: User with email information in the profile should see the "Verification Code" screen
    Given the user is on the Forgot Password screen with email: "<email>"
    And the Send Email radio button is selected
    When the user clicks on the Continue button
    Then the user lands on the Verification Code screen
    And the user should see the email: "<email>"
    Examples:
      | email                |
      | startdrift@gmail.com |

  Scenario Outline: User with phone information in the profile should see the "Verification Code" screen
    Given the user is on the Forgot Password screen with email: "<email>"
    And the Send SMS radio button is selected
    When the user clicks on the Continue button
    Then the user lands on the Verification Code screen
    And the user should see the phone number: "<phoneNumber>"
    Examples:
      | email                | phoneNumber  |
      | startdrift@gmail.com | xxx-xxx-2917 |

  Scenario Outline: User should be able to click on the "No code received?" link when the Verification Code is not received in the email
    Given the user is on the Forgot Password screen with email: "<email>"
    And the Send Email radio button is selected
    And the user clicks on the Continue button
    When the user lands on the Verification Code screen
    And the user clicks on the button: "No Code received?"
    Then the user lands on the Forgot Password screen
    And the user should see the email: "<email>"
    Examples:
      | email                |
      | startdrift@gmail.com |

  Scenario Outline: User should be able to click on the "No code received?" link when the Verification Code is not received on the phone
    Given the user is on the Forgot Password screen with email: "<email>"
    And the Send SMS radio button is selected
    And the user clicks on the Continue button
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
    And the user clicks on the Continue button
    And the user lands on the Verification Code screen
    And the user clicks on the Submit button
    When the user enters the Verification Code in the field
    And the user clicks on the Submit button
    Then the user lands on the Change Password screen
    Examples:
      | email               |
      | nann40547@gmail.com |

  #Scenario Outline: User should be able to retrieve the verification code from a SMS message
    ##### User should be on the Verification Code with email & phone number #####
    #Given the user is on the Verification Code screen with email: "<email>"
    #When the user retrieves the Verification Code from the phone
    #And the user enters the Security Code in the field
    #And the user clicks on the Submit button
    #Then the user lands on the Change Password screen
    #Examples:
    #  | email               | phoneNumber  |
    #  | nann40547@gmail.com | xxx-xxx-3966 |

  #Scenario Outline: User can login with the New password
  # Given the user is on the Change Password Screen
    #When the user enters the password: "<newPassword>"
    #And the user clicks on the button: "Save Changes"
    #And the user is on the Email screen
    #And the user enters the email: "<email>"
    #And the user clicks on the Continue button
    #And the user enters the password: "<newPassword>"
    #And the user clicks on the Sign in button
    #Then the user lands on the Homepage as logged in user: "<user>"
  #  Examples:
  #    | email                | newPassword | user             |
  #    | startdrift@gmail.com | test123     | Stanislav Kuleshov |

  #Scenario Outline: User cannot login with the Old password
    #Given the user is on the Change Password Screen with email: "<email>"
    #When the user enters the password: "<newPassword>"
    #And the user clicks on the Save Changes button
    #And the user is on the Email screen
    #And the user enters the email: "<email>"
    #And the user clicks on the Continue button
    #And the user enters the password: "<oldPassword>"
    #And the user clicks on the Sign in button
    #Then the user should see the validation error message: "<validationMessage>"
  #  Examples:
  #    | email                | oldPassword | validationMessage                                                  | newPassword |
  #    | startdrift@gmail.com | test123     | Invalid email or password: please check your details and try again | test1234    |